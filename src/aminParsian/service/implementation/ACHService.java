package aminParsian.service.implementation;

import aminParsian.DAO.*;
import aminParsian.displaytag.PaginatedListImpl;
import aminParsian.displaytag.PagingUtil;
import aminParsian.model.*;
import aminParsian.service.IACHService;
import aminParsian.util.DataValidation;
import aminParsian.util.DateUtil;
import aminParsian.util.PersianCalendar;
import aminParsian.viewModel.*;
//import aminParsian.webService.ir.parsianinsurance.he.interfaces.webservice.client.*;

import aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice.*;
import aminParsian.webService.AchAmin.ir.parsian_bank.*;
import aminParsian.webService.sms.SMSServiceLocator;
import aminParsian.webService.sms.SMSServiceSoap_PortType;
import aminParsian.webService.virtualBank.DarmanWebService_PortType;
import aminParsian.webService.virtualBank.DarmanWebService_ServiceLocator;
//import org.apache.poi.hssf.record.formula.functions.Row;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;

import javax.transaction.Transactional;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

import org.apache.poi.xwpf.usermodel.*;
import java.nio.file.*;

/**
 * Created by a-naderi on 7/25/2017.
 */
@Transactional
public class ACHService implements IACHService {

    private Credebit credebit;
    private CredebitStateDAO credebitStateDAO;
    private CredebitDAO credebitDAO;
    private UsersDAO usersDAO;
    private SmsLogDAO smsLogDAO;
    private ListCredebitBankDAO listCredebitBankDAO;
    private ListCredebitBankLogDAO listCredebitBankLogDAO;
    private ReceptionExcelDAO receptionExcelDAO;
    private ReceptionExcelNotExistIPDAO receptionExcelNotExistIPDAO;
    private CredebitReceptionExcelDAO credebitReceptionExcelDAO;
    private PolicyDAO policyDAO;
    private InsuredPersonDAO insuredPersonDAO;
    private PersonDAO personDAO;
    private ContactDAO contactDAO;
    private AccountDAO accountDAO;
    private ExcelMappingDAO excelMappingDAO;
    private AgencyDAO agencyDAO;
    private SuspendDAO suspendDAO;
    private ReceptionExcelFileDAO receptionExcelFileDAO;

//----------------------------------------------------------------------------------------------------------------------------------------------------------------------


    public ReceptionExcelFileDAO getReceptionExcelFileDAO() {
        return receptionExcelFileDAO;
    }

    public void setReceptionExcelFileDAO(ReceptionExcelFileDAO receptionExcelFileDAO) {
        this.receptionExcelFileDAO = receptionExcelFileDAO;
    }

    public SuspendDAO getSuspendDAO() {
        return suspendDAO;
    }

    public void setSuspendDAO(SuspendDAO suspendDAO) {
        this.suspendDAO = suspendDAO;
    }

    public AgencyDAO getAgencyDAO() {
        return agencyDAO;
    }

    public void setAgencyDAO(AgencyDAO agencyDAO) {
        this.agencyDAO = agencyDAO;
    }

    public ExcelMappingDAO getExcelMappingDAO() {
        return excelMappingDAO;
    }

