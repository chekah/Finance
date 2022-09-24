package aminParsian.service.implementation;

import aminParsian.DAO.CredebitDAO;
import aminParsian.DAO.ListCredebitBankDAO;
import aminParsian.DAO.UsersDAO;
import aminParsian.model.Credebit;
import aminParsian.model.ListCredebitBank;
import aminParsian.model.Users;
import aminParsian.service.IACHService;
import aminParsian.service.IWebService;
import aminParsian.util.DateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.transaction.Transactional;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by a-chekah on 7/20/2017.
 */
@WebService(serviceName = "DarmanWebService")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)

public class DarmanWebService implements IWebService {

    private CredebitDAO credebitDAO;
    private UsersDAO usersDAO;
    private ListCredebitBankDAO listCredebitBankDAO;
    private IACHService achService;
//    private IACHService iachService;


// --------------------------------------------------------------------------------------------------------------------------
/*
    public IACHService getAchService() {
        return achService;
    }

    public void setAchService(IACHService achService) {
        this.achService = achService;
    }*/
//

    @WebMethod(exclude = true)
    public IACHService getAchService () {
        return achService;
    }

    @WebMethod(exclude = true)
    public void setAchService (IACHService achService) {
        this.achService = achService;
    }

    @WebMethod(exclude = true)
    public ListCredebitBankDAO getListCredebitBankDAO() {
        return listCredebitBankDAO;
    }

    @WebMethod(exclude = true)
    public void setListCredebitBankDAO(ListCredebitBankDAO listCredebitBankDAO) {
        this.listCredebitBankDAO = listCredebitBankDAO;
    }

    @WebMethod(exclude = true)
    public CredebitDAO getCredebitDAO() {
        return credebitDAO;
    }

    @WebMethod(exclude = true)
    public void setCredebitDAO(CredebitDAO credebitDAO) {
        this.credebitDAO = credebitDAO;
    }

    @WebMethod(exclude = true)
    public UsersDAO getUsersDAO() {
        return usersDAO;
    }

    @WebMethod(exclude = true)
    public void setUsersDAO(UsersDAO usersDAO) {
        this.usersDAO = usersDAO;
    }


//    --------------------------------------------------------------------------------------------------------------------------


    @WebMethod(operationName = "createCredebit")
    public String createCredebit(String input) {
        Map<String, String> resultMap = new HashMap<String, String>();


        try {

            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(input);
            String invoiceNO = (String) obj.get("invoiceNO");
            String uniqeCode = (String) obj.get("uniqeCode");
            Long amount = (Long) obj.get("amount");
            String policyNO = (String) obj.get("policyNO");
            String orgName = (String ) obj.get("orgName");
            String nationalID = (String ) obj.get("nationalID");
            String personName = (String ) obj.get("personName");
            String sheba = (String ) obj.get("sheba");
            String elamBeMaliDate = (String ) obj.get("elamBeMaliDate");
            String receptionDate = (String ) obj.get("receptionDate");
            String secretariatDate = ((Long ) obj.get("secretariatDate")).toString();
            String mobile = (String) obj.get("mobile");

            BigInteger amount2 = new BigInteger(amount.toString());

//            achService.createCredebit(invoiceNO, uniqeCode, amount2, policyNO, orgName, nationalID, personName, sheba);

            Users user = usersDAO.findById(new BigDecimal("5"));
            Credebit temp = credebitDAO.findBySanamCredebitID(invoiceNO, nationalID, amount2);
            BigDecimal temp2 = credebitDAO.findBySanamCredebitIDFromLog(invoiceNO, nationalID, amount2);
            if(temp !=null || temp2 != null){
                resultMap.put("result","2");
                JSONObject jsoobj = new JSONObject(resultMap);
                return jsoobj.toString();
            }

            Credebit credebit = new Credebit();
            credebit.setCreatedate(DateUtil.getCurrentDate());
            credebit.setCreatetime(DateUtil.getCurrentTime());

            credebit.setUsers(user);
            credebit.setEntryuser(user);
            credebit.setEntrydate(DateUtil.getLongDateFromStrDate(DateUtil.getCurrentDate()));
            credebit.setInvoiceNo(invoiceNO);
            credebit.setMablagh(amount2);
            credebit.setPolicyNo(policyNO);
            credebit.setOrgNmae(orgName);
            credebit.setNationalID(nationalID);
            credebit.setPersonName(personName);
            credebit.setSanamcredebitid(uniqeCode);
            credebit.setSheba(sheba);
            credebit.setState(new Long(1));
            credebit.setMobile(mobile);

            credebit=(Credebit)achService.saveOrUpdateCredebit(credebit);//credebitDAO.manualSaveOrUpdate(credebit);

            if(credebit == null){
                resultMap.put("result","-1");

                JSONObject jsoobj = new JSONObject(resultMap);
                return jsoobj.toString();
            }
            resultMap.put("result","1");

            JSONObject jsoobj = new JSONObject(resultMap);
            return jsoobj.toString();

        }catch (Exception ex){
            ex.printStackTrace();
//           resultMap.put("result","-1");
        }
        resultMap.put("result","-1");
        JSONObject jsoobj = new JSONObject(resultMap);
        return jsoobj.toString();

    }

    @WebMethod(operationName = "ersalBeSafePardakht")
    public String ersalBeSafePardakht(String input) {
        Map<String, String> resultMap = new HashMap<String, String>();

        try {

            JSONParser parser = new JSONParser();
            JSONObject obj = (JSONObject) parser.parse(input);
            String uniqeCode = ((Long) obj.get("uniqeCode")).toString();

//            achService.createCredebit(invoiceNO, uniqeCode, amount2, policyNO, orgName, nationalID, personName, sheba);

            Users user = usersDAO.findById(new BigDecimal("5"));
            ListCredebitBank temp = listCredebitBankDAO.findByUniqueCode(uniqeCode);

            if(temp != null){
                resultMap.put("result","2");
                JSONObject jsoobj = new JSONObject(resultMap);
                return jsoobj.toString();
            }

            ListCredebitBank listCredebitBank = new ListCredebitBank();

            listCredebitBank.setCreatedate(DateUtil.getCurrentDate());
            listCredebitBank.setCreatetime(DateUtil.getCurrentTime());
            listCredebitBank.setUsers(user);
            listCredebitBank.setState(new Long(1));
            listCredebitBank.setEntryuser(user);
            listCredebitBank.setEntrydate(DateUtil.getLongDateFromStrDate(DateUtil.getCurrentDate()));
            listCredebitBank.setUniqueCode(credebitDAO.findById(new BigDecimal(uniqeCode)));

            listCredebitBank=achService.saveOrUpdateListCredebitBank(listCredebitBank);//listCredebitBankDAO.saveOrUpdate(listCredebitBank);//listCredebitBankDAO.manualSaveOrUpdate(listCredebitBank);

            if(listCredebitBank == null){
                resultMap.put("result","-1");

                JSONObject jsoobj = new JSONObject(resultMap);
                return jsoobj.toString();
            }
            resultMap.put("result","1");

            JSONObject jsoobj = new JSONObject(resultMap);
            return jsoobj.toString();

        }catch (Exception ex){
            ex.printStackTrace();
//           resultMap.put("result","-1");
        }
        resultMap.put("result","-1");
        JSONObject jsoobj = new JSONObject(resultMap);
        return jsoobj.toString();
    }

}
