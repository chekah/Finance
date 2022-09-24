package aminParsian.service.jobs;

import aminParsian.DAO.CredebitReceptionExcelDAO;
import aminParsian.DAO.ReceptionExcelDAO;
import aminParsian.DAO.UsersDAO;
import aminParsian.DAO.CredebitDAO;
import aminParsian.model.Credebit;
import aminParsian.model.CredebitReceptionExcel;
import aminParsian.model.ReceptionExcel;
import aminParsian.model.Users;
import aminParsian.service.IACHService;
import aminParsian.util.DateUtil;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ach on 8/1/2020.
 */
public class CreateCredebitForReceptionExcelTask {

    private IACHService achService;
    private UsersDAO userDAO;
    private ReceptionExcelDAO receptionExcelDAO;
    private CredebitDAO credebitDAO;
    private CredebitReceptionExcelDAO credebitReceptionExcelDAO;

    public IACHService getAchService() {
        return achService;
    }

    public void setAchService(IACHService achService) {
        this.achService = achService;
    }

    public UsersDAO getUserDAO() {
        return userDAO;
    }

    public void setUserDAO(UsersDAO userDAO) {
        this.userDAO = userDAO;
    }

    public ReceptionExcelDAO getReceptionExcelDAO() {
        return receptionExcelDAO;
    }

    public void setReceptionExcelDAO(ReceptionExcelDAO receptionExcelDAO) {
        this.receptionExcelDAO = receptionExcelDAO;
    }

    public CredebitDAO getCredebitDAO() {
        return credebitDAO;
    }

    public void setCredebitDAO(CredebitDAO credebitDAO) {
        this.credebitDAO = credebitDAO;
    }

    public CredebitReceptionExcelDAO getCredebitReceptionExcelDAO() {
        return credebitReceptionExcelDAO;
    }

    public void setCredebitReceptionExcelDAO(CredebitReceptionExcelDAO credebitReceptionExcelDAO) {
        this.credebitReceptionExcelDAO = credebitReceptionExcelDAO;
    }

    @Transactional
    public void saveCredebitForReceptionExcel() {
        try {
            Users user = userDAO.findById(new BigDecimal("1"));
            List<BigDecimal> invoiceExcelIDs = receptionExcelDAO.findReceptionExcelWithoutCredebit();

            if(invoiceExcelIDs != null && invoiceExcelIDs.size() >0 ) {
                int size = invoiceExcelIDs.size();
                for(int i=0 ; i < size ; i++) {
                    try {
                        BigInteger invoiceExcelID = invoiceExcelIDs.get(i).toBigInteger();
                        String result = saveCredebitForReceptionExcel(invoiceExcelID, user);
                    }catch (Exception e){
                            e.printStackTrace();
                    }

                }
            }

        }catch (Exception e){
                e.printStackTrace();
        }

    }

    public String saveCredebitForReceptionExcel(BigInteger invoiceExcelID, Users user) {


        List<Object[]> baseCredebits = receptionExcelDAO.findBaseCredebitsFromReceptionExcel(invoiceExcelID);

        List<Credebit> credebitList = createCredebitForReceptionExcel(invoiceExcelID, baseCredebits, user);


       /* for (ViewReceptionExcel viewReceptionExcel : viewDBReceptionExcelList) {

            Credebit credebit = createCredebitForReceptionExcel(viewReceptionExcel, user);
            if (credebit == null) {
                return null;
            }

        }*/

        return "success";
    }

    List<Credebit> createCredebitForReceptionExcel(BigInteger invoiceExcelID, List<Object[]> baseCredebits, Users user) {

        List<Credebit> credebitList = new ArrayList<Credebit>();
        for (int i = 0; i < baseCredebits.size(); i++) {
            Object[] baseCredebit = baseCredebits.get(i);
            String invoiceNO = ((BigDecimal) baseCredebit[0]).toString();
            String nationalId = (String) baseCredebit[1];
            String orgName = (String) baseCredebit[2];
            String policyNo = (String) baseCredebit[3];
            String fullName = (String) baseCredebit[4];
            String sheba = (String) baseCredebit[5];
            BigInteger mablaghPardakhti = ((BigDecimal) baseCredebit[6]).toBigInteger();
            String sanamCredebitId = ((BigDecimal)baseCredebit[7]).toPlainString();
            BigInteger mobile = null;
            if (baseCredebit[8] != null) {
                mobile = ((BigDecimal) baseCredebit[8]).toBigInteger();
            }


            Credebit credebit = new Credebit();
            credebit.setCreatedate(DateUtil.getCurrentDate());
            credebit.setCreatetime(DateUtil.getCurrentTime());

            credebit.setUsers(user);
            credebit.setEntryuser(user);
            credebit.setEntrydate(DateUtil.getLongDateFromStrDate(DateUtil.getCurrentDate()));
            credebit.setInvoiceNo(invoiceNO);
            credebit.setMablagh(mablaghPardakhti);
            credebit.setPolicyNo(policyNo);
            credebit.setOrgNmae(orgName);
            credebit.setNationalID(nationalId);
            credebit.setPersonName(fullName);
            credebit.setSanamcredebitid(sanamCredebitId);
            credebit.setSheba(sheba);
            credebit.setState(new Long(1));
            credebit.setDescription("ReceptionExcel");
            if (mobile != null) {
                credebit.setMobile(mobile.toString());
            }

            aminParsian.model.Credebit cre = credebitDAO.findByData(nationalId,invoiceNO, mablaghPardakhti);

            if(cre == null) {
                credebit = (Credebit) credebitDAO.saveOrUpdate(credebit);
            }
            else{
                credebit = cre;
            }
//            if(credebit == null){
//                credebit = credebitDAO.findByData(nationalId,invoiceNO, mablaghPardakhti);
//            }
            credebitList.add(credebit);
            createCredebitReceptionExcel(invoiceExcelID, credebit, user);

        }

        return credebitList;
    }

    public void createCredebitReceptionExcel(BigInteger invoiceExcelID, Credebit credebit, Users user) {

        int i = 0;
/*        if(credebit == null){
            credebit = credebitDAO.findById(credebit.getId());
        }*/
        List<ReceptionExcel> receptionExcels = receptionExcelDAO.findListByInvoiceExcelIDAndMainPerson(invoiceExcelID, credebit.getNationalID(), credebit.getPolicyNo(), credebit.getInvoiceNo());
        //receptionExcels
//        System.out.println(receptionExcels.size());
        for (ReceptionExcel receptionExcel : receptionExcels) {
            CredebitReceptionExcel credebitReceptionExcel = new CredebitReceptionExcel();
            credebitReceptionExcel.setReceptionExcel(receptionExcel);
            credebitReceptionExcel.setCredebit(credebit);
            credebitReceptionExcel.setCreatedate(DateUtil.getCurrentDate());
            credebitReceptionExcel.setCreatetime(DateUtil.getCurrentTime());
            credebitReceptionExcel.setUsers(user);
            credebitReceptionExcel.setState(1l);
            CredebitReceptionExcel cre = credebitReceptionExcelDAO.findByReceptionExcelId(receptionExcel.getId());
            if(cre != null){
                continue;
            }
            credebitReceptionExcel = (CredebitReceptionExcel) credebitReceptionExcelDAO.saveOrUpdate(credebitReceptionExcel);

//            System.out.println(i++);
        }

    }

}
