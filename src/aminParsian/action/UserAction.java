package aminParsian.action;

import org.apache.struts2.util.ServletContextAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import aminParsian.DAO.UsersDAO;
import aminParsian.displaytag.PaginatedListImpl;
import aminParsian.model.*;
import aminParsian.service.IUserService;
import aminParsian.service.implementation.UserService;
import aminParsian.util.BaseAction;
import aminParsian.util.StringUtil;
import aminParsian.viewModel.ViewSematRole;
import aminParsian.viewModel.ViewUser;

import javax.servlet.ServletContext;
import java.io.File;
import java.lang.Exception;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by 8041 on 3/8/2016.
 */
public class UserAction extends BaseAction implements ServletContextAware {


    private IUserService userService;
    private List usersArrayList = new ArrayList();
    private ServletContext servletContext;
    private List<ViewUser> viewUser;
    private String message;
    private String errorMessage;
    private String username;
    private String password;
    private String rePassword;
    private BigDecimal hiddenAID;
    private BigDecimal hiddenSCode;
    private BigDecimal hiddenSemat;
    private BigDecimal hiddenTID;
    private BigDecimal hiddenPID;
    private BigDecimal hiddenState;
    private BigDecimal hiddenStation;
    private String userName;
    private BigDecimal hiddenSAID;
    private BigDecimal hiddenSSCode;
    private BigDecimal hiddenSSemat;
    private BigDecimal hiddenSStation;
    private BigDecimal hiddenSTID;
    private BigDecimal hiddenSPID;
    private BigDecimal hiddenSState;
    private String description;
    private BigDecimal id;
    private BigDecimal hiddenOrgID;
    private BigDecimal hiddenSaveHealthCenterID;
    private String type;
    private Long typeid;
    private String state;
    private Long stateid;
    private String healthCenter;
    private BigDecimal healthCenterid;
    private String insured;
    private BigDecimal insuredid;
    private String agency;
    private BigDecimal agencyid;
    private BigDecimal secondaryCode;
    private String discription;
    private BigDecimal searchtypeid;
    private BigDecimal searchstateid;
    private BigDecimal searchhealthCenterid;
    private BigDecimal searchinsuredid;
    private BigDecimal searchagencyid;
    private BigDecimal createuserid;
    private BigDecimal personid;
    private String personel;
    private BigDecimal searchAgencyid;
    private BigDecimal searchPersonNameid;
    private String searchPersonel;
    private BigDecimal searchStateid;
    private BigDecimal searchStaCreateUserid;
    private String password1;
    private String password2;


    //-------->SaveSematRole.jsp -------------------------------------------------------------//
    private Long sematRoleID;
    private List<ViewSematRole> viewRole;
    private List<BigDecimal> selectedRoles;
    private List<BigDecimal> sematid;

    //-------->SearchSematRole.jsp -------------------------------------------------------------//
    private BigDecimal hiddenRole;
    private List<ViewSematRole> viewSematRole;

// ------------>UploadFileDAO----------------------------------------------------

    private File fileUpload;
    private String fileUploadContentType;
    private String fileUploadFileName;

// ----------------------------------------------------------------

    private String nationalID;
    private String persianBirthDate;
    // ----------------------------------------------------------------
    private Person person;

// ----------------------------------------------------------------


    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public BigDecimal getSearchStaCreateUserid() {
        return searchStaCreateUserid;
    }

    public void setSearchStaCreateUserid(BigDecimal searchStaCreateUserid) {
        this.searchStaCreateUserid = searchStaCreateUserid;
    }

    public BigDecimal getSearchPersonNameid() {
        return searchPersonNameid;
    }

    public void setSearchPersonNameid(BigDecimal searchPersonNameid) {
        this.searchPersonNameid = searchPersonNameid;
    }

    public BigDecimal getSearchAgencyid() {
        return searchAgencyid;
    }

    public void setSearchAgencyid(BigDecimal searchAgencyid) {
        this.searchAgencyid = searchAgencyid;
    }

    public String getSearchPersonel() {
        return searchPersonel;
    }

    public void setSearchPersonel(String searchPersonel) {
        this.searchPersonel = searchPersonel;
    }

    public BigDecimal getSearchStateid() {
        return searchStateid;
    }

    public void setSearchStateid(BigDecimal searchStateid) {
        this.searchStateid = searchStateid;
    }

