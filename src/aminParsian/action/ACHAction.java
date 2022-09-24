package aminParsian.action;

import aminParsian.displaytag.PagingUtil;
import aminParsian.service.IACHService;
import aminParsian.service.IUserService;
import aminParsian.util.StringUtil;
import aminParsian.viewModel.*;
import org.apache.struts2.util.ServletContextAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import aminParsian.displaytag.PaginatedListImpl;
import aminParsian.model.*;
import aminParsian.util.BaseAction;

import javax.servlet.ServletContext;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

import java.io.File;

/**
 * Created by a-naderi on 7/25/2017.
 */
public class ACHAction extends BaseAction implements ServletContextAware {

    private IUserService userService;
    private List usersArrayList = new ArrayList();
    private ServletContext servletContext;
    private PaginatedListImpl<ViewCredebit> credebitList;
    private IACHService achService;
    private String invoiceNo;
    private String nationalNO;
    private String policyNO;
    private Long state;
    private String errorMessage;
    private String actionMessage;
    private BigDecimal credebitID;
    private Credebit credebit;
    private Users user;
    private ViewCredebit viewCredebit;
    private String createDateFrom;
    private String createDateTo;
    private String elamBeMaliDateFrom;
    private String elamBeMaliDateTo;
    private List<Credebit> credebits;
    private List<Credebit> credebitList2;
    private ArrayList<ViewCredebitState> credebitStateList;
    private List<ViewSanad> viewSanadList;
    private List<ViewSanad> viewSanadListPardakht1;
    private List<ViewSanad> viewSanadListPardakht2;

    private File bankFileAddress;
    private String bankFileAddressContentType;
    private String bankFileAddressFileName;
    private List<String> getBankExcel;

    private File darmanFileAddress;
    private String darmanFileAddressContentType;
    private String darmanFileAddressFileName;
    private List<String> getDarmanExcel;

    private List<ViewCredebit> moghayerat;
    private BigInteger sumMablagh;

