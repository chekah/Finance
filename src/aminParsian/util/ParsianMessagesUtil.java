package aminParsian.util;

import com.opensymphony.xwork2.ActionContext;
import org.springframework.security.core.context.SecurityContextHolder;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Properties;
import java.util.ResourceBundle;



public class ParsianMessagesUtil {

	static Properties props;

	//System.out.println("Current Locale: " + Locale.getDefault());
	static ResourceBundle bundle = ResourceBundle.getBundle("ApplicationResources",Locale.getDefault());
	
	public static String getMessage(String key){
		try{
			System.out.println("Current Locale: " + Locale.getDefault());
			return bundle.getString(key);
		}catch(MissingResourceException e){
			return "!!!"+key+"!!!";
		}
	}
	public static String getMessage(String key,Object... params){
		try{
			String message = bundle.getString(key);
			message = substituteParams(Locale.getDefault(), message, params);
			return message;
		}catch(MissingResourceException e){
			return "!!!"+key+"!!!";
		}
	}

    /**
     * 
     * @return  currently applicable Locale for this request.
/*     *//*
    public static Locale getCurrentLocale() {
        Locale locale;

        Object instance = ActionContext.getContext().getInstance();
        if(SecurityContextHolder.getContext() != null && SecurityContextHolder.getContext().g != null) {
            locale = context.getViewRoot().getLocale();
            if(locale == null)
                locale = Locale.getDefault();
        } else {
            locale = Locale.getDefault();
        }
        
        return locale;
    }*/

    /**
     * Uses <code>MessageFormat</code> and the supplied parameters to fill in the param placeholders in the String.
     *
     * @param locale The <code>Locale</code> to use when performing the substitution.
     * @param msgtext The original parameterized String.
     * @param params The params to fill in the String with.
     * @return The updated String.
     */
    public static String substituteParams(Locale locale, String msgtext, Object params[])
    {
        String localizedStr = null;
        if(params == null || msgtext == null)
            return msgtext;
        StringBuffer b = new StringBuffer(100);
        MessageFormat mf = new MessageFormat(msgtext);
        if(locale != null)
        {
            mf.setLocale(locale);
            b.append(mf.format(((Object) (params))));
            localizedStr = b.toString();
        }
        return localizedStr;
    }
}
