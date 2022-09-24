package aminParsian.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Created by neda-asadi on 4/30/2017.
 */
public class SessionFilter implements Filter {

    private ArrayList<String> urlList;

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;
        String url = request.getServletPath();
        boolean allowedRequest = false;
        if (urlList.contains(url)) {
            allowedRequest = true;
        }

        if (!allowedRequest) {
            HttpSession session = request.getSession(false);
            if (null == session) {
                response.sendRedirect("index.jsp");
            } else {
                chain.doFilter(request, response);
            }
        } else {
            chain.doFilter(request, response);
        }
    }

    public void init(FilterConfig config) throws ServletException {
        String urls = config.getInitParameter("avoid-urls");
        StringTokenizer token = new StringTokenizer(urls, ",");
        urlList = new ArrayList<String>();
        while (token.hasMoreTokens()) {
            urlList.add(token.nextToken());

        }
    }
}
