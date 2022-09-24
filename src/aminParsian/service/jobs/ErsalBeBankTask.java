package aminParsian.service.jobs;

import aminParsian.DAO.CredebitDAO;
import aminParsian.DAO.ListCredebitBankDAO;
import aminParsian.DAO.ListCredebitBankLogDAO;
import aminParsian.model.Credebit;
import aminParsian.model.Users;
import aminParsian.model.ListCredebitBank;
import aminParsian.model.ListCredebitBankLog;
import aminParsian.service.IACHService;
import aminParsian.service.implementation.ACHService;
import aminParsian.util.DateUtil;
import aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice.*;
import aminParsian.webService.AchAmin.ir.parsian_bank.*;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


import org.apache.oltu.oauth2.client.OAuthClient;
import org.apache.oltu.oauth2.client.URLConnectionClient;
import org.apache.oltu.oauth2.client.request.OAuthClientRequest;
import org.apache.oltu.oauth2.client.response.OAuthJSONAccessTokenResponse;
import org.apache.oltu.oauth2.common.OAuth;
import org.apache.oltu.oauth2.common.message.types.GrantType;
import org.glassfish.jersey.client.ClientConfig;
/**
 * Created by ach on 1/8/2019.
 */
public class ErsalBeBankTask {
    ListCredebitBankDAO listCredebitBankDAO;
    IACHService achService;
    ListCredebitBankLogDAO listCredebitBankLogDAO;

    public ListCredebitBankLogDAO getListCredebitBankLogDAO() {
        return listCredebitBankLogDAO;
    }

    public void setListCredebitBankLogDAO(ListCredebitBankLogDAO listCredebitBankLogDAO) {
        this.listCredebitBankLogDAO = listCredebitBankLogDAO;
    }

    public IACHService getAchService() {
        return achService;
    }


    public void setAchService(IACHService achService) {
        this.achService = achService;
    }

    public ListCredebitBankDAO getListCredebitBankDAO() {
        return listCredebitBankDAO;
    }

    public void setListCredebitBankDAO(ListCredebitBankDAO listCredebitBankDAO) {
        this.listCredebitBankDAO = listCredebitBankDAO;
    }

    public String getAccessToken()throws Exception{

        try {
            System.setProperty("javax.net.debug", "all");
            System.setProperty("https.protocols", "TLSv1.2");

            OAuthClient client = new OAuthClient(new URLConnectionClient());
            OAuthClientRequest request = OAuthClientRequest.tokenLocation("https://oauth2.parsian-bank.ir/oauth2/token")
                    .setGrantType(GrantType.CLIENT_CREDENTIALS)

                    .setClientId("780834032103518")
                    .setClientSecret("396c620a-683f-454f-a70c-040c90014623")
                    .buildBodyMessage();

            request.addHeader("accept", "application/json");
            String token = client.accessToken(request, OAuth.HttpMethod.POST, OAuthJSONAccessTokenResponse.class).getAccessToken();

            return token;

        }catch(Exception e){
            return null;
        }

    }

    private static java.net.URI getBaseURI() {
        return javax.ws.rs.core.UriBuilder.fromUri("https://openapi.parsian-bank.ir/channelServices/1.0").build();
    }

    public javax.ws.rs.core.Response AchTransfer(String token, Credebit credebit)throws Exception{

        String method ="achNormalTransfer";
        org.json.simple.JSONObject input = new org.json.simple.JSONObject();
        javax.ws.rs.core.Response response=null;
        String result=null;
        int state=0;
        try {


            input.put("amount" , credebit.getMablagh());
            input.put("cif" , "3860897");//
            input.put("description" , credebit.getId());
            input.put("factorNumber" , credebit.getInvoiceNo());
            input.put("ibanNumber" , "IR"+credebit.getSheba());
            input.put("ownerName" , credebit.getOrgNmae()+" "+credebit.getPersonName());
            input.put("sourceDepositNumber" , "00200569078002");
            input.put("uniqueTrackingCode" , credebit.getId());//UNIQUECODE
//            be har transaction yek code unique midim k tekrari sabt nashe
            input.put("checkUniqueTrackingCode" , "true");
            input.put("transferDescription" , credebit.getId());
//            input.put("email" , "true");


            ClientConfig config = new ClientConfig();
            javax.ws.rs.client.Client client = javax.ws.rs.client.ClientBuilder.newClient( config);

            javax.ws.rs.client.WebTarget target = client.target(getBaseURI()).path(method);
            javax.ws.rs.client.Invocation.Builder invocationBuilder =  target.request()
                    .header("Authorization", "Bearer " + token)
                    .accept(javax.ws.rs.core.MediaType.APPLICATION_JSON);
            response = invocationBuilder.post(javax.ws.rs.client.Entity.entity(input, javax.ws.rs.core.MediaType.APPLICATION_JSON));
            result = response.readEntity(String.class);
            state = response.getStatus();


            // Sabte sanad

        }catch(Exception e){

        }
        return response;
    }