    public BigDecimal getPersonid() {
        return personid;
    }

    public void setPersonid(BigDecimal personid) {
        this.personid = personid;
    }

    public String getPersonel() {
        return personel;
    }

    public void setPersonel(String personel) {
        this.personel = personel;
    }

    public BigDecimal getCreateuserid() {
        return createuserid;
    }

    public void setCreateuserid(BigDecimal createuserid) {
        this.createuserid = createuserid;
    }

    public BigDecimal getSearchtypeid() {
        return searchtypeid;
    }

    public void setSearchtypeid(BigDecimal searchtypeid) {
        this.searchtypeid = searchtypeid;
    }

    public BigDecimal getSearchstateid() {
        return searchstateid;
    }

    public void setSearchstateid(BigDecimal searchstateid) {
        this.searchstateid = searchstateid;
    }

    public BigDecimal getSearchhealthCenterid() {
        return searchhealthCenterid;
    }

    public void setSearchhealthCenterid(BigDecimal searchhealthCenterid) {
        this.searchhealthCenterid = searchhealthCenterid;
    }

    public BigDecimal getSearchinsuredid() {
        return searchinsuredid;
    }

    public void setSearchinsuredid(BigDecimal searchinsuredid) {
        this.searchinsuredid = searchinsuredid;
    }

    public BigDecimal getSearchagencyid() {
        return searchagencyid;
    }

    public void setSearchagencyid(BigDecimal searchagencyid) {
        this.searchagencyid = searchagencyid;
    }

    public BigDecimal getAgencyid() {
        return agencyid;
    }

    public void setAgencyid(BigDecimal agencyid) {
        this.agencyid = agencyid;
    }

    public BigDecimal getInsuredid() {
        return insuredid;
    }

    public void setInsuredid(BigDecimal insuredid) {
        this.insuredid = insuredid;
    }

    public BigDecimal getHealthCenterid() {
        return healthCenterid;
    }

    public void setHealthCenterid(BigDecimal healthCenterid) {
        this.healthCenterid = healthCenterid;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }


    public String getPersianBirthDate() {
        return persianBirthDate;
    }

    public void setPersianBirthDate(String persianBirthDate) {
        this.persianBirthDate = persianBirthDate;
    }

    public File getFileUpload() {
        return fileUpload;
    }

    public void setFileUpload(File fileUpload) {
        this.fileUpload = fileUpload;
    }

    public String getFileUploadContentType() {
        return fileUploadContentType;
    }

    public void setFileUploadContentType(String fileUploadContentType) {
        this.fileUploadContentType = fileUploadContentType;
    }

    public String getFileUploadFileName() {
        return fileUploadFileName;
    }

    public void setFileUploadFileName(String fileUploadFileName) {
        this.fileUploadFileName = fileUploadFileName;
    }


    // -----------------GetterSetter---------------------------------------------


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getTypeid() {
        return typeid;
    }

    public void setTypeid(Long typeid) {
        this.typeid = typeid;
    }

    public Long getStateid() {
        return stateid;
    }

