package aminParsian.action;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.util.ServletContextAware;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import aminParsian.model.Role;
import aminParsian.model.Tab;
import aminParsian.model.TabRelation;
import aminParsian.model.Users;
import aminParsian.service.ITabService;
import aminParsian.service.IUserService;
import aminParsian.util.BaseAction;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: a-sajadian
 * Date: 2/14/16
 * Time: 12:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class LoginAction extends BaseAction implements ServletContextAware, ServletRequestAware {

    private IUserService userService;
    private ITabService tabService;
    private ServletContext servletContext;
    Map<Tab, List<TabRelation>> tabsList = null;
    TabRelation activeTabRelation;
    List<Role>roleList;
    Long userId=(long)50037;
    Users user;



//    --------------------------------------------------------------------------------------------------------------------


    public ITabService getTabService() {
        return tabService;
    }

    public void setTabService(ITabService tabService) {
        this.tabService = tabService;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public IUserService getUserService() {
        return userService;
    }

    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    public ServletContext getServletContext() {
        return servletContext;
    }

    public Map<Tab, List<TabRelation>> getTabsList() {
        return tabsList;
    }

    public void setTabsList(Map<Tab, List<TabRelation>> tabsList) {
        this.tabsList = tabsList;
    }

    public TabRelation getActiveTabRelation() {
        return activeTabRelation;
    }

    public void setActiveTabRelation(TabRelation activeTabRelation) {
        this.activeTabRelation = activeTabRelation;
    }

//    -------------------------------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public void setServletContext(ServletContext servletContext) {
        WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
        this.userService = (IUserService) wac.getBean(IUserService.SERVICE_NAME);
        this.tabService = (ITabService) wac.getBean(ITabService.SERVICE_NAME);
        this.servletContext = servletContext;
    }

    @Override
    public void setServletRequest(HttpServletRequest httpServletRequest) {
        //To change body of implemented methods use File | Settings | File Templates.
    }


    public String login() throws Exception {
        user = getUser();  //user jari
        if (user == null || user.getId().equals(-1))  //agar karbare jari vojood nadarad
        {
            return "nosession";
        }
//        TabDAO tabDAO = ApplicationContextProvider.getApplicationContext().getBean("tabDAO", TabDAO.class);

        tabsList = tabService.getTabs(user.getId());

        getSession().put("tabsList", tabsList);

        String action = "";
        switch(user.getSemat().getId().intValue()){
            case 1:
                action = "sideTab_FanniManager";
                break;
            case 2:
                action = "sideTab_FanniManager";
                break;
            case 3:
                action = "sideTab_MaliManager";
                break;
            case 4:
                action = "sideTab_FanniSubManager";
                break;
            case 5:
                action = "sideTab_MaliSubManager";
                break;
            case 6:
                action = "sideTab_FanniSubManager";
                break;
            case 7:
                action = "LetterPrintForInsured";
                break;
        }

        activeTabRelation = userService.setCurrentTabRelation(action);

       //this.roleList= userService.findRoleByUserId(userId);
        return "success";
    }

    private Users getUser() {
        try {
            String username = SecurityContextHolder.getContext().getAuthentication().getName();
            if (username != null && username.length() > 0) {
                Users theUser = userService.findUserByUsername(username);
                getSession().put("Login_User",theUser);
                if (theUser != null && theUser.getId().compareTo(new BigDecimal(0))>0) {
                    return theUser;
                }
            }
            SecurityContextHolder.clearContext();
            return null;
        } catch(Exception e) {
            return null;
        }
    }



}
