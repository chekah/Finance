package aminParsian.action;

import aminParsian.util.*;
import org.apache.struts2.util.ServletContextAware;

public class PolicyInvoiceAction extends BaseAction implements ServletContextAware {

    private aminParsian.service.IUserService userService;
    private javax.servlet.ServletContext servletContext;
    private aminParsian.service.IPolicyInvoiceService PolicyInvoiceService;

    @Override
    public void setServletContext (javax.servlet.ServletContext servletContext) {
        org.springframework.web.context.WebApplicationContext wac = org.springframework.web.context.support.WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
        this.PolicyInvoiceService = (aminParsian.service.IPolicyInvoiceService) wac.getBean(aminParsian.service.IPolicyInvoiceService.SERVICE_NAME);
        this.userService = (aminParsian.service.IUserService) wac.getBean(aminParsian.service.IUserService.SERVICE_NAME);
        this.servletContext = servletContext;
    }



}