    public void setStateid(Long stateid) {
        this.stateid = stateid;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getHealthCenter() {
        return healthCenter;
    }

    public void setHealthCenter(String healthCenter) {
        this.healthCenter = healthCenter;
    }

    public String getInsured() {
        return insured;
    }

    public void setInsured(String insured) {
        this.insured = insured;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public BigDecimal getSecondaryCode() {
        return secondaryCode;
    }

    public void setSecondaryCode(BigDecimal secondaryCode) {
        this.secondaryCode = secondaryCode;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public BigDecimal getHiddenSaveHealthCenterID() {
        return hiddenSaveHealthCenterID;
    }

    public void setHiddenSaveHealthCenterID(BigDecimal hiddenSaveHealthCenterID) {
        this.hiddenSaveHealthCenterID = hiddenSaveHealthCenterID;
    }

    public BigDecimal getHiddenOrgID() {
        return hiddenOrgID;
    }

    public void setHiddenOrgID(BigDecimal hiddenOrgID) {
        this.hiddenOrgID = hiddenOrgID;
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public BigDecimal getHiddenAID() {
        return hiddenAID;
    }

    public void setHiddenAID(BigDecimal hiddenAID) {
        this.hiddenAID = hiddenAID;
    }

    public BigDecimal getHiddenSCode() {
        return hiddenSCode;
    }

    public void setHiddenSCode(BigDecimal hiddenSCode) {
        this.hiddenSCode = hiddenSCode;
    }

    public BigDecimal getHiddenSemat() {
        return hiddenSemat;
    }

    public void setHiddenSemat(BigDecimal hiddenSemat) {
        this.hiddenSemat = hiddenSemat;
    }

    public BigDecimal getHiddenTID() {
        return hiddenTID;
    }

    public void setHiddenTID(BigDecimal hiddenTID) {
        this.hiddenTID = hiddenTID;
    }

    public BigDecimal getHiddenPID() {
        return hiddenPID;
    }

    public void setHiddenPID(BigDecimal hiddenPID) {
        this.hiddenPID = hiddenPID;
    }

    public BigDecimal getHiddenState() {
        return hiddenState;
    }

    public void setHiddenState(BigDecimal hiddenState) {
        this.hiddenState = hiddenState;
    }

    public BigDecimal getHiddenStation() {
        return hiddenStation;
    }

    public void setHiddenStation(BigDecimal hiddenStation) {
        this.hiddenStation = hiddenStation;
    }

    public BigDecimal getHiddenSAID() {
        return hiddenSAID;
    }

    public void setHiddenSAID(BigDecimal hiddenSAID) {
        this.hiddenSAID = hiddenSAID;
    }

    public BigDecimal getHiddenSSCode() {
        return hiddenSSCode;
    }

    public void setHiddenSSCode(BigDecimal hiddenSSCode) {
        this.hiddenSSCode = hiddenSSCode;
    }

    public BigDecimal getHiddenSStation() {
        return hiddenSStation;
    }

    public void setHiddenSStation(BigDecimal hiddenSStation) {
        this.hiddenSStation = hiddenSStation;
    }

    public BigDecimal getHiddenSTID() {
        return hiddenSTID;
    }

    public void setHiddenSTID(BigDecimal hiddenSTID) {
        this.hiddenSTID = hiddenSTID;
    }

    public BigDecimal getHiddenSPID() {
        return hiddenSPID;
    }

    public void setHiddenSPID(BigDecimal hiddenSPID) {
        this.hiddenSPID = hiddenSPID;
    }

    public BigDecimal getHiddenSState() {
        return hiddenSState;
    }

    public void setHiddenSState(BigDecimal hiddenSState) {
        this.hiddenSState = hiddenSState;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
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

    @Override
    public void setServletContext(ServletContext servletContext) {
        WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
        this.userService = (IUserService) wac.getBean(IUserService.SERVICE_NAME);
        this.servletContext = servletContext;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public BigDecimal getHiddenSSemat() {
        return hiddenSSemat;
    }

    public void setHiddenSSemat(BigDecimal hiddenSSemat) {
        this.hiddenSSemat = hiddenSSemat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ViewUser> getViewUser() {
        return viewUser;
    }

    public void setViewUser(List<ViewUser> viewUser) {
        this.viewUser = viewUser;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<ViewSematRole> getViewRole() {
        return viewRole;
    }

    public void setViewRole(List<ViewSematRole> viewRole) {
        this.viewRole = viewRole;
    }

    public List<BigDecimal> getSelectedRoles() {
        return selectedRoles;
    }

    public void setSelectedRoles(List<BigDecimal> selectedRoles) {
        this.selectedRoles = selectedRoles;
    }

    public List<BigDecimal> getSematid() {
        return sematid;
    }

    public void setSematid(List<BigDecimal> sematid) {
        this.sematid = sematid;
    }

    public BigDecimal getHiddenRole() {
        return hiddenRole;
    }

    public void setHiddenRole(BigDecimal hiddenRole) {
        this.hiddenRole = hiddenRole;
    }

    public List<ViewSematRole> getViewSematRole() {
        return viewSematRole;
    }

    // ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public void setViewSematRole(List<ViewSematRole> viewSematRole) {
        this.viewSematRole = viewSematRole;
    }

    public String userManagement() throws Exception {
        TabRelation activeTabRelation = userService.setCurrentTabRelation("UserManagement");
        getSession().put("activeTabRelation", activeTabRelation);
        return "SUCCESS";
    }

    public String sematManagement() throws Exception {
        TabRelation activeTabRelation = userService.setCurrentTabRelation("SematManagement");
        getSession().put("activeTabRelation", activeTabRelation);
        return "SUCCESS";
    }

    public String selectUser() {

        return "SUCCESS";
    }

    public String selectSemat() {
        viewRole = userService.selectSemat(hiddenSemat);
        return "SUCCESS";
    }

    public String barrasiTekrariNaboodaneUsername() {
        if (id == null) {
            if (userService.findUserOnlyByUsername(username) != null) {
                addActionMessage("error");
                return SUCCESS;
            }
        }
        return SUCCESS;
    }

    public String saveUser() {

        if (id == null) {
            if (userService.findUserOnlyByUsername(username) != null) {
                errorMessage = "* نام کاربری تکراری است.";

                return "SUCCESS";
            }
        }

        if (hiddenTID.intValue() == 3 && hiddenSaveHealthCenterID == null) {
            errorMessage = "کاربر پورتال مرکز درمانی است. لطفا مرکز درمانی را انتخاب کنید";
            return "error";
        }

        if (hiddenTID.intValue() == 2 && hiddenOrgID == null) {
            errorMessage = "کاربر بیمه گذار است. لطفا نام بیمه گذار را انتخاب نمایید";
            return "error";
        }

        Users user = userService.saveUser(this.id, this.username, this.password, this.rePassword, this.hiddenState, this.hiddenTID, this.hiddenAID, this.hiddenStation, this.hiddenPID, this.hiddenSCode, this.hiddenSemat, this.description, this.hiddenOrgID, this.hiddenSaveHealthCenterID);
        if (user.getId() != null) {
            message = "* کاربر با نام کاربری " + username + " با موفقیت در سیستم ثبت شد.";
            return "SUCCESS";
        } else {
            errorMessage = "*ثبت ناموفق";
        }
        return "NOSESSION";

    }

    public String saveSematRole() {
        List<BigDecimal> l = new ArrayList<BigDecimal>();
        BigDecimal semat = null;
        for (int i = 1; i < 2; i++) {
            semat = sematid.get(i);
        }

        if (selectedRoles != null) {

            for (int i = 1; i < selectedRoles.size(); i++) {
                if (selectedRoles.get(i) != null) {
                    BigDecimal roleID = selectedRoles.get(i);
                    l.add(roleID);

                }
            }

        }
        List<SematRole> sr = userService.saveSematRole(l, semat);

        return "SUCCESS";

    }

    public String searchSematRole() {
        viewSematRole = userService.searchSematRole(this.hiddenSSemat, this.hiddenRole);
        return "SUCCESS";
    }

    public Long getSematRoleID() {
        return sematRoleID;
    }

    public void setSematRoleID(Long SematRoleID) {
        sematRoleID = SematRoleID;
    }

    public String UserSabtMoshakhasatJadid() throws Exception {

        return "successSabtMoshakhasatJadid";
    }

    public String userGetMoshakhasatFromWebService() throws Exception {
        person = userService.getMoshakhasatFromWebService(nationalID, persianBirthDate.replaceAll("/", ""));
        if (person.getId() != null && !person.getId().equals(new BigDecimal(-1))) {
            addActionError("اطلاعات شخص مورد نظر در پایگاه داده موجود است.");
        } else if (person.getId() != null && person.getId().equals(new BigDecimal(-1))) {
            addActionError("در حال حاضر امکان استعلام اطلاعات مقدور نیست.");
        } else {
            getSession().put("person", person);
        }

        return "success";
    }

    public String UserShowMoshakhasat() throws Exception {

        return "successShowMoshakhasat";
    }


    public String sabtNewPerson() {
        person = (Person) getSession().get("person");
        userService.sabtNewPerson(person);
        getSession().remove("person");
        return "success";
    }




    public String userManagementEnterChangePassword() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        return "success";
    }

    public String userManagementChangePassword() throws Exception {
        Users user = userService.getCurrentUser();
        if (user == null) {
            return "nosession";
        }
        if (!password1.equals(password2)) {
            errorMessage = "تکرار پسورد صحیح نمی باشد";
            return "error";
        } else if (!StringUtil.md5Hash(password).equals(user.getPassword())) {
            errorMessage = "رمز عبور صحیح نمی باشد";
            return "error";
        }
        String newPassword = StringUtil.md5Hash(password1);
        userService.changePassword(user, newPassword);

        message = "رمز عبور با موفقیت تغییر کرد ";
        return "success";
    }

}