    private boolean bimarestani;
    private PaginatedListImpl<ViewReceptionExcel> paginatedViewDBReceptionExcelList;
    private PaginatedListImpl<ViewReceptionExcel> paginatedViewReceptionExcelList;
    private File fileUpload;
    private String contentType;
    private String fileName;
    private String errormessage;
    private InputStream inputStream;
    private String message;
    private PaginatedListImpl<ViewInsuredPerson> paginatedViewInsuredPersonList;
    private List<InsuredPerson> insuredPersons;
    private BigDecimal policyID;
    private String nationalID;
    private String mainNationalID;
    private String personelID;
    private List<ViewPolicy> viewPolicyList;
    private PaginatedListImpl<ViewPolicy> paginatedViewPolicyList;
    private List<ViewInsuredPerson> viewInsuredPersonList;
    private BigDecimal mainInsuredPersonID;
    private Long hasShebaID;
    private Long hasMobileID;
    private String sumMablaghStr;
    private String sheba;
    private BigInteger mobile;
    private Long stateCode;
    private Policy policy;
    private BigDecimal insuredPersonCode;
// -------------------------------------------------------------------------------------------------------------------------------------------------------------



    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }
    public BigDecimal getInsuredPersonCode() {
        return insuredPersonCode;
    }

    public void setInsuredPersonCode(BigDecimal insuredPersonCode) {
        this.insuredPersonCode = insuredPersonCode;
    }

    public Long getStateCode() {
        return stateCode;
    }

    public void setStateCode(Long stateCode) {
        this.stateCode = stateCode;
    }

    public String getSheba() {
        return sheba;
    }

    public void setSheba(String sheba) {
        this.sheba = sheba;
    }

    public BigInteger getMobile() {
        return mobile;
    }

    public void setMobile(BigInteger mobile) {
        this.mobile = mobile;
    }

    public String getSumMablaghStr() {
        return sumMablaghStr;
    }

    public void setSumMablaghStr(String sumMablaghStr) {
        this.sumMablaghStr = sumMablaghStr;
    }

    public BigInteger getSumMablagh() {
        return sumMablagh;
    }

    public void setSumMablagh(BigInteger sumMablagh) {
        this.sumMablagh = sumMablagh;
    }

    public Long getHasShebaID() {
        return hasShebaID;
    }

    public void setHasShebaID(Long hasShebaID) {
        this.hasShebaID = hasShebaID;
    }

    public Long getHasMobileID() {
        return hasMobileID;
    }

    public void setHasMobileID(Long hasMobileID) {
        this.hasMobileID = hasMobileID;
    }

    public BigDecimal getMainInsuredPersonID() {
        return mainInsuredPersonID;
    }

    public void setMainInsuredPersonID(BigDecimal mainInsuredPersonID) {
        this.mainInsuredPersonID = mainInsuredPersonID;
    }

    public List<ViewInsuredPerson> getViewInsuredPersonList() {
        return viewInsuredPersonList;
    }

    public void setViewInsuredPersonList(List<ViewInsuredPerson> viewInsuredPersonList) {
        this.viewInsuredPersonList = viewInsuredPersonList;
    }

    public PaginatedListImpl<ViewPolicy> getPaginatedViewPolicyList() {
        return paginatedViewPolicyList;
    }

    public void setPaginatedViewPolicyList(PaginatedListImpl<ViewPolicy> paginatedViewPolicyList) {
        this.paginatedViewPolicyList = paginatedViewPolicyList;
    }

    public List<ViewPolicy> getViewPolicyList() {
        return viewPolicyList;
    }

    public void setViewPolicyList(List<ViewPolicy> viewPolicyList) {
        this.viewPolicyList = viewPolicyList;
    }

    public String getPersonelID() {
        return personelID;
    }

    public void setPersonelID(String personelID) {
        this.personelID = personelID;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getMainNationalID() {
        return mainNationalID;
    }

    public void setMainNationalID(String mainNationalID) {
        this.mainNationalID = mainNationalID;
    }

    public BigDecimal getPolicyID() {
        return policyID;
    }

    public void setPolicyID(BigDecimal policyID) {
        this.policyID = policyID;
    }

    public List<InsuredPerson> getInsuredPersons() {
        return insuredPersons;
    }

    public void setInsuredPersons(List<InsuredPerson> insuredPersons) {
        this.insuredPersons = insuredPersons;
    }

    public PaginatedListImpl<ViewInsuredPerson> getPaginatedViewInsuredPersonList() {
        return paginatedViewInsuredPersonList;
    }

    public void setPaginatedViewInsuredPersonList(PaginatedListImpl<ViewInsuredPerson> paginatedViewInsuredPersonList) {
        this.paginatedViewInsuredPersonList = paginatedViewInsuredPersonList;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getErrormessage() {
        return errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public boolean isBimarestani() {
        return bimarestani;
    }

    public void setBimarestani(boolean bimarestani) {
        this.bimarestani = bimarestani;
    }

    public PaginatedListImpl<ViewReceptionExcel> getPaginatedViewDBReceptionExcelList() {
        return paginatedViewDBReceptionExcelList;
    }

    public void setPaginatedViewDBReceptionExcelList(PaginatedListImpl<ViewReceptionExcel> paginatedViewDBReceptionExcelList) {
        this.paginatedViewDBReceptionExcelList = paginatedViewDBReceptionExcelList;
    }

    public PaginatedListImpl<ViewReceptionExcel> getPaginatedViewReceptionExcelList() {
        return paginatedViewReceptionExcelList;
    }

    public void setPaginatedViewReceptionExcelList(PaginatedListImpl<ViewReceptionExcel> paginatedViewReceptionExcelList) {
        this.paginatedViewReceptionExcelList = paginatedViewReceptionExcelList;
    }

    public File getFileUpload() {
        return fileUpload;
    }

    public void setFileUpload(File fileUpload) {
        this.fileUpload = fileUpload;
    }

    public List<String> getGetBankExcel() {
        return getBankExcel;
    }

    public void setGetBankExcel(List<String> getBankExcel) {
        this.getBankExcel = getBankExcel;
    }

    public List<String> getGetDarmanExcel() {
        return getDarmanExcel;
    }

    public void setGetDarmanExcel(List<String> getDarmanExcel) {
        this.getDarmanExcel = getDarmanExcel;
    }

    public List<ViewCredebit> getMoghayerat() {
        return moghayerat;
    }

    public void setMoghayerat(List<ViewCredebit> moghayerat) {
        this.moghayerat = moghayerat;
    }

    public File getBankFileAddress() {
        return bankFileAddress;
    }

    public void setBankFileAddress(File bankFileAddress) {
        this.bankFileAddress = bankFileAddress;
    }

    public String getBankFileAddressContentType() {
        return bankFileAddressContentType;
    }

    public void setBankFileAddressContentType(String bankFileAddressContentType) {
        this.bankFileAddressContentType = bankFileAddressContentType;
    }

    public String getBankFileAddressFileName() {
        return bankFileAddressFileName;
    }

    public void setBankFileAddressFileName(String bankFileAddressFileName) {
        this.bankFileAddressFileName = bankFileAddressFileName;
    }

    public File getDarmanFileAddress() {
        return darmanFileAddress;
    }

    public void setDarmanFileAddress(File darmanFileAddress) {
        this.darmanFileAddress = darmanFileAddress;
    }

    public String getDarmanFileAddressContentType() {
        return darmanFileAddressContentType;
    }

    public void setDarmanFileAddressContentType(String darmanFileAddressContentType) {
        this.darmanFileAddressContentType = darmanFileAddressContentType;
    }

    public String getDarmanFileAddressFileName() {
        return darmanFileAddressFileName;
    }

    public void setDarmanFileAddressFileName(String darmanFileAddressFileName) {
        this.darmanFileAddressFileName = darmanFileAddressFileName;
    }

    public List<ViewSanad> getViewSanadListPardakht2() {
        return viewSanadListPardakht2;
    }

    public void setViewSanadListPardakht2(List<ViewSanad> viewSanadListPardakht2) {
        this.viewSanadListPardakht2 = viewSanadListPardakht2;
    }

    public List<ViewSanad> getViewSanadListPardakht1() {
        return viewSanadListPardakht1;
    }

    public void setViewSanadListPardakht1(List<ViewSanad> viewSanadListPardakht1) {
        this.viewSanadListPardakht1 = viewSanadListPardakht1;
    }

    public List<ViewSanad> getViewSanadList() {
        return viewSanadList;
    }

    public void setViewSanadList(List<ViewSanad> viewSanadList) {
        this.viewSanadList = viewSanadList;
    }

    public List<Credebit> getCredebitList2() {
        return credebitList2;
    }

    public void setCredebitList2(List<Credebit> credebitList2) {
        this.credebitList2 = credebitList2;
    }

    public List<Credebit> getCredebits() {
        return credebits;
    }

    public void setCredebits(List<Credebit> credebits) {
        this.credebits = credebits;
    }

    public String getCreateDateFrom() {
        return createDateFrom;
    }

    public void setCreateDateFrom(String createDateFrom) {
        this.createDateFrom = createDateFrom;
    }

    public String getCreateDateTo() {
        return createDateTo;
    }

    public void setCreateDateTo(String createDateTo) {
        this.createDateTo = createDateTo;
    }

    public String getElamBeMaliDateFrom() {
        return elamBeMaliDateFrom;
    }

    public void setElamBeMaliDateFrom(String elamBeMaliDateFrom) {
        this.elamBeMaliDateFrom = elamBeMaliDateFrom;
    }

    public String getElamBeMaliDateTo() {
        return elamBeMaliDateTo;
    }

    public void setElamBeMaliDateTo(String elamBeMaliDateTo) {
        this.elamBeMaliDateTo = elamBeMaliDateTo;
    }

    public ArrayList<ViewCredebitState> getCredebitStateList() {
        return credebitStateList;
    }

    public void setCredebitStateList(ArrayList<ViewCredebitState> credebitStateList) {
        this.credebitStateList = credebitStateList;
    }

    public ViewCredebit getViewCredebit() {
        return viewCredebit;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public void setViewCredebit(ViewCredebit viewCredebit) {
        this.viewCredebit = viewCredebit;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public List getUsersArrayList() {
        return usersArrayList;
    }

    public void setUsersArrayList(List usersArrayList) {
        this.usersArrayList = usersArrayList;
    }

    public ServletContext getServletContext() {
        return servletContext;
    }

    public PaginatedListImpl<ViewCredebit> getCredebitList() {
        return credebitList;
    }

    public void setCredebitList(PaginatedListImpl<ViewCredebit> credebitList) {
        this.credebitList = credebitList;
    }

    public IACHService getAchService() {
        return achService;
    }

    public void setAchService(IACHService achService) {
        this.achService = achService;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getNationalNO() {
        return nationalNO;
    }

    public void setNationalNO(String nationalNO) {
        this.nationalNO = nationalNO;
    }

    public String getPolicyNO() {
        return policyNO;
    }

    public void setPolicyNO(String policyNO) {
        this.policyNO = policyNO;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getActionMessage() {
        return actionMessage;
    }

    public void setActionMessage(String actionMessage) {
        this.actionMessage = actionMessage;
    }

    public BigDecimal getCredebitID() {
        return credebitID;
    }

    public void setCredebitID(BigDecimal credebitID) {
        this.credebitID = credebitID;
    }

    public Credebit getCredebit() {
        return credebit;
    }

    public void setCredebit(Credebit credebit) {
        this.credebit = credebit;
    }

    //    -------------------------------------------------------------------------------------------------------------------------------------------------------------
    @Override
    public void setServletContext(ServletContext servletContext) {
        WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);

        this.achService = (IACHService) wac.getBean(IACHService.SERVICE_NAME);
        this.userService = (IUserService) wac.getBean(IUserService.SERVICE_NAME);
        this.servletContext = servletContext;
    }

    //    مدیر فنی
    public String sideTab_FanniManager() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_FanniManager");
        getSession().put("activeTabRelation", actviceTabRelation);
        return "success";
    }

    public String searchFanniManager() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_FanniManager");
        getSession().put("activeTabRelation", actviceTabRelation);
        credebitList = achService.searchFanniManager(invoiceNo, nationalNO, policyNO, state, createDateFrom, createDateTo, elamBeMaliDateFrom, elamBeMaliDateTo);
        if (credebitList == null || credebitList.getFullListSize() == 0) {
            errorMessage = "نیست";
            return "error";
        }
        return "success";
    }

//------------------------------------------------------------------------------------------------------------------------
    //    مدیر مالی
    public String sideTab_MaliManager() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_MaliManager");
        getSession().put("activeTabRelation", actviceTabRelation);

        return "success";
    }

    public String sideTab_MaliManagerReport() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_MaliManagerReport");
        getSession().put("activeTabRelation", actviceTabRelation);
        return "success";
    }

    public String mali_report_first() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        viewSanadList = achService.mali_report_first(createDateFrom, createDateTo);
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_MaliManagerReport");
        getSession().put("activeTabRelation", actviceTabRelation);
        return "success";
    }

    public String searchMaliManager() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_MaliManager");
        getSession().put("activeTabRelation", actviceTabRelation);
        credebitList = achService.searchMaliManager(invoiceNo, nationalNO, policyNO, state, createDateFrom, createDateTo, elamBeMaliDateFrom, elamBeMaliDateTo);
        if (credebitList == null || credebitList.getFullListSize() == 0) {
            errorMessage = "نیست";
            return "error";
        }
        return "success";
    }

    public String ersalBeBankGrouhi() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_MaliSubManager");
        getSession().put("activeTabRelation", actviceTabRelation);

        credebits = achService.searchMaliSubManagerForTeedGrouhi(invoiceNo, nationalNO, policyNO, state, createDateFrom, createDateTo, elamBeMaliDateFrom, elamBeMaliDateTo);
        credebit = achService.ersalBeBank(credebitID, user);
        if (credebit.getState() == 4) {
            actionMessage = "تایید با موفقیت انجام شد";
            return "ersalBeBank";
        } else {
            errorMessage = "تایید ناموفق";
            return "error";
        }

    }

    public String teedGrouhiErsalBeBank() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_MaliSubManager");
        getSession().put("activeTabRelation", actviceTabRelation);

        credebits = achService.searchMaliManagerForTeedGrouhi(invoiceNo, nationalNO, policyNO, state, createDateFrom, createDateTo, elamBeMaliDateFrom, elamBeMaliDateTo);
        for (int i = 0; i < credebits.size(); i++) {
//            credebit =  achService.ersalBeBank(credebits.get(i).getId(), user);
            credebit = achService.ersalBeBankMajazi(credebits.get(i).getId(), user);
        }
        return "success";
    }

    public String searchMaliManagerForPardakhtCheck() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_MaliManager_PardakhCheck");
        getSession().put("activeTabRelation", actviceTabRelation);

        credebitList = achService.searchMaliManagerForPardakhtCheck(invoiceNo, nationalNO, policyNO, state, createDateFrom, createDateTo, elamBeMaliDateFrom, elamBeMaliDateTo);
        if (credebitList == null || credebitList.getFullListSize() == 0) {
            errorMessage = "نیست";
            return "error";
        }
        return "success";
    }

    public String pardakhtBaCheck() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_MaliManager");
        getSession().put("activeTabRelation", actviceTabRelation);

        credebit = achService.teedPardakhtBaCheck(credebitID, user);
        if (credebit.getState() == 7) {
            actionMessage = "تایید با موفقیت انجام شد";
            return "message";
        } else {
            errorMessage = "تایید ناموفق";
            return "error";
        }
    }

    public String sideTab_MaliManager_PardakhCheck() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_MaliManager_PardakhCheck");
        getSession().put("activeTabRelation", actviceTabRelation);
        return "success";
    }
