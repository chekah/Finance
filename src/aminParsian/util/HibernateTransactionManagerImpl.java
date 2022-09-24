package aminParsian.util;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTransactionManager;

/**
 * Created by ach on 10/6/2017.
 */
public class HibernateTransactionManagerImpl extends HibernateTransactionManager {


    public HibernateTransactionManagerImpl(SessionFactory sessionFactory) {
        super(sessionFactory);
    }


}
