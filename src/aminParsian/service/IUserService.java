package aminParsian.service;

import aminParsian.displaytag.PaginatedListImpl;
import aminParsian.model.*;
import aminParsian.viewModel.ViewSematRole;
import aminParsian.viewModel.ViewUser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: f-haghighi
 * Date: 2/7/16
 * Time: 3:28 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IUserService {
    public static final String SERVICE_NAME="userService";

    public TabRelation setCurrentTabRelation(String actionName);

    public Users findUserByUsername(String username);

    public Users saveUser(BigDecimal ID, String userName, String password, String rePassword, BigDecimal hiddenState, BigDecimal hiddenTID, BigDecimal hiddenAID, BigDecimal hiddenStation, BigDecimal hiddenPID, BigDecimal hiddenSCode, BigDecimal hiddenSemat, String description, BigDecimal orgID, BigDecimal healthCenterID);

    public List<Role> findRoleByUserId(Long userId);

    public List<ViewSematRole> selectSemat(BigDecimal sematID);

    public List<SematRole> saveSematRole(List<BigDecimal> RolesList ,BigDecimal sematid);

    public List<ViewSematRole> searchSematRole(BigDecimal sematid, BigDecimal roleid);

    public Users getCurrentUser();

    public Users getCurrentUserForSetUsers();

    public Users findUserOnlyByUsername(String username);



    public Person getMoshakhasatFromWebService(String nationalID, String persianBirthDate);

    public void sabtNewPerson(Person person);

    boolean changePassword(Users user, String newPassword);
}
