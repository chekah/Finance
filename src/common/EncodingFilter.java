package common;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.TreeMap;

public class EncodingFilter implements Filter {
    private String encoding = "utf-8";
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain filterChain) throws IOException, ServletException {
        request.setCharacterEncoding(encoding);
        Enumeration<String> parameterNames = request.getParameterNames();
        Map<String, String[]> additionalParams =  request.getParameterMap();
        while (parameterNames.hasMoreElements()){
            String theParameterName = parameterNames.nextElement();
            request.getCharacterEncoding();

            String[] paramValues = request.getParameterValues(theParameterName);
            int paramValuesCounter = 0;
            for (String paramValue : paramValues) {
                //This fixes the problem with different types of kaaf and yaa'e. Here we make it unified so what
                //that the user enters matches exactly what that is stored in our databse!
                byte[] test = paramValue.getBytes("ISO-8859-1");
                if(test.length>0&&test[0]!=63){
                    paramValue = new String(paramValue.getBytes("ISO-8859-1"),"UTF-8");
                    paramValues[paramValuesCounter]=paramValue;
                }
                paramValue = paramValue.replaceAll("ي","ي");
                paramValue = paramValue.replaceAll("ك","ک");
//                paramValues[paramValuesCounter] = "abc";
                paramValues[paramValuesCounter] = paramValue;
                paramValuesCounter++;
            }
        }
//        filterChain.doFilter(new FilteredRequest(request), response);

        HttpServletRequest wrappedRequest = new PrettyFacesWrappedRequest((HttpServletRequest)request, additionalParams);
//        request.getRequestDispatcher("url").forward(wrappedRequest, response);

        filterChain.doFilter(request, response);

    }
    public void init(FilterConfig filterConfig) throws ServletException {
        String encodingParam = filterConfig.getInitParameter("encoding");
        if (encodingParam != null) {
            encoding = encodingParam;
        }
    }
    public void destroy() {
        // nothing
    }
}
