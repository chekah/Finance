package aminParsian.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.UUID;


/**
 * Created by ahmad on 10/26/15.
 */
public class HibernateUtil {
    private SessionFactory sessionFactory;

    public HibernateUtil() {
        sessionFactory = createSessionFactory();
    }

    private static SessionFactory createSessionFactory() {
        SessionFactory factory = null;
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            factory = configuration.buildSessionFactory();

        } catch (Throwable ex) {

            System.err.println("Initial SessionFactory creation failed.");
            ex.printStackTrace();
            throw new ExceptionInInitializerError(ex);

        }
        return factory;

    }

    public SessionFactory getSessionFactory(){
        return this.sessionFactory;
    }


    public static  String createGUID(){
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }



    public static  String filterInput(String str) {
        str = str.replaceAll("ي","ی");
        str = str.replaceAll("ك","ک");
        return str;
    }
}
