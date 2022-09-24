package aminParsian.util;

import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: f-haghighi
 * Date: 1/3/16
 * Time: 10:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class SessionUtil implements SessionAware {
    private Map<String, Object> sessionMap;

    public Map<String, Object> getSessionMap() {
        return sessionMap;
    }

    public void setSessionMap(Map<String, Object> sessionMap) {
        this.sessionMap = sessionMap;
    }

    @Override
    public void setSession(Map<String, Object> stringObjectMap) {
        this.sessionMap = stringObjectMap;

    }
}
