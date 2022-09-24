package aminParsian.service.implementation;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.apache.axis.types.Id;
import org.apache.poi.*;
import org.apache.poi.hssf.record.formula.functions.Type;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.displaytag.pagination.PaginatedList;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import aminParsian.DAO.*;
import aminParsian.displaytag.PaginatedListImpl;
import aminParsian.model.*;
//import aminParsian.model.Exception;
import aminParsian.service.IUserService;
import aminParsian.util.DateUtil;
import aminParsian.util.StringUtil;
import aminParsian.viewModel.ViewSematRole;
import aminParsian.viewModel.ViewUser;
import aminParsian.webService.EstelamHoviayat.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: f-haghighi
 * Date: 1/3/16
 * Time: 3:02 PM
 * To change this template use File | Settings | File Templates.
 */
@Transactional
public class UserService implements IUserService,UserDetailsService {

    private UsersDAO usersDAO;
    private AgencyDAO agencyDAO;
    private SematDAO sematDAO;
    private PersonDAO personDAO;
    private RoleDAO roleDao;
    private SematRoleDAO sematRoleDAO;
    private String errorMessage;


    // -----------------------------------------------------------------------

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public AgencyDAO getAgencyDAO() {
        return agencyDAO;
    }

    public void setAgencyDAO(AgencyDAO agencyDAO) {
        this.agencyDAO = agencyDAO;
    }

    public SematDAO getSematDAO() {
        return sematDAO;
    }

    public void setSematDAO(SematDAO sematDAO) {
        this.sematDAO = sematDAO;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }

