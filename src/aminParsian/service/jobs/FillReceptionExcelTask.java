package aminParsian.service.jobs;

import aminParsian.DAO.*;
import aminParsian.model.*;
import aminParsian.service.IACHService;
import aminParsian.util.DateUtil;
import aminParsian.viewModel.ViewReceptionExcel;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.View;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ach on 7/25/2020.
 */
public class FillReceptionExcelTask {

   private ReceptionExcelNotExistIPDAO receptionExcelNotExistIPDAO;
    private ReceptionExcelDAO receptionExcelDAO;
    private InsuredPersonDAO insuredPersonDAO;
    private IACHService achService;
    private UsersDAO userDAO;
    private PolicyDAO policyDAO;


    public PolicyDAO getPolicyDAO() {
        return policyDAO;
    }

    public void setPolicyDAO(PolicyDAO policyDAO) {
        this.policyDAO = policyDAO;
    }

    public ReceptionExcelNotExistIPDAO getReceptionExcelNotExistIPDAO() {
        return receptionExcelNotExistIPDAO;
    }

    public void setReceptionExcelNotExistIPDAO(ReceptionExcelNotExistIPDAO receptionExcelNotExistIPDAO) {
        this.receptionExcelNotExistIPDAO = receptionExcelNotExistIPDAO;
    }

    public ReceptionExcelDAO getReceptionExcelDAO() {
        return receptionExcelDAO;
    }

    public void setReceptionExcelDAO(ReceptionExcelDAO receptionExcelDAO) {
        this.receptionExcelDAO = receptionExcelDAO;
    }

    public InsuredPersonDAO getInsuredPersonDAO() {
        return insuredPersonDAO;
    }

    public void setInsuredPersonDAO(InsuredPersonDAO insuredPersonDAO) {
        this.insuredPersonDAO = insuredPersonDAO;
    }

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


    @Transactional
    public List<ViewReceptionExcel>  fillReceptionExcel() {

       try {
           List<ViewReceptionExcel> viewDBReceptionExcelNotExistList = receptionExcelNotExistIPDAO.findReceptionExcelForComplete();

           List<ViewReceptionExcel> viewDBReceptionExcelList = new ArrayList<>();
           if (viewDBReceptionExcelNotExistList != null) {
               int size = viewDBReceptionExcelNotExistList.size();
               String date = DateUtil.getCurrentDate();
               String time = DateUtil.getCurrentTime();
               Users user = userDAO.findById(new BigDecimal("1"));
               BigInteger invoiceExcelID = new BigInteger(DateUtil.getCurrentDate().replace("/", "") + DateUtil.getCurrentTime().replace(":", ""));

               for (int i = 0; i < size; i++) {
                   try {
                       ViewReceptionExcel viewReceptionExcelNotExistIP = viewDBReceptionExcelNotExistList.get(i);
                        ReceptionExcel receptionExcel = moveReceptionExcelNotExistToReceptionExcel(viewReceptionExcelNotExistIP,invoiceExcelID, date, time, user);
                        if(receptionExcel == null)
                            continue;
                        ViewReceptionExcel viewReceptionExcel = new ViewReceptionExcel();
                       viewReceptionExcel.setInvoiceExcelID(invoiceExcelID);
                       viewDBReceptionExcelList.add(viewReceptionExcel);
                   } catch (Exception e) {

                   }
               }
           }
           return viewDBReceptionExcelList;
       }catch (Exception e){
           return null;
       }
    }