//    -------------------------------------------------------------------------------------------------------------------------
    //    معاون فنی
    public String sideTab_FanniSubManager() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_FanniSubManager");
        getSession().put("activeTabRelation", actviceTabRelation);
//        credebitList = achService.fanniSubManager();
        return "success";
    }

    public String searchFanniSubManager() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_FanniSubManager");
        getSession().put("activeTabRelation", actviceTabRelation);
        credebitList = achService.searchFanniSubManager(invoiceNo, nationalNO, policyNO, state, createDateFrom, createDateTo, elamBeMaliDateFrom, elamBeMaliDateTo);

        sumMablagh = achService.findSumOfMablagh(invoiceNo, nationalNO, policyNO, state, createDateFrom, createDateTo, elamBeMaliDateFrom, elamBeMaliDateTo);
        sumMablaghStr = StringUtil.moneyFormat(sumMablagh);

        if (credebitList == null || credebitList.getFullListSize() == 0) {
            errorMessage = "نیست";
            return "error";
        }
        return "success";
    }

    public String teedMoavenFani() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_FanniSubManager");
        getSession().put("activeTabRelation", actviceTabRelation);
        credebit = achService.teedMoavenFani(credebitID, user);
        if (credebit.getState() == 2) {
            actionMessage = "تایید با موفقیت انجام شد";
            return "message";
        } else {
            errorMessage = "تایید ناموفق";
            return "error";
        }
    }

    public String teedGrouhiMoavenFani() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_FanniSubManager");
        getSession().put("activeTabRelation", actviceTabRelation);

        credebits = achService.searchFanniSubManagerForTeedGrouhi(invoiceNo, nationalNO, policyNO, state, createDateFrom, createDateTo, elamBeMaliDateFrom, elamBeMaliDateTo);
        for (int i = 0; i < credebits.size(); i++) {
            credebit = achService.teedMoavenFani(credebits.get(i).getId(), user);
        }
        return "success";
    }

//-------------------------------------------------------------------------------------------------------------------------------
    //    معاون مالی
    public String sideTab_MaliSubManager() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_MaliSubManager");
        getSession().put("activeTabRelation", actviceTabRelation);
        return "success";
    }

    public String searchMaliSubManager() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_MaliSubManager");
        getSession().put("activeTabRelation", actviceTabRelation);
        credebitList = achService.searchMaliSubManager(invoiceNo, nationalNO, policyNO, state, createDateFrom, createDateTo, elamBeMaliDateFrom, elamBeMaliDateTo);
        if (credebitList == null || credebitList.getFullListSize() == 0) {
            errorMessage = "نیست";
            return "error";
        }
        return "success";
    }

    public String teedMoavenMali() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_MaliSubManager");
        getSession().put("activeTabRelation", actviceTabRelation);
        credebit = achService.teedMoavenMali(credebitID, user);
        if (credebit.getState() == 3) {
            actionMessage = "تایید با موفقیت انجام شد";
            return "message";
        } else {
            errorMessage = "تایید ناموفق";
            return "error";
        }
    }

    public String ersalBeBank() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_MaliSubManager");
        getSession().put("activeTabRelation", actviceTabRelation);
