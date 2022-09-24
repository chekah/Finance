package aminParsian.service.jobs;

/**
 * Created by ach on 10/10/2018.
 */


import aminParsian.DAO.CredebitDAO;
import aminParsian.DAO.CredebitStateDAO;
import aminParsian.model.Credebit;
import aminParsian.service.IACHService;

import java.util.ArrayList;
import java.util.List;


public class SmsServiceTask {
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


    public void sendSmsForDuplicate(){
        /*try {
        List<Credebit> credebitList = new ArrayList<Credebit>();
        credebitList = achService.getCredebitsForSendSmsDuplicate();

        for (int i = 0; i < credebitList.size(); i++) {
            try {

                String result = achService.sendSmsForDuplicate(credebitList.get(i));
                //log sms results
            } catch (Exception ex) {
                continue;
            }
        }
        }catch(Exception e){
            System.out.println("Exception!!!");
        }

        System.out.println("JobComplete!!!");
*/
    }

    public void sendSms(){

        try {
            List<Credebit> credebitList = new ArrayList<Credebit>();
            credebitList = achService.getCredebitsForSendSms();
//            credebitList = achService.getCredebitsForTestSms();

                for (int i = 0; i < credebitList.size(); i++) {
                    try {

                        String result = achService.sendSms(credebitList.get(i));
                        //log sms results
                    } catch (Exception ex) {
                        continue;
                    }
                }

            }catch(Exception e){
                System.out.println("Exception!!!");
            }

            System.out.println("JobComplete!!!");

    }
}
