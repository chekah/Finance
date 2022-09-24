package aminParsian.service.jobs;

import aminParsian.DAO.CredebitDAO;
import aminParsian.DAO.CredebitStateDAO;
import aminParsian.model.Credebit;
import aminParsian.service.IACHService;
import aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice.ChUserInfoRequestBean;
import aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice.ChannelServiceType;
import aminParsian.webService.AchAmin.ir.parsian_bank.ErrType;
import aminParsian.webService.AchAmin.ir.parsian_bank.LoginResult;
import aminParsian.webService.AchAmin.ir.parsian_bank.ParsianBank;
import aminParsian.webService.AchAmin.ir.parsian_bank.ParsianBankSoap;

import java.util.ArrayList;
import java.util.List;


public class FeedBackServiceTask {

    private CredebitDAO credebitDAO;
    private CredebitStateDAO credebitStateDAO;
    private IACHService achService;

    public IACHService getAchService() {
        return achService;
    }

    public void setAchService(IACHService achService) {
        this.achService = achService;
    }

    public CredebitStateDAO getCredebitStateDAO() {
        return credebitStateDAO;
    }

    public void setCredebitStateDAO(CredebitStateDAO credebitStateDAO) {
        this.credebitStateDAO = credebitStateDAO;
    }

    public CredebitDAO getCredebitDAO() {
        return credebitDAO;
    }

    public void setCredebitDAO(CredebitDAO credebitDAO) {
        this.credebitDAO = credebitDAO;
    }



//    @Transactional
    public void getFeedBackACH() {

        try {
            List<Credebit> credebitList = new ArrayList<Credebit>();
            credebitList = achService.getCredebitsForFeedBack();

            LoginResult loginResult=null;

//                for(int j=0; j<20; j++) {
                    while (true) {
                        ParsianBank parsianBank = new ParsianBank();
                        ChUserInfoRequestBean chUserInfoRequestBean = new ChUserInfoRequestBean();
                        chUserInfoRequestBean.setUsername("aminparsian274032");
                        chUserInfoRequestBean.setPassword("19545475");

                        ParsianBankSoap parsianBankSoap = parsianBank.getParsianBankSoap();

                        loginResult = parsianBankSoap.login(chUserInfoRequestBean, ChannelServiceType.THIRDPARTY);

                        if (!loginResult.getError().equals(ErrType.OK)) {
                            continue;
                        } else {
                            break;
                        }
                    }
                    for (int i = 0; i < 100; i++) {
                        try {
                            achService.feedBackACH(credebitList.get(i), loginResult.getResponse().getSessionId());
                        } catch (Exception ex) {
                            ex.printStackTrace();
                            continue;
                        }
                    }

//                }
        } catch (Exception e) {
            System.out.println("Exception!!!");
        }

        System.out.println("JobComplete!!!");
    }

}
