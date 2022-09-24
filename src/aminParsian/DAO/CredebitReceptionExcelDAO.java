package aminParsian.DAO;

import aminParsian.model.CredebitReceptionExcel;

import aminParsian.util.BaseDAO;

import java.math.BigDecimal;
import org.hibernate.*;
import java.util.*;
/**
 * Created by asadi on 5/23/2020.
 */
public class CredebitReceptionExcelDAO  extends BaseDAO {

    public CredebitReceptionExcel findById(BigDecimal id)
    {
        return (CredebitReceptionExcel) super.findById(CredebitReceptionExcel.class,id);
    }

    public  Object saveOrUpdate(CredebitReceptionExcel i) {
        super.saveOrUpdate(i);
        return super.findById(CredebitReceptionExcel.class ,currentSession().getIdentifier(i));
    }

    public CredebitReceptionExcel findByReceptionExcelId (BigDecimal id) {
        String credebitReceptionExcelQuery = "select cre from CredebitReceptionExcel cre where cre.receptionExcel.id = " + id;
        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(credebitReceptionExcelQuery);
        List<CredebitReceptionExcel> credebitReceptionExcels = query.list();
        if(credebitReceptionExcels != null && credebitReceptionExcels.size()>0){
            return credebitReceptionExcels.get(0);
        }
        return null;

    }
}
