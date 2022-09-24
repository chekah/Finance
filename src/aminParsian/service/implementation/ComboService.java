package aminParsian.service.implementation;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import aminParsian.DAO.ComboDAO;
import aminParsian.service.IComboService;


@Transactional
public class ComboService implements IComboService {
    private ComboDAO comboDAO;
    private SessionFactory sessionFactory;

    public ComboDAO getComboDAO() {
        return comboDAO;
    }

    public void setComboDAO(ComboDAO comboDAO) {
        this.comboDAO = comboDAO;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public String getList(String searchTerm , int page, String QeryID,String haveWhere,Object value  ){
        return comboDAO.getList(searchTerm,page,QeryID, haveWhere,value) ;
    }

}
