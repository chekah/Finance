package aminParsian.filter;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import  aminParsian.util.StringUtil;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

/**
 * The ImageServlet serves up images stored in the freenet.jar file for other
 * servlets. e.g. NodeInfoServlet.
 * <p>
 * Images are loaded from the path set by
 * </p>
 */
public class EncodingFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
			ServletException {
		request.setCharacterEncoding("UTF-8");
		Map<String, String[]> parameterMap = request.getParameterMap();
		for(Map.Entry<String,String[]> e : (Set<Map.Entry<String,String[]>>)parameterMap.entrySet()){
			request.getParameter(e.getKey());
			ArrayList<String> values=new ArrayList<String>();
			for (String value:e.getValue() ) {
				values.add(StringUtil.replaceArabicCharacter(value));
				System.out.println(e.getKey());
			}
			String [] params = values.toArray(new String[values.size()]);
			e.setValue(params);
		}
		chain.doFilter(new RequestWrapper((HttpServletRequest) request), response);
	}

	public void init(FilterConfig arg0) throws ServletException {

	}

}

class RequestWrapper extends HttpServletRequestWrapper {

	public RequestWrapper(HttpServletRequest request) {
//		System.out.println(request.getSession().getAttributeNames().toString());
		super(request);
	}

	@Override
	public String getParameter(String name) {
		String parameter = super.getParameter(name);
		if(parameter != null){
//			parameter=parameter.trim();
			int lastIndexOf = parameter.lastIndexOf("\u064a");
			parameter =StringUtil.replaceArabicCharacter(parameter);
		}
		return parameter;
	}
	
	@Override
	public Object getAttribute(String name) {
		return super.getAttribute(name);
	}
	
	public String[] getParameterValues(String parameter) {
//		System.out.println("replacing parameters...");

		String[] results = super.getParameterValues(parameter);

		if (results == null) {
			return null;
		}

		int count = results.length;

		String[] trimResults = new String[count];

		for (int i = 0; i < count; i++) {
			trimResults[i] = StringUtil.replaceArabicCharacter(results[i]);
		}

		return trimResults;
	}

}