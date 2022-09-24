package aminParsian.action;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import aminParsian.model.TabRelation;
import aminParsian.service.IComboService;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: s-tayebifar
 * Date: 12/13/15
 * Time: 3:58 PM
 * To change this template use File | Settings | File Templates.
 */
//public class ComboAction extends HttpServlet {
public class ComboAction extends HttpServlet implements ServletContextAware, SessionAware {

    private Integer page;
    private List<Map> rows;
    private Integer sidx;
    private Integer sord;
    private String searchTerm;
    private String getList = "";
    private String query;
    private String haveWhere;
    private String sn;
    private String relatedValue;
    private String moduleName;
    private BigDecimal id;
    private IComboService comboService;
    private ServletContext servletContext;
    private Map<String, Object> session;

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

        setServletContext(super.getServletContext());
        searchTerm  = req.getParameter("searchTerm");
        page        = Integer.parseInt(req.getParameter("page"));
        query       = req.getParameter("str");
        haveWhere=req.getParameter("haveWhere");
//        relatedValue=req.getParameter("relatedValue");
        TabRelation tabRelation=(TabRelation) req.getSession().getAttribute("activeTabRelation");
        sn= req.getParameter("sn");
        moduleName=tabRelation.getModuleName();
        String sessionName = moduleName+"_"+sn;
        Object value=req.getSession().getAttribute(sessionName);
        getList     = comboService.getList(searchTerm, page, query,haveWhere,value);
        res.setCharacterEncoding("UTF-8");
        res.setContentType("application/json");
        res.getWriter().write(getList);
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {doPost(req, res);}

    public Integer getPage() {
        return page;
    }

    public ServletContext getServletContext() {
        return servletContext;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<Map> getRows() {
        return rows;
    }

    public void setRows(List<Map> rows) {
        this.rows = rows;
    }

    public Integer getSidx() {
        return sidx;
    }

    public void setSidx(Integer sidx) {
        this.sidx = sidx;
    }

    public Integer getSord() {
        return sord;
    }

    public void setSord(Integer sord) {
        this.sord = sord;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public String getGetList() {
        return getList;
    }

    public void setGetList(String getList) {
        this.getList = getList;
    }

    public String getTest() {
        return query;
    }

    public void setTest(String test) {
        this.query = test;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public IComboService getComboService() {
        return comboService;
    }

    public void setComboService(IComboService comboService) {
        this.comboService = comboService;
    }

    public String getHaveWhere() {
        return haveWhere;
    }

    public void setHaveWhere(String haveWhere) {
        this.haveWhere = haveWhere;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getRelatedValue() {
        return relatedValue;
    }

    public void setRelatedValue(String relatedValue) {
        this.relatedValue = relatedValue;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
        this.comboService = (IComboService) wac.getBean(IComboService.SERVICE_NAME);
        this.servletContext = servletContext;
    }

    @Override
    public void setSession(Map<String, Object> map) {
        this.session = map;
    }
}