    public ReceptionExcel moveReceptionExcelNotExistToReceptionExcel(ViewReceptionExcel viewReceptionExcelNotExistIP,BigInteger invoiceExcelID,String date,String time,Users user){



        ReceptionExcel receptionExcel = new ReceptionExcel();
        receptionExcel.setInvoiceExcelID(invoiceExcelID);
        receptionExcel.setCodeKarshenas(viewReceptionExcelNotExistIP.getCodeKarshenas());
        receptionExcel.setState(1l);
        receptionExcel.setCodeBimeShode(viewReceptionExcelNotExistIP.getCodeBimeShode());
        receptionExcel.setBimeGozar(viewReceptionExcelNotExistIP.getBimeGozar());
        receptionExcel.setPolicyNo(viewReceptionExcelNotExistIP.getPolicyno());
        receptionExcel.setCodeTarh(viewReceptionExcelNotExistIP.getCodeTarh());
        receptionExcel.setFranshiz(viewReceptionExcelNotExistIP.getFranshiz());
        receptionExcel.setGrouhKariBimeGozar(viewReceptionExcelNotExistIP.getGrouhKariBimeGozar());
        if (viewReceptionExcelNotExistIP.getBimarestani().intValue() == 1) {
            receptionExcel.setBimarestani(1l);
            receptionExcel.setHazineBimarestaniElami(viewReceptionExcelNotExistIP.getHazineBimarestaniElami());
            receptionExcel.setHazineBimarestaniPardakhti(viewReceptionExcelNotExistIP.getHazineBimarestaniPardakhti());
        } else {
            receptionExcel.setBimarestani(0l);
            receptionExcel.setHazineParaElami(viewReceptionExcelNotExistIP.getHazineParaElami());
            receptionExcel.setHazineParaPardakhti(viewReceptionExcelNotExistIP.getHazineParaPardakhti());
        }

        receptionExcel.setKarshenasParvande(viewReceptionExcelNotExistIP.getKarshenasParvande());
        receptionExcel.setMaliat(viewReceptionExcelNotExistIP.getMaliat());
        receptionExcel.setNameKarshenas(viewReceptionExcelNotExistIP.getNameKarshenas());
        receptionExcel.setNameMarkazDarmani(viewReceptionExcelNotExistIP.getNameMarkazDarmani());
        receptionExcel.setNoeBimari(viewReceptionExcelNotExistIP.getNoeBimari());
        receptionExcel.setNoeTahvilMadarek(viewReceptionExcelNotExistIP.getNoeTahvilMadarek());
        receptionExcel.setNoeTarh(viewReceptionExcelNotExistIP.getNoeTarh());
        receptionExcel.setPardakhtAzMahal(viewReceptionExcelNotExistIP.getPardakhtAzMahal());
        receptionExcel.setRadif(viewReceptionExcelNotExistIP.getRadif());
        receptionExcel.setSerialMoarefiName(viewReceptionExcelNotExistIP.getSerialMoarefiName());
        receptionExcel.setShomareBaygani(viewReceptionExcelNotExistIP.getShomareBaygani());
        receptionExcel.setShomareHavale(viewReceptionExcelNotExistIP.getShomareHavale());
        receptionExcel.setTarikhHavale(new Long(viewReceptionExcelNotExistIP.getTarikhHavale().replaceAll("/", "")));
        receptionExcel.setShomareParvande(viewReceptionExcelNotExistIP.getShomareParvande());
        receptionExcel.setTasvieShode(viewReceptionExcelNotExistIP.getTasvieShode());
        receptionExcel.setVahedePardakhti(viewReceptionExcelNotExistIP.getVahedePardakhti());
        receptionExcel.setVahedeMoaref(viewReceptionExcelNotExistIP.getVehedeMoaref());
        receptionExcel.setVahedeSazmani(viewReceptionExcelNotExistIP.getVahedeSazmani());
        receptionExcel.setVahedeSodour(viewReceptionExcelNotExistIP.getVehedeSodour());
        receptionExcel.setTarikhBimari(new Long(viewReceptionExcelNotExistIP.getTarikhBimari().replaceAll("/", "")));
        receptionExcel.setNameTarh(viewReceptionExcelNotExistIP.getPolicyName());
        receptionExcel.setTarikhElamKhesarat(new Long(viewReceptionExcelNotExistIP.getTarikhElamKhesarat().replaceAll("/", "")));
        receptionExcel.setNoeHavale(viewReceptionExcelNotExistIP.getNoeHavale());
        receptionExcel.setVazeiatParvande(viewReceptionExcelNotExistIP.getVazeiatParvande());
        receptionExcel.setKarbarSabteParvande(viewReceptionExcelNotExistIP.getKarbarSabteParvande());
        receptionExcel.setGruheBimari(viewReceptionExcelNotExistIP.getGruheBimari());
        receptionExcel.setCodeRayaneMoredKhesarat(viewReceptionExcelNotExistIP.getCodeRayaneMoredKhesarat());
        receptionExcel.setMablaghMotabeghTarefe(viewReceptionExcelNotExistIP.getMablaghMohasebeSodeMotabeghTarefe());


        Policy policy = policyDAO.findById(viewReceptionExcelNotExistIP.getPolicyID());
        InsuredPerson insuredPerson = insuredPersonDAO.findByNationalAndPolicyID(viewReceptionExcelNotExistIP.getPatientNationalID(), policy.getId());
        if(insuredPerson == null)
            return null;
        receptionExcel.setInsuredPerson(insuredPerson);
        receptionExcel.setPerson(insuredPerson.getPerson());
        receptionExcel.setPolicy(policy);
        receptionExcel.setCreatedate(viewReceptionExcelNotExistIP.getCreatedate());
        receptionExcel.setCreatetime(viewReceptionExcelNotExistIP.getCreatetime());
        receptionExcel.setUsers(user);
        receptionExcel.setTarikheEnteghal(date);
        receptionExcel.setZamanEnteghal(time);
        receptionExcel.setAction("fromJob");

        ReceptionExcelNotExistIP receptionExcelNotExist = receptionExcelNotExistIPDAO.findById(viewReceptionExcelNotExistIP.getReceptionExcelNotExistIPID());
        receptionExcel.setReceptionExcelNotExistIP(receptionExcelNotExist);
        receptionExcel.setSheba(viewReceptionExcelNotExistIP.getSheba());
        receptionExcel = (ReceptionExcel) receptionExcelDAO.saveOrUpdate(receptionExcel);

        receptionExcelNotExist.setState(2l);
        receptionExcelNotExist = (ReceptionExcelNotExistIP) receptionExcelNotExistIPDAO.saveOrUpdate(receptionExcelNotExist);


        return receptionExcel;
    }




}