    public void ersalBeBankKaspian(){

        String result=null;
        int state=0;
        List<ListCredebitBank> listCredebitBanks = new ArrayList<ListCredebitBank>();
        listCredebitBanks = achService.findListToErsalBeBank();

        int listCredebitBanksSize = 0;
        if (listCredebitBanks != null)
            listCredebitBanksSize = listCredebitBanks.size();

//        Users user = userService.getUserById(79130780l);
        String token = null;
        try {
            token = getAccessToken();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if(listCredebitBanks!=null){
            for(int i=0 ; i<listCredebitBanksSize;i++){
                ListCredebitBank listCredebitBank = listCredebitBanks.get(i);

                ListCredebitBankLog listCredebitBankLog = new ListCredebitBankLog(listCredebitBank);
                listCredebitBankLog.setErsalDate(DateUtil.getCurrentDate());
                listCredebitBankLog.setErsalTime(DateUtil.getCurrentTime());

                Credebit credebit = listCredebitBank.getUniqueCode();

                listCredebitBank.setState(2l);

                try {
                    javax.ws.rs.core.Response response = AchTransfer(token,credebit);

                    result = response.readEntity(String.class);
                    state = response.getStatus();

                    if (state ==200) {
                        org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
                        org.json.simple.JSONObject obj = (org.json.simple.JSONObject) parser.parse(result);
                        String referenceId = (String) obj.get("referenceId");
                        listCredebitBank.setSanamcredebitid(referenceId);
                    }
                    else {
                        final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(aminParsian.action.ACHAction.class);
                        logger.info(String.format("ACH Failed ! credebit identifier: %s bimename.shomare: %s ach response: %s"
                                , credebit.getId(), "", response));
                    }


                }catch (Exception e){
                    e.printStackTrace();
                    continue;
                } finally {
                    listCredebitBank.setState(2l);
                    achService.saveOrUpdateListCredebitBank(listCredebitBank);
                    achService.saveOrUpdateListCredebitBankLog(listCredebitBankLog);
                    achService.saveOrUpdateCredebit(credebit);
                }
            }
        }

    }

    public void ersalBeBank()  {

        System.setProperty("javax.net.debug", "all");
        System.setProperty("https.protocols", "TLSv1.2");
        aminParsian.webService.AchAmin.ir.parsian_bank.ParsianBankSoap parsianBankSoap = null;

        LoginResult loginResult = null;

        for (int k = 0; k < 5; k++) {
            try {
                while (true) {
                    try {
                        ParsianBank parsianBank = new ParsianBank();
                        ChUserInfoRequestBean chUserInfoRequestBean = new ChUserInfoRequestBean();
                        chUserInfoRequestBean.setUsername("aminparsian274032");
                        chUserInfoRequestBean.setPassword("19545475");


                        parsianBankSoap = parsianBank.getParsianBankSoap();
                        loginResult = parsianBankSoap.login(chUserInfoRequestBean, ChannelServiceType.THIRDPARTY);

                        if (loginResult.getError().equals(ErrType.OK)) {
                            break;
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();

                    }
                }

                List<ListCredebitBank> listCredebitBanks = new ArrayList<ListCredebitBank>();
                listCredebitBanks = achService.findListToErsalBeBank();

                int listCredebitBanksSize = 0;
                if (listCredebitBanks != null)
                    listCredebitBanksSize = listCredebitBanks.size();
                if (listCredebitBanksSize == 0) {
                    break;
                }

                for (int i = 0; i < listCredebitBanksSize; i++) {
                    ListCredebitBank listCredebitBank = listCredebitBanks.get(i);

                    ListCredebitBankLog listCredebitBankLog = new ListCredebitBankLog(listCredebitBank);
                    listCredebitBankLog.setErsalDate(DateUtil.getCurrentDate());
                    listCredebitBankLog.setErsalTime(DateUtil.getCurrentTime());

                    Credebit credebit = listCredebitBank.getUniqueCode();

                    listCredebitBank.setState(2l);
//===========================================================
                    try {
                        ChAchNormalTransferRequestBean chAchNormalTransferRequestBean = new ChAchNormalTransferRequestBean();
                        chAchNormalTransferRequestBean.setCif("3860897");
                        chAchNormalTransferRequestBean.setAmount(new BigDecimal(credebit.getMablagh()));
                        chAchNormalTransferRequestBean.setDescription(credebit.getPolicyNo() + "|" + credebit.getNationalID() + "|" + credebit.getPersonName());
                        chAchNormalTransferRequestBean.setIbanNumber(credebit.getSheba());
                        chAchNormalTransferRequestBean.setOwnerName(credebit.getPersonName());
                        chAchNormalTransferRequestBean.setSourceDepositNumber("00200569078002");
                        chAchNormalTransferRequestBean.setTransferDescription(credebit.getId().toPlainString());
                        chAchNormalTransferRequestBean.setUniqueTrackingCode(credebit.getId().toPlainString());
                        chAchNormalTransferRequestBean.setCheckUniqueTrackingCode(true);

                        AchNormalTransferResult achNormalTransferResult = parsianBankSoap.achNormalTransfer(chAchNormalTransferRequestBean, loginResult.getResponse().getSessionId());

                        listCredebitBank.setSanamcredebitid(achNormalTransferResult.getResponse().getReferenceId());
                        credebit.setSanamcredebitid(achNormalTransferResult.getResponse().getReferenceId());

                    } catch (Exception ex) {
                        ex.printStackTrace();
                        continue;
                    } finally {
                        listCredebitBank.setState(2l);
                        achService.saveOrUpdateListCredebitBank(listCredebitBank);
                        achService.saveOrUpdateListCredebitBankLog(listCredebitBankLog);
                        achService.saveOrUpdateCredebit(credebit);
                    }
                }

            } catch (Exception ex)

            {

                ex.printStackTrace();
                k--;
            }

        }
        parsianBankSoap.logout(ChannelServiceType.THIRDPARTY, loginResult.getResponse().getSessionId());

    }
}