    public void setPersonDAO(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    public SematRoleDAO getSematRoleDAO() {
        return sematRoleDAO;
    }

    public void setSematRoleDAO(SematRoleDAO sematRoleDAO) {
        this.sematRoleDAO = sematRoleDAO;
    }

//------------------------------------------------------------------------


    public RoleDAO getRoleDao() {
        return roleDao;
    }

    public void setRoleDao(RoleDAO roleDao) {
        this.roleDao = roleDao;
    }

    public UsersDAO getUsersDAO() {
        return usersDAO;
    }

    public void setUsersDAO(UsersDAO usersDAO) {
        this.usersDAO = usersDAO;
    }

    public TabRelation setCurrentTabRelation(String actionName)
    {
          return usersDAO.setCurrentTabRelation(actionName);
    }

    @Override
    public Users findUserByUsername(String username) {
        return usersDAO.findUserByUsername(username);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Role> findRoleByUserId(Long userId) {
        return roleDao.findRoleByUserId(userId);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users userEntity = usersDAO.findUserByUsername(username);

        if (userEntity == null)
            throw new UsernameNotFoundException("No such user: " + username);

        String userEntityName = userEntity.getUsername().toString();
        String password = userEntity.getPassword();
        boolean enabled = (userEntity.getState()==1);
        boolean accountNonExpired = enabled;
        boolean credentialsNonExpired = enabled;
        boolean accountNonLocked = enabled;

        ArrayList<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
        for(Role r :userEntity.getRoleCollection()){
            authorities.add(new SimpleGrantedAuthority(r.getRolename()));
        }

        return new org.springframework.security.core.userdetails.User(userEntityName, password, enabled,
                accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    public    String getCurrentUserName() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return auth.getName();
    }

    public   String getCurrentUserPassword() {
        return  usersDAO.findUserByUsername(getCurrentUserName()).getPassword();

    }

    public Users getCurrentUser()
    {
        return  usersDAO.findUserByUsername(getCurrentUserName());
    }

    public Users getCurrentUserForSetUsers() {
        return  usersDAO.findUserByUsernameForCurrentUser(getCurrentUserName());
    }

    public Users saveUser(BigDecimal ID, String userName, String password, String rePassword, BigDecimal hiddenState, BigDecimal hiddenTID, BigDecimal hiddenAID, BigDecimal hiddenStation, BigDecimal hiddenPID, BigDecimal hiddenSCode, BigDecimal hiddenSemat, String description, BigDecimal orgID, BigDecimal healthCenterID){
        Users user = new Users();
        if(ID!=null){
            user = usersDAO.findById(ID);
        }
        user.setUsername(userName);
        if(password.equals(rePassword)){

            user.setPassword(StringUtil.md5Hash(password));
        }
        else{
            return null;
        }
//
        user.setPassword(StringUtil.md5Hash(password));
        user.setType(hiddenTID.longValue());
        user.setState(hiddenState.longValue());
        user.setSemat(sematDAO.findById(hiddenSemat));
        if(hiddenPID !=  null  && hiddenPID.intValue()  > 0){
            Person person = personDAO.findById(hiddenPID);
            user.setPerson(person);
            user.setName(person.getFullName());
        }

        user.setAgency(agencyDAO.findById(hiddenAID));

        if(description!=null){
            user.setDescription(description);
        }
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        user.setUsers(usersDAO.findUserByUsername(username));
        if(ID == null){
        user.setCreatedate(DateUtil.getCurrentDate());
        user.setCreatetime(DateUtil.getCurrentTime());
        }
        else{
            user.setLastModifieddate(DateUtil.getCurrentDate());
            user.setLastModifiedtime(DateUtil.getCurrentTime());
        }

        usersDAO.saveUser(user);
        return user;
    }

        public List<ViewSematRole> selectSemat(BigDecimal sematID){
        return sematDAO.selectSemat( sematID);
    }

    @Override
    @Transactional
    public List<SematRole> saveSematRole(List<BigDecimal> RolesList, BigDecimal sematID) {
        List<BigDecimal> sematRoleId = sematRoleDAO.findSematRole(sematID);
        if(sematRoleId.isEmpty() == false){
            for(BigDecimal id : sematRoleId){
                sematRoleDAO.delete(sematRoleDAO.findById(id));
            }
        }
        List<SematRole> sematRoleList = new ArrayList<SematRole>();
        if(RolesList.isEmpty() == false){
            sematRoleList = new ArrayList<SematRole>();
            for(int i =0 ; i < RolesList.size(); i++){
                int j = RolesList.get(i).intValue();
                BigDecimal t = new BigDecimal(j);
                SematRole sr = new SematRole();
                sr.setRole(roleDao.findById(t));
                sr.setSemat(sematDAO.findById(new BigDecimal(sematID.intValue())));
                sematRoleDAO.saveOrUpdate(sr);
                sematRoleList.add(sr);
            }
        }
        return sematRoleList;
    }

    @Override
    public List<ViewSematRole> searchSematRole(BigDecimal sematid, BigDecimal roleid) {
        List<ViewSematRole> result = sematRoleDAO.findSematRoles(sematid, roleid);
        return result;
    }

    @Override
    public Users findUserOnlyByUsername(String username){
        return usersDAO.findOnlyByUsername(username);
    }



    public Person getMoshakhasatFromWebService(String nationalID, String persianBirthDate){

        List<Person> persons = personDAO.findByProperty(Person.class, "nationalid", nationalID);
        if(persons != null && persons.size() > 0){
            return  persons.get(0);
        }
        Person person = new Person();
        try {
            ISabtInq service = new SabtInq().getPort(ISabtInq.class);
            CiiPersonInfo ciiPersonInfo = new CiiPersonInfo();
            ciiPersonInfo.setBirthDate(new Integer(persianBirthDate));
            ciiPersonInfo.setNin(Long.parseLong((nationalID.replaceAll("-",""))));
            SabtInqRes sabtInqRes = service.submitInq(ciiPersonInfo, "pa6476", "ciiws@sabt92");
            CiiEstelamResult3 estelamResult = sabtInqRes.getCiiEstelamResult().getValue();
            person.setPersianbirthdate((long) estelamResult.getBirthDate());
            person.setName(estelamResult.getName().getValue());
            person.setFamily(estelamResult.getFamily().getValue());
            person.setFathername(estelamResult.getFatherName().getValue());
            person.setNationalid((nationalID.replaceAll("-","")));

        }
        catch (java.lang.Throwable e) {
          person.setId(new BigDecimal(-1));
        }
        if(person.getNationalid().equals("0")){
            person.setId(new BigDecimal(-1));
        }
         return person;
    }

    public void sabtNewPerson(Person person){
        personDAO.saveOrUpdate(person);
    }


    @Override
    public boolean changePassword(Users user, String newPassword) {
        user.setPassword(newPassword);
        usersDAO.saveOrUpdate(user);
        return true;
    }

}
