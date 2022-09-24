package aminParsian.security;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by 8119 on 3/14/2017.
 */
public class ContentTypeFilter  implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if(servletRequest.getContentType() == null || ! isThreat(servletRequest.getContentType()))
            filterChain.doFilter(servletRequest, servletResponse);
        else
            System.out.println("Request Blocked!!!");
        // block request otherwise
    }

    @Override
    public void destroy() {

    }
    private boolean isThreat(String headerContentType){
        if(     headerContentType.contains("addHeader") ||
                headerContentType.contains("opensymphony") ||
                headerContentType.contains("context") ||
                headerContentType.contains("Struts")
                )
            return true;
        else
            return false;
    }
}