    public void setExcelMappingDAO(ExcelMappingDAO excelMappingDAO) {
        this.excelMappingDAO = excelMappingDAO;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public AccountDAO getAccountDAO() {
        return accountDAO;
    }

    public void setAccountDAO(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public ContactDAO getContactDAO() {
        return contactDAO;
    }

    public void setContactDAO(ContactDAO contactDAO) {
        this.contactDAO = contactDAO;
    }

    public PolicyDAO getPolicyDAO() {
        return policyDAO;
    }

    public void setPolicyDAO(PolicyDAO policyDAO) {
        this.policyDAO = policyDAO;
    }

    public InsuredPersonDAO getInsuredPersonDAO() {
        return insuredPersonDAO;
    }

    public void setInsuredPersonDAO(InsuredPersonDAO insuredPersonDAO) {
        this.insuredPersonDAO = insuredPersonDAO;
    }

    public ReceptionExcelDAO getReceptionExcelDAO() {
        return receptionExcelDAO;
    }

    public void setReceptionExcelDAO(ReceptionExcelDAO receptionExcelDAO) {
        this.receptionExcelDAO = receptionExcelDAO;
    }

    public CredebitReceptionExcelDAO getCredebitReceptionExcelDAO() {
        return credebitReceptionExcelDAO;
    }

    public void setCredebitReceptionExcelDAO(CredebitReceptionExcelDAO credebitReceptionExcelDAO) {
        this.credebitReceptionExcelDAO = credebitReceptionExcelDAO;
    }

    public ReceptionExcelNotExistIPDAO getReceptionExcelNotExistIPDAO() {
        return receptionExcelNotExistIPDAO;
    }

    public void setReceptionExcelNotExistIPDAO(ReceptionExcelNotExistIPDAO receptionExcelNotExistIPDAO) {
        this.receptionExcelNotExistIPDAO = receptionExcelNotExistIPDAO;
    }

    public ListCredebitBankLogDAO getListCredebitBankLogDAO() {
        return listCredebitBankLogDAO;
    }

    public void setListCredebitBankLogDAO(ListCredebitBankLogDAO listCredebitBankLogDAO) {
        this.listCredebitBankLogDAO = listCredebitBankLogDAO;
    }

    public ListCredebitBankDAO getListCredebitBankDAO() {
        return listCredebitBankDAO;
    }

    public void setListCredebitBankDAO(ListCredebitBankDAO listCredebitBankDAO) {
        this.listCredebitBankDAO = listCredebitBankDAO;
    }

    public UsersDAO getUsersDAO() {
        return usersDAO;
    }

    public void setUsersDAO(UsersDAO usersDAO) {
        this.usersDAO = usersDAO;
    }

    public CredebitStateDAO getCredebitStateDAO() {
        return credebitStateDAO;
    }

    public void setCredebitStateDAO(CredebitStateDAO credebitStateDAO) {
        this.credebitStateDAO = credebitStateDAO;
    }


    public Credebit getCredebit() {
        return credebit;
    }

    public void setCredebit(Credebit credebit) {
        this.credebit = credebit;
    }

    public CredebitDAO getCredebitDAO() {
        return credebitDAO;
    }

    public void setCredebitDAO(CredebitDAO credebitDAO) {
        this.credebitDAO = credebitDAO;
    }

    public SmsLogDAO getSmsLogDAO() {
        return smsLogDAO;
    }

    public void setSmsLogDAO(SmsLogDAO smsLogDAO) {
        this.smsLogDAO = smsLogDAO;
    }

    //    ----------------------------------------------------------------------------------------------------------------------------------------------------------------------


    @Override
    public PaginatedListImpl<ViewCredebit> fanniManager() {
        return credebitDAO.searchCredebits(null, null, null, null, 2l, null, null, null, null);
    }


    @Override
    public PaginatedListImpl<ViewCredebit> searchFanniManager(String invoiceNo, String nationalNO, String policyNO, Long state, String createDateFrom, String createDateTo, String elamBeMaliDateFrom, String elamBeMaliDateTo) {
        return credebitDAO.searchCredebits(invoiceNo, nationalNO, policyNO, state, 2l, createDateFrom, createDateTo, elamBeMaliDateFrom, elamBeMaliDateTo);
    }

    @Override
    public PaginatedListImpl<ViewCredebit> maliManager() {
        return credebitDAO.searchCredebits(null, null, null, null, 3l, null, null, null, null);
    }

    @Override
    public PaginatedListImpl<ViewCredebit> searchMaliManager(String invoiceNo, String nationalNO, String policyNO, Long state, String createDateFrom, String createDateTo, String elamBeMaliDateFrom, String elamBeMaliDateTo) {
        return credebitDAO.searchCredebits(invoiceNo, nationalNO, policyNO, state, 3l, createDateFrom, createDateTo, elamBeMaliDateFrom, elamBeMaliDateTo);
    }

    @Override
    public PaginatedListImpl<ViewCredebit> fanniSubManager() {
        return credebitDAO.searchCredebits(null, null, null, null, 4l, null, null, null, null);
    }

    @Override
    public PaginatedListImpl<ViewCredebit> searchFanniSubManager(String invoiceNo, String nationalNO, String policyNO, Long state, String createDateFrom, String createDateTo, String elamBeMaliDateFrom, String elamBeMaliDateTo) {
        return credebitDAO.searchCredebits(invoiceNo, nationalNO, policyNO, state, 4l, createDateFrom, createDateTo, elamBeMaliDateFrom, elamBeMaliDateTo);
    }

    @Override
    public PaginatedListImpl<ViewCredebit> maliSubManager() {
        return credebitDAO.searchCredebits(null, null, null, null, 5l, null, null, null, null);
    }

    @Override
    public PaginatedListImpl<ViewCredebit> searchMaliSubManager(String invoiceNo, String nationalNO, String policyNO, Long state, String createDateFrom, String createDateTo, String elamBeMaliDateFrom, String elamBeMaliDateTo) {
        return credebitDAO.searchCredebits(invoiceNo, nationalNO, policyNO, state, 5l, createDateFrom, createDateTo, elamBeMaliDateFrom, elamBeMaliDateTo);
    }

    @Override
    public Credebit teedMoavenFani(BigDecimal credebitID, Users users) {
        credebit = credebitDAO.findById(credebitID);
        if (credebit != null) {
            credebit.setState(new Long(2));
            credebitDAO.saveOrUpdate(credebit);
        }

        CredebitState cs = new CredebitState();
        cs.setState(2l);
        cs.setCreatedate(DateUtil.getCurrentDate());
        cs.setCreatetime(DateUtil.getCurrentTime());
        cs.setUsers(users);
        cs.setCredebit(credebit);
        credebitStateDAO.saveOrUpdate(cs);
        credebit.setState(new Long(2));
        credebitDAO.saveOrUpdate(credebit);
        return credebit;
    }

    @Override
    public Credebit teedMoavenMali(BigDecimal credebitID, Users users) {
        credebit = credebitDAO.findById(credebitID);
        credebit.setState(new Long(3));
        CredebitState cs = new CredebitState();
        cs.setState(3l);
        cs.setCreatedate(DateUtil.getCurrentDate());
        cs.setCreatetime(DateUtil.getCurrentTime());
        cs.setUsers(users);
        cs.setCredebit(credebit);
        credebitStateDAO.saveOrUpdate(cs);
        credebitDAO.saveOrUpdate(credebit);
        return credebit;
    }

    @Override
    public Credebit ersalBeBankMajazi(BigDecimal credebitID, Users user) {
        credebit = credebitDAO.findById(credebitID);

        if (credebit.getState().intValue() >= 4) {
            return credebit;
        }
        if(suspendDAO.isSuspend(credebit.getNationalID())){
            return credebit;
        }

        try {
            DarmanWebService_ServiceLocator dws = new DarmanWebService_ServiceLocator();
            DarmanWebService_PortType dport = dws.getDarmanWebServicePort();

            /////////////////////////////////////////////////////////////////////////
            JSONObject input = new JSONObject();

            input.put("uniqeCode", credebitID);

            String result = dport.ersalBeSafePardakht(input.toString());
            /////////////////////////////////////////////////////////////////////////
        } catch (Exception ex) {
            ex.printStackTrace();
            return credebit;
        }
        credebit.setState(4l);
        credebit = (Credebit) credebitDAO.saveOrUpdate(credebit);
        return credebit;
    }

    @Override
    public Credebit ersalBeBank(BigDecimal credebitID, Users users) {
        credebit = credebitDAO.findById(credebitID);

        if (credebit.getState().intValue() >= 4) {
            return credebit;
        }
        if(suspendDAO.isSuspend(credebit.getNationalID())){
            return credebit;
        }
        try {

//            chAchNormalTransferRequestBean.set

            ParsianBank parsianBank = new ParsianBank();
            ChUserInfoRequestBean chUserInfoRequestBean = new ChUserInfoRequestBean();
            chUserInfoRequestBean.setUsername("aminparsian274032");
            chUserInfoRequestBean.setPassword("19545475");


            ParsianBankSoap parsianBankSoap = parsianBank.getParsianBankSoap();
            LoginResult loginResult = parsianBankSoap.login(chUserInfoRequestBean, ChannelServiceType.THIRDPARTY);

            if (!loginResult.getError().equals(ErrType.OK)) {
                return null;
            }

            ChAchNormalTransferRequestBean chAchNormalTransferRequestBean = new ChAchNormalTransferRequestBean();
            chAchNormalTransferRequestBean.setCif("3860897");
            chAchNormalTransferRequestBean.setAmount(new BigDecimal(credebit.getMablagh()));
            chAchNormalTransferRequestBean.setDescription(credebit.getPolicyNo() + "|" + credebit.getNationalID() + "|" + credebit.getPersonName());
            chAchNormalTransferRequestBean.setIbanNumber(credebit.getSheba());
            chAchNormalTransferRequestBean.setOwnerName(credebit.getPersonName());
            chAchNormalTransferRequestBean.setSourceDepositNumber("00200569078002");
            chAchNormalTransferRequestBean.setTransferDescription(credebit.getId().toPlainString());


            AchNormalTransferResult achNormalTransferResult = parsianBankSoap.achNormalTransfer(chAchNormalTransferRequestBean, loginResult.getResponse().getSessionId());

            credebit.setSanamcredebitid(achNormalTransferResult.getResponse().getReferenceId());


            parsianBankSoap.logout(ChannelServiceType.THIRDPARTY, loginResult.getResponse().getSessionId());

//        Main main = new Main();
//        main.call();
        } catch (Exception ex) {
            return credebit;
        }
        credebit.setState(4l);
        credebit = (Credebit) credebitDAO.saveOrUpdate(credebit);
        return credebit;
    }

    @Override
    public List<ViewSanad> mali_report_first(String createDateFrom, String createDateTo) {
        return credebitDAO.mali_report_first(createDateFrom, createDateTo);
    }

    @Override
    public ViewCredebit getViewCredebit(BigDecimal credebitID) {
        credebit = credebitDAO.findById(credebitID);
        return credebitDAO.getViewCredebit(credebit);
    }

    public void feedBackAch() {
        Users user = usersDAO.findById(new BigDecimal("4"));

    }

    @Override
    public Credebit createCredebit(String invoiceNO, String uniqeCode, BigInteger amount, String policyNO, String orgName, String nationalID, String personName,
                                   String sheba, String elamBeMaliDate, String receptionDate, String secretariatDate) {
        Users user = usersDAO.findById(new BigDecimal("5"));
        Credebit temp = credebitDAO.findBySanamCredebitID(invoiceNO, nationalID, amount);
        if (temp != null) {
            return temp;
        }

        Credebit credebit = new Credebit();
        credebit.setCreatedate(DateUtil.getCurrentDate());
        credebit.setCreatetime(DateUtil.getCurrentTime());
        credebit.setUsers(user);
        credebit.setEntrydate(DateUtil.getLongDateFromStrDate(DateUtil.getCurrentDate()));
        credebit.setEntryuser(user);
        credebit.setInvoiceNo(invoiceNO);
        credebit.setMablagh(amount);
        credebit.setPolicyNo(policyNO);
        credebit.setOrgNmae(orgName);
        credebit.setNationalID(nationalID);
        credebit.setPersonName(personName);
        credebit.setSanamcredebitid(uniqeCode);
        credebit.setSheba(sheba);
        credebit.setElamBeMaliDate(elamBeMaliDate);
        credebit.setReceptionDate(receptionDate);
        credebit.setSecretariatDate(secretariatDate);
        credebit.setState(new Long(1));

        credebitDAO.saveOrUpdate(credebit);
        return credebit;
    }

    @Override
    public List<Credebit> searchFanniSubManagerForTeedGrouhi(String invoiceNo, String nationalNO, String policyNO, Long state, String createDateFrom, String createDateTo, String elamBeMaliDateFrom, String elamBeMaliDateTo) {
        return credebitDAO.searchCredebitsForTeedGrouhi(invoiceNo, nationalNO, policyNO, state, 4l, createDateFrom, createDateTo, elamBeMaliDateFrom, elamBeMaliDateTo);
    }


    @Override
    public List<Credebit> searchMaliSubManagerForTeedGrouhi(String invoiceNo, String nationalNO, String policyNO, Long state, String createDateFrom, String createDateTo, String elamBeMaliDateFrom, String elamBeMaliDateTo) {
        return credebitDAO.searchCredebitsForTeedGrouhi(invoiceNo, nationalNO, policyNO, state, 5l, createDateFrom, createDateTo, elamBeMaliDateFrom, elamBeMaliDateTo);
    }


    @Override
    public List<Credebit> searchMaliManagerForTeedGrouhi(String invoiceNo, String nationalNO, String policyNO, Long state, String createDateFrom, String createDateTo, String elamBeMaliDateFrom, String elamBeMaliDateTo) {
        return credebitDAO.searchCredebitsForTeedGrouhi(invoiceNo, nationalNO, policyNO, state, 3l, createDateFrom, createDateTo, elamBeMaliDateFrom, elamBeMaliDateTo);
    }

    @Override
    public PaginatedListImpl<ViewCredebit> searchMaliManagerForPardakhtCheck(String invoiceNo, String nationalNO, String policyNO, Long state, String createDateFrom, String createDateTo, String elamBeMaliDateFrom, String elamBeMaliDateTo) {
        return credebitDAO.searchCredebitsForPardakhtCheck(invoiceNo, nationalNO, policyNO, state, 3l, createDateFrom, createDateTo, elamBeMaliDateFrom, elamBeMaliDateTo);
    }

    @Override
    public Credebit teedPardakhtBaCheck(BigDecimal credebitID, Users user) {
        credebit = credebitDAO.findById(credebitID);
        credebit.setState(new Long(7));
        CredebitState cs = new CredebitState();
        cs.setState(7l);
        cs.setCreatedate(DateUtil.getCurrentDate());
        cs.setCreatetime(DateUtil.getCurrentTime());
        cs.setUsers(user);
        cs.setCredebit(credebit);
        credebitStateDAO.saveOrUpdate(cs);
        credebitDAO.saveOrUpdate(credebit);
        return credebit;
    }

    @Override
    public List<ViewSanad> mali_report_sanadPardakht1(String createDateFrom, String createDateTo) {
        return credebitDAO.mali_report_sanadPardakht1(createDateFrom, createDateTo);
    }

    @Override
    public List<ViewSanad> mali_report_sanadPardakht2(String createDateFrom, String createDateTo) {
        return credebitDAO.mali_report_sanadPardakht2(createDateFrom, createDateTo);
    }

    @Override
    public void feedBackACH(Credebit sanamcredebitid, String sessionId) {

        ParsianBank parsianBank = new ParsianBank();
//        ChUserInfoRequestBean chUserInfoRequestBean = new ChUserInfoRequestBean();
//        chUserInfoRequestBean.setUsername("aminparsian274032");
//        chUserInfoRequestBean.setPassword("19545475");
//
        ParsianBankSoap parsianBankSoap = parsianBank.getParsianBankSoap();
//        LoginResult loginResult = parsianBankSoap.login(chUserInfoRequestBean, ChannelServiceType.THIRDPARTY);
//
//        if (!loginResult.getError().equals(ErrType.OK)) {
//            return;
//        }

        ChAchTransferSearchRequestBean achrep_request = new ChAchTransferSearchRequestBean();
        achrep_request.setCif("3860897"); //= ; // شماره مشتری بیمه امین پارسیان. همواره ثابت است
        achrep_request.setOffset(0l);
        //achrep_request.setOffsetSpecified = true;
        achrep_request.setLength(100l);// = 100;
        //achrep_request.lengthSpecified = true;
        achrep_request.setSourceDepositNumber("00200569078002"); // این سپرده طبق نامه شرکت همواره ثابت است
        // achrep_request.fromIssueDate // تاریخ انجام - از
        // achrep_request.toIssueDate // تاریخ انجام - تا
        achrep_request.setReferenceId(sanamcredebitid.getSanamcredebitid().toString()); // کد پیگیری پایا
        // achrep_request.fromRegisterDate // تاریخ ثبت - از
        // achrep_request.toRegisterDate // تاریخ ثبت - تا
        // achrep_request.sourceDepositNumber // شماره سپرده مبدا
        // achrep_request.destinationIbanNumber // شماره شبای مقصد
        // achrep_request.fromTransactionAmount // مبلغ تراکنش - از
        // achrep_request.toTransactionAmount // مبلغ تراکنش - تا

        AchTransferReportResult achrep_result = parsianBankSoap.achTransferReport(achrep_request, sessionId);
        achrep_result.getError();  //مناسب را برمی گرداند error است یا خیر. در هر صورت (OK) نشان می دهد نتیجه فراخوانی موفق
        if (achrep_result.getError().equals(ErrType.OK)) {
            XMLGregorianCalendar date = achrep_result.getResponse().getAchTransferBeans().get(0).getRegisterDate();
//            String d = DateUtil.gregurianToJalali(2017, 12, 29);
            PersianCalendar cal = new PersianCalendar();
            String persianDate = PersianCalendar.getPersianDate(date.getYear(), date.getMonth(), date.getDay());

            sanamcredebitid.setPardakhtdate(DateUtil.getLongDateFromStrDate(persianDate));
            CredebitState cs = new CredebitState();
            cs.setCreatedate(DateUtil.getCurrentDate());
            cs.setCreatetime(DateUtil.getCurrentTime());
            cs.setUsers(usersDAO.findById(new BigDecimal(1)));
            cs.setCredebit(sanamcredebitid);
            cs.setState(5l);
            credebitStateDAO.saveOrUpdate(cs);
            credebitDAO.saveOrUpdate(sanamcredebitid);
        }
        achrep_result.getResponse().getAchTransferBeans().get(0);
        // achrep_result.error_deposit  شماره سپرده یا شماره شبا که منجر به تولید خطا شده برمی گرداند
        // achrep_result.response.achTransferBeans[i].cancelable // پایا قابل لغو است یا خیر
        // achrep_result.response.achTransferBeans[i].currency // ارز تراکنش
        // achrep_result.response.achTransferBeans[i].status // وضعیت پایا
        // achrep_result.response.achTransferBeans[i].referenceId // کد پیگیری پایا
        // achrep_result.response.achTransferBeans[i].registerDate // تاریخ ثبت

    }

    @Override
    public List<Credebit> getCredebitsForFeedBack() {
        return credebitDAO.getCredebitsForFeedBack();
    }

    @Override
    public List<Credebit> getCredebitsForSendSms() {
        return credebitDAO.getCredebitsForSendSms();

    }

    @Override
    public List<Credebit> getCredebitsForSendSmsDuplicate() {
        return  credebitDAO.getCredebitsForSendSmsDuplicate();
    }

    @Override
    public String sendSmsForDuplicate(Credebit credebit) {
        String smsText = "";
        BigInteger mablagh = credebit.getMablagh().divide(new BigInteger("2"));
        smsText += " سرکار خانم/جناب آقای " + credebit.getPersonName();
        smsText += " با سلام و احترام";
        smsText += " با توجه به اشتباه در پرداخت دو برابری صورتحساب به شماره " + credebit.getInvoiceNo()+" خواهشمند است نسبت به عودت مبلغ " + mablagh.toString()+" ریال به کارت به شماره 6221061045609767";
        smsText += " به نام شرکت امین پارسیان واریز  و فیش واریزی را به شماره موبایل 09018389855 واتس اپ نمایید";
        smsText += " با سپاس";
        smsText += " امین پارسیان، امین ایرانیان ";

        try {
            SMSServiceLocator smsServiceLocator = new SMSServiceLocator();
            SMSServiceSoap_PortType lsoap = null;

            lsoap = smsServiceLocator.getSMSServiceSoap();
            String smsResult = lsoap.createSMS(credebit.getInvoiceNo(), DateUtil.getCurrentDate(), credebit.getMobile(), smsText, 3);

            SmsLog smsLog = new SmsLog();

            smsLog.setCreatedate(DateUtil.getCurrentDate());
            smsLog.setCreatetime(DateUtil.getCurrentTime());
            smsLog.setInvoiceNo(credebit.getInvoiceNo());
            smsLog.setMablagh(credebit.getMablagh());
            smsLog.setMobile(credebit.getMobile());
            smsLog.setPardakhtdate(credebit.getPardakhtdate());
            smsLog.setSheba(credebit.getSheba());
            smsLog.setSmsresult(smsResult);
            smsLog.setDescription(smsText);
            smsLog.setState(1l);
            smsLog.setCredebit(credebit);

            smsLogDAO.saveOrUpdate(smsLog);


        } catch (Exception ex) {
            ex.printStackTrace();
        }


        return null;
    }

    @Override
    public String sendSms(Credebit credebit) {
        String smsText = "";
        smsText += " سرکار خانم/جناب آقای " + credebit.getPersonName();
        smsText += " با سلام و احترام، ضمن آرزوی سلامتی، اسناد  پزشکی شما مربوط به صورتحساب " + credebit.getInvoiceNo() + " به مبلغ " + credebit.getMablagh() + " ریال ";
        smsText += " به شماره شبای " + credebit.getSheba() + " در تاریخ " +
                DateUtil.minusDays(DateUtil.getDateFromLong(credebit.getPardakhtdate()), 1);
        smsText += " واریز گردید. امین پارسیان، امین ایرانیان ";

        try {
            SMSServiceLocator smsServiceLocator = new SMSServiceLocator();
            SMSServiceSoap_PortType lsoap = null;

            lsoap = smsServiceLocator.getSMSServiceSoap();
            String smsResult = lsoap.createSMS(credebit.getInvoiceNo(), DateUtil.getCurrentDate(), credebit.getMobile(), smsText, 3);

            SmsLog smsLog = new SmsLog();

            smsLog.setCreatedate(DateUtil.getCurrentDate());
            smsLog.setCreatetime(DateUtil.getCurrentTime());
            smsLog.setInvoiceNo(credebit.getInvoiceNo());
            smsLog.setMablagh(credebit.getMablagh());
            smsLog.setMobile(credebit.getMobile());
            smsLog.setPardakhtdate(credebit.getPardakhtdate());
            smsLog.setSheba(credebit.getSheba());
            smsLog.setSmsresult(smsResult);
            smsLog.setState(1l);
            smsLog.setCredebit(credebit);

            smsLogDAO.saveOrUpdate(smsLog);


        } catch (Exception ex) {
            ex.printStackTrace();
        }


        return null;
    }

    @Override
    public List<Credebit> getCredebitsForTestSms() {
        return credebitDAO.getCredebitsForTestSms();
    }


    @Override
    public ListCredebitBank saveOrUpdateListCredebitBank(ListCredebitBank listCredebitBank) {
        return listCredebitBankDAO.saveOrUpdate(listCredebitBank);
    }

    @Override
    public void saveOrUpdateListCredebitBankLog(ListCredebitBankLog listCredebitBankLog) {
        listCredebitBankLogDAO.saveOrUpdate(listCredebitBankLog);
    }

    @Override
    public List<ListCredebitBank> findListToErsalBeBank() {
        return listCredebitBankDAO.findListToErsalBeBank();
    }

    @Override
    public Object saveOrUpdateCredebit(Credebit credebit) {
        return credebitDAO.saveOrUpdate(credebit);
    }

    @Override
    public List<ViewCredebit> readExcel(File fileAddressFileName) {
        File excelFile = fileAddressFileName;
        FileInputStream fis = null;
        List<ViewCredebit> viewCredebits = new ArrayList<ViewCredebit>();

        Iterator<Row> rowIterator = null;

        Row row = null;
        try {
            fis = new FileInputStream(excelFile);
            XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
            int rows = mySheet.getPhysicalNumberOfRows();
            if (rows < 2) {
                return null;
            }
            rowIterator = mySheet.iterator();

            rowIterator.next();//
            Cell cell = null;
            while (rowIterator.hasNext()) {
                ViewCredebit viewCredebit = new ViewCredebit();
                row = (Row) rowIterator.next();

                cell = row.getCell(0);
                viewCredebit.setSanamCredebitId(cell.getStringCellValue());

                cell = row.getCell(1);
                viewCredebit.setNationalID(cell.getStringCellValue());

                cell = row.getCell(2);
                Double mablagh = cell.getNumericCellValue();
                Long m = mablagh.longValue();
                viewCredebit.setMablagh(new BigInteger(m.toString()));

                cell = row.getCell(3);
                viewCredebit.setPardakhtdate(cell.getStringCellValue());

                viewCredebits.add(viewCredebit);
            }
        } catch (Exception e) {
            return null;
        }

        return viewCredebits;
    }

    @Override
    public List<ViewCredebit> moghayeratAchBank(List<ViewCredebit> bankCredebits, List<ViewCredebit> darmanCredebits) {
        List<ViewCredebit> moghayerat = new ArrayList<ViewCredebit>();
        boolean findCredebit = false;

//کنترل از ACH با بانک
        for (int i = 0; i < darmanCredebits.size(); i++) {
            findCredebit = false;
            for (int j = 0; j < bankCredebits.size(); j++) {
                if (darmanCredebits.get(i).getSanamCredebitId().equals(bankCredebits.get(j).getSanamCredebitId())) {
                    findCredebit = true;
                    break;
                }
            }
            if (findCredebit == false) {
                darmanCredebits.get(i).setFileType("در سیستم ach هست در فایل آپلودی نیست");
                moghayerat.add(darmanCredebits.get(i));
            }
        }
//کنترل از بانک با ACH
        for (int i = 0; i < bankCredebits.size(); i++) {
            findCredebit = false;
            for (int j = 0; j < darmanCredebits.size(); j++) {
                if (bankCredebits.get(i).getSanamCredebitId().equals(darmanCredebits.get(j).getSanamCredebitId())) {
                    findCredebit = true;
                    break;
                }
            }
            if (findCredebit == false) {
                bankCredebits.get(i).setFileType("در فایل آپلودی هست در سیستم ach نیست");
                moghayerat.add(bankCredebits.get(i));
            }
        }

        //کنترل  رکوردهای دوبله در فایل بانک

        for (int i = 0; i < bankCredebits.size(); i++) {
            findCredebit = false;
            for (int j = 0; j < bankCredebits.size(); j++) {
                if (i == j)
                    break;
                if (bankCredebits.get(i).getSanamCredebitId().equals(bankCredebits.get(j).getSanamCredebitId())) {
                    findCredebit = true;
                    break;
                }
            }
            if (findCredebit == true) {
                bankCredebits.get(i).setFileType(" در فایل آپلودی تکراری است");
                moghayerat.add(bankCredebits.get(i));
            }
        }

        //کنترل  رکوردهای دوبله در فایل درمان

        for (int i = 0; i < darmanCredebits.size(); i++) {
            findCredebit = false;
            for (int j = 0; j < darmanCredebits.size(); j++) {
                if (i == j)
                    break;
                if (darmanCredebits.get(i).getSanamCredebitId().equals(darmanCredebits.get(j).getSanamCredebitId())) {
                    findCredebit = true;
                    break;
                }
            }
            if (findCredebit == true) {
                darmanCredebits.get(i).setFileType(" در سیستم ach تکراری است");
                moghayerat.add(darmanCredebits.get(i));
            }
        }

        return moghayerat;
    }

    @Override
    public List<ViewCredebit> getCredebitsByPardakhtDate(String createDateFrom, String createDateTo) {
        return credebitDAO.findByPardakhtDate(DateUtil.getLongDateFromStrDate(createDateFrom), DateUtil.getLongDateFromStrDate(createDateTo));
    }

    @Override
    public List<ViewCredebit> getCredebitsByCreateDate(String createDateFrom, String createDateTo) {
        return credebitDAO.findByCreateDate(DateUtil.getLongDateFromStrDate(createDateFrom), DateUtil.getLongDateFromStrDate(createDateTo));
    }

    @Override
    public List<ViewReceptionExcel> validateExcelKhesarat(boolean bimarestani, File fileUpload, Map<Integer, Map<Integer, String>> errorMap, Users user, List<ViewReceptionExcel> viewReceptionExcelList) {



        FileInputStream fis = null;
        Policy policy = null;
        Long policyNo = null;
        String nationalID = null;
        String noeBimari = null;
        Long tarikhBimari = null;
        Long radif = null;
        String noeHavale = null;
        String tarikhHavale = null;
        Long shomareHavale = null;
        Long shomareParvande = null;
        String vahedePardakht = null;
        String nameBimeGozar = null;
        String vahedeSazmani = null;
        Long codeBimeShode = null;
        String codeRayaneBimeName = null;
        String serialMoarefiName = null;
        String pardakhtAzMahal = null;
        Long codeTarh = null;
        String noeTarh = null;
        String tasvieShode = null;
        Long shomareBaygani = null;
        String grouhKariBimeGozar = null;
        String tarikhElamKhesart = null;
        Long codeKarshenas = null;
        String vahedeSodour = null;
        String moaref = null;
        String nameKarshenas = null;
        String karshenasParvande = null;
        String nameMarkasDarmani = null;
        String noeTahvilMadarek = null;
        BigInteger hazinePardakhti = null;
        BigInteger hazineElamShode = null;
        Long maliat = null;
        BigInteger franshiz = null;
        String nameBimeShode = null;
        String nameBimeShodeAsli = null;
        String nationalIDAsli = null;
        String personelID = null;
        String nameTarh = null;
        String vazeiatParvande = null;
        String karbarSabteParvande = null;
        String gruheBimari = null;
        BigDecimal codeRayaneMoredKhesarat = null;
        BigInteger mablaghMohasebeSodeMotabeghTarefe = null;
        boolean notExist = false;
        boolean duplicate = false;
        InsuredPerson insuredPerson = null;
        List<ViewReceptionExcel> viewDBReceptionExcelList = new ArrayList<>();
        Map<Integer, String> rowError = null;
        Row row = null;


        Map<String, Integer> mapping = new HashMap<>();

        if (bimarestani == true) {
            mapping.put("radif", 0);
            mapping.put("shomareHavale", 1);
            mapping.put("tarikhHavale", 2);
            mapping.put("shomareParvande", 3);
            mapping.put("vazeiatParvande", 4);
            mapping.put("vahedePardakht", 5);
            mapping.put("karbarSabteParvande", 6);
            mapping.put("nameBimeShode", 7);
            mapping.put("nameBimeGozar", 8);
            mapping.put("nameBimeShodeAsli", 9);
            mapping.put("nationalIDAsli", 10);

            mapping.put("vahedeSazmani", 12);
            mapping.put("policyNo", 13);
            mapping.put("codeBimeShode", 14);
            mapping.put("codeRayaneBimeName", 15);
            mapping.put("nationalID", 16);
            mapping.put("serialMoarefiName", 17);
            mapping.put("personelID", 18);
            mapping.put("pardakhtAzMahal", 19);
            mapping.put("codeTarh", 22);
            mapping.put("noeTarh", 23);
            mapping.put("nameTarh", 24);
            mapping.put("tasvieShode", 25);
            mapping.put("shomareBaygani", 26);
            mapping.put("gruheBimari", 27);
            mapping.put("tarikhBimari", 28);
            mapping.put("tarikhElamKhesart", 29);
            mapping.put("noeBimari", 31);
            mapping.put("codeKarshenas", 33);
            mapping.put("vahedeSodour", 34);
            mapping.put("moaref", 35);
            mapping.put("nameKarshenas", 36);
            mapping.put("karshenasParvande", 37);
            mapping.put("nameMarkasDarmani", 39);
            mapping.put("noeTahvilMadarek", 40);
            mapping.put("hazineElamShode", 41);
            mapping.put("hazinePardakhti", 42);
            mapping.put("maliat", 43);
            mapping.put("franshiz", 44);
        } else {
            mapping.put("radif", 0);
            mapping.put("nameBimeShodeAsli", 1);
            mapping.put("shomareHavale", 2);
            mapping.put("tarikhHavale", 3);
            mapping.put("noeHavale", 4);
            mapping.put("shomareParvande", 5);
            mapping.put("vazeiatParvande", 6);
            mapping.put("vahedePardakht", 7);
            mapping.put("karbarSabteParvande", 8);
            mapping.put("nameBimeShode", 9);
            mapping.put("nameBimeGozar", 10);
            mapping.put("noeTarh", 11);
            mapping.put("nationalIDAsli", 12);
            mapping.put("vahedeSazmani", 13);
            mapping.put("policyNo", 14);
            mapping.put("codeBimeShode", 15);
            mapping.put("codeRayaneBimeName", 16);
            mapping.put("nationalID", 17);
            mapping.put("serialMoarefiName", 18);
            mapping.put("personelID", 19);
            mapping.put("pardakhtAzMahal", 20);
            mapping.put("codeTarh", 23);
            mapping.put("nameTarh", 24);
            mapping.put("tasvieShode", 25);
            mapping.put("shomareBaygani", 26);
            mapping.put("gruheBimari", 27);
            mapping.put("codeRayaneMoredKhesarat", 28);
            mapping.put("tarikhBimari", 29);
            mapping.put("tarikhElamKhesart", 30);
            mapping.put("noeBimari", 31);
            mapping.put("codeKarshenas", 32);
            mapping.put("vahedeSodour", 33);
            mapping.put("nameKarshenas", 34);
            mapping.put("moaref", 35);
            mapping.put("karshenasParvande", 36);
            mapping.put("nameMarkasDarmani", 37);
            mapping.put("noeTahvilMadarek", 38);
            mapping.put("hazineElamShode", 39);
            mapping.put("mablaghMotabegheTarefe", 40);
            mapping.put("hazinePardakhti", 41);
            mapping.put("maliat", 42);
            mapping.put("franshiz", 43);


        }

        try {
            fis = new FileInputStream(fileUpload);
            XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
            int rows = mySheet.getPhysicalNumberOfRows();
            if (rows < 2) {
                return null;
            }

            Iterator<Row> rowIterator = mySheet.iterator();
            rowIterator.next();//ignore first Row//
            Cell cell = null;
            BigInteger invoiceExcelID = new BigInteger(DateUtil.getCurrentDate().replace("/", "") + DateUtil.getCurrentTime().replace(":", ""));

            while (rowIterator.hasNext()) {
                rowError = new HashMap<Integer, String>();
                String error = null;
                row = (Row) rowIterator.next();
                if (row == null)
                    continue;

                cell = row.getCell(mapping.get("serialMoarefiName"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    serialMoarefiName = cell.getStringCellValue();
                }
                if(serialMoarefiName != null ){
                    continue;
                }

                cell = row.getCell(mapping.get("codeRayaneBimeName"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "شماره بيمه نامه الزامي است";
                    rowError.put(mapping.get("codeRayaneBimeName"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    codeRayaneBimeName = cell.getStringCellValue();
                    policy = policyDAO.findById(new BigDecimal(codeRayaneBimeName));
                    if (policy == null) {
                        error = "بيمه نامه اي با اين شماره بيمه نامه در سيستم موجود نيست";
                        rowError.put(mapping.get("codeRayaneBimeName"), error);
                        if (rowError.size() > 0) {
                            errorMap.put(row.getRowNum(), rowError);
                        }
                        continue;
                    }
                }

                cell = row.getCell(mapping.get("nationalID"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "کدملي بيمه شده الزامي است.";
                    rowError.put(mapping.get("nationalID"), error);
                    if (rowError.size() > 0) {
                        errorMap.put(row.getRowNum(), rowError);
                    }
                    continue;
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nationalID = cell.getStringCellValue();
                    insuredPerson = insuredPersonDAO.findByNationalAndPolicyID(nationalID, policy.getId());
                    if (insuredPerson == null) {
                        notExist = true;
                    } else {
                        Account account = insuredPersonDAO.findAccountByInsuredPerson(insuredPerson.getMainInsuredPerson());
                        if (account == null || (account != null && account.getSheba() == null)) {
                            notExist = true;
                        }
                    }
                }

                cell = row.getCell(mapping.get("noeBimari"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "نوع بيماري الزامي است";
                    rowError.put(mapping.get("noeBimari"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    noeBimari = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("hazinePardakhti"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "هزينه پرداختي الزامي است";
                    rowError.put(mapping.get("hazinePardakhti"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    hazinePardakhti = new BigInteger(cell.getStringCellValue());
                }
                cell = row.getCell(mapping.get("tarikhBimari"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "تاريخ بيماري الزامي است";
                    rowError.put(mapping.get("tarikhBimari"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    tarikhBimari = new Long(cell.getStringCellValue().replaceAll("/", ""));
                }
                cell = row.getCell(mapping.get("hazineElamShode"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    hazineElamShode = new BigInteger(cell.getStringCellValue());
                }

                //check Kardane tekrari nabudan khesarat
                if (notExist == false) {
                    duplicate = receptionExcelDAO.checkDuplicateReceptionExcel(insuredPerson, noeBimari, hazineElamShode, tarikhBimari, bimarestani);
                }
                if (duplicate) {
                    error = "خسارت تکراری است";
                    rowError.put(mapping.get("nationalID"), error);
                }

                cell = row.getCell(mapping.get("radif"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    radif = new Long(cell.getStringCellValue());
                }

                cell = row.getCell(mapping.get("tarikhHavale"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    tarikhHavale = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("shomareHavale"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    shomareHavale = new Long(cell.getStringCellValue());
                }
                cell = row.getCell(mapping.get("shomareParvande"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    shomareParvande = new Long(cell.getStringCellValue());
                }
                cell = row.getCell(mapping.get("vahedePardakht"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    vahedePardakht = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("nameBimeShode"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nameBimeShode = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("nameBimeGozar"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nameBimeGozar = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("nameBimeShodeAsli"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nameBimeShodeAsli = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("nationalIDAsli"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nationalIDAsli = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("vahedeSazmani"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    vahedeSazmani = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("codeBimeShode"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    codeBimeShode = new Long(cell.getStringCellValue());
                }
                cell = row.getCell(mapping.get("policyNo"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    policyNo = new Long(cell.getStringCellValue());
                }

                cell = row.getCell(mapping.get("personelID"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    personelID = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("pardakhtAzMahal"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    pardakhtAzMahal = cell.getStringCellValue();
                }

                cell = row.getCell(mapping.get("codeTarh"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    codeTarh = new Long(cell.getStringCellValue());
                }

                cell = row.getCell(mapping.get("noeTarh"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    noeTarh = cell.getStringCellValue();
                }

                cell = row.getCell(mapping.get("nameTarh"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nameTarh = cell.getStringCellValue();
                }

                cell = row.getCell(mapping.get("tasvieShode"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    tasvieShode = cell.getStringCellValue();
                }

                cell = row.getCell(mapping.get("shomareBaygani"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    shomareBaygani = new Long(cell.getStringCellValue());
                }
                if (mapping.containsKey("grouhKariBimeGozar")) {
                    cell = row.getCell(mapping.get("grouhKariBimeGozar"));
                    if (!DataValidation.isCellEmpty(cell)) {
                        cell.setCellType(Cell.CELL_TYPE_STRING);
                        grouhKariBimeGozar = cell.getStringCellValue();
                    }
                }
                cell = row.getCell(mapping.get("tarikhElamKhesart"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    tarikhElamKhesart = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("codeKarshenas"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    codeKarshenas = new Long(cell.getStringCellValue());
                }
                cell = row.getCell(mapping.get("vahedeSodour"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    vahedeSodour = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("moaref"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    moaref = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("nameKarshenas"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nameKarshenas = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("karshenasParvande"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    karshenasParvande = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("nameMarkasDarmani"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nameMarkasDarmani = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("noeTahvilMadarek"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    noeTahvilMadarek = cell.getStringCellValue();
                }

                cell = row.getCell(mapping.get("maliat"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    maliat = new Long(cell.getStringCellValue());
                }
                cell = row.getCell(mapping.get("franshiz"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    franshiz = new BigInteger(cell.getStringCellValue());
                }
                cell = row.getCell(mapping.get("vazeiatParvande"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    vazeiatParvande = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("karbarSabteParvande"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    karbarSabteParvande = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("gruheBimari"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    gruheBimari = cell.getStringCellValue();
                }
                if (mapping.containsKey("codeRayaneMoredKhesarat")) {
                    cell = row.getCell(mapping.get("codeRayaneMoredKhesarat"));
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    if (!DataValidation.isCellEmpty(cell) && !cell.getStringCellValue().equals("")) {

                        codeRayaneMoredKhesarat = new BigDecimal(cell.getStringCellValue());
                    }
                }
                if (mapping.containsKey("mablaghMotabegheTarefe")) {
                    cell = row.getCell(mapping.get("mablaghMotabegheTarefe"));
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    if (!DataValidation.isCellEmpty(cell) && !cell.getStringCellValue().equals("")) {

                        mablaghMohasebeSodeMotabeghTarefe = new BigInteger(cell.getStringCellValue());
                    }
                }
                if (mapping.containsKey("noeHavale")) {
                    cell = row.getCell(mapping.get("noeHavale"));
                    if (!DataValidation.isCellEmpty(cell)) {
                        cell.setCellType(Cell.CELL_TYPE_STRING);
                        noeHavale = cell.getStringCellValue();
                    }
                }


                if (notExist == true) {
                    boolean duplicateInNotExistTable = receptionExcelNotExistIPDAO.checkDuplicateReceptionExcel(nationalID, policy, noeBimari, hazineElamShode, tarikhBimari, bimarestani);

                    if (duplicateInNotExistTable) {
                        error = "خسارت تکراری است";
                        rowError.put(mapping.get("nationalID"), error);
                    }
                    if (duplicateInNotExistTable == false) {
                        ViewReceptionExcel viewReceptionExcelNotExist = new ViewReceptionExcel();
                        viewReceptionExcelNotExist.setInvoiceExcelID(invoiceExcelID);
                        viewReceptionExcelNotExist.setCodeKarshenas(codeKarshenas);
                        viewReceptionExcelNotExist.setCodeBimeShode(codeBimeShode);
                        viewReceptionExcelNotExist.setBimeGozar(nameBimeGozar);
                        viewReceptionExcelNotExist.setPolicyno(policyNo);
                        viewReceptionExcelNotExist.setCodeTarh(codeTarh);
                        viewReceptionExcelNotExist.setFranshiz(franshiz);
                        viewReceptionExcelNotExist.setGrouhKariBimeGozar(grouhKariBimeGozar);
                        if (bimarestani) {
                            viewReceptionExcelNotExist.setBimarestani(1l);
                            viewReceptionExcelNotExist.setHazineBimarestaniElami(hazineElamShode);
                            viewReceptionExcelNotExist.setHazineBimarestaniPardakhti(hazinePardakhti);
                        } else {
                            viewReceptionExcelNotExist.setBimarestani(0l);
                            viewReceptionExcelNotExist.setHazineParaElami(hazineElamShode);
                            viewReceptionExcelNotExist.setHazineParaPardakhti(hazinePardakhti);
                        }
                        viewReceptionExcelNotExist.setPatientNationalID(nationalID);
                        viewReceptionExcelNotExist.setAsliNationalID(nationalIDAsli);
                        viewReceptionExcelNotExist.setPatientName(nameBimeShode);
                        viewReceptionExcelNotExist.setAsliFullName(nameBimeShodeAsli);
                        viewReceptionExcelNotExist.setPersonelID(personelID);
                        viewReceptionExcelNotExist.setPolicy(policy);
                        viewReceptionExcelNotExist.setKarshenasParvande(karshenasParvande);
                        viewReceptionExcelNotExist.setMaliat(maliat);
                        viewReceptionExcelNotExist.setNameKarshenas(nameKarshenas);
                        viewReceptionExcelNotExist.setNameMarkazDarmani(nameMarkasDarmani);
                        viewReceptionExcelNotExist.setNoeBimari(noeBimari);
                        viewReceptionExcelNotExist.setNoeTahvilMadarek(noeTahvilMadarek);
                        viewReceptionExcelNotExist.setNoeTarh(noeTarh);
                        viewReceptionExcelNotExist.setPardakhtAzMahal(pardakhtAzMahal);
                        viewReceptionExcelNotExist.setRadif(radif);
                        viewReceptionExcelNotExist.setSerialMoarefiName(serialMoarefiName);
                        viewReceptionExcelNotExist.setShomareBaygani(shomareBaygani);
                        viewReceptionExcelNotExist.setShomareHavale(shomareHavale);
                        viewReceptionExcelNotExist.setShomareParvande(shomareParvande);
                        viewReceptionExcelNotExist.setTasvieShode(tasvieShode);
                        viewReceptionExcelNotExist.setVahedePardakhti(vahedePardakht);
                        viewReceptionExcelNotExist.setVehedeMoaref(moaref);
                        viewReceptionExcelNotExist.setVahedeSazmani(vahedeSazmani);
                        viewReceptionExcelNotExist.setVehedeSodour(vahedeSodour);
                        viewReceptionExcelNotExist.setPolicyName(nameTarh);
                        viewReceptionExcelNotExist.setNoeHavale(noeHavale);
                        viewReceptionExcelNotExist.setInvoiceExcelID(invoiceExcelID);
                        viewReceptionExcelNotExist.setTarikhBimari(DateUtil.getStrDate(tarikhBimari));
                        viewReceptionExcelNotExist.setTarikhHavale(tarikhHavale);
                        viewReceptionExcelNotExist.setTarikhElamKhesarat(tarikhElamKhesart);
                        viewReceptionExcelNotExist.setVazeiatParvande(vazeiatParvande);
                        viewReceptionExcelNotExist.setKarbarSabteParvande(karbarSabteParvande);
                        viewReceptionExcelNotExist.setGruheBimari(gruheBimari);
                        viewReceptionExcelNotExist.setCodeRayaneMoredKhesarat(codeRayaneMoredKhesarat);
                        viewReceptionExcelNotExist.setMablaghMohasebeSodeMotabeghTarefe(mablaghMohasebeSodeMotabeghTarefe);
                        viewReceptionExcelList.add(viewReceptionExcelNotExist);
                    }

                } else if (duplicate == false) {

                    ViewReceptionExcel viewDBReceptionExcel = new ViewReceptionExcel();
                    viewDBReceptionExcel.setInvoiceExcelID(invoiceExcelID);
                    viewDBReceptionExcel.setCodeKarshenas(codeKarshenas);
                    viewDBReceptionExcel.setState(1l);
                    viewDBReceptionExcel.setCodeBimeShode(codeBimeShode);
                    viewDBReceptionExcel.setBimeGozar(nameBimeGozar);
                    viewDBReceptionExcel.setPolicyno(policyNo);
                    viewDBReceptionExcel.setCodeTarh(codeTarh);
                    viewDBReceptionExcel.setFranshiz(franshiz);
                    viewDBReceptionExcel.setGrouhKariBimeGozar(grouhKariBimeGozar);
                    if (bimarestani) {
                        viewDBReceptionExcel.setBimarestani(1l);
                        viewDBReceptionExcel.setHazineBimarestaniElami(hazineElamShode);
                        viewDBReceptionExcel.setHazineBimarestaniPardakhti(hazinePardakhti);
                    } else {
                        viewDBReceptionExcel.setBimarestani(0l);
                        viewDBReceptionExcel.setHazineParaElami(hazineElamShode);
                        viewDBReceptionExcel.setHazineParaPardakhti(hazinePardakhti);
                    }
                    viewDBReceptionExcel.setInsuredPerson(insuredPerson);
                    viewDBReceptionExcel.setPerson(insuredPerson.getPerson());
                    viewDBReceptionExcel.setPolicy(policy);
                    viewDBReceptionExcel.setKarshenasParvande(karshenasParvande);
                    viewDBReceptionExcel.setMaliat(maliat);
                    viewDBReceptionExcel.setNameKarshenas(nameKarshenas);
                    viewDBReceptionExcel.setNameMarkazDarmani(nameMarkasDarmani);
                    viewDBReceptionExcel.setNoeBimari(noeBimari);
                    viewDBReceptionExcel.setNoeTahvilMadarek(noeTahvilMadarek);
                    viewDBReceptionExcel.setNoeTarh(noeTarh);
                    viewDBReceptionExcel.setPardakhtAzMahal(pardakhtAzMahal);
                    viewDBReceptionExcel.setRadif(radif);
                    viewDBReceptionExcel.setSerialMoarefiName(serialMoarefiName);
                    viewDBReceptionExcel.setShomareBaygani(shomareBaygani);
                    viewDBReceptionExcel.setShomareHavale(shomareHavale);
                    viewDBReceptionExcel.setShomareParvande(shomareParvande);
                    viewDBReceptionExcel.setTasvieShode(tasvieShode);
                    viewDBReceptionExcel.setVahedePardakhti(vahedePardakht);
                    viewDBReceptionExcel.setVehedeMoaref(moaref);
                    viewDBReceptionExcel.setVahedeSazmani(vahedeSazmani);
                    viewDBReceptionExcel.setVehedeSodour(vahedeSodour);
                    viewDBReceptionExcel.setPolicyName(nameTarh);
                    viewDBReceptionExcel.setNoeHavale(noeHavale);
                    viewDBReceptionExcel.setInvoiceExcelID(invoiceExcelID);
                    viewDBReceptionExcel.setPersonelID(personelID);
                    viewDBReceptionExcel.setPatientNationalID(nationalID);
                    viewDBReceptionExcel.setAsliFullName(nameBimeShodeAsli);
                    viewDBReceptionExcel.setAsliNationalID(nationalIDAsli);
                    viewDBReceptionExcel.setPatientName(nameBimeShode);
                    viewDBReceptionExcel.setTarikhBimari(DateUtil.getStrDate(tarikhBimari));
                    viewDBReceptionExcel.setTarikhHavale(tarikhHavale);
                    viewDBReceptionExcel.setTarikhElamKhesarat(tarikhElamKhesart);
                    viewDBReceptionExcel.setVazeiatParvande(vazeiatParvande);
                    viewDBReceptionExcel.setKarbarSabteParvande(karbarSabteParvande);
                    viewDBReceptionExcel.setGruheBimari(gruheBimari);
                    viewDBReceptionExcel.setCodeRayaneMoredKhesarat(codeRayaneMoredKhesarat);
                    viewDBReceptionExcel.setMablaghMohasebeSodeMotabeghTarefe(mablaghMohasebeSodeMotabeghTarefe);
                    viewDBReceptionExcelList.add(viewDBReceptionExcel);
                } else {
                    duplicate = true;
                }

                if (duplicate) {
                    error = "خسارت تکراری است";
                    rowError.put(mapping.get("nationalID"), error);
                }

                notExist = false;
                duplicate = false;
                policy = null;
                policyNo = null;
                nationalID = null;
                noeBimari = null;
                tarikhBimari = null;
                radif = null;
                noeHavale = null;
                tarikhHavale = null;
                shomareHavale = null;
                shomareParvande = null;
                vahedePardakht = null;
                nameBimeGozar = null;
                vahedeSazmani = null;
                codeBimeShode = null;
                codeRayaneBimeName = null;
                serialMoarefiName = null;
                pardakhtAzMahal = null;
                codeTarh = null;
                noeTarh = null;
                tasvieShode = null;
                shomareBaygani = null;
                grouhKariBimeGozar = null;
                tarikhElamKhesart = null;
                codeKarshenas = null;
                vahedeSodour = null;
                moaref = null;
                nameKarshenas = null;
                karshenasParvande = null;
                nameMarkasDarmani = null;
                noeTahvilMadarek = null;
                hazinePardakhti = null;
                hazineElamShode = null;
                maliat = null;
                franshiz = null;
                nameBimeShode = null;
                nameBimeShodeAsli = null;
                nationalIDAsli = null;
                personelID = null;
                nameTarh = null;
                insuredPerson = null;
                vazeiatParvande = null;
                karbarSabteParvande = null;
                gruheBimari = null;
                codeRayaneMoredKhesarat = null;
                mablaghMohasebeSodeMotabeghTarefe = null;


                if (rowError.size() > 0) {
                    errorMap.put(row.getRowNum(), rowError);
                }
            }

        } catch (Exception e) {
            if (rowError.size() > 0) {
                errorMap.put(row.getRowNum(), rowError);
            }
            if (errorMap.size() > 0) {
                return null;
            }
            return null;
        }
        return viewDBReceptionExcelList;

    }

    @Override
    public List<ViewReceptionExcel> sabtExcelKhesarat(ReceptionExcelFiles receptionExcelFile, boolean bimarestani, File fileUpload, Users user, List<ViewReceptionExcel> viewDBReceptionExcelList, List<ViewReceptionExcel> viewReceptionExcelList) {

        String date = DateUtil.getCurrentDate();
        String time = DateUtil.getCurrentTime();

        for (int i = 0; i < viewDBReceptionExcelList.size(); i++) {

            ViewReceptionExcel viewDBReceptionExcel = viewDBReceptionExcelList.get(i);
            if(viewDBReceptionExcel.getSerialMoarefiName() != null){
                continue;
            }
            ReceptionExcel receptionExcel = new ReceptionExcel();
            receptionExcel.setInvoiceExcelID(viewDBReceptionExcel.getInvoiceExcelID());
            receptionExcel.setCodeKarshenas(viewDBReceptionExcel.getCodeKarshenas());
            receptionExcel.setState(1l);
            receptionExcel.setCodeBimeShode(viewDBReceptionExcel.getCodeBimeShode());
            receptionExcel.setBimeGozar(viewDBReceptionExcel.getBimeGozar());
            receptionExcel.setPolicyNo(viewDBReceptionExcel.getPolicyno());
            receptionExcel.setCodeTarh(viewDBReceptionExcel.getCodeTarh());
            receptionExcel.setFranshiz(viewDBReceptionExcel.getFranshiz());
            receptionExcel.setGrouhKariBimeGozar(viewDBReceptionExcel.getGrouhKariBimeGozar());
            if (bimarestani) {
                receptionExcel.setBimarestani(1l);
                receptionExcel.setHazineBimarestaniElami(viewDBReceptionExcel.getHazineBimarestaniElami());
                receptionExcel.setHazineBimarestaniPardakhti(viewDBReceptionExcel.getHazineBimarestaniPardakhti());
            } else {
                receptionExcel.setBimarestani(0l);
                receptionExcel.setHazineParaElami(viewDBReceptionExcel.getHazineParaElami());
                receptionExcel.setHazineParaPardakhti(viewDBReceptionExcel.getHazineParaPardakhti());
            }
            receptionExcel.setInsuredPerson(viewDBReceptionExcel.getInsuredPerson());
            receptionExcel.setPerson(viewDBReceptionExcel.getPerson());
            receptionExcel.setPolicy(viewDBReceptionExcel.getPolicy());
            receptionExcel.setKarshenasParvande(viewDBReceptionExcel.getKarshenasParvande());
            receptionExcel.setMaliat(viewDBReceptionExcel.getMaliat());
            receptionExcel.setNameKarshenas(viewDBReceptionExcel.getNameKarshenas());
            receptionExcel.setNameMarkazDarmani(viewDBReceptionExcel.getNameMarkazDarmani());
            receptionExcel.setNoeBimari(viewDBReceptionExcel.getNoeBimari());
            receptionExcel.setNoeTahvilMadarek(viewDBReceptionExcel.getNoeTahvilMadarek());
            receptionExcel.setNoeTarh(viewDBReceptionExcel.getNoeTarh());
            receptionExcel.setPardakhtAzMahal(viewDBReceptionExcel.getPardakhtAzMahal());
            receptionExcel.setRadif(viewDBReceptionExcel.getRadif());
            receptionExcel.setSerialMoarefiName(viewDBReceptionExcel.getSerialMoarefiName());
            receptionExcel.setShomareBaygani(viewDBReceptionExcel.getShomareBaygani());
            receptionExcel.setShomareHavale(viewDBReceptionExcel.getShomareHavale());
            receptionExcel.setTarikhHavale(new Long(viewDBReceptionExcel.getTarikhHavale().replaceAll("/", "")));
            receptionExcel.setShomareParvande(viewDBReceptionExcel.getShomareParvande());
            receptionExcel.setTasvieShode(viewDBReceptionExcel.getTasvieShode());
            receptionExcel.setVahedePardakhti(viewDBReceptionExcel.getVahedePardakhti());
            receptionExcel.setVahedeMoaref(viewDBReceptionExcel.getVehedeMoaref());
            receptionExcel.setVahedeSazmani(viewDBReceptionExcel.getVahedeSazmani());
            receptionExcel.setVahedeSodour(viewDBReceptionExcel.getVehedeSodour());
            receptionExcel.setTarikhBimari(new Long(viewDBReceptionExcel.getTarikhBimari().replaceAll("/", "")));
            receptionExcel.setNameTarh(viewDBReceptionExcel.getPolicyName());
            receptionExcel.setTarikhElamKhesarat(new Long(viewDBReceptionExcel.getTarikhElamKhesarat().replaceAll("/", "")));
            receptionExcel.setCreatedate(date);
            receptionExcel.setCreatetime(time);
            receptionExcel.setUsers(user);
            receptionExcel.setNoeHavale(viewDBReceptionExcel.getNoeHavale());
//            byte[] fileByteArray = null;
//            try {
//                fileByteArray = java.nio.file.Files.readAllBytes(fileUpload.toPath());
//            } catch (IOException e) {
//            }
            receptionExcel.setReceptionExcelFile(receptionExcelFile);
            receptionExcel.setVazeiatParvande(viewDBReceptionExcel.getVazeiatParvande());
            receptionExcel.setKarbarSabteParvande(viewDBReceptionExcel.getKarbarSabteParvande());
            receptionExcel.setGruheBimari(viewDBReceptionExcel.getGruheBimari());
            receptionExcel.setCodeRayaneMoredKhesarat(viewDBReceptionExcel.getCodeRayaneMoredKhesarat());
            receptionExcel.setMablaghMotabeghTarefe(viewDBReceptionExcel.getMablaghMohasebeSodeMotabeghTarefe());
            receptionExcel.setSheba(viewDBReceptionExcel.getSheba());
            receptionExcel = (ReceptionExcel) receptionExcelDAO.saveOrUpdate(receptionExcel);
        }

        for (int i = 0; i < viewReceptionExcelList.size(); i++) {

            ViewReceptionExcel viewReceptionExcelNotExist = viewReceptionExcelList.get(i);
            if(viewReceptionExcelNotExist.getSerialMoarefiName() != null){
                continue;
            }
            ReceptionExcelNotExistIP reNotExistIP = new ReceptionExcelNotExistIP();
            reNotExistIP.setInvoiceExcelID(viewReceptionExcelNotExist.getInvoiceExcelID());
            reNotExistIP.setCodeKarshenas(viewReceptionExcelNotExist.getCodeKarshenas());
            reNotExistIP.setState(1l);
            reNotExistIP.setCodeBimeShode(viewReceptionExcelNotExist.getCodeBimeShode());
            reNotExistIP.setBimeGozar(viewReceptionExcelNotExist.getBimeGozar());
            reNotExistIP.setPolicyNo(viewReceptionExcelNotExist.getPolicyno());
            reNotExistIP.setCodeTarh(viewReceptionExcelNotExist.getCodeTarh());
            reNotExistIP.setFranshiz(viewReceptionExcelNotExist.getFranshiz());
            reNotExistIP.setGrouhKariBimeGozar(viewReceptionExcelNotExist.getGrouhKariBimeGozar());
            if (bimarestani) {
                reNotExistIP.setBimarestani(1l);
                reNotExistIP.setHazineBimarestaniElami(viewReceptionExcelNotExist.getHazineBimarestaniElami());
                reNotExistIP.setHazineBimarestaniPardakhti(viewReceptionExcelNotExist.getHazineBimarestaniPardakhti());
            } else {
                reNotExistIP.setBimarestani(0l);
                reNotExistIP.setHazineParaElami(viewReceptionExcelNotExist.getHazineParaElami());
                reNotExistIP.setHazineParaPardakhti(viewReceptionExcelNotExist.getHazineParaPardakhti());
            }
            reNotExistIP.setNationalID(viewReceptionExcelNotExist.getPatientNationalID());
            reNotExistIP.setNationalIDAsli(viewReceptionExcelNotExist.getAsliNationalID());
            reNotExistIP.setNameBimeShode(viewReceptionExcelNotExist.getPatientName());
            reNotExistIP.setNameBimeShodeAsli(viewReceptionExcelNotExist.getAsliFullName());
            reNotExistIP.setPersonelID(viewReceptionExcelNotExist.getPersonelID());
            reNotExistIP.setPolicy(viewReceptionExcelNotExist.getPolicy());
            reNotExistIP.setKarshenasParvande(viewReceptionExcelNotExist.getKarshenasParvande());
            reNotExistIP.setMaliat(viewReceptionExcelNotExist.getMaliat());
            reNotExistIP.setNameKarshenas(viewReceptionExcelNotExist.getNameKarshenas());
            reNotExistIP.setNameMarkazDarmani(viewReceptionExcelNotExist.getNameMarkazDarmani());
            reNotExistIP.setNoeBimari(viewReceptionExcelNotExist.getNoeBimari());
            reNotExistIP.setNoeTahvilMadarek(viewReceptionExcelNotExist.getNoeTahvilMadarek());
            reNotExistIP.setNoeTarh(viewReceptionExcelNotExist.getNoeTarh());
            reNotExistIP.setPardakhtAzMahal(viewReceptionExcelNotExist.getPardakhtAzMahal());
            reNotExistIP.setRadif(viewReceptionExcelNotExist.getRadif());
            reNotExistIP.setSerialMoarefiName(viewReceptionExcelNotExist.getSerialMoarefiName());
            reNotExistIP.setShomareBaygani(viewReceptionExcelNotExist.getShomareBaygani());
            reNotExistIP.setShomareHavale(viewReceptionExcelNotExist.getShomareHavale());
            reNotExistIP.setTarikhHavale(new Long(viewReceptionExcelNotExist.getTarikhHavale().replaceAll("/", "")));
            reNotExistIP.setShomareParvande(viewReceptionExcelNotExist.getShomareParvande());
            reNotExistIP.setTasvieShode(viewReceptionExcelNotExist.getTasvieShode());
            reNotExistIP.setVahedePardakhti(viewReceptionExcelNotExist.getVahedePardakhti());
            reNotExistIP.setVahedeMoaref(viewReceptionExcelNotExist.getVehedeMoaref());
            reNotExistIP.setVahedeSazmani(viewReceptionExcelNotExist.getVahedeSazmani());
            reNotExistIP.setVahedeSodour(viewReceptionExcelNotExist.getVehedeSodour());
            reNotExistIP.setTarikhBimari(new Long(viewReceptionExcelNotExist.getTarikhBimari().replaceAll("/", "")));
            reNotExistIP.setTarikhElamKhesarat(new Long(viewReceptionExcelNotExist.getTarikhElamKhesarat().replaceAll("/", "")));
            reNotExistIP.setCreatedate(date);
            reNotExistIP.setCreatetime(time);
            reNotExistIP.setUsers(user);
            reNotExistIP.setNameTarh(viewReceptionExcelNotExist.getPolicyName());
            reNotExistIP.setNoeHavale(viewReceptionExcelNotExist.getNoeHavale());
            byte[] fileByteArray = null;
            try {
                fileByteArray = java.nio.file.Files.readAllBytes(fileUpload.toPath());
            } catch (IOException e) {
            }
            reNotExistIP.setExcel(fileByteArray);
            reNotExistIP.setVazeiatParvande(viewReceptionExcelNotExist.getVazeiatParvande());
            reNotExistIP.setKarbarSabteParvande(viewReceptionExcelNotExist.getKarbarSabteParvande());
            reNotExistIP.setGruheBimari(viewReceptionExcelNotExist.getGruheBimari());
            reNotExistIP.setCodeRayaneMoredKhesarat(viewReceptionExcelNotExist.getCodeRayaneMoredKhesarat());
            reNotExistIP.setMablaghMotabeghTarefe(viewReceptionExcelNotExist.getMablaghMohasebeSodeMotabeghTarefe());
            reNotExistIP.setSheba(viewReceptionExcelNotExist.getSheba());
            reNotExistIP = (ReceptionExcelNotExistIP) receptionExcelNotExistIPDAO.saveOrUpdate(reNotExistIP);
        }
        return viewDBReceptionExcelList;
    }

    @Override
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

    @Transactional
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
            String sanamCredebitId = ((BigDecimal) baseCredebit[7]).toPlainString();
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

            credebit = (Credebit) credebitDAO.saveOrUpdate(credebit);//credebitDAO.manualSaveOrUpdate(credebit);
            credebitList.add(credebit);
            createCredebitReceptionExcel(invoiceExcelID, credebit, user);

        }

        return credebitList;
    }

    public void createCredebitReceptionExcel(BigInteger invoiceExcelID, Credebit credebit, Users user) {

        int i = 0;
        List<ReceptionExcel> receptionExcels = receptionExcelDAO.findListByInvoiceExcelIDAndMainPerson(invoiceExcelID, credebit.getNationalID(), credebit.getPolicyNo(), credebit.getInvoiceNo());
        //receptionExcels
        System.out.println(receptionExcels.size());
        for (ReceptionExcel receptionExcel : receptionExcels) {
            CredebitReceptionExcel credebitReceptionExcel = new CredebitReceptionExcel();
            credebitReceptionExcel.setReceptionExcel(receptionExcel);
            credebitReceptionExcel.setCredebit(credebit);
            credebitReceptionExcel.setCreatedate(DateUtil.getCurrentDate());
            credebitReceptionExcel.setCreatetime(DateUtil.getCurrentTime());
            credebitReceptionExcel.setUsers(user);
            credebitReceptionExcel.setState(1l);
            credebitReceptionExcelDAO.saveOrUpdate(credebitReceptionExcel);
            System.out.println(i++);
        }

    }

    @Override
    public PaginatedListImpl<ViewReceptionExcel> getViewReceptionExcelPaginatedList(int page, List<ViewReceptionExcel> viewExcelList) {
        PaginatedListImpl<ViewReceptionExcel> resultList = new PaginatedListImpl<ViewReceptionExcel>();
        resultList.setPageNumber(page); //(page)
        resultList.setObjectsPerPage(PagingUtil.MAX_OBJECTS_PER_PAGE);
        resultList.setList(viewExcelList);
        resultList.setPageNumber(1);
        resultList.setObjectsPerPage(Integer.MAX_VALUE);
        resultList.setFullListSize(viewExcelList.size());
        return resultList;
    }

    @Transactional
    public File produceErrorExcelFile(Map<Integer, Map<Integer, String>> error, File fileUpload) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileUpload);
            XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
            Row row = null;
            for (Integer rowNum : error.keySet()) {
                row = mySheet.getRow(rowNum);
                Map<Integer, String> errors = error.get(row.getRowNum());
                for (Integer i : errors.keySet()) {
                    Cell cell = row.getCell(i);
                    if (cell == null) {
                        cell = row.createCell(i);
                    }
                    CellStyle style = myWorkBook.createCellStyle();
                    style.setFillForegroundColor(IndexedColors.RED.getIndex());
                    style.setFillPattern(CellStyle.SOLID_FOREGROUND);
                    cell.setCellStyle(style);
                    Drawing drawing = cell.getSheet().createDrawingPatriarch();
                    CreationHelper factory = cell.getSheet().getWorkbook().getCreationHelper();
                    ClientAnchor anchor = factory.createClientAnchor();
                    Comment comment = drawing.createCellComment(anchor);
                    RichTextString str = factory.createRichTextString(errors.get(i));
                    comment.setString(str);
                    cell.setCellComment(comment);
                }

            }

            FileOutputStream os = new FileOutputStream(fileUpload);
            myWorkBook.write(os);
            os.close();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return fileUpload;
    }

    @Override
    public List<ViewInsuredPerson> validatePersonExcel(File fileUpload, Map<Integer, Map<Integer, String>> errorMap) {

        FileInputStream fis = null;
        Policy policy = null;
        String policyNo = null;
        BigDecimal insuredPersonCode = null;
        BigInteger mobile = null;
        BigDecimal mainInsuredPersonCode = null;
        String personelID = null;
        String firstName = null;
        String lastName = null;
        String fatherName = null;
        String familyRelation = null;
        String gender = null;
        String day = null;
        String month = null;
        String year = null;
        String idNo = null;
        String nationalID = null;
        String beginDate = null;
        String endDate = null;
        String sheba = null;
        InsuredPerson insuredPerson = null;


        List<ViewInsuredPerson> viewInsuredPersonList = new ArrayList<>();
        Map<Integer, String> rowError = null;
        Row row = null;

        Map<String, Integer> mapping = new HashMap<>();


        mapping.put("policyNo", 1);
        mapping.put("insuredPersonCode", 3);
        mapping.put("mobile", 5);
        mapping.put("mainInsuredPersonCode", 6);
        mapping.put("personelID", 7);
        mapping.put("firstName", 11);
        mapping.put("lastName", 13);
        mapping.put("fatherName", 14);
        mapping.put("familyRelation", 15);
        mapping.put("gender", 17);
        mapping.put("year", 16);
        mapping.put("month", 18);
        mapping.put("day", 19);
        mapping.put("idNo", 20);
        mapping.put("nationalID", 22);
        mapping.put("beginDate", 24);
        mapping.put("endDate", 25);
        mapping.put("sheba", 27);

        try {
            fis = new FileInputStream(fileUpload);
            XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
            int rows = mySheet.getPhysicalNumberOfRows();
            if (rows < 2) {
                return null;
            }

            Iterator<Row> rowIterator = mySheet.iterator();
            rowIterator.next();//ignore first Row//
            Cell cell = null;

            while (rowIterator.hasNext()) {
                rowError = new HashMap<Integer, String>();
                String error = null;
                row = (Row) rowIterator.next();
                if (row == null)
                    continue;


                cell = row.getCell(mapping.get("policyNo"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "شماره بيمه نامه الزامي است";
                    rowError.put(mapping.get("policyNo"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    policyNo = cell.getStringCellValue();
                    policy = policyDAO.findByPolicyNo(policyNo);
                    if (policy == null) {
                        error = "بيمه نامه اي با اين شماره بيمه نامه در سيستم موجود نيست";
                        rowError.put(mapping.get("policyNo"), error);
                        if (rowError.size() > 0) {
                            errorMap.put(row.getRowNum(), rowError);
                        }
                        continue;
                    }
                }

                cell = row.getCell(mapping.get("insuredPersonCode"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "کد بیمه شده الزامی است";
                    rowError.put(mapping.get("insuredPersonCode"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    insuredPersonCode = new BigDecimal(cell.getStringCellValue());
//                    insuredPerson = insuredPersonDAO.findById(insuredPersonCode);
//                    if (insuredPerson != null) {
//                        error = "بیمه شده تکراری است";
//                        rowError.put(mapping.get("insuredPersonCode"), error);
//                    }
                }
                cell = row.getCell(mapping.get("nationalID"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "کدملی بیمه شده الزامی است";
                    rowError.put(mapping.get("nationalID"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nationalID = cell.getStringCellValue();
                    insuredPerson = insuredPersonDAO.findByNationalAndPolicyID(nationalID, policy.getId());
                    if (insuredPerson != null) {
                        error = "بیمه شده تکراری است";
                        rowError.put(mapping.get("nationalID"), error);
                    }
                }
                cell = row.getCell(mapping.get("familyRelation"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "نسبت بیمه شده الزامی است";
                    rowError.put(mapping.get("familyRelation"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    familyRelation = cell.getStringCellValue();
                }

                if (familyRelation != null && familyRelation.equals("سرپرست")) {
                    cell = row.getCell(mapping.get("mobile"));
                    if (DataValidation.isCellEmpty(cell)) {
//                        error = "شماره موبایل الزامی است";
//                        rowError.put(mapping.get("mobile"), error);
                    } else {
                        cell.setCellType(Cell.CELL_TYPE_STRING);
                        mobile = new BigInteger(cell.getStringCellValue());
                    }
                }

                cell = row.getCell(mapping.get("mainInsuredPersonCode"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "کد بیمه شده اصلی الزامی است";
                    rowError.put(mapping.get("mainInsuredPersonCode"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    mainInsuredPersonCode = new BigDecimal(cell.getStringCellValue());
                }
                cell = row.getCell(mapping.get("personelID"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "کد پرسنلی بیمه شده الزامی است";
                    rowError.put(mapping.get("personelID"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    personelID = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("firstName"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "نام بیمه شده الزامی است";
                    rowError.put(mapping.get("firstName"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    firstName = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("lastName"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "نام خانوادگی بیمه شده الزامی است";
                    rowError.put(mapping.get("lastName"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    lastName = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("fatherName"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "نام پدر بیمه شده الزامی است";
                    rowError.put(mapping.get("fatherName"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    fatherName = cell.getStringCellValue();
                }

                cell = row.getCell(mapping.get("gender"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "جنسیت بیمه شده الزامی است";
                    rowError.put(mapping.get("gender"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    gender = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("day"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "روز تاریخ تولد بیمه شده الزامی است";
                    rowError.put(mapping.get("day"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    day = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("month"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "ماه تاریخ تولد بیمه شده الزامی است";
                    rowError.put(mapping.get("month"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    month = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("year"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "سال تاریخ تولد بیمه شده الزامی است";
                    rowError.put(mapping.get("year"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    year = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("idNo"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "شماره شناسنامه بیمه شده الزامی است";
                    rowError.put(mapping.get("idNo"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    idNo = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("beginDate"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "تاریخ شروع پوشش بیمه شده الزامی است";
                    rowError.put(mapping.get("beginDate"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    beginDate = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("endDate"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "تاریخ پایان پوشش بیمه شده الزامی است";
                    rowError.put(mapping.get("endDate"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    endDate = cell.getStringCellValue();
                }
                if (familyRelation != null && familyRelation.equals("سرپرست")) {
                    cell = row.getCell(mapping.get("sheba"));
                    if (DataValidation.isCellEmpty(cell)) {
//                        error = "شماره شبا برای بیمه شده اصلی الزامی است";
//                        rowError.put(mapping.get("sheba"), error);
                    } else {
                        cell.setCellType(Cell.CELL_TYPE_STRING);
                        sheba = cell.getStringCellValue();
                    }
                }
                if (familyRelation != null && familyRelation.equals("سرپرست")) {
                    insuredPerson = insuredPersonDAO.findMainPersonByPersonelIDAndPolicyID(personelID, policy.getId());
                    if (insuredPerson != null) {
                        error = "بیمه شده اضلی با این کد پرسنلی در بیkه نامه موجود می باشد";
                        rowError.put(mapping.get("personelID"), error);
                    }
                }


                ViewInsuredPerson viewInsuredPerson = new ViewInsuredPerson();
                viewInsuredPerson.setPolicy(policy);
                viewInsuredPerson.setPolicyNo(policyNo);
                viewInsuredPerson.setInsuredPersonCode(insuredPersonCode);
                viewInsuredPerson.setMobile(mobile);
                viewInsuredPerson.setMainInsuredPersonCode(mainInsuredPersonCode);
                viewInsuredPerson.setPersonelID(personelID);
                viewInsuredPerson.setFirstName(firstName);
                viewInsuredPerson.setLastName(lastName);
                viewInsuredPerson.setFatherName(fatherName);
                viewInsuredPerson.setFamilyRelation(familyRelation);
                viewInsuredPerson.setGender(gender);
                viewInsuredPerson.setDay(day);
                viewInsuredPerson.setMonth(month);
                viewInsuredPerson.setYear(year);
                viewInsuredPerson.setIdNo(idNo);
                viewInsuredPerson.setNationalID(nationalID);
                viewInsuredPerson.setBeginDate(beginDate);
                viewInsuredPerson.setEndDate(endDate);
                viewInsuredPerson.setSheba(sheba);
                viewInsuredPersonList.add(viewInsuredPerson);


                policy = null;
                policyNo = null;
                insuredPersonCode = null;
                mobile = null;
                mainInsuredPersonCode = null;
                personelID = null;
                firstName = null;
                lastName = null;
                fatherName = null;
                familyRelation = null;
                gender = null;
                day = null;
                month = null;
                year = null;
                idNo = null;
                nationalID = null;
                beginDate = null;
                endDate = null;
                sheba = null;
                insuredPerson = null;


                if (rowError.size() > 0) {
                    errorMap.put(row.getRowNum(), rowError);
                }
            }

        } catch (Exception e) {
            if (rowError.size() > 0) {
                errorMap.put(row.getRowNum(), rowError);
            }
            if (errorMap.size() > 0) {
                return null;
            }
            return null;
        }

        return viewInsuredPersonList;

    }

    @Transactional
    @Override
    public List<ViewInsuredPerson> getInsuredPersonFromFile(List<ViewInsuredPerson> viewInsuredPersonList, Users user) {

        List<ViewInsuredPerson> viewInsuredPersons = new ArrayList<>();
        String date = DateUtil.getCurrentDate();
        String time = DateUtil.getCurrentTime();
        for (int i = 0; i < viewInsuredPersonList.size(); i++) {
            ViewInsuredPerson viewInsuredPerson = viewInsuredPersonList.get(i);

            Person person = new Person();
            person.setName(viewInsuredPerson.getFirstName());
            person.setFamily(viewInsuredPerson.getLastName());
            person.setFathername(viewInsuredPerson.getFatherName());
            person.setNationalid(viewInsuredPerson.getNationalID());
            person.setIdno(viewInsuredPerson.getIdNo());
            String birthDate = viewInsuredPerson.getYear() + viewInsuredPerson.getMonth() + viewInsuredPerson.getDay();
            person.setPersianbirthdate(new Long(birthDate));
            person.setCreatetime(time);
            person.setCreatedate(date);
            person.setUsers(user);
            person.setState(1l);
            if (viewInsuredPerson.getGender().equals("زن")) {
                person.setGender(1l);
            } else {
                person.setGender(0l);
            }
            viewInsuredPerson.setPerson(person);


            InsuredPerson insuredPerson = new InsuredPerson();
            insuredPerson.setPerson(person);
            insuredPerson.setPolicy(viewInsuredPerson.getPolicy());
            insuredPerson.setPersonelid(viewInsuredPerson.getPersonelID());
            insuredPerson.setCreatetime(time);
            insuredPerson.setCreatedate(date);
            insuredPerson.setUsers(user);
            insuredPerson.setState(1l);
            String familyRelation = viewInsuredPerson.getFamilyRelation();
            if (familyRelation.equals("سرپرست")) {
                insuredPerson.setFamilyrelation(1l);
            } else if (familyRelation.equals("همسر")) {
                insuredPerson.setFamilyrelation(2l);
            } else if (familyRelation.equals("دختر")) {
                insuredPerson.setFamilyrelation(3l);
            } else if (familyRelation.equals("پسر")) {
                insuredPerson.setFamilyrelation(4l);
            } else if (familyRelation.equals("مادر")) {
                insuredPerson.setFamilyrelation(5l);
            } else if (familyRelation.equals("پدر")) {
                insuredPerson.setFamilyrelation(6l);
            }
            viewInsuredPerson.setInsuredPerson(insuredPerson);


            if (viewInsuredPerson.getSheba() != null) {

                Account account = new Account();
                account.setSheba(viewInsuredPerson.getSheba());
                account.setBegindate(DateUtil.getLongDateFromStrDate(viewInsuredPerson.getBeginDate()));
                account.setEnddate(DateUtil.getLongDateFromStrDate(viewInsuredPerson.getEndDate()));
                account.setCreatetime(time);
                account.setCreatedate(date);
                account.setUsers(user);
                account.setState(1l);
                account.setInsuredPerson(insuredPerson.getMainInsuredPerson());

                viewInsuredPerson.setAccount(account);
            }

            if (viewInsuredPerson.getMobile() != null) {

                Contact contact = new Contact();
                contact.setMobile(viewInsuredPerson.getMobile());
                contact.setPerson(person);
                contact.setCreatetime(time);
                contact.setCreatedate(date);
                contact.setUsers(user);
                contact.setState(1l);

                viewInsuredPerson.setContact(contact);
            }

            viewInsuredPerson.setBirthDate(viewInsuredPerson.getYear() + "/" + viewInsuredPerson.getMonth() + "/" + viewInsuredPerson.getDay());
            viewInsuredPersons.add(viewInsuredPerson);
        }


        return viewInsuredPersonList;
    }

    public Map<String, Family> validateFamily(List<ViewInsuredPerson> viewInsuredPersonList, Map<String, String> errorMap) {
        Map<String, Family> familyMap = new HashMap<String, Family>();
        String lastMainInsuredPersonCode = viewInsuredPersonList.get(0).getMainInsuredPersonCode().toString();
        for (ViewInsuredPerson viewInsuredPerson : viewInsuredPersonList) {
            InsuredPerson insuredPerson = viewInsuredPerson.getInsuredPerson();
            if (!viewInsuredPerson.getMainInsuredPersonCode().equals(new BigDecimal(lastMainInsuredPersonCode))) {
                familyMap.get(lastMainInsuredPersonCode).setHasCapacity(false);
                lastMainInsuredPersonCode = viewInsuredPerson.getMainInsuredPersonCode().toString();
            }
            Family family = new Family();

            String familyNo = insuredPerson.getPersonelid();
            BigDecimal policyID = insuredPerson.getPolicy().getId();
            String familyKey = viewInsuredPerson.getMainInsuredPersonCode().toString();
            if (insuredPerson.getFamilyrelation() == 1) {
                if (familyMap.containsKey(familyKey)) {
                    if (familyMap.get(familyKey).getSarparast() != null) {
                        if (errorMap.containsKey(familyKey)) {
                            errorMap.put(familyKey, errorMap.get(familyKey) + "*به ازای این کد پرسنلی دو بیمه شده ی اصلی موجود است. ");
                        } else {
                            errorMap.put(familyKey, "*به ازای این کد پرسنلی دو بیمه شده ی اصلی موجود است. ");
                        }

                    } else {
                        familyMap.get(familyKey).setSarparast(viewInsuredPerson);

                    }

                } else {
                    family.setFamilyKey(familyKey);
                    family.setFamilyNO(familyNo);
                    family.setSarparast(viewInsuredPerson);
                    family.setPolicyID(viewInsuredPerson.getPolicy().getId());
                    familyMap.put(familyKey, family);
                }

            } else {


                if (familyMap.containsKey(familyKey)) {
                    if (familyMap.get(familyKey).getHasCapacity()) {
                        familyMap.get(familyKey).getFamilyMembers().add(viewInsuredPerson);
                    } else {
                        if (errorMap.containsKey(familyKey)) {
                            errorMap.put(familyKey, errorMap.get(familyKey) + "*اطلاعات عضوی از این خانواده در کنار سایر اعضا نیامده است. ");
                        } else {
                            errorMap.put(familyKey, "*اطلاعات عضوی از این خانواده در کنار سایر اعضا نیامده است. ");
                        }
                    }

                } else {
                    family.setFamilyKey(familyKey);
                    family.setFamilyNO(familyNo);
                    family.getFamilyMembers().add(viewInsuredPerson);
                    family.setPolicyID(viewInsuredPerson.getPolicy().getId());
                    familyMap.put(familyKey, family);

                }
            }
        }


        for (Family family : familyMap.values()) {
            String familyKey = family.getFamilyKey();
            String personelID = family.getFamilyNO();
            BigDecimal mainInsuredPersonCode = null;
            if (family.getFamilyMembers() != null && family.getFamilyMembers().size() > 0) {
                mainInsuredPersonCode = family.getFamilyMembers().get(0).getMainInsuredPersonCode();
            }
            if (family.getSarparast() == null) {
                InsuredPerson mainInsuredPerson = insuredPersonDAO.findMainPersonByPersonelIDAndPolicyID(personelID, family.getPolicyID());
                if (mainInsuredPerson != null) {
                    familyMap.get(familyKey).setSarparastIsInDB(mainInsuredPerson);
                } else if (mainInsuredPersonCode != null) {
                    mainInsuredPerson = insuredPersonDAO.findById(mainInsuredPersonCode);
                    if (mainInsuredPerson != null) {
                        familyMap.get(familyKey).setSarparastIsInDB(mainInsuredPerson);
                    }
                    else{
                        if (errorMap.containsKey(familyKey)) {
                            errorMap.put(familyKey, errorMap.get(familyKey) + "* اطلاعات بیمه شده ی اصلی در فایل موجود نیست. ");
                        } else {
                            errorMap.put(familyKey, "*اطلاعات بیمه شده ی اصلی در فایل موجود نیست. ");
                        }
                    }
                } else {
                    if (errorMap.containsKey(familyKey)) {
                        errorMap.put(familyKey, errorMap.get(familyKey) + "* اطلاعات بیمه شده ی اصلی در فایل موجود نیست. ");
                    } else {
                        errorMap.put(familyKey, "*اطلاعات بیمه شده ی اصلی در فایل موجود نیست. ");
                    }
//                    familyMap.remove(personelID);
                }

            }
        }


        return familyMap;

    }


    @Override
    public PaginatedListImpl<ViewInsuredPerson> getViewInsuredPersonPaginatedList(int page, List<ViewInsuredPerson> viewInsuredPersonList) {
        PaginatedListImpl<ViewInsuredPerson> resultList = new PaginatedListImpl<ViewInsuredPerson>();
        resultList.setPageNumber(page); //(page)
        resultList.setObjectsPerPage(PagingUtil.MAX_OBJECTS_PER_PAGE);
        resultList.setList(viewInsuredPersonList);
        resultList.setPageNumber(1);
        resultList.setObjectsPerPage(Integer.MAX_VALUE);
        resultList.setFullListSize(viewInsuredPersonList.size());
        return resultList;
    }

    @Override
    @Transactional
    public String savePersons(Users user, List<Family> families) {

        try {
            Person person = null;
            InsuredPerson insuredPerson = null;
            InsuredPerson mainInsuredPerson = null;

            for (Family family : families) {
                if (family.getSarparastIsInDB() == null) {

                    ViewInsuredPerson sarparast = family.getSarparast();

                    String ins = sarparast.getPolicy().getId()+""+sarparast.getInsuredPersonCode();
                    BigDecimal insuredPersonid = new BigDecimal(ins);

                    person = sarparast.getPerson();
                    person.setId(insuredPersonid);
                    personDAO.save(person);

                    Contact contact = sarparast.getContact();
                    if (contact != null) {
                        contact.setId(insuredPersonid);
                        contact.setPerson(person);
                        contactDAO.save(contact);
                    }

                    insuredPerson = sarparast.getInsuredPerson();



                    insuredPerson.setId(insuredPersonid);
                    insuredPerson.setMainInsuredPerson(insuredPerson);
                    insuredPersonDAO.save(insuredPerson);

                    Account account = sarparast.getAccount();
                    if (account != null) {
                        account.setId(insuredPersonid);
                        account.setInsuredPerson(insuredPerson);
                        accountDAO.save(account);
                    }

                    mainInsuredPerson = sarparast.getInsuredPerson();

                } else {
                    mainInsuredPerson = family.getSarparastIsInDB();
                }

                for (ViewInsuredPerson member : family.getFamilyMembers()) {
                    String ins = member.getPolicy().getId()+""+member.getInsuredPersonCode();
                    BigDecimal insuredPersonid = new BigDecimal(ins);

                    person = member.getPerson();
                    person.setId(insuredPersonid);
                    personDAO.save(person);


                    insuredPerson = member.getInsuredPerson();


                    insuredPerson.setId(insuredPersonid);
                    insuredPerson.setMainInsuredPerson(mainInsuredPerson);
                    insuredPersonDAO.save(insuredPerson);


                }

            }
        } catch (Throwable e) {
            return null;
        }
        return "success";
    }


    @Override
    public File produceFamilyErrorExcelFile(Map<String, String> errorMap, File fileUpload, int cellNum) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileUpload);
            XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
            Iterator<Row> rowIterator = mySheet.iterator();
            rowIterator.next();//ignore first Row//

            while (rowIterator.hasNext()) {
                Row row = (Row) rowIterator.next();
                Cell cell = row.getCell(cellNum);
                cell.setCellType(Cell.CELL_TYPE_STRING);
                if (errorMap.containsKey(cell.getStringCellValue().replaceAll("-", ""))) {
                    CellStyle style = myWorkBook.createCellStyle();
                    style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
                    style.setFillPattern(CellStyle.SOLID_FOREGROUND);
                    row.setRowStyle(style);
                    cell = row.getCell(cellNum);
                    style.setFillForegroundColor(IndexedColors.RED.getIndex());
                    style.setFillPattern(CellStyle.SOLID_FOREGROUND);
                    cell.setCellStyle(style);
                    Drawing drawing = cell.getSheet().createDrawingPatriarch();
                    CreationHelper factory = cell.getSheet().getWorkbook().getCreationHelper();
                    ClientAnchor anchor = factory.createClientAnchor();
                    Comment comment = drawing.createCellComment(anchor);
                    RichTextString str = factory.createRichTextString(errorMap.get(cell.getStringCellValue().replaceAll("-", "")));
                    comment.setString(str);
                    cell.setCellComment(comment);
                }
            }

            FileOutputStream os = new FileOutputStream(fileUpload);
            myWorkBook.write(os);
            os.close();
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return fileUpload;
    }

    @Override
    public List<ViewInsuredPerson> readExcelFileForSaveSheba(File fileUpload, Map<Integer, Map<Integer, String>> errorMap) {


        FileInputStream fis = null;
        Policy policy = null;
        String policyNo = null;
        String nationalID = null;
        String sheba = null;
        InsuredPerson insuredPerson = null;
        Account account = null;


        List<ViewInsuredPerson> viewInsuredPersonList = new ArrayList<>();
        Map<Integer, String> rowError = null;
        Row row = null;

        Map<String, Integer> mapping = new HashMap<>();

        mapping.put("policyNo", 0);
        mapping.put("nationalID", 1);
        mapping.put("sheba", 2);


        try {
            fis = new FileInputStream(fileUpload);
            XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
            int rows = mySheet.getPhysicalNumberOfRows();
            if (rows < 2) {
                return null;
            }

            Iterator<Row> rowIterator = mySheet.iterator();
            rowIterator.next();//ignore first Row//
            Cell cell = null;

            while (rowIterator.hasNext()) {
                rowError = new HashMap<Integer, String>();
                String error = null;
                row = (Row) rowIterator.next();
                if (row == null)
                    continue;


                cell = row.getCell(mapping.get("policyNo"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "شماره بيمه نامه الزامي است";
                    rowError.put(mapping.get("policyNo"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    policyNo = cell.getStringCellValue();
                    policy = policyDAO.findByPolicyNo(policyNo);
                    if (policy == null) {
                        error = "بيمه نامه اي با اين شماره بيمه نامه در سيستم موجود نيست";
                        rowError.put(mapping.get("policyNo"), error);
                        if (rowError.size() > 0) {
                            errorMap.put(row.getRowNum(), rowError);
                        }
                        continue;
                    }
                }


                cell = row.getCell(mapping.get("nationalID"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "کدملی بیمه شده الزامی است";
                    rowError.put(mapping.get("nationalID"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nationalID = cell.getStringCellValue();
                    insuredPerson = insuredPersonDAO.findByNationalAndPolicyID(nationalID, policy.getId());
                    if (insuredPerson == null) {
                        error = "بیمه شده در سیستم موجود نیست";
                        rowError.put(mapping.get("nationalID"), error);
                    } else {
                        if (insuredPerson.getFamilyrelation() != null && insuredPerson.getFamilyrelation() != 1) {
                            error = "شماره شبا فقط برای بیمه شده اصلی ثبت می شود";
                            rowError.put(mapping.get("nationalID"), error);
                        }
// else {
////                            account = insuredPersonDAO.findAccountByInsuredPerson(insuredPerson);
////                            if (account != null) {
////                                error = "برای این بیمه شده قبلا شماره شبا ثبت شده است";
////                                rowError.put(mapping.get("nationalID"), error);
////                            }
//                        }

                    }
                }


                cell = row.getCell(mapping.get("sheba"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "شماره شباالزامی است";
                    rowError.put(mapping.get("sheba"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    sheba = cell.getStringCellValue();
                }


                ViewInsuredPerson viewInsuredPerson = new ViewInsuredPerson();
                viewInsuredPerson.setPolicy(policy);
                viewInsuredPerson.setPolicyNo(policyNo);
                viewInsuredPerson.setNationalID(nationalID);
                viewInsuredPerson.setInsuredPerson(insuredPerson);
                viewInsuredPerson.setSheba(sheba);
                viewInsuredPersonList.add(viewInsuredPerson);


                policy = null;
                policyNo = null;
                nationalID = null;
                sheba = null;
                insuredPerson = null;


                if (rowError.size() > 0) {
                    errorMap.put(row.getRowNum(), rowError);
                }
            }

        } catch (Exception e) {
            if (rowError.size() > 0) {
                errorMap.put(row.getRowNum(), rowError);
            }
            if (errorMap.size() > 0) {
                return null;
            }
            return null;
        }


        return viewInsuredPersonList;
    }

    @Override
    public void deleteOldSheba(ViewInsuredPerson viewInsuredPerson, Users user, String date, String time) {
        InsuredPerson insuredPerson = viewInsuredPerson.getInsuredPerson();
        String sheba = viewInsuredPerson.getSheba();
        Policy policy = viewInsuredPerson.getPolicy();

        Account oldAccount = insuredPersonDAO.findAccountByInsuredPerson(insuredPerson);
        if(oldAccount != null){
            oldAccount.setState(100l);
            oldAccount.setLastEditDate(date);
            oldAccount.setLastEditTime(time);
            oldAccount.setLastEditUserID(user);
            accountDAO.saveOrUpdate(oldAccount);
        }
    }

    @Override
    public ViewInsuredPerson saveSheba(ViewInsuredPerson viewInsuredPerson, Users user, String date, String time) {
        InsuredPerson insuredPerson = viewInsuredPerson.getInsuredPerson();
        String sheba = viewInsuredPerson.getSheba();
        Policy policy = viewInsuredPerson.getPolicy();

//        Account oldAccount = insuredPersonDAO.findAccountByInsuredPerson(insuredPerson);
//        if(oldAccount != null){
//            oldAccount.setState(100l);
//            accountDAO.saveOrUpdate(oldAccount);
//        }

        Account account = new Account();
        account.setInsuredPerson(insuredPerson);
        account.setSheba(sheba);
        account.setCreatedate(date);
        account.setCreatetime(time);
        account.setUsers(user);
        account.setState(1l);
        account.setBegindate(policy.getBegindate());
        account.setEnddate(policy.getEnddate());
//        account.setId(insuredPerson.getId());
        accountDAO.saveOrUpdate(account);

        viewInsuredPerson.setFirstName(insuredPerson.getPerson().getName());
        viewInsuredPerson.setLastName(insuredPerson.getPerson().getFamily());

        return viewInsuredPerson;

    }

    @Override
    public List<ViewInsuredPerson> savePersonFromReceptionExcel(boolean bimarestani, File fileUpload, Users user) {
        FileInputStream fis = null;
        Policy policy = null;
        String nationalID = null;
        Long codeBimeShode = null;
        String codeRayaneBimeName = null;
        String nameBimeShode = null;
        String nameBimeShodeAsli = null;
        String nationalIDAsli = null;
        String personelID = null;

        boolean notExist = false;
        InsuredPerson insuredPerson = null;
        List<ViewInsuredPerson> viewMainInsuredPersonList = new ArrayList<>();
        List<ViewInsuredPerson> viewInsuredPersonList = new ArrayList<>();

        Row row = null;

        Map<String, Integer> mapping = new HashMap<>();

        if (bimarestani == true) {
            mapping.put("nameBimeShode", 7);
            mapping.put("nameBimeShodeAsli", 9);
            mapping.put("nationalIDAsli", 10);
            mapping.put("codeBimeShode", 13);
            mapping.put("codeRayaneBimeName", 14);
            mapping.put("nationalID", 15);
            mapping.put("personelID", 17);
        } else {
            mapping.put("nameBimeShodeAsli", 1);
            mapping.put("nameBimeShode", 9);
            mapping.put("nationalIDAsli", 12);
            mapping.put("codeBimeShode", 15);
            mapping.put("codeRayaneBimeName", 16);
            mapping.put("nationalID", 17);
            mapping.put("personelID", 19);
        }

        try {
            fis = new FileInputStream(fileUpload);
            XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
            int rows = mySheet.getPhysicalNumberOfRows();
            if (rows < 2) {
                return null;
            }

            Iterator<Row> rowIterator = mySheet.iterator();
            rowIterator.next();//ignore first Row//
            Cell cell = null;


            while (rowIterator.hasNext()) {

                String error = null;
                row = (Row) rowIterator.next();
                if (row == null)
                    continue;


                cell = row.getCell(mapping.get("codeRayaneBimeName"));
                if (DataValidation.isCellEmpty(cell)) {
                    continue;
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    codeRayaneBimeName = cell.getStringCellValue();
                    policy = policyDAO.findById(new BigDecimal(codeRayaneBimeName));
                    if (policy == null) {
                        continue;
                    }
                }

                cell = row.getCell(mapping.get("nationalID"));
                if (DataValidation.isCellEmpty(cell)) {
                    continue;
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nationalID = cell.getStringCellValue();
                    insuredPerson = insuredPersonDAO.findByNationalAndPolicyID(nationalID, policy.getId());
                    if (insuredPerson == null) {
                        notExist = true;
                    }
                }

                cell = row.getCell(mapping.get("nameBimeShode"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nameBimeShode = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("nameBimeShodeAsli"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nameBimeShodeAsli = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("nationalIDAsli"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nationalIDAsli = cell.getStringCellValue();
                }
                cell = row.getCell(mapping.get("codeBimeShode"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    codeBimeShode = new Long(cell.getStringCellValue());
                }
                cell = row.getCell(mapping.get("personelID"));
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    personelID = cell.getStringCellValue();
                }


                if (notExist == true) {

                    if (nationalIDAsli.equals(nationalID)) {
                        ViewInsuredPerson viewMainInsuredPerson = new ViewInsuredPerson();

                        viewMainInsuredPerson.setInsuredPersonCode(new BigDecimal(codeBimeShode));
                        viewMainInsuredPerson.setNationalID(nationalID);
                        viewMainInsuredPerson.setNationalIDAsli(nationalIDAsli);
                        viewMainInsuredPerson.setFirstName(nameBimeShode);
                        viewMainInsuredPerson.setFullNameAsli(nameBimeShodeAsli);
                        viewMainInsuredPerson.setPersonelID(personelID);
                        viewMainInsuredPerson.setPolicy(policy);
                        viewMainInsuredPersonList.add(viewMainInsuredPerson);

                    } else {
                        ViewInsuredPerson viewInsuredPerson = new ViewInsuredPerson();

                        viewInsuredPerson.setInsuredPersonCode(new BigDecimal(codeBimeShode));
                        viewInsuredPerson.setNationalID(nationalID);
                        viewInsuredPerson.setNationalIDAsli(nationalIDAsli);
                        viewInsuredPerson.setFirstName(nameBimeShode);
                        viewInsuredPerson.setFullNameAsli(nameBimeShodeAsli);
                        viewInsuredPerson.setPersonelID(personelID);
                        viewInsuredPerson.setPolicy(policy);
                        viewInsuredPersonList.add(viewInsuredPerson);

                    }
                    notExist = false;
                    policy = null;
                    nationalID = null;
                    codeBimeShode = null;
                    codeRayaneBimeName = null;
                    nameBimeShode = null;
                    nameBimeShodeAsli = null;
                    nationalIDAsli = null;
                    personelID = null;
                    insuredPerson = null;


                }
            }

            String date = DateUtil.getCurrentDate();
            String time = DateUtil.getCurrentTime();

            //sabte bimeshode haye asli
            for(int i = 0 ; i<viewMainInsuredPersonList.size();i++){
                ViewInsuredPerson viewInsuredPerson = viewMainInsuredPersonList.get(i);

                Person person = personDAO.findById(viewInsuredPerson.getInsuredPersonCode());
                if(person != null){
                    continue;
                }
                insuredPerson = insuredPersonDAO.findMainPersonByPersonelIDAndPolicyID(viewInsuredPerson.getPersonelID(), viewInsuredPerson.getPolicy().getId());
                if(insuredPerson != null){
                    continue; // code personeli asli yekta dar bime name
                }
                String ins = viewInsuredPerson.getPolicy().getId()+""+viewInsuredPerson.getInsuredPersonCode();
                BigDecimal insuredPersonid = new BigDecimal(ins);

                person = new Person();

                person.setId(insuredPersonid);
                person.setName(viewInsuredPerson.getFirstName());
                person.setNationalid(viewInsuredPerson.getNationalID());
                person.setCreatetime(time);
                person.setCreatedate(date);
                person.setUsers(user);
                person.setState(1l);
                personDAO.save(person);


                insuredPerson = new InsuredPerson();

                insuredPerson.setId(insuredPersonid);
                insuredPerson.setPerson(person);
                insuredPerson.setPolicy(viewInsuredPerson.getPolicy());
                insuredPerson.setPersonelid(viewInsuredPerson.getPersonelID());
                insuredPerson.setCreatetime(time);
                insuredPerson.setCreatedate(date);
                insuredPerson.setUsers(user);
                insuredPerson.setState(1l);
                insuredPerson.setFamilyrelation(1l);
                insuredPerson.setMainInsuredPerson(insuredPerson);
                insuredPersonDAO.save(insuredPerson);

            }

            //sabte bimeshode haye gheire asli
            for(int i = 0 ; i<viewInsuredPersonList.size();i++){
                ViewInsuredPerson viewInsuredPerson = viewInsuredPersonList.get(i);

                InsuredPerson mainPerson = insuredPersonDAO.findMainPersonByPersonelIDAndPolicyID(viewInsuredPerson.getPersonelID(),viewInsuredPerson.getPolicy().getId());
                if(mainPerson == null){
                    mainPerson = personDAO.findMainInsuredPersonByNationalID(viewInsuredPerson.getNationalIDAsli());
                    if(mainPerson == null){
                        continue;  // bimeh shode asli nis pas save nemishe
                    }

                }
                String ins = viewInsuredPerson.getPolicy().getId()+""+viewInsuredPerson.getInsuredPersonCode();
                BigDecimal insuredPersonid = new BigDecimal(ins);
                Person person = personDAO.findById(viewInsuredPerson.getInsuredPersonCode());
                if(person != null){
                    continue;
                }

                person = new Person();
                person.setId(insuredPersonid);
                person.setName(viewInsuredPerson.getFirstName());
                person.setNationalid(viewInsuredPerson.getNationalID());
                person.setCreatetime(time);
                person.setCreatedate(date);
                person.setUsers(user);
                person.setState(1l);
                personDAO.save(person);


                insuredPerson = new InsuredPerson();

                insuredPerson.setId(insuredPersonid);
                insuredPerson.setPerson(person);
                insuredPerson.setPolicy(viewInsuredPerson.getPolicy());
                insuredPerson.setPersonelid(viewInsuredPerson.getPersonelID());
                insuredPerson.setCreatetime(time);
                insuredPerson.setCreatedate(date);
                insuredPerson.setUsers(user);
                insuredPerson.setState(1l);
                insuredPerson.setFamilyrelation(0l);
                insuredPerson.setMainInsuredPerson(mainPerson);
                insuredPersonDAO.save(insuredPerson);
            }

        } catch (Exception e) {

            return null;
        }
        return viewInsuredPersonList;
    }

    @Override
    public PaginatedListImpl<ViewReceptionExcel> receptionExcelNotExistIpReport(boolean flag, int page, BigDecimal policyID, String nationalID, String mainNationalID, String createDateFrom, String createDateTo) {
        return receptionExcelNotExistIPDAO.receptionExcelNotExistIpReport(flag,page,policyID,nationalID,mainNationalID,createDateFrom,createDateTo);
    }

    @Override
    public PaginatedListImpl<ViewReceptionExcel> receptionExcelReport(boolean flag, int page, BigDecimal policyID, String nationalID, String mainNationalID, String createDateFrom, String createDateTo) {
        return receptionExcelDAO.receptionExcelReport(flag,page,policyID,nationalID,mainNationalID,createDateFrom,createDateTo);
    }

    @Override
    public PaginatedListImpl<ViewInsuredPerson> insuredPersonListReport(boolean flag, int page, String personelID, BigDecimal policyID, String nationalID, String mainNationalID, String createDateFrom, String createDateTo, Long hasShebaID, Long hasMobileID, String sheba, BigInteger mobile, Long stateCode) {
        return policyDAO.insuredPersonListReport(flag,page,personelID,policyID,nationalID,mainNationalID,createDateFrom,createDateTo,hasShebaID,hasMobileID,sheba,mobile,stateCode);
    }

    @Override
    public List<ViewInsuredPerson> savePersonFromReceptionExcelWithSheba(boolean bimarestani, File fileUpload, Users user) {
        FileInputStream fis = null;
        Policy policy = null;
        String nationalID = null;
        Long codeBimeShode = null;
        String codeRayaneBimeName = null;
        String nameBimeShode = null;
        String nameBimeShodeAsli = null;
        String nationalIDAsli = null;
        String personelID = null;
        String sheba = null;

        boolean notExist = false;
        InsuredPerson insuredPerson = null;
        List<ViewInsuredPerson> viewMainInsuredPersonList = new ArrayList<>();
        List<ViewInsuredPerson> viewInsuredPersonList = new ArrayList<>();
        Long type = null;
        if(bimarestani)
            type = 2l;
        else
            type = 1l;
        Map<String,Long> excelMapping = excelMappingDAO.getExcelMappingByType(type);
        if(excelMapping == null || excelMapping.size() == 0)
            return null;

        Row row = null;

//        Map<String, Integer> mapping = new HashMap<>();

//        if (bimarestani == true) {
//            mapping.put("nameBimeShode", 7);
//            mapping.put("nameBimeShodeAsli", 9);
//            mapping.put("nationalIDAsli", 10);
//            mapping.put("codeBimeShode", 13);
//            mapping.put("codeRayaneBimeName", 14);
//            mapping.put("nationalID", 15);
//            mapping.put("personelID", 17);
//        } else {
//            mapping.put("nameBimeShodeAsli", 1);
//            mapping.put("nameBimeShode", 9);
//            mapping.put("nationalIDAsli", 12);
//            mapping.put("codeBimeShode", 15);
//            mapping.put("codeRayaneBimeName", 16);
//            mapping.put("nationalID", 17);
//            mapping.put("personelID", 19);
//        }

        try {
            fis = new FileInputStream(fileUpload);
            XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
            int rows = mySheet.getPhysicalNumberOfRows();
            if (rows < 2) {
                return null;
            }

            Iterator<Row> rowIterator = mySheet.iterator();
            rowIterator.next();//ignore first Row//
            Cell cell = null;


            while (rowIterator.hasNext()) {

                String error = null;
                row = (Row) rowIterator.next();
                if (row == null)
                    continue;


                cell = row.getCell(excelMapping.get("codeRayaneBimeName").intValue());
                if (DataValidation.isCellEmpty(cell)) {
                    continue;
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    codeRayaneBimeName = cell.getStringCellValue();
                    policy = policyDAO.findById(new BigDecimal(codeRayaneBimeName));
                    if (policy == null) {
                        continue;
                    }
                }

                cell = row.getCell(excelMapping.get("nationalID").intValue());
                if (DataValidation.isCellEmpty(cell)) {
                    continue;
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nationalID = cell.getStringCellValue();
                    insuredPerson = insuredPersonDAO.findByNationalAndPolicyID(nationalID, policy.getId());
                    if (insuredPerson == null) {
                        notExist = true;
                    }
                }

                cell = row.getCell(excelMapping.get("nameBimeShode").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nameBimeShode = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("nameBimeShodeAsli").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nameBimeShodeAsli = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("nationalIDAsli").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nationalIDAsli = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("codeBimeShode").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    codeBimeShode = new Long(cell.getStringCellValue());
                }
                cell = row.getCell(excelMapping.get("personelID").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    personelID = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("sheba").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    sheba = cell.getStringCellValue();
                }


                if (notExist == true) {

                    if (nationalIDAsli.equals(nationalID)) {
                        ViewInsuredPerson viewMainInsuredPerson = new ViewInsuredPerson();

                        viewMainInsuredPerson.setInsuredPersonCode(new BigDecimal(codeBimeShode));
                        viewMainInsuredPerson.setNationalID(nationalID);
                        viewMainInsuredPerson.setNationalIDAsli(nationalIDAsli);
                        viewMainInsuredPerson.setFirstName(nameBimeShode);
                        viewMainInsuredPerson.setFullNameAsli(nameBimeShodeAsli);
                        viewMainInsuredPerson.setPersonelID(personelID);
                        viewMainInsuredPerson.setPolicy(policy);
                        viewMainInsuredPerson.setSheba(sheba);
                        viewMainInsuredPersonList.add(viewMainInsuredPerson);

                    } else {
                        ViewInsuredPerson viewInsuredPerson = new ViewInsuredPerson();

                        viewInsuredPerson.setInsuredPersonCode(new BigDecimal(codeBimeShode));
                        viewInsuredPerson.setNationalID(nationalID);
                        viewInsuredPerson.setNationalIDAsli(nationalIDAsli);
                        viewInsuredPerson.setFirstName(nameBimeShode);
                        viewInsuredPerson.setFullNameAsli(nameBimeShodeAsli);
                        viewInsuredPerson.setPersonelID(personelID);
                        viewInsuredPerson.setPolicy(policy);
                        viewInsuredPersonList.add(viewInsuredPerson);

                    }
                    notExist = false;
                    policy = null;
                    nationalID = null;
                    codeBimeShode = null;
                    codeRayaneBimeName = null;
                    nameBimeShode = null;
                    nameBimeShodeAsli = null;
                    nationalIDAsli = null;
                    personelID = null;
                    insuredPerson = null;
                    sheba = null;

                }
            }

            String date = DateUtil.getCurrentDate();
            String time = DateUtil.getCurrentTime();

            //sabte bimeshode haye asli
            for(int i = 0 ; i<viewMainInsuredPersonList.size();i++){
                ViewInsuredPerson viewInsuredPerson = viewMainInsuredPersonList.get(i);

                Person person = personDAO.findByNationalID(viewInsuredPerson.getNationalID());
                if(person != null){
                    continue;
                }
                insuredPerson = insuredPersonDAO.findMainPersonByPersonelIDAndPolicyID(viewInsuredPerson.getPersonelID(), viewInsuredPerson.getPolicy().getId());
                if(insuredPerson != null){
                    continue; // code personeli asli yekta dar bime name
                }
//                String ins = viewInsuredPerson.getPolicy().getId()+""+viewInsuredPerson.getInsuredPersonCode();
//                BigDecimal insuredPersonid = new BigDecimal(ins);

                person = new Person();

//                person.setId(insuredPersonid);
                person.setName(viewInsuredPerson.getFirstName());
                person.setNationalid(viewInsuredPerson.getNationalID());
                person.setCreatetime(time);
                person.setCreatedate(date);
                person.setUsers(user);
                person.setState(1l);
                personDAO.saveOrUpdate(person);


                insuredPerson = new InsuredPerson();

//                insuredPerson.setId(insuredPersonid);
                insuredPerson.setPerson(person);
                insuredPerson.setPolicy(viewInsuredPerson.getPolicy());
                insuredPerson.setPersonelid(viewInsuredPerson.getPersonelID());
                insuredPerson.setCreatetime(time);
                insuredPerson.setCreatedate(date);
                insuredPerson.setUsers(user);
                insuredPerson.setState(1l);
                insuredPerson.setFamilyrelation(1l);
                insuredPerson.setMainInsuredPerson(insuredPerson);
                insuredPersonDAO.saveOrUpdate(insuredPerson);


                Account account = new Account();
                account.setInsuredPerson(insuredPerson);
                account.setSheba(viewInsuredPerson.getSheba());
                account.setCreatedate(date);
                account.setCreatetime(time);
                account.setUsers(user);
                account.setState(1l);
                account.setBegindate(viewInsuredPerson.getPolicy().getBegindate());
                account.setEnddate(viewInsuredPerson.getPolicy().getEnddate());
      //        account.setId(insuredPerson.getId());
                accountDAO.saveOrUpdate(account);

            }

            //sabte bimeshode haye gheire asli
            for(int i = 0 ; i<viewInsuredPersonList.size();i++){
                ViewInsuredPerson viewInsuredPerson = viewInsuredPersonList.get(i);

                InsuredPerson mainPerson = insuredPersonDAO.findMainPersonByPersonelIDAndPolicyID(viewInsuredPerson.getPersonelID(),viewInsuredPerson.getPolicy().getId());
                if(mainPerson == null){
                    mainPerson = personDAO.findMainInsuredPersonByNationalID(viewInsuredPerson.getNationalIDAsli());
                    if(mainPerson == null){
                        continue;  // bimeh shode asli nis pas save nemishe
                    }

                }
//                String ins = viewInsuredPerson.getPolicy().getId()+""+viewInsuredPerson.getInsuredPersonCode();
//                BigDecimal insuredPersonid = new BigDecimal(ins);
                Person person = personDAO.findByNationalID(viewInsuredPerson.getNationalID());
                if(person != null){
                    continue;
                }

                person = new Person();
//                person.setId(insuredPersonid);
                person.setName(viewInsuredPerson.getFirstName());
                person.setNationalid(viewInsuredPerson.getNationalID());
                person.setCreatetime(time);
                person.setCreatedate(date);
                person.setUsers(user);
                person.setState(1l);
                personDAO.saveOrUpdate(person);


                insuredPerson = new InsuredPerson();

//                insuredPerson.setId(insuredPersonid);
                insuredPerson.setPerson(person);
                insuredPerson.setPolicy(viewInsuredPerson.getPolicy());
                insuredPerson.setPersonelid(viewInsuredPerson.getPersonelID());
                insuredPerson.setCreatetime(time);
                insuredPerson.setCreatedate(date);
                insuredPerson.setUsers(user);
                insuredPerson.setState(1l);
                insuredPerson.setFamilyrelation(0l);
                insuredPerson.setMainInsuredPerson(mainPerson);
                insuredPersonDAO.saveOrUpdate(insuredPerson);
            }

        } catch (Exception e) {

            return null;
        }
        return viewInsuredPersonList;

    }

    @Override
    public List<ViewReceptionExcel> validateExcelKhesaratWithSheba(boolean bimarestani, File fileUpload, Map<Integer, Map<Integer, String>> errorMap, Users user, List<ViewReceptionExcel> viewReceptionExcelList, List<Errors> errorsList) {


        FileInputStream fis = null;
        Policy policy = null;
        Long policyNo = null;
        String nationalID = null;
        String noeBimari = null;
        Long tarikhBimari = null;
        Long radif = null;
        String noeHavale = null;
        String tarikhHavale = null;
        Long shomareHavale = null;
        Long shomareParvande = null;
        String vahedePardakht = null;
        String nameBimeGozar = null;
        String vahedeSazmani = null;
        Long codeBimeShode = null;
        String codeRayaneBimeName = null;
        String serialMoarefiName = null;
        String pardakhtAzMahal = null;
        Long codeTarh = null;
        String noeTarh = null;
        String tasvieShode = null;
        Long shomareBaygani = null;
        String grouhKariBimeGozar = null;
        String tarikhElamKhesart = null;
        Long codeKarshenas = null;
        String vahedeSodour = null;
        String moaref = null;
        String nameKarshenas = null;
        String karshenasParvande = null;
        String nameMarkasDarmani = null;
        String noeTahvilMadarek = null;
        BigInteger hazinePardakhti = null;
        BigInteger hazineElamShode = null;
        Long maliat = null;
        BigInteger franshiz = null;
        String nameBimeShode = null;
        String nameBimeShodeAsli = null;
        String nationalIDAsli = null;
        String personelID = null;
        String nameTarh = null;
        String vazeiatParvande = null;
        String karbarSabteParvande = null;
        String gruheBimari = null;
        BigDecimal codeRayaneMoredKhesarat = null;
        BigInteger mablaghMohasebeSodeMotabeghTarefe = null;
        boolean notExist = false;
        boolean duplicate = false;
        InsuredPerson insuredPerson = null;
        List<ViewReceptionExcel> viewDBReceptionExcelList = new ArrayList<>();
        Map<Integer, String> rowError = null;
        Row row = null;
        String sheba=null;


        Long type = null;
        if(bimarestani)
            type = 2l;
        else
            type = 1l;
        Map<String,Long> excelMapping = excelMappingDAO.getExcelMappingByType(type);
        if(excelMapping == null || excelMapping.size() == 0)
            return null;

//        Map<String, Integer> mapping = new HashMap<>();
//
//        if (bimarestani == true) {
//            mapping.put("radif", 0);
//            mapping.put("tarikhHavale", 1);
//            mapping.put("shomareHavale", 2);
//            mapping.put("shomareParvande", 3);
//            mapping.put("vazeiatParvande", 4);
//            mapping.put("vahedePardakht", 5);
//            mapping.put("karbarSabteParvande", 6);
//            mapping.put("nameBimeShode", 7);
//            mapping.put("nameBimeGozar", 8);
//            mapping.put("nameBimeShodeAsli", 9);
//            mapping.put("nationalIDAsli", 10);
//            mapping.put("vahedeSazmani", 11);
//            mapping.put("policyNo", 12);
//            mapping.put("codeBimeShode", 13);
//            mapping.put("codeRayaneBimeName", 14);
//            mapping.put("nationalID", 15);
//            mapping.put("serialMoarefiName", 16);
//            mapping.put("personelID", 17);
//            mapping.put("pardakhtAzMahal", 18);
//            mapping.put("codeTarh", 21);
//            mapping.put("noeTarh", 22);
//            mapping.put("nameTarh", 23);
//            mapping.put("tasvieShode", 24);
//            mapping.put("shomareBaygani", 25);
//            mapping.put("gruheBimari", 26);
//            mapping.put("tarikhBimari", 27);
//            mapping.put("tarikhElamKhesart", 28);
//            mapping.put("noeBimari", 29);
//            mapping.put("codeKarshenas", 30);
//            mapping.put("vahedeSodour", 31);
//            mapping.put("moaref", 32);
//            mapping.put("nameKarshenas", 33);
//            mapping.put("karshenasParvande", 34);
//            mapping.put("nameMarkasDarmani", 35);
//            mapping.put("noeTahvilMadarek", 36);
//            mapping.put("hazineElamShode", 37);
//            mapping.put("hazinePardakhti", 38);
//            mapping.put("maliat", 39);
//            mapping.put("franshiz", 40);
//        } else {
//            mapping.put("radif", 0);
//            mapping.put("nameBimeShodeAsli", 1);
//            mapping.put("shomareHavale", 2);
//            mapping.put("tarikhHavale", 3);
//            mapping.put("noeHavale", 4);
//            mapping.put("shomareParvande", 5);
//            mapping.put("vazeiatParvande", 6);
//            mapping.put("vahedePardakht", 7);
//            mapping.put("karbarSabteParvande", 8);
//            mapping.put("nameBimeShode", 9);
//            mapping.put("nameBimeGozar", 10);
//            mapping.put("noeTarh", 11);
//            mapping.put("nationalIDAsli", 12);
//            mapping.put("vahedeSazmani", 13);
//            mapping.put("policyNo", 14);
//            mapping.put("codeBimeShode", 15);
//            mapping.put("codeRayaneBimeName", 16);
//            mapping.put("nationalID", 17);
//            mapping.put("serialMoarefiName", 18);
//            mapping.put("personelID", 19);
//            mapping.put("pardakhtAzMahal", 20);
//            mapping.put("codeTarh", 23);
//            mapping.put("nameTarh", 24);
//            mapping.put("tasvieShode", 25);
//            mapping.put("shomareBaygani", 26);
//            mapping.put("gruheBimari", 27);
//            mapping.put("codeRayaneMoredKhesarat", 28);
//            mapping.put("tarikhBimari", 29);
//            mapping.put("tarikhElamKhesart", 30);
//            mapping.put("noeBimari", 31);
//            mapping.put("codeKarshenas", 32);
//            mapping.put("vahedeSodour", 33);
//            mapping.put("nameKarshenas", 34);
//            mapping.put("moaref", 35);
//            mapping.put("karshenasParvande", 36);
//            mapping.put("nameMarkasDarmani", 37);
//            mapping.put("noeTahvilMadarek", 38);
//            mapping.put("hazineElamShode", 39);
//            mapping.put("mablaghMotabegheTarefe", 40);
//            mapping.put("hazinePardakhti", 41);
//            mapping.put("maliat", 42);
//            mapping.put("franshiz", 43);
//
//
//        }

        try {
            fis = new FileInputStream(fileUpload);
            XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
            int rows = mySheet.getPhysicalNumberOfRows();
            if (rows < 2) {
                return null;
            }

            Iterator<Row> rowIterator = mySheet.iterator();
            rowIterator.next();//ignore first Row//
            Cell cell = null;
            BigInteger invoiceExcelID = new BigInteger(DateUtil.getCurrentDate().replace("/", "") + DateUtil.getCurrentTime().replace(":", ""));

            while (rowIterator.hasNext()) {
                rowError = new HashMap<Integer, String>();
                String error = null;
                row = (Row) rowIterator.next();
                if (row == null)
                    continue;

                cell = row.getCell(excelMapping.get("serialMoarefiName").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    serialMoarefiName = cell.getStringCellValue();
                }
                if(serialMoarefiName != null ){
                    continue;
                }

                cell = row.getCell(excelMapping.get("codeRayaneBimeName").intValue());
                if (DataValidation.isCellEmpty(cell)) {
                    error = "شماره بيمه نامه الزامي است";
                    rowError.put(excelMapping.get("codeRayaneBimeName").intValue(), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    codeRayaneBimeName = cell.getStringCellValue();
                    policy = policyDAO.findById(new BigDecimal(codeRayaneBimeName));
                    if (policy == null) {
                        error = "بيمه نامه اي با اين شماره بيمه نامه در سيستم موجود نيست";
                        rowError.put(excelMapping.get("codeRayaneBimeName").intValue(), error);
                        if (rowError.size() > 0) {
                            errorMap.put(row.getRowNum(), rowError);
                        }
                        continue;
                    }
                }

                cell = row.getCell(excelMapping.get("nationalID").intValue());
                if (DataValidation.isCellEmpty(cell)) {
                    error = "کدملي بيمه شده الزامي است.";
                    rowError.put(excelMapping.get("nationalID").intValue(), error);
                    if (rowError.size() > 0) {
                        errorMap.put(row.getRowNum(), rowError);
                    }
                    continue;
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nationalID = cell.getStringCellValue();
                    insuredPerson = insuredPersonDAO.findByNationalAndPolicyID(nationalID, policy.getId());
                    if (insuredPerson == null) {
                        notExist = true;
                    } else {
                        Account account = insuredPersonDAO.findAccountByInsuredPerson(insuredPerson.getMainInsuredPerson());
                        if (account == null || (account != null && account.getSheba() == null)) {
                            notExist = true;
                        }
                    }
                }

                cell = row.getCell(excelMapping.get("noeBimari").intValue());
                if (DataValidation.isCellEmpty(cell)) {
                    error = "نوع بيماري الزامي است";
                    rowError.put(excelMapping.get("noeBimari").intValue(), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    noeBimari = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("hazinePardakhti").intValue());
                if (DataValidation.isCellEmpty(cell)) {
                    error = "هزينه پرداختي الزامي است";
                    rowError.put(excelMapping.get("hazinePardakhti").intValue(), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    hazinePardakhti = new BigInteger(cell.getStringCellValue());
                    if(hazinePardakhti.compareTo(BigInteger.valueOf(0)) < 0)
                        continue;
                }
                cell = row.getCell(excelMapping.get("tarikhBimari").intValue());
                if (DataValidation.isCellEmpty(cell)) {
                    error = "تاريخ بيماري الزامي است";
                    rowError.put(excelMapping.get("tarikhBimari").intValue(), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    tarikhBimari = new Long(cell.getStringCellValue().replaceAll("/", ""));
                }
                cell = row.getCell(excelMapping.get("hazineElamShode").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    hazineElamShode = new BigInteger(cell.getStringCellValue());
                    if(hazineElamShode.compareTo(BigInteger.valueOf(0)) < 0)
                        continue;
                }

                //check Kardane tekrari nabudan khesarat
                if (notExist == false) {
                    duplicate = receptionExcelDAO.checkDuplicateReceptionExcel(insuredPerson, noeBimari, hazineElamShode, tarikhBimari, bimarestani);
                }
                if (duplicate) {
                    error = "خسارت تکراری است";
                    rowError.put(excelMapping.get("nationalID").intValue(), error);
                }

                cell = row.getCell(excelMapping.get("radif").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    radif = new Long(cell.getStringCellValue());
                }

                cell = row.getCell(excelMapping.get("tarikhHavale").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    tarikhHavale = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("shomareHavale").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    shomareHavale = new Long(cell.getStringCellValue());
                }
                cell = row.getCell(excelMapping.get("shomareParvande").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    shomareParvande = new Long(cell.getStringCellValue());
                }
                cell = row.getCell(excelMapping.get("vahedePardakht").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    vahedePardakht = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("nameBimeShode").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nameBimeShode = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("nameBimeGozar").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nameBimeGozar = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("nameBimeShodeAsli").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nameBimeShodeAsli = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("nationalIDAsli").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nationalIDAsli = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("vahedeSazmani").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    vahedeSazmani = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("codeBimeShode").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    codeBimeShode = new Long(cell.getStringCellValue());
                }
                cell = row.getCell(excelMapping.get("policyNo").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    policyNo = new Long(cell.getStringCellValue());
                }

                cell = row.getCell(excelMapping.get("personelID").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    personelID = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("pardakhtAzMahal").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    pardakhtAzMahal = cell.getStringCellValue();
                }

                cell = row.getCell(excelMapping.get("codeTarh").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    codeTarh = new Long(cell.getStringCellValue());
                }

                cell = row.getCell(excelMapping.get("noeTarh").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    noeTarh = cell.getStringCellValue();
                }

                cell = row.getCell(excelMapping.get("nameTarh").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nameTarh = cell.getStringCellValue();
                }

                cell = row.getCell(excelMapping.get("tasvieShode").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    tasvieShode = cell.getStringCellValue();
                }

                cell = row.getCell(excelMapping.get("shomareBaygani").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    shomareBaygani = new Long(cell.getStringCellValue());
                }
                if (excelMapping.containsKey("grouhKariBimeGozar")) {
                    cell = row.getCell(excelMapping.get("grouhKariBimeGozar").intValue());
                    if (!DataValidation.isCellEmpty(cell)) {
                        cell.setCellType(Cell.CELL_TYPE_STRING);
                        grouhKariBimeGozar = cell.getStringCellValue();
                    }
                }
                cell = row.getCell(excelMapping.get("tarikhElamKhesart").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    tarikhElamKhesart = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("codeKarshenas").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    codeKarshenas = new Long(cell.getStringCellValue());
                }
                cell = row.getCell(excelMapping.get("vahedeSodour").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    vahedeSodour = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("moaref").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    moaref = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("nameKarshenas").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nameKarshenas = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("karshenasParvande").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    karshenasParvande = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("nameMarkasDarmani").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nameMarkasDarmani = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("noeTahvilMadarek").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    noeTahvilMadarek = cell.getStringCellValue();
                }

                cell = row.getCell(excelMapping.get("maliat").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    maliat = new Long(cell.getStringCellValue());
                }
                cell = row.getCell(excelMapping.get("franshiz").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    franshiz = new BigInteger(cell.getStringCellValue());
                }
                cell = row.getCell(excelMapping.get("vazeiatParvande").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    vazeiatParvande = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("karbarSabteParvande").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    karbarSabteParvande = cell.getStringCellValue();
                }
                cell = row.getCell(excelMapping.get("gruheBimari").intValue());
                if (!DataValidation.isCellEmpty(cell)) {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    gruheBimari = cell.getStringCellValue();
                }
                if (excelMapping.containsKey("codeRayaneMoredKhesarat")) {
                    cell = row.getCell(excelMapping.get("codeRayaneMoredKhesarat").intValue());
                    if(cell!=null)
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    if (!DataValidation.isCellEmpty(cell) && !cell.getStringCellValue().equals("")) {

                        codeRayaneMoredKhesarat = new BigDecimal(cell.getStringCellValue());
                    }
                }
                if (excelMapping.containsKey("mablaghMotabegheTarefe")) {
                    cell = row.getCell(excelMapping.get("mablaghMotabegheTarefe").intValue());
                    if(cell!= null)
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    if (!DataValidation.isCellEmpty(cell) && !cell.getStringCellValue().equals("")) {

                        mablaghMohasebeSodeMotabeghTarefe = new BigInteger(cell.getStringCellValue());
                    }
                }
                if (excelMapping.containsKey("noeHavale")) {
                    cell = row.getCell(excelMapping.get("noeHavale").intValue());
                    if (!DataValidation.isCellEmpty(cell)) {
                        cell.setCellType(Cell.CELL_TYPE_STRING);
                        noeHavale = cell.getStringCellValue();
                    }
                }
                if (excelMapping.containsKey("sheba")) {
                    cell = row.getCell(excelMapping.get("sheba").intValue());
                    if (!DataValidation.isCellEmpty(cell)) {
                        cell.setCellType(Cell.CELL_TYPE_STRING);
                        sheba = cell.getStringCellValue();
                    }else{
                        error = "شماره شبا الزامي است";
                        rowError.put(excelMapping.get("sheba").intValue(), error);
                    }
                }


                if (notExist == true) {
                    boolean duplicateInNotExistTable = receptionExcelNotExistIPDAO.checkDuplicateReceptionExcel(nationalID, policy, noeBimari, hazineElamShode, tarikhBimari, bimarestani);

                    if (duplicateInNotExistTable) {
                        error = "خسارت تکراری است";
                        rowError.put(excelMapping.get("nationalID").intValue(), error);
                    }
                    if (duplicateInNotExistTable == false) {
                        ViewReceptionExcel viewReceptionExcelNotExist = new ViewReceptionExcel();
                        viewReceptionExcelNotExist.setInvoiceExcelID(invoiceExcelID);
                        viewReceptionExcelNotExist.setCodeKarshenas(codeKarshenas);
                        viewReceptionExcelNotExist.setCodeBimeShode(codeBimeShode);
                        viewReceptionExcelNotExist.setBimeGozar(nameBimeGozar);
                        viewReceptionExcelNotExist.setPolicyno(policyNo);
                        viewReceptionExcelNotExist.setCodeTarh(codeTarh);
                        viewReceptionExcelNotExist.setFranshiz(franshiz);
                        viewReceptionExcelNotExist.setGrouhKariBimeGozar(grouhKariBimeGozar);
                        if (bimarestani) {
                            viewReceptionExcelNotExist.setBimarestani(1l);
                            viewReceptionExcelNotExist.setHazineBimarestaniElami(hazineElamShode);
                            viewReceptionExcelNotExist.setHazineBimarestaniPardakhti(hazinePardakhti);
                        } else {
                            viewReceptionExcelNotExist.setBimarestani(0l);
                            viewReceptionExcelNotExist.setHazineParaElami(hazineElamShode);
                            viewReceptionExcelNotExist.setHazineParaPardakhti(hazinePardakhti);
                        }
                        viewReceptionExcelNotExist.setPatientNationalID(nationalID);
                        viewReceptionExcelNotExist.setAsliNationalID(nationalIDAsli);
                        viewReceptionExcelNotExist.setPatientName(nameBimeShode);
                        viewReceptionExcelNotExist.setAsliFullName(nameBimeShodeAsli);
                        viewReceptionExcelNotExist.setPersonelID(personelID);
                        viewReceptionExcelNotExist.setPolicy(policy);
                        viewReceptionExcelNotExist.setKarshenasParvande(karshenasParvande);
                        viewReceptionExcelNotExist.setMaliat(maliat);
                        viewReceptionExcelNotExist.setNameKarshenas(nameKarshenas);
                        viewReceptionExcelNotExist.setNameMarkazDarmani(nameMarkasDarmani);
                        viewReceptionExcelNotExist.setNoeBimari(noeBimari);
                        viewReceptionExcelNotExist.setNoeTahvilMadarek(noeTahvilMadarek);
                        viewReceptionExcelNotExist.setNoeTarh(noeTarh);
                        viewReceptionExcelNotExist.setPardakhtAzMahal(pardakhtAzMahal);
                        viewReceptionExcelNotExist.setRadif(radif);
                        viewReceptionExcelNotExist.setSerialMoarefiName(serialMoarefiName);
                        viewReceptionExcelNotExist.setShomareBaygani(shomareBaygani);
                        viewReceptionExcelNotExist.setShomareHavale(shomareHavale);
                        viewReceptionExcelNotExist.setShomareParvande(shomareParvande);
                        viewReceptionExcelNotExist.setTasvieShode(tasvieShode);
                        viewReceptionExcelNotExist.setVahedePardakhti(vahedePardakht);
                        viewReceptionExcelNotExist.setVehedeMoaref(moaref);
                        viewReceptionExcelNotExist.setVahedeSazmani(vahedeSazmani);
                        viewReceptionExcelNotExist.setVehedeSodour(vahedeSodour);
                        viewReceptionExcelNotExist.setPolicyName(nameTarh);
                        viewReceptionExcelNotExist.setNoeHavale(noeHavale);
                        viewReceptionExcelNotExist.setInvoiceExcelID(invoiceExcelID);
                        viewReceptionExcelNotExist.setTarikhBimari(DateUtil.getStrDate(tarikhBimari));
                        viewReceptionExcelNotExist.setTarikhHavale(tarikhHavale);
                        viewReceptionExcelNotExist.setTarikhElamKhesarat(tarikhElamKhesart);
                        viewReceptionExcelNotExist.setVazeiatParvande(vazeiatParvande);
                        viewReceptionExcelNotExist.setKarbarSabteParvande(karbarSabteParvande);
                        viewReceptionExcelNotExist.setGruheBimari(gruheBimari);
                        viewReceptionExcelNotExist.setCodeRayaneMoredKhesarat(codeRayaneMoredKhesarat);
                        viewReceptionExcelNotExist.setMablaghMohasebeSodeMotabeghTarefe(mablaghMohasebeSodeMotabeghTarefe);
                        viewReceptionExcelNotExist.setSheba(sheba);
                        viewReceptionExcelList.add(viewReceptionExcelNotExist);
                    }

                } else if (duplicate == false) {

                    ViewReceptionExcel viewDBReceptionExcel = new ViewReceptionExcel();
                    viewDBReceptionExcel.setInvoiceExcelID(invoiceExcelID);
                    viewDBReceptionExcel.setCodeKarshenas(codeKarshenas);
                    viewDBReceptionExcel.setState(1l);
                    viewDBReceptionExcel.setCodeBimeShode(codeBimeShode);
                    viewDBReceptionExcel.setBimeGozar(nameBimeGozar);
                    viewDBReceptionExcel.setPolicyno(policyNo);
                    viewDBReceptionExcel.setCodeTarh(codeTarh);
                    viewDBReceptionExcel.setFranshiz(franshiz);
                    viewDBReceptionExcel.setGrouhKariBimeGozar(grouhKariBimeGozar);
                    if (bimarestani) {
                        viewDBReceptionExcel.setBimarestani(1l);
                        viewDBReceptionExcel.setHazineBimarestaniElami(hazineElamShode);
                        viewDBReceptionExcel.setHazineBimarestaniPardakhti(hazinePardakhti);
                    } else {
                        viewDBReceptionExcel.setBimarestani(0l);
                        viewDBReceptionExcel.setHazineParaElami(hazineElamShode);
                        viewDBReceptionExcel.setHazineParaPardakhti(hazinePardakhti);
                    }
                    viewDBReceptionExcel.setInsuredPerson(insuredPerson);
                    viewDBReceptionExcel.setPerson(insuredPerson.getPerson());
                    viewDBReceptionExcel.setPolicy(policy);
                    viewDBReceptionExcel.setKarshenasParvande(karshenasParvande);
                    viewDBReceptionExcel.setMaliat(maliat);
                    viewDBReceptionExcel.setNameKarshenas(nameKarshenas);
                    viewDBReceptionExcel.setNameMarkazDarmani(nameMarkasDarmani);
                    viewDBReceptionExcel.setNoeBimari(noeBimari);
                    viewDBReceptionExcel.setNoeTahvilMadarek(noeTahvilMadarek);
                    viewDBReceptionExcel.setNoeTarh(noeTarh);
                    viewDBReceptionExcel.setPardakhtAzMahal(pardakhtAzMahal);
                    viewDBReceptionExcel.setRadif(radif);
                    viewDBReceptionExcel.setSerialMoarefiName(serialMoarefiName);
                    viewDBReceptionExcel.setShomareBaygani(shomareBaygani);
                    viewDBReceptionExcel.setShomareHavale(shomareHavale);
                    viewDBReceptionExcel.setShomareParvande(shomareParvande);
                    viewDBReceptionExcel.setTasvieShode(tasvieShode);
                    viewDBReceptionExcel.setVahedePardakhti(vahedePardakht);
                    viewDBReceptionExcel.setVehedeMoaref(moaref);
                    viewDBReceptionExcel.setVahedeSazmani(vahedeSazmani);
                    viewDBReceptionExcel.setVehedeSodour(vahedeSodour);
                    viewDBReceptionExcel.setPolicyName(nameTarh);
                    viewDBReceptionExcel.setNoeHavale(noeHavale);
                    viewDBReceptionExcel.setInvoiceExcelID(invoiceExcelID);
                    viewDBReceptionExcel.setPersonelID(personelID);
                    viewDBReceptionExcel.setPatientNationalID(nationalID);
                    viewDBReceptionExcel.setAsliFullName(nameBimeShodeAsli);
                    viewDBReceptionExcel.setAsliNationalID(nationalIDAsli);
                    viewDBReceptionExcel.setPatientName(nameBimeShode);
                    viewDBReceptionExcel.setTarikhBimari(DateUtil.getStrDate(tarikhBimari));
                    viewDBReceptionExcel.setTarikhHavale(tarikhHavale);
                    viewDBReceptionExcel.setTarikhElamKhesarat(tarikhElamKhesart);
                    viewDBReceptionExcel.setVazeiatParvande(vazeiatParvande);
                    viewDBReceptionExcel.setKarbarSabteParvande(karbarSabteParvande);
                    viewDBReceptionExcel.setGruheBimari(gruheBimari);
                    viewDBReceptionExcel.setCodeRayaneMoredKhesarat(codeRayaneMoredKhesarat);
                    viewDBReceptionExcel.setMablaghMohasebeSodeMotabeghTarefe(mablaghMohasebeSodeMotabeghTarefe);
                    viewDBReceptionExcel.setSheba(sheba);
                    viewDBReceptionExcelList.add(viewDBReceptionExcel);
                } else {
                    duplicate = true;
                }

                if (duplicate) {
                    error = "خسارت تکراری است";
                    rowError.put(excelMapping.get("nationalID").intValue(), error);
                }

                notExist = false;
                duplicate = false;
                policy = null;
                policyNo = null;
                nationalID = null;
                noeBimari = null;
                tarikhBimari = null;
                radif = null;
                noeHavale = null;
                tarikhHavale = null;
                shomareHavale = null;
                shomareParvande = null;
                vahedePardakht = null;
                nameBimeGozar = null;
                vahedeSazmani = null;
                codeBimeShode = null;
                codeRayaneBimeName = null;
                serialMoarefiName = null;
                pardakhtAzMahal = null;
                codeTarh = null;
                noeTarh = null;
                tasvieShode = null;
                shomareBaygani = null;
                grouhKariBimeGozar = null;
                tarikhElamKhesart = null;
                codeKarshenas = null;
                vahedeSodour = null;
                moaref = null;
                nameKarshenas = null;
                karshenasParvande = null;
                nameMarkasDarmani = null;
                noeTahvilMadarek = null;
                hazinePardakhti = null;
                hazineElamShode = null;
                maliat = null;
                franshiz = null;
                nameBimeShode = null;
                nameBimeShodeAsli = null;
                nationalIDAsli = null;
                personelID = null;
                nameTarh = null;
                insuredPerson = null;
                vazeiatParvande = null;
                karbarSabteParvande = null;
                gruheBimari = null;
                codeRayaneMoredKhesarat = null;
                mablaghMohasebeSodeMotabeghTarefe = null;
                sheba=null;


                if (rowError.size() > 0) {
                    errorMap.put(row.getRowNum(), rowError);
                }
            }

        } catch (Exception e) {
            if (rowError.size() > 0) {
                errorMap.put(row.getRowNum(), rowError);
            }
            Errors errors = new Errors();
            errors.setMsg("خطا در ردیف " + row.getRowNum() + " \n خطا: " + e.toString());
            errorsList.add(errors);
            if (errorMap.size() > 0) {
                return null;
            }
            return null;
        }
        return viewDBReceptionExcelList;
    }

    @Override
    public List<ViewPolicy> readExcelFileForSaveBimehGozar(File fileUpload, Map<Integer, Map<Integer, String>> errorMap) {

        FileInputStream fis = null;

        Policy policy = null;
        String policyNo=null;
        BigDecimal codeRayaneBimehNameh=null;
        String orgName=null;
        BigDecimal codeSodour=null;
        String beginDate=null;
        String endDate=null;


        List<ViewPolicy> viewPolicyList = new ArrayList<>();
        Map<Integer, String> rowError = null;
        Row row = null;

        Map<String, Integer> mapping = new HashMap<>();

        mapping.put("codeRayaneBimehNameh", 2);
        mapping.put("policyNo", 3);
        mapping.put("orgName", 9);
        mapping.put("codeSodour", 12);
        mapping.put("beginDate", 13);
        mapping.put("endDate", 14);

        try {
            fis = new FileInputStream(fileUpload);
            XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
            int rows = mySheet.getPhysicalNumberOfRows();
            if (rows < 2) {
                return null;
            }

            Iterator<Row> rowIterator = mySheet.iterator();
            rowIterator.next();//ignore first Row//
            Cell cell = null;

            while (rowIterator.hasNext()) {
                rowError = new HashMap<Integer, String>();
                String error = null;
                row = (Row) rowIterator.next();
                if (row == null)
                    continue;


                cell = row.getCell(mapping.get("policyNo"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "شماره بيمه نامه الزامي است";
                    rowError.put(mapping.get("policyNo"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    policyNo = cell.getStringCellValue();
                    policy = policyDAO.findByPolicyNo(policyNo);
                    if (policy != null) {
                        error = "بیمه نامه ای با این شماره بیمه نامه در سیستم موجود است";
                        rowError.put(mapping.get("policyNo"), error);
                    }
                }

                cell = row.getCell(mapping.get("codeRayaneBimehNameh"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "کد رایانه بیمه نامه الزامی است";
                    rowError.put(mapping.get("codeRayaneBimehNameh"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    codeRayaneBimehNameh = new BigDecimal(cell.getStringCellValue());
                    policy = policyDAO.findById(codeRayaneBimehNameh);
                    if (policy != null) {
                        error = "بیمه نامه ای با این کد رایانه در سیستم موجود است";
                        rowError.put(mapping.get("codeRayaneBimehNameh"), error);
                    }
                }

                cell = row.getCell(mapping.get("orgName"));
                if (DataValidation.isCellEmpty(cell)) {
                    error ="نام بیمه گذار الزامی است.";
                    rowError.put(mapping.get("orgName"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    orgName = cell.getStringCellValue();
                }

                cell = row.getCell(mapping.get("codeSodour"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "کد صدور الزامی است.";
                    rowError.put(mapping.get("codeSodour"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    codeSodour = new BigDecimal(cell.getStringCellValue());
                    if(!codeSodour.equals(new BigDecimal(410510))){
                        error = "کد صدور مجاز نیست";
                        rowError.put(mapping.get("codeSodour"), error);
                    }
                }


                cell = row.getCell(mapping.get("beginDate"));
                if (DataValidation.isCellEmpty(cell)) {
                    error ="تاریخ شروع بیمه نامه الزامی است.";
                    rowError.put(mapping.get("beginDate"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    beginDate = cell.getStringCellValue();
                }

                cell = row.getCell(mapping.get("endDate"));
                if (DataValidation.isCellEmpty(cell)) {
                    error ="تاریخ پایان بیمه نامه الزامی است.";
                    rowError.put(mapping.get("endDate"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    endDate = cell.getStringCellValue();
                }


                ViewPolicy viewPolicy = new ViewPolicy();
                viewPolicy.setCodeRayaneBimehNameh(codeRayaneBimehNameh);
                viewPolicy.setPolicyNo(policyNo);
                viewPolicy.setCodeSodour(codeSodour);
                viewPolicy.setOrgName(orgName);
                viewPolicy.setBeginDate(beginDate);
                viewPolicy.setEndDate(endDate);
                viewPolicyList.add(viewPolicy);



                policyNo = null;
                codeRayaneBimehNameh = null;
                codeSodour = null;
                orgName = null;
                beginDate=null;
                endDate=null;
                policy = null;


                if (rowError.size() > 0) {
                    errorMap.put(row.getRowNum(), rowError);
                }
            }

        } catch (Exception e) {
            if (rowError.size() > 0) {
                errorMap.put(row.getRowNum(), rowError);
            }
            if (errorMap.size() > 0) {
                return null;
            }
            return null;
        }


        return viewPolicyList;
    }


    @Override
    public void saveBimehGozar(ViewPolicy viewPolicy, Users user, String date, String time) {

        Policy policy = new Policy();
        policy.setBegindate(new Long(viewPolicy.getBeginDate().replaceAll("/","")));
        policy.setEnddate(new Long(viewPolicy.getEndDate().replaceAll("/","")));
        policy.setPolicyno(viewPolicy.getPolicyNo());
        policy.setPolicyname(viewPolicy.getOrgName());
        policy.setAgency(agencyDAO.findById(viewPolicy.getCodeSodour()));
        policy.setId(viewPolicy.getCodeRayaneBimehNameh());
        policy.setUsers(user);
        policy.setCreatedate(date);
        policy.setCreatetime(time);
        policy.setState(1l);
        policy.setPolicytype(3l);
        policyDAO.save(policy);

    }

    @Override
    public PaginatedListImpl<ViewPolicy> getViewPolicyPaginatedList(int page, List<ViewPolicy> viewPolicyList) {
        PaginatedListImpl<ViewPolicy> resultList = new PaginatedListImpl<ViewPolicy>();
        resultList.setPageNumber(page); //(page)
        resultList.setObjectsPerPage(PagingUtil.MAX_OBJECTS_PER_PAGE);
        resultList.setList(viewPolicyList);
        resultList.setPageNumber(1);
        resultList.setObjectsPerPage(Integer.MAX_VALUE);
        resultList.setFullListSize(viewPolicyList.size());
        return resultList;
    }

    @Override
    public List<ViewInsuredPerson> readExcelFileForSaveMobile(File fileUpload, Map<Integer, Map<Integer, String>> errorMap) {
        FileInputStream fis = null;
        Policy policy = null;
        String policyNo = null;
        String nationalID = null;
        String mobile = null;
        InsuredPerson insuredPerson = null;
        Contact contact = null;


        List<ViewInsuredPerson> viewInsuredPersonList = new ArrayList<>();
        Map<Integer, String> rowError = null;
        Row row = null;

        Map<String, Integer> mapping = new HashMap<>();

        mapping.put("policyNo", 0);
        mapping.put("nationalID", 1);
        mapping.put("mobile", 2);


        try {
            fis = new FileInputStream(fileUpload);
            XSSFWorkbook myWorkBook = new XSSFWorkbook(fis);
            XSSFSheet mySheet = myWorkBook.getSheetAt(0);
            int rows = mySheet.getPhysicalNumberOfRows();
            if (rows < 2) {
                return null;
            }

            Iterator<Row> rowIterator = mySheet.iterator();
            rowIterator.next();//ignore first Row//
            Cell cell = null;

            while (rowIterator.hasNext()) {
                rowError = new HashMap<Integer, String>();
                String error = null;
                row = (Row) rowIterator.next();
                if (row == null)
                    continue;


                cell = row.getCell(mapping.get("policyNo"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "شماره بيمه نامه الزامي است";
                    rowError.put(mapping.get("policyNo"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    policyNo = cell.getStringCellValue();
                    policy = policyDAO.findByPolicyNo(policyNo);
                    if (policy == null) {
                        error = "بيمه نامه اي با اين شماره بيمه نامه در سيستم موجود نيست";
                        rowError.put(mapping.get("policyNo"), error);
                        if (rowError.size() > 0) {
                            errorMap.put(row.getRowNum(), rowError);
                        }
                        continue;
                    }
                }


                cell = row.getCell(mapping.get("nationalID"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "کدملی بیمه شده الزامی است";
                    rowError.put(mapping.get("nationalID"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    nationalID = cell.getStringCellValue();
                    insuredPerson = insuredPersonDAO.findByNationalAndPolicyID(nationalID, policy.getId());
                    if (insuredPerson == null) {
                        error = "بیمه شده در سیستم موجود نیست";
                        rowError.put(mapping.get("nationalID"), error);
                    } else {
                        if (insuredPerson.getFamilyrelation() != null && insuredPerson.getFamilyrelation() != 1) {
                            error = "شماره موبایل فقط برای بیمه شده اصلی ثبت می شود";
                            rowError.put(mapping.get("nationalID"), error);
                        }
                    }
                }


                cell = row.getCell(mapping.get("mobile"));
                if (DataValidation.isCellEmpty(cell)) {
                    error = "شماره موبایل الزامی است";
                    rowError.put(mapping.get("sheba"), error);
                } else {
                    cell.setCellType(Cell.CELL_TYPE_STRING);
                    mobile = cell.getStringCellValue();
                }


                ViewInsuredPerson viewInsuredPerson = new ViewInsuredPerson();
                viewInsuredPerson.setPolicy(policy);
                viewInsuredPerson.setPolicyNo(policyNo);
                viewInsuredPerson.setNationalID(nationalID);
                viewInsuredPerson.setInsuredPerson(insuredPerson);
                viewInsuredPerson.setMobile(new BigInteger(mobile));
                viewInsuredPersonList.add(viewInsuredPerson);


                policy = null;
                policyNo = null;
                nationalID = null;
                mobile = null;
                insuredPerson = null;


                if (rowError.size() > 0) {
                    errorMap.put(row.getRowNum(), rowError);
                }
            }

        } catch (Exception e) {
            if (rowError.size() > 0) {
                errorMap.put(row.getRowNum(), rowError);
            }
            if (errorMap.size() > 0) {
                return null;
            }
            return null;
        }


        return viewInsuredPersonList;
    }

    @Override
    public void deleteOldMobile(ViewInsuredPerson viewInsuredPerson, Users user, String date, String time) {
        InsuredPerson insuredPerson = viewInsuredPerson.getInsuredPerson();

        Contact oldContact = personDAO.findByPersonId(insuredPerson.getPerson().getId());
        if(oldContact != null){
            oldContact.setState(100l);
            oldContact.setLastEditDate(date);
            oldContact.setLastEditTime(time);
            oldContact.setLastEditUserID(user);
            contactDAO.saveOrUpdate(oldContact);
        }
    }

    @Override
    public ViewInsuredPerson saveMobile(ViewInsuredPerson viewInsuredPerson, Users user, String date, String time) {
        InsuredPerson insuredPerson = viewInsuredPerson.getInsuredPerson();
        BigInteger mobile = viewInsuredPerson.getMobile();

        Contact contact = new Contact();
        contact.setPerson(insuredPerson.getPerson());
        contact.setMobile(mobile);
        contact.setCreatedate(date);
        contact.setCreatetime(time);
        contact.setUsers(user);
        contact.setState(1l);

        contactDAO.saveOrUpdate(contact);

        viewInsuredPerson.setFirstName(insuredPerson.getPerson().getName());
        viewInsuredPerson.setLastName(insuredPerson.getPerson().getFamily());

        return viewInsuredPerson;
    }

    @Override
    public List<ViewInsuredPerson> searchMainInsuredPerson( BigDecimal policyID, String mainNationalID) {
        List<ViewInsuredPerson> viewInsuredPersonList =  policyDAO.findMainInsuredPersonByPolicyAndMainNationalID(mainNationalID,policyID);
        if(viewInsuredPersonList!=null && viewInsuredPersonList.size()!=0) {
            Suspend suspend = suspendDAO.findByMainInsuredPerson(viewInsuredPersonList.get(0).getInsuredPersonCode());
            if(suspend!= null) {
                viewInsuredPersonList.get(0).setStateStr("تعلیق شده");
                viewInsuredPersonList.get(0).setState(0);
            }
            else {
                viewInsuredPersonList.get(0).setStateStr("فعال");
                viewInsuredPersonList.get(0).setState(1);
            }
        }
        return viewInsuredPersonList;
    }

    @Override
    public List<ViewInsuredPerson> suspendInsuredPerson(List<ViewInsuredPerson> viewInsuredPersonList, BigDecimal mainInsuredPersonID, Users user) {

        String date = DateUtil.getCurrentDate();
        String time= DateUtil.getCurrentTime();
        Suspend suspend = new Suspend();
        suspend.setMainInsuredPerson(insuredPersonDAO.findById(mainInsuredPersonID));
        suspend.setSuspendDate(date);
        suspend.setSuspendTime(time);
        suspend.setSuspendUser(user);
        suspend.setState(1l);

        suspend.setUsers(user);
        suspend.setCreatedate(date);
        suspend.setCreatetime(time);
        suspendDAO.saveOrUpdate(suspend);

        if(viewInsuredPersonList != null && viewInsuredPersonList.size()!=0) {
            viewInsuredPersonList.get(0).setStateStr("تعلیق شده");
            viewInsuredPersonList.get(0).setState(0);
        }


        return viewInsuredPersonList;
    }

    @Override
    public List<ViewInsuredPerson> fixTheSuspensionInsuredPerson(List<ViewInsuredPerson> viewInsuredPersonList, BigDecimal mainInsuredPersonID, Users user) {

        String date = DateUtil.getCurrentDate();
        String time= DateUtil.getCurrentTime();

        Suspend suspend = suspendDAO.findByMainInsuredPerson(mainInsuredPersonID);
        suspend.setRafeTalighDate(date);
        suspend.setRafeTalighTime(time);
        suspend.setRafeTalighUser(user);
        suspend.setState(2l);

        suspend.setUsers(user);
        suspend.setCreatedate(date);
        suspend.setCreatetime(time);
        suspendDAO.saveOrUpdate(suspend);

        if(viewInsuredPersonList != null && viewInsuredPersonList.size()!=0) {
            viewInsuredPersonList.get(0).setStateStr("فعال");
            viewInsuredPersonList.get(0).setState(1);
        }

        return viewInsuredPersonList;
    }

    @Override
    public ReceptionExcelFiles saveReceptionExcelFile(File fileUpload, Users user) {
        ReceptionExcelFiles receptionExcelFile = new ReceptionExcelFiles();
        receptionExcelFile.setCreatedate(DateUtil.getCurrentDate());
        receptionExcelFile.setCreatetime(DateUtil.getCurrentTime());
        receptionExcelFile.setUsers(user);
        receptionExcelFile.setState(1l);
        byte[] fileByteArray = null;
        try {
            fileByteArray = java.nio.file.Files.readAllBytes(fileUpload.toPath());
        } catch (IOException e) {
        }
        receptionExcelFile.setExcelFile(fileByteArray);
        receptionExcelFile= (ReceptionExcelFiles) receptionExcelFileDAO.saveOrUpdate(receptionExcelFile);
        return receptionExcelFile;
    }

    @Override
    public BigInteger findSumOfMablagh(String invoiceNo, String nationalNO, String policyNO, Long state, String createDateFrom, String createDateTo, String elamBeMaliDateFrom, String elamBeMaliDateTo) {
        PaginatedListImpl<ViewCredebit> credebitList = searchFanniSubManager(invoiceNo, nationalNO, policyNO, state, createDateFrom, createDateTo, elamBeMaliDateFrom, elamBeMaliDateTo);
        BigInteger sumMablagh = new BigInteger("0");
        List<ViewCredebit> viewCredebitList = credebitList.getList();
        for(ViewCredebit viewCredebit: viewCredebitList){
            sumMablagh = sumMablagh.add(viewCredebit.getMablagh());
        }
        return sumMablagh;
    }
	@Override
    public Policy findPolicyByID(BigDecimal policyID) {
        Policy policy = policyDAO.findById(policyID);
        policy = policyDAO.setStrForPolicy(policy);
        return policy;
    }

    @Override
    public List<ViewInsuredPerson> searchInsuredPerson(BigDecimal policyID, String nationalID) {
        return policyDAO.findInsuredPersonByPolicyAndNationalID(nationalID,policyID);
    }

    @Override
    public InsuredPerson movingInsuredPerson(Users user, BigDecimal policyID, String mainNationalID, BigDecimal insuredPersonCode, List<Errors> errors) {

        InsuredPerson mainInsuredPerson = insuredPersonDAO.findInsuredPersonByNationalIDAndPolicy(mainNationalID,policyID);
        InsuredPerson insuredPerson = insuredPersonDAO.findById(insuredPersonCode);

        if(insuredPerson == null){
            Errors error = new Errors();
            error.setMsg("بیمه شده مورد نظر یافت نشد.");
            errors.add(error);
            return null;
        }
        if(mainInsuredPerson != null && mainInsuredPerson.getFamilyrelation()!= null && mainInsuredPerson.getFamilyrelation().intValue()==1){
            insuredPerson.setPersonelid(mainInsuredPerson.getPersonelid());
            insuredPerson.setMainInsuredPerson(mainInsuredPerson);
            insuredPerson.setPolicy(mainInsuredPerson.getPolicy());
            insuredPerson.setLastEditDate(DateUtil.getCurrentDate());
            insuredPerson.setLastEditTime(DateUtil.getCurrentTime());
            insuredPerson.setLastEditUserID(user);
            insuredPerson = (InsuredPerson) insuredPersonDAO.saveOrUpdate(insuredPerson);
        }else{
            Errors error = new Errors();
            error.setMsg("بیمه شده اصلی یافت نشد.");
            errors.add(error);
        }
        return insuredPerson;
    }

    @Override
    public InsuredPerson movingFamily(Users user, BigDecimal policyID, String personelID, BigDecimal mainInsuredPersonID, List<Errors> errors) {

        InsuredPerson mainInsuredPerson = insuredPersonDAO.findById(mainInsuredPersonID);
        if(mainInsuredPerson == null){
            Errors error = new Errors();
            error.setMsg("بیمه شده اصلی یافت نشد.");
            errors.add(error);
            return null;
        }
        InsuredPerson mainPersonMaghsad = insuredPersonDAO.findMainPersonByPersonelIDAndPolicyID(personelID,policyID);
        if(mainPersonMaghsad != null && !mainPersonMaghsad.getId().equals(mainInsuredPersonID)){
            Errors error = new Errors();
            error.setMsg("خانواده دیگری با این کد پرسنلی در بیمه نامه مقصد وجود دارد. (کد پرسنلی تکراری)");
            errors.add(error);
            return mainInsuredPerson;
        }
        List<InsuredPerson> familyMember = insuredPersonDAO.getInsuredPersonListByMainInsuredPerson(mainInsuredPersonID);
        Policy policy = policyDAO.findById(policyID);

        //enteghal bimeh shode asli
        mainInsuredPerson.setPersonelid(personelID);
        mainInsuredPerson.setPolicy(policy);
        mainInsuredPerson.setLastEditDate(DateUtil.getCurrentDate());
        mainInsuredPerson.setLastEditTime(DateUtil.getCurrentTime());
        mainInsuredPerson.setLastEditUserID(user);
        mainInsuredPerson = (InsuredPerson) insuredPersonDAO.saveOrUpdate(mainInsuredPerson);

        //enteghal azae khanevade
        if(familyMember!= null){
            for (InsuredPerson insuredPerson : familyMember) {
                insuredPerson.setPersonelid(personelID);
                insuredPerson.setPolicy(policy);
                insuredPerson.setLastEditDate(DateUtil.getCurrentDate());
                insuredPerson.setLastEditTime(DateUtil.getCurrentTime());
                insuredPerson.setLastEditUserID(user);
                insuredPerson = (InsuredPerson) insuredPersonDAO.saveOrUpdate(insuredPerson);
            }
        }


        return mainInsuredPerson;
    }

    @Override
    public Policy suspendPolicy(BigDecimal policyID, Users user) {

        Policy policy= policyDAO.findById(policyID);
        String date = DateUtil.getCurrentDate();
        String time= DateUtil.getCurrentTime();
        Suspend suspend = new Suspend();
        suspend.setPolicy(policy);
        suspend.setSuspendDate(date);
        suspend.setSuspendTime(time);
        suspend.setSuspendUser(user);
        suspend.setState(1l);

        suspend.setUsers(user);
        suspend.setCreatedate(date);
        suspend.setCreatetime(time);
        suspendDAO.saveOrUpdate(suspend);

        policy.setStateStr("تعلیق شده");
        policy.setSuspond(1l);

        return policy;
    }

    @Override
    public Policy fixTheSuspensionPolicy(BigDecimal policyID, Users user) {

        Policy policy= policyDAO.findById(policyID);
        String date = DateUtil.getCurrentDate();
        String time= DateUtil.getCurrentTime();

        Suspend suspend = policyDAO.findSuspondByPolicy(policyID);
        suspend.setRafeTalighDate(date);
        suspend.setRafeTalighTime(time);
        suspend.setRafeTalighUser(user);
        suspend.setState(2l);

        suspend.setUsers(user);
        suspend.setCreatedate(date);
        suspend.setCreatetime(time);
        suspendDAO.saveOrUpdate(suspend);

        policy.setStateStr("دائم");
        policy.setSuspond(0l);

        return policy;
    }



    @Override
    public void generateWordDoc (aminParsian.viewModel.ViewSarresidElamBedehi viewSarresidElamBedehi, String source, String dest) throws java.io.IOException {

    }
}
