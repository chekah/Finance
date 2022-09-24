package aminParsian.util;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.log4j.Logger;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

public class BaseAction extends ActionSupport implements SessionAware {
    protected Logger getLogger(){
        Logger logger = Logger.getLogger(getClass());
        return logger;
    }


    private Map<String, Object> session;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;
    public String getParameters(String name) {
        try {
            String[] s;
            s = (String[]) ActionContext.getContext().getParameters().get(name);
            return s[0];
        } catch (Exception ex) {
            String s;
            s = (String) ActionContext.getContext().getParameters().get(name);
            return s;
        }
    }



    public Object getFromSession(String key) {
        if (session != null)
            return session.get(key);
        else return ActionContext.getContext().getSession().get(key);
    }


    public void setSession(Map<String, Object> stringObjectMap) {
        session = stringObjectMap;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    public void putToSession(String key, Object val) {
        session.put(key, val);
    }

    public void removeFromSession(String key) {
        session.remove(key);
    }

    public boolean isExport() {
        boolean bExport = false;

        Map values = ActionContext.getContext().getParameters();

        if (values != null && !values.isEmpty()) {
            Iterator i = values.keySet().iterator();
            while (i.hasNext()) {
                String name = (String) i.next();
                // Export parameter is of the form 'd-5314487-e'
                if (name.startsWith("d-") && name.endsWith("-e")) {
                    bExport = true;
                    break;
                }
            }
        }

        return bExport;
    }

    public String getUserAgent(HttpServletRequest request) {
        return request.getHeader("user-agent");
    }


    public String getRndValue() {
        return UUID.randomUUID().toString();
    }

    public String removeSessionByName() throws Exception {
        String actionName = ServletActionContext.getRequest().getHeader("Referer");
       // String sessionName = ServletActionContext.getRequest().getParameterMap().get("sessionName")[0];
        String[] sessionNames = ServletActionContext.getRequest().getParameterMap().get("sessionName");
        for (String sessionName:sessionNames ) {
            getSession().remove(sessionName);
        }
        setUrl(actionName);
        return "back";
    }

}
