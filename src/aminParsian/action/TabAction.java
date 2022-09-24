package aminParsian.action;


import org.springframework.web.context.ServletContextAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import aminParsian.DAO.TabDAO;
import aminParsian.model.Tab;
import aminParsian.model.TabRelation;
import aminParsian.service.ITabService;
import aminParsian.util.BaseAction;
import aminParsian.service.IUserService;
import aminParsian.util.ApplicationContextProvider;

import javax.servlet.ServletContext;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class TabAction extends BaseAction implements ServletContextAware {

    private ITabService tabService;
    private IUserService userService;
    private ServletContext servletContext;
    Map<Tab, List<TabRelation>> tabsList = null;
    TabRelation activeTabRelation;

    public ServletContext getServletContext() {
        return servletContext;
    }

    public TabRelation getActiveTabRelation() {
        return activeTabRelation;
    }

    public void setActiveTabRelation(TabRelation activeTabRelation) {
        this.activeTabRelation = activeTabRelation;
    }

    public Map<Tab, List<TabRelation>> getTabsList() {
        return tabsList;
    }

    public void setTabsList(Map<Tab, List<TabRelation>> tabsList) {
        this.tabsList = tabsList;
    }

    public ITabService getTabService() {
        return tabService;
    }

    public void setTabService(ITabService tabService) {
        this.tabService = tabService;
    }

    public String execute() {
        TabDAO tabDAO = ApplicationContextProvider.getApplicationContext().getBean("tabDAO", TabDAO.class);
        tabsList = tabService.getTabs(new BigDecimal(2209));
		getSession().put("tabsList", tabsList);
        activeTabRelation = userService.setCurrentTabRelation("TabAction");
        getSession().put("activeTabRelation", activeTabRelation);
        return "success";
    }


    @Override

    public void setServletContext(ServletContext servletContext) {
        WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
        this.tabService = (ITabService) wac.getBean(ITabService.SERVICE_NAME);
        this.userService = (IUserService) wac.getBean(IUserService.SERVICE_NAME);
        this.servletContext = servletContext;
    }
}
