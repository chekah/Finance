package aminParsian.DAO;

import aminParsian.model.InsuredPerson;
import aminParsian.model.Queries;
import aminParsian.model.Suspend;
import aminParsian.util.BaseDAO;
import org.hibernate.Query;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by ach on 10/28/2020.
 */


public class SuspendDAO extends BaseDAO {
    public Suspend findById(BigDecimal id)
    {
        return (Suspend) super.findById(Suspend.class,id);
    }
    public  void saveOrUpdate(Suspend i)
    {
        super.saveOrUpdate(i);
    }


    public Suspend findByMainInsuredPerson(BigDecimal mainInsuredPersonID) {
        String hql = "select s from Suspend s " +
                " where s.mainInsuredPerson.id=:mainInsuredPersonID and s.state = 1 " ;
        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
        query.setParameter("mainInsuredPersonID", mainInsuredPersonID);

        try {
            Suspend suspend = (Suspend) query.list().get(0);
            return suspend;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean isSuspend(String nationalID) {
        String hql = "select s from Suspend s where s.mainInsuredPerson.person.nationalid='"+nationalID+"'  and s.state = 1 ";
        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
        List<Suspend> suspendList = query.list();
        if(suspendList == null || suspendList.size()==0){
            return false;
        }
        return true;
    }
}