//        credebit =  achService.ersalBeBank(credebitID, user);
        credebit = achService.ersalBeBankMajazi(credebitID, user);
        if (credebit.getState() == 4) {
            actionMessage = "تایید با موفقیت انجام شد";
            return "ersalBeBank";
        } else {
            errorMessage = "تایید ناموفق";
            return "error";
        }

    }

    public String teedGrouhiMoavenMali() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_FanniSubManager");
        getSession().put("activeTabRelation", actviceTabRelation);

        credebits = achService.searchMaliSubManagerForTeedGrouhi(invoiceNo, nationalNO, policyNO, state, createDateFrom, createDateTo, elamBeMaliDateFrom, elamBeMaliDateTo);
        for (int i = 0; i < credebits.size(); i++) {
            credebit = achService.teedMoavenMali(credebits.get(i).getId(), user);
        }
        return "success";
    }

    public String viewCharkhe() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_MaliSubManager");
        getSession().put("activeTabRelation", actviceTabRelation);

        viewCredebit = achService.getViewCredebit(credebitID);
        credebitStateList = viewCredebit.getCredebitStateArrayList();

        return "success";
    }

    public String mali_report_sanadPardakht1() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        viewSanadList = achService.mali_report_sanadPardakht1(createDateFrom, createDateTo);
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_MaliManagerReport");
        getSession().put("activeTabRelation", actviceTabRelation);
        return "success";
    }

    public String mali_report_sanadPardakht2() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        viewSanadListPardakht2 = achService.mali_report_sanadPardakht2(createDateFrom, createDateTo);
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_MaliManagerReport");
        getSession().put("activeTabRelation", actviceTabRelation);
        return "success";
    }

    public String feedBack() {

        List<Credebit> credebitList = new ArrayList<Credebit>();
        credebitList = achService.getCredebitsForFeedBack();

        for (int i = 0; i < credebitList.size(); i++) {
            achService.feedBackACH(credebitList.get(i), "");
        }

        return "success";
    }

    public String sideTab_MaliMoghayerat() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation actviceTabRelation = userService.setCurrentTabRelation("sideTab_MaliMoghayerat");
        getSession().put("activeTabRelation", actviceTabRelation);
        return "success";
    }

    public String mali_MoghaieratGiri() throws Exception {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        if (createDateFrom == null || createDateTo == null) {
            return "error";
        }
        if (bankFileAddressFileName == null && darmanFileAddressFileName == null || (bankFileAddressFileName != null && darmanFileAddressFileName != null)) {
            return "error";
        }
        List<ViewCredebit> uploadedCredebits = null;
        List<ViewCredebit> achCredebits = null;

        if (bankFileAddressFileName != null) {
            uploadedCredebits = achService.readExcel(bankFileAddress);
            achCredebits = achService.getCredebitsByPardakhtDate(createDateFrom, createDateTo);
        } else {
            uploadedCredebits = achService.readExcel(darmanFileAddress);
            achCredebits = achService.getCredebitsByCreateDate(createDateFrom, createDateTo);
        }

        moghayerat = achService.moghayeratAchBank(uploadedCredebits, achCredebits);
        if(moghayerat == null || moghayerat.size()==0){
            actionMessage = "مغایرتی وجود ندارد";
        }

        return "success";
/*
        // Creating a Workbook from an Excel file (.xls or .xlsx)
        Workbook workbookDarman = WorkbookFactory.create(new File(String.valueOf(darmanFileAddress)));

        // Getting the Sheet at index zero
        Sheet sheetDarman = workbookDarman.getSheetAt(0);

        // Create a DataFormatter to format and get each cell's value as String
        DataFormatter dataFormatter = new DataFormatter();

        // 1. You can obtain a rowIterator and columnIterator and iterate over them
        Iterator<Row> rowIteratorDarman = sheetDarman.rowIterator();
        while (rowIteratorDarman.hasNext()) {
            Row row = rowIteratorDarman.next();
            //getBankExcel.add(row.toString());

        // iterate over the columns of the current row
        Iterator<Cell> cellIterator = row.cellIterator();

        while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();
            String cellValue = dataFormatter.formatCellValue(cell);
            System.out.print(cellValue + "\t");
        }
        System.out.println();
    }*/

    }

    public String ModiriatSystemExcelPaziresh() throws Exception {

        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemExcelPaziresh");
        getSession().put("activeTabRelation", activeTabRelation);

        getSession().remove("paginatedViewDBReceptionExcelList");
        getSession().remove("paginatedViewReceptionExcelList");
        return "success";
    }

    public String ModiriatSystemSabteExcelPaziresh() throws Exception {

        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }


        if (fileUpload == null) {
            addActionError("بارگذاري فايل الزامي است");
            return "errorInSaveReceptionExcelFile";
        }
        getSession().remove("paginatedViewDBReceptionExcelList");
        getSession().remove("paginatedViewReceptionExcelList");
        List<ViewReceptionExcel> viewDBReceptionExcelList = null;
        List<ViewReceptionExcel> viewReceptionExcelList = new ArrayList<>();//unayi k bimeshode shun tu system nis
        try {
            // sabte person
            List<ViewInsuredPerson> viewInsuredpersonList = achService.savePersonFromReceptionExcel(bimarestani, fileUpload, user);

            Map<Integer, Map<Integer, String>> errorMap = new HashMap<Integer, Map<Integer, String>>();
            viewDBReceptionExcelList = achService.validateExcelKhesarat(bimarestani, fileUpload, errorMap, user, viewReceptionExcelList);


            if (viewDBReceptionExcelList == null) {
                addActionError("خطا در اعتبارسنجي اکسل ");
            }
            if (errorMap.size() > 0) { //توليد فايل حاوي خطاهاي کنترل اوليه
                fileUpload = achService.produceErrorExcelFile(errorMap, fileUpload);
                if (fileUpload != null) {
                    contentType = "application/octet-stream";
                    fileName = "ErrorFile.xlsx";
                    try {
                        inputStream = new FileInputStream(fileUpload);
                        return "errorInReceptionExcel";
                    } catch (FileNotFoundException e) {
                        addActionError("فايل بارگذاري شده دچار مشکل است. لطفاً پس از رفع ايرادات مجدداً بارگذاري نماييد.");
                        return "errorInSaveReceptionExcelFile";
                    }

                }
            }

        } catch (Exception e) {
            addActionError("خطا در ذخيره اطلاعات فايل اکسل");
            return "errorInSaveReceptionExcelFile";
        }

        int page = PagingUtil.getPageNumberFromContext("page");
        paginatedViewDBReceptionExcelList = achService.getViewReceptionExcelPaginatedList(page, viewDBReceptionExcelList);
        paginatedViewReceptionExcelList = achService.getViewReceptionExcelPaginatedList(page, viewReceptionExcelList);
        getSession().put("paginatedViewDBReceptionExcelList", paginatedViewDBReceptionExcelList);
        getSession().put("paginatedViewReceptionExcelList", paginatedViewReceptionExcelList);

        try {
            String result = null;
            if (viewDBReceptionExcelList != null) {
                ReceptionExcelFiles receptionExcelFile = achService.saveReceptionExcelFile(fileUpload,user) ;
                viewDBReceptionExcelList = achService.sabtExcelKhesarat(receptionExcelFile, bimarestani, fileUpload, user, viewDBReceptionExcelList, viewReceptionExcelList);
            }
            if (viewDBReceptionExcelList != null && viewDBReceptionExcelList.size() != 0) {
                BigInteger invoiceExcelID = viewDBReceptionExcelList.get(0).getInvoiceExcelID();
                result = achService.saveCredebitForReceptionExcel(invoiceExcelID, user);
                message = "اطلاعات با موفقيت ذخيره شد";
            } else {
                message = " اطلاعات یکتایی برای ذخیره در سیستم موجود نیست";
            }


        } catch (Exception e) {
            e.printStackTrace();
            addActionError("خطا در ساخت دستور پرداخت");
            return "errorInSaveReceptionExcelFile";
        }

        message = "عملیات با موفقیت انجام شد";
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemExcelPaziresh");
        getSession().put("activeTabRelation", activeTabRelation);

        return "saveReceptionExcelFile";
    }

    public String ModiriatSystemSaveReceptionExcelFile() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        paginatedViewDBReceptionExcelList = (PaginatedListImpl<ViewReceptionExcel>) getSession().get("paginatedViewDBReceptionExcelList");
        paginatedViewReceptionExcelList = (PaginatedListImpl<ViewReceptionExcel>) getSession().get("paginatedViewReceptionExcelList");


        TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemExcelPaziresh");
        getSession().put("activeTabRelation", activeTabRelation);
        return "success";
    }

    public String ModiriatSystemAddPerson() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        getSession().remove("paginatedViewInsuredPersonList");

        TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemAddPerson");
        getSession().put("activeTabRelation", activeTabRelation);
        return "success";
    }

    public String ModiriatSystemSavePerson() throws Exception {

        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }


        if (fileUpload == null) {
            addActionError("بارگذاري فايل الزامي است");
            return "errorInSavePersonFile";
        }
        getSession().remove("paginatedViewInsuredPersonList");
        Map<String, Family> familyMap = null;
        List<ViewInsuredPerson> viewInsuredPersonList = null;
        try {
            Map<Integer, Map<Integer, String>> errorMap = new HashMap<Integer, Map<Integer, String>>();
            viewInsuredPersonList = achService.validatePersonExcel(fileUpload, errorMap);

            if (viewInsuredPersonList == null) {
                addActionError("خطا در اعتبارسنجي اکسل ");
            }
            if (errorMap.size() > 0) { //توليد فايل حاوي خطاهاي کنترل اوليه
                fileUpload = achService.produceErrorExcelFile(errorMap, fileUpload);
                if (fileUpload != null) {
                    contentType = "application/octet-stream";
                    fileName = "ErrorFile.xlsx";
                    try {
                        inputStream = new FileInputStream(fileUpload);
                        return "errorInFileUpload";
                    } catch (FileNotFoundException e) {
                        addActionError("فايل بارگذاري شده دچار مشکل است. لطفاً پس از رفع ايرادات مجدداً بارگذاري نماييد.");
                        return "errorInSavePersonFile";
                    }

                }
            }


            viewInsuredPersonList = achService.getInsuredPersonFromFile(viewInsuredPersonList, user);

            if (!(viewInsuredPersonList != null && viewInsuredPersonList.size() > 0)) {
                errormessage = "اطلاعات ارسالی قابل پیمایش نیست.";
                return "errorInSavePersonFile";
            } else {
                Map<String, String> errorsMap = new HashMap<String, String>();


                familyMap = achService.validateFamily(viewInsuredPersonList, errorsMap);

                if (errorsMap.size() > 0) {
                    fileUpload = achService.produceFamilyErrorExcelFile(errorsMap, fileUpload, 6);
                    if (fileUpload != null) {
                        contentType = "application/octet-stream";
                        fileName = "ErrorFile.xlsx";
                        try {
                            inputStream = new FileInputStream(fileUpload);
                            return "errorInFileUpload";
                        } catch (FileNotFoundException e) {
                            addActionError("فايل بارگذاري شده دچار مشکل است. لطفاً پس از رفع ايرادات مجدداً بارگذاري نماييد.");
                            return "errorInSavePersonFile";
                        }

                    }
                }

            }
        } catch (Exception e) {
            addActionError("خطا در اعتبارسنجی فایل بیمه شدگان");
            e.printStackTrace();
            return "errorInSavePersonFile";
        }
        try {
            if (familyMap != null) {
                Collection<Family> families = familyMap.values();
                int counter = 0;
                Iterator<Family> familyIterator = families.iterator();
                List<Family> familyList = new ArrayList<Family>();
                String result = null;
                int i = 0;
                while (familyIterator.hasNext()) {

                    if (counter <= 200) {
                        familyList.add(familyIterator.next());
                        counter += 1;
                    } else {
                        counter = 0;
                        result = achService.savePersons(user, familyList);
                        i++;
                        if (result == null) {
                            errormessage = "خطا در ذخیره ی اطلاعات در پایگاه داده";
                            return "errorInSavePersonFile";
                        }
                        familyList = new ArrayList<Family>();
                    }

                }//230 tay akharu 200 tashu bala vared karde 30 tay baghysh paiin
                if (familyList.size() > 0) {
                    result = achService.savePersons(user, familyList);
                    if (result == null) {
                        errormessage = "خطا در ذخیره ی اطلاعات در پایگاه داده";
                        return "errorInSavePersonFile";
                    }
                }

            }
        } catch (Exception e) {
            addActionError("خطا در ذخیره فایل بیمه شدگان");
            return "errorInSavePersonFile";
        }

        int page = PagingUtil.getPageNumberFromContext("page");
        paginatedViewInsuredPersonList = achService.getViewInsuredPersonPaginatedList(page, viewInsuredPersonList);
        getSession().put("paginatedViewInsuredPersonList", paginatedViewInsuredPersonList);

        message = "عملیات با موفقیت انجام شد";

        TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemAddPerson");
        getSession().put("activeTabRelation", activeTabRelation);
        return "successSavePersonFile";

    }

    public String ModiriatSystemSavePersonFile() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        paginatedViewInsuredPersonList = (PaginatedListImpl<ViewInsuredPerson>) getSession().get("paginatedViewInsuredPersonList");
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemAddPerson");
        getSession().put("activeTabRelation", activeTabRelation);

        return "success";
    }

    public String ModiriatSystemDownloadSampleSabteBimehShode() {
        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        fileUpload = new File(servletContext.getRealPath("/") + "content/SampleSabteBimehShode.xlsx");
        contentType = "application/octet-stream";
        fileName = "SampleSabteBimehShode.xlsx";
        try {
            inputStream = new FileInputStream(fileUpload);
            return "successInDownloadFile";
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            errormessage = "امکان دانلود فایل وجود ندارد.";
            return "errorInDownloadFile";
        }


    }
    /////////////////////

    public String ModiriatSystemAddSheba() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        getSession().remove("paginatedViewInsuredPersonList");
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemAddSheba");
        getSession().put("activeTabRelation", activeTabRelation);
        return "success";
    }

    public String ModiriatSystemDownLoadSampleFileForSabteSheba() throws Exception {

        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        fileUpload = new File(servletContext.getRealPath("/") + "content/sampleSabtSheba.xlsx");
        contentType = "application/octet-stream";
        fileName = "sampleSabtSheba.xlsx";
        try {
            inputStream = new FileInputStream(fileUpload);
            return "successInDownloadFile";
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            message = "امکان دانلود فايل وجود ندارد.";
            return "errorInDownloadFile";
        }
    }

    public String ModiriatSystemSaveSheba() throws Exception {

        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        if (fileUpload == null) {
            addActionError("بارگذاري فايل الزامي است");
            return "errorInSaveSheba";
        }
        getSession().remove("paginatedViewInsuredPersonList");

        try {
            List<ViewInsuredPerson> viewInsuredPersonList = null;
            Map<Integer, Map<Integer, String>> errorMap = new HashMap<>();
            viewInsuredPersonList = achService.readExcelFileForSaveSheba(fileUpload, errorMap);

            if (viewInsuredPersonList == null) {
                addActionError("خطا در اعتبارسنجي اکسل ");
            }
            if (errorMap.size() > 0) { //توليد فايل حاوي خطاهاي کنترل اوليه
                fileUpload = achService.produceErrorExcelFile(errorMap, fileUpload);
                if (fileUpload != null) {
                    contentType = "application/octet-stream";
                    fileName = "ErrorFile.xlsx";
                    try {
                        inputStream = new FileInputStream(fileUpload);
                        return "errorInFileUpload";
                    } catch (FileNotFoundException e) {
                        addActionError("فايل بارگذاري شده دچار مشکل است. لطفاً پس از رفع ايرادات مجدداً بارگذاري نماييد.");
                        return "errorInSaveSheba";
                    }

                }
            }


            String date = aminParsian.util.DateUtil.getCurrentDate();
            String time = aminParsian.util.DateUtil.getCurrentTime();

            if (viewInsuredPersonList != null && viewInsuredPersonList.size() != 0) {
                for (int i = 0; i < viewInsuredPersonList.size(); i++) {

                    ViewInsuredPerson viewInsuredPerson = viewInsuredPersonList.get(i);
                    achService.deleteOldSheba(viewInsuredPerson, user, date, time);
                    viewInsuredPerson = achService.saveSheba(viewInsuredPerson, user, date, time);

                }
            }

            int page = PagingUtil.getPageNumberFromContext("page");
            paginatedViewInsuredPersonList = achService.getViewInsuredPersonPaginatedList(page, viewInsuredPersonList);
            getSession().put("paginatedViewInsuredPersonList", paginatedViewInsuredPersonList);

            message = "عملیات با موفقیت انجام شد";

            TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemAddSheba");
            getSession().put("activeTabRelation", activeTabRelation);

            return "successSaveSheba";

        } catch (Exception e) {
            addActionError("خطا در ثبت شماره شبا");
            return "errorInSaveSheba";
        }
    }

    public String ModiriatSystemSaveShebaFile() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        paginatedViewInsuredPersonList = (PaginatedListImpl<ViewInsuredPerson>) getSession().get("paginatedViewInsuredPersonList");


        return "success";
    }

    //********************************************************************************************************************************

    public String ReportsReceptionExcelNotExistIpReport() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        try {
            boolean flag = true;
            int page = PagingUtil.getPageNumberFromContext("page");
            paginatedViewReceptionExcelList = achService.receptionExcelNotExistIpReport(flag, page, policyID, nationalID, mainNationalID, createDateFrom, createDateTo);
        } catch (Exception e) {
            addActionError("خطا در گزارش گیری");
        }
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ReportsReceptionExcelNotExistIpReport");
        getSession().put("activeTabRelation", activeTabRelation);

        return "success";
    }

    public String ReportsSearchReceptionExcelNotExistIpReport() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        try {
            boolean flag = false;
            int page = PagingUtil.getPageNumberFromContext("page");
            paginatedViewReceptionExcelList = achService.receptionExcelNotExistIpReport(flag, page, policyID, nationalID, mainNationalID, createDateFrom, createDateTo);
        } catch (Exception e) {
            addActionError("خطا در گزارش گیری");
        }
        policyID = null;
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ReportsReceptionExcelNotExistIpReport");
        getSession().put("activeTabRelation", activeTabRelation);

        return "success";
    }

    public String ReportsReceptionExcelReport() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        try {
            boolean flag = true;
            int page = PagingUtil.getPageNumberFromContext("page");
            paginatedViewReceptionExcelList = achService.receptionExcelReport(flag, page, policyID, nationalID, mainNationalID, createDateFrom, createDateTo);
        } catch (Exception e) {
            addActionError("خطا در گزارش گیری");
        }
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ReportsReceptionExcelReport");
        getSession().put("activeTabRelation", activeTabRelation);

        return "success";
    }

    public String ReportsSearchReceptionExcelReport() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        try {
            boolean flag = false;
            int page = PagingUtil.getPageNumberFromContext("page");
            paginatedViewReceptionExcelList = achService.receptionExcelReport(flag, page, policyID, nationalID, mainNationalID, createDateFrom, createDateTo);
        } catch (Exception e) {
            addActionError("خطا در گزارش گیری");
        }
        policyID = null;
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ReportsReceptionExcelReport");
        getSession().put("activeTabRelation", activeTabRelation);

        return "success";
    }

    public String ReportsInsuredPersonListReport() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
