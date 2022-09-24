package aminParsian.interceptor;

/**
 * Created by s-talebi on 8/20/2016.
 */

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;
import aminParsian.util.DateUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class DateInterceptor implements Interceptor {
    @Override
    public void destroy() {

    }

    @Override
    public void init() {

    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {

        ValueStack stack=actionInvocation.getStack();
        Map<String,String> parametersMap=(Map<String,String>)stack.getContext().get("parameters");
        Set<String> parametersName=parametersMap.keySet();
        for(String name:parametersName){
            if(name.contains("date")|| name.contains("Date")){
                String dateValue=parametersMap.get(name);
                String dateWithSlash=DateUtil.getStrDate(dateValue);
                stack.setParameter(name,dateWithSlash);
            }
            String dateValue=parametersMap.get(name);
            if( dateValue != null){
                String dateWithSlash= dateValue.replaceAll("ی","ي");
                stack.setParameter(name,dateWithSlash);
            }

        }
        return actionInvocation.invoke();
    }
}