//        try {
//            boolean flag = true;
//            int page = PagingUtil.getPageNumberFromContext("page");
//            paginatedViewInsuredPersonList = achService.insuredPersonListReport(flag, page,personelID, policyID, nationalID, mainNationalID, createDateFrom, createDateTo);
//        } catch (Exception e) {
//            addActionError("خطا در گزارش گیری");
//        }
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ReportsInsuredPersonListReport");
        getSession().put("activeTabRelation", activeTabRelation);

        return "success";
    }

    public String ReportsSearchInsuredPersonListReport() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        try {
            boolean flag = false;
            int page = PagingUtil.getPageNumberFromContext("page");
            paginatedViewInsuredPersonList = achService.insuredPersonListReport(flag, page, personelID, policyID, nationalID, mainNationalID, createDateFrom, createDateTo,hasShebaID,hasMobileID,sheba,mobile,stateCode);
        } catch (Exception e) {
            addActionError("خطا در گزارش گیری");
        }
        policyID = null;
        hasMobileID=null;
        hasShebaID=null;
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ReportsInsuredPersonListReport");
        getSession().put("activeTabRelation", activeTabRelation);

        return "success";
    }

    //*******************************************************************88

    public String ModiriatSystemExcelPazireshWithSheba() throws Exception {

        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemExcelPazireshWithSheba");
        getSession().put("activeTabRelation", activeTabRelation);

        getSession().remove("paginatedViewDBReceptionExcelList");
        getSession().remove("paginatedViewReceptionExcelList");
        return "success";
    }

    public String ModiriatSystemSabteExcelPazireshWithSheba() throws Exception {

        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }


        if (fileUpload == null) {
            addActionError("بارگذاري فايل الزامي است");
            return "errorInSaveReceptionExcelFile";
        }
        getSession().remove("paginatedViewDBReceptionExcelList");
        getSession().remove("paginatedViewReceptionExcelList");
        List<ViewReceptionExcel> viewDBReceptionExcelList = null;
        List<ViewReceptionExcel> viewReceptionExcelList = new ArrayList<>();//unayi k bimeshode shun tu system nis
        try {
            // sabte person
            List<ViewInsuredPerson> viewInsuredpersonList = achService.savePersonFromReceptionExcelWithSheba(bimarestani, fileUpload, user);

            Map<Integer, Map<Integer, String>> errorMap = new HashMap<Integer, Map<Integer, String>>();
            List<Errors> errorsList = new ArrayList<>();
            viewDBReceptionExcelList = achService.validateExcelKhesaratWithSheba(bimarestani, fileUpload, errorMap, user, viewReceptionExcelList,errorsList);



            if (errorMap.size() > 0) { //توليد فايل حاوي خطاهاي کنترل اوليه
                fileUpload = achService.produceErrorExcelFile(errorMap, fileUpload);
                if (fileUpload != null) {
                    contentType = "application/octet-stream";
                    fileName = "ErrorFile.xlsx";
                    try {
                        inputStream = new FileInputStream(fileUpload);
                        return "errorInReceptionExcel";
                    } catch (FileNotFoundException e) {
                        addActionError("فايل بارگذاري شده دچار مشکل است. لطفاً پس از رفع ايرادات مجدداً بارگذاري نماييد.");
                        return "errorInSaveReceptionExcelFile";
                    }

                }
            }
            if (viewDBReceptionExcelList == null) {
                addActionError("خطا در اعتبارسنجي اکسل ");
                for (Errors errors : errorsList) {
                    addActionError(errors.getMsg());
                }
                return "errorInSaveReceptionExcelFile";
            }

        } catch (Exception e) {
            addActionError("خطا در ذخيره اطلاعات فايل اکسل");
            return "errorInSaveReceptionExcelFile";
        }

        int page = PagingUtil.getPageNumberFromContext("page");
        paginatedViewDBReceptionExcelList = achService.getViewReceptionExcelPaginatedList(page, viewDBReceptionExcelList);
        paginatedViewReceptionExcelList = achService.getViewReceptionExcelPaginatedList(page, viewReceptionExcelList);
        getSession().put("paginatedViewDBReceptionExcelList", paginatedViewDBReceptionExcelList);
        getSession().put("paginatedViewReceptionExcelList", paginatedViewReceptionExcelList);

        try {
            String result = null;
            if (viewDBReceptionExcelList != null) {
                ReceptionExcelFiles receptionExcelFile = achService.saveReceptionExcelFile(fileUpload,user) ;
                viewDBReceptionExcelList = achService.sabtExcelKhesarat(receptionExcelFile,bimarestani, fileUpload, user, viewDBReceptionExcelList, viewReceptionExcelList);
            }
            if (viewDBReceptionExcelList != null && viewDBReceptionExcelList.size() != 0) {
                BigInteger invoiceExcelID = viewDBReceptionExcelList.get(0).getInvoiceExcelID();
                result = achService.saveCredebitForReceptionExcel(invoiceExcelID, user);
                message = "اطلاعات با موفقيت ذخيره شد";
            } else {
                message = " اطلاعات یکتایی برای ذخیره در سیستم موجود نیست";
            }


        } catch (Exception e) {
            e.printStackTrace();
            addActionError("خطا در ساخت دستور پرداخت");
            return "errorInSaveReceptionExcelFile";
        }

        message = "عملیات با موفقیت انجام شد";
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemExcelPazireshWithSheba");
        getSession().put("activeTabRelation", activeTabRelation);

        return "saveReceptionExcelFile";
    }

    public String ModiriatSystemSaveReceptionExcelFileWithSheba() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        paginatedViewDBReceptionExcelList = (PaginatedListImpl<ViewReceptionExcel>) getSession().get("paginatedViewDBReceptionExcelList");
        paginatedViewReceptionExcelList = (PaginatedListImpl<ViewReceptionExcel>) getSession().get("paginatedViewReceptionExcelList");


        TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemExcelPazireshWithSheba");
        getSession().put("activeTabRelation", activeTabRelation);
        return "success";
    }

    //**************************************************

    public String ModiriatSystemSabteBimehGozar() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        getSession().remove("paginatedViewPolicyList");
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemSabteBimehGozar");
        getSession().put("activeTabRelation", activeTabRelation);
        return "success";
    }

    public String ModiriatSystemDownLoadSampleFileForSabteBimehGozar() throws Exception {

        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        fileUpload = new File(servletContext.getRealPath("/") + "content/SampleSabtBimehGozar.xlsx");
        contentType = "application/octet-stream";
        fileName = "SampleSabtBimehGozar.xlsx";
        try {
            inputStream = new FileInputStream(fileUpload);
            return "successInDownloadFile";
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            message = "امکان دانلود فايل وجود ندارد.";
            return "errorInDownloadFile";
        }
    }

    public String ModiriatSystemSaveBimehGozar() throws Exception {

        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        if (fileUpload == null) {
            addActionError("بارگذاري فايل الزامي است");
            return "errorInSaveBimehGozar";
        }
        getSession().remove("paginatedViewPolicyList");

        try {
            List<ViewInsuredPerson> viewInsuredPersonList = null;
            Map<Integer, Map<Integer, String>> errorMap = new HashMap<>();
            viewPolicyList = achService.readExcelFileForSaveBimehGozar(fileUpload, errorMap);


            if (viewPolicyList == null) {
                addActionError("خطا در اعتبارسنجي اکسل ");
            }
            if (errorMap.size() > 0) { //توليد فايل حاوي خطاهاي کنترل اوليه
                fileUpload = achService.produceErrorExcelFile(errorMap, fileUpload);
                if (fileUpload != null) {
                    contentType = "application/octet-stream";
                    fileName = "ErrorFile.xlsx";
                    try {
                        inputStream = new FileInputStream(fileUpload);
                        return "errorInFileUpload";
                    } catch (FileNotFoundException e) {
                        addActionError("فايل بارگذاري شده دچار مشکل است. لطفاً پس از رفع ايرادات مجدداً بارگذاري نماييد.");
                        return "errorInSaveBimehGozar";
                    }

                }
            }


            String date = aminParsian.util.DateUtil.getCurrentDate();
            String time = aminParsian.util.DateUtil.getCurrentTime();

            if (viewPolicyList != null && viewPolicyList.size() != 0) {
                int size = viewPolicyList.size();
                for (int i = 0; i < size; i++) {
                    ViewPolicy viewPolicy = viewPolicyList.get(i);
                    achService.saveBimehGozar(viewPolicy, user, date, time);
                }
            }

            int page = PagingUtil.getPageNumberFromContext("page");
            paginatedViewPolicyList = achService.getViewPolicyPaginatedList(page, viewPolicyList);
            getSession().put("paginatedViewPolicyList", paginatedViewPolicyList);

            message = "عملیات با موفقیت انجام شد";

            TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemSabteBimehGozar");
            getSession().put("activeTabRelation", activeTabRelation);

            return "successSaveBimehGozar";

        } catch (Exception e) {
            addActionError("خطا در ثبت بیمه گذار");
            return "errorInSaveBimehGozar";
        }
    }

    public String ModiriatSystemSaveBimehGozarFile() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        paginatedViewPolicyList = (PaginatedListImpl<ViewPolicy>) getSession().get("paginatedViewPolicyList");


        return "success";
    }

    //*********************************************************

    public String ModiriatSystemSabtMobile() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        getSession().remove("paginatedViewInsuredPersonList");
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemSabtMobile");
        getSession().put("activeTabRelation", activeTabRelation);
        return "success";
    }

    public String ModiriatSystemDownLoadSampleFileForSabteMobile() throws Exception {

        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        fileUpload = new File(servletContext.getRealPath("/") + "content/sampleSabtMobile.xlsx");
        contentType = "application/octet-stream";
        fileName = "sampleSabtMobile.xlsx";
        try {
            inputStream = new FileInputStream(fileUpload);
            return "successInDownloadFile";
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            message = "امکان دانلود فايل وجود ندارد.";
            return "errorInDownloadFile";
        }
    }

    public String ModiriatSystemSaveMobile() throws Exception {

        user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        if (fileUpload == null) {
            addActionError("بارگذاري فايل الزامي است");
            return "errorInSaveMobile";
        }
        getSession().remove("paginatedViewInsuredPersonList");

        try {
            List<ViewInsuredPerson> viewInsuredPersonList = null;
            Map<Integer, Map<Integer, String>> errorMap = new HashMap<>();
            viewInsuredPersonList = achService.readExcelFileForSaveMobile(fileUpload, errorMap);
            if (viewInsuredPersonList == null) {
                addActionError("خطا در اعتبارسنجي اکسل ");
            }
            if (errorMap.size() > 0) { //توليد فايل حاوي خطاهاي کنترل اوليه
                fileUpload = achService.produceErrorExcelFile(errorMap, fileUpload);
                if (fileUpload != null) {
                    contentType = "application/octet-stream";
                    fileName = "ErrorFile.xlsx";
                    try {
                        inputStream = new FileInputStream(fileUpload);
                        return "errorInFileUpload";
                    } catch (FileNotFoundException e) {
                        addActionError("فايل بارگذاري شده دچار مشکل است. لطفاً پس از رفع ايرادات مجدداً بارگذاري نماييد.");
                        return "errorInSaveMobile";
                    }

                }
            }


            String date = aminParsian.util.DateUtil.getCurrentDate();
            String time = aminParsian.util.DateUtil.getCurrentTime();

            if (viewInsuredPersonList != null && viewInsuredPersonList.size() != 0) {
                for (int i = 0; i < viewInsuredPersonList.size(); i++) {

                    ViewInsuredPerson viewInsuredPerson = viewInsuredPersonList.get(i);
                    achService.deleteOldMobile(viewInsuredPerson, user, date, time);
                    viewInsuredPerson = achService.saveMobile(viewInsuredPerson, user, date, time);

                }
            }

            int page = PagingUtil.getPageNumberFromContext("page");
            paginatedViewInsuredPersonList = achService.getViewInsuredPersonPaginatedList(page, viewInsuredPersonList);
            getSession().put("paginatedViewInsuredPersonList", paginatedViewInsuredPersonList);

            message = "عملیات با موفقیت انجام شد";

            TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemSabtMobile");
            getSession().put("activeTabRelation", activeTabRelation);

            return "successSaveMobile";

        } catch (Exception e) {
            addActionError("خطا در ثبت شماره موبایل");
            return "errorInSaveMobile";
        }
    }

    public String ModiriatSystemSaveMobileFile() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        paginatedViewInsuredPersonList = (PaginatedListImpl<ViewInsuredPerson>) getSession().get("paginatedViewInsuredPersonList");


        return "success";
    }

    //*************************************

    public String ModiriatSystemInsuredPersonSuspendManagement() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        viewInsuredPersonList= (List<ViewInsuredPerson>) getSession().get("viewInsuredPersonList");
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemInsuredPersonSuspendManagement");
        getSession().put("activeTabRelation", activeTabRelation);
        return "success";
    }

    public String ModiriatSystemSearchMainInsuredPerson() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        try {
            viewInsuredPersonList = achService.searchMainInsuredPerson( policyID, mainNationalID);
            getSession().put("viewInsuredPersonList", viewInsuredPersonList);
        } catch (Exception e) {
            addActionError("خطا در گزارش گیری");
        }
        return "success";
    }

    public String ModiriatSystemSuspendInsuredPerson() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        try {
            viewInsuredPersonList= (List<ViewInsuredPerson>) getSession().get("viewInsuredPersonList");
            viewInsuredPersonList = achService.suspendInsuredPerson(viewInsuredPersonList,mainInsuredPersonID,user);
            getSession().put("viewInsuredPersonList", viewInsuredPersonList);

            message ="بیمه شده با موفقیت تعلیق شد";
            return "success";
        } catch (Exception e) {
            errormessage="خطا در تعلیق بیمه شده";
            return "error";
        }

    }

    public String ModiriatSystemFixTheSuspension() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        try {
            viewInsuredPersonList= (List<ViewInsuredPerson>) getSession().get("viewInsuredPersonList");
            viewInsuredPersonList = achService.fixTheSuspensionInsuredPerson(viewInsuredPersonList,mainInsuredPersonID,user);
            getSession().put("viewInsuredPersonList", viewInsuredPersonList);

            message ="بیمه شده با موفقیت رفع تعلیق شد";
            return "success";
        } catch (Exception e) {
            errormessage="خطا در رفع تعلیق بیمه شده";
            return "error";
        }

    }

    //*************************************

    public String ModiriatSystemPolicySuspendManagement() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        if(policyID !=null){
            policy = achService.findPolicyByID(policyID);
        }
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemPolicySuspendManagement");
        getSession().put("activeTabRelation", activeTabRelation);
        return "success";
    }

    public String ModiriatSystemMovingInsuredPerson() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        getSession().remove("viewInsuredPersonList");
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemMovingInsuredPerson");
        getSession().put("activeTabRelation", activeTabRelation);
        return "success";
    }

    public String ModiriatSystemSearchInsuredPerson() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        try {
            viewInsuredPersonList = achService.searchInsuredPerson( policyID, nationalID);
            getSession().put("viewInsuredPersonList", viewInsuredPersonList);
            policyID=null;
        } catch (Exception e) {
            addActionError("خطا در گزارش گیری");
        }
        return "success";
    }

    public String ModiriatSystemMoveInsuredPerson() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        viewInsuredPersonList = (List<ViewInsuredPerson>) getSession().get("viewInsuredPersonList");
        try {
            if(policyID == null){
                addActionError("شماره بیمه نامه الزامی است.");
                return "success";
            }
            if(mainNationalID == null){
                addActionError("کد ملی بیمه شده اصلی الزامی است.");
                return "success";
            }
            List<Errors> errors = new ArrayList<>();
            InsuredPerson insuredPerson = achService.movingInsuredPerson( user,policyID, mainNationalID,insuredPersonCode,errors);

            if(errors.size() > 0 || insuredPerson == null){
                for (Errors error : errors) {
                    addActionError(error.getMsg());
                }
            }else{
                viewInsuredPersonList = achService.searchInsuredPerson( policyID, insuredPerson.getPerson().getNationalid());
                getSession().put("viewInsuredPersonList", viewInsuredPersonList);
                message = " بیمه شده با موفقیت انتقال یافت.";
            }
        } catch (Exception e) {
            addActionError("خطا در گزارش گیری");
        }
        return "success";
    }

    public String ModiriatSystemMoveFamily() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        viewInsuredPersonList = (List<ViewInsuredPerson>) getSession().get("viewInsuredPersonList");
        try {
            if(policyID == null){
                addActionError("شماره بیمه نامه الزامی است.");
                return "success";
            }
            if(personelID == null){
                addActionError("کد پرسنلی الزامی است.");
                return "success";
            }
            List<Errors> errors = new ArrayList<>();
            InsuredPerson mainInsuredPerson = achService.movingFamily( user,policyID, personelID,mainInsuredPersonID,errors);

            if(errors.size() > 0 || mainInsuredPerson == null){
                for (Errors error : errors) {
                    addActionError(error.getMsg());
                }
            }else{
                viewInsuredPersonList = achService.searchInsuredPerson( policyID, mainInsuredPerson.getPerson().getNationalid());
                getSession().put("viewInsuredPersonList", viewInsuredPersonList);
                message = " خانواده با موفقیت انتقال یافت.";
            }
        } catch (Exception e) {
            addActionError("خطا در گزارش گیری");
        }
        return "success";
    }

    public String ModiriatSystemSearchPolicy() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        policy = achService.findPolicyByID(policyID);
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemPolicySuspendManagement");
        getSession().put("activeTabRelation", activeTabRelation);
        return "success";
    }

    public String ModiriatSystemSuspondPolicy() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        policy = achService.suspendPolicy(policyID,user);
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemPolicySuspendManagement");
        getSession().put("activeTabRelation", activeTabRelation);
        return "success";
    }

    public String ModiriatSystemFixTheSuspensionForPolicy() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }

        policy = achService.fixTheSuspensionPolicy(policyID,user);
        TabRelation activeTabRelation = userService.setCurrentTabRelation("ModiriatSystemPolicySuspendManagement");
        getSession().put("activeTabRelation", activeTabRelation);
        return "success";
    }


}