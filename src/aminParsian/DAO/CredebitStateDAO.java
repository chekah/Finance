package aminParsian.DAO;

import aminParsian.model.CredebitState;
import aminParsian.util.BaseDAO;
import aminParsian.viewModel.ViewCredebitState;
import org.hibernate.Query;

import java.math.BigDecimal;

/**
 * Created by a-naderi on 7/28/2017.
 */
public class CredebitStateDAO extends BaseDAO{

    public CredebitState findById(BigDecimal id){
        return (CredebitState)super.findById(CredebitState.class, id);
    }

    public  Object  saveOrUpdate(CredebitState i) {
        super.saveOrUpdate(i);
        return super.findById(CredebitState.class ,currentSession().getIdentifier(i));
    }

    public ViewCredebitState getViewCredebitState(CredebitState credebitState) {
        ViewCredebitState viewCredebitState = new ViewCredebitState();

        String queryStr = "select nameFarsi from dictionary where pid=1000 AND code = "+credebitState.getState();
        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(queryStr);
        String state = (String)query.uniqueResult();

        viewCredebitState.setCredebitID(credebitState.getCredebit().getId());
        viewCredebitState.setDate(credebitState.getCreatedate());
        viewCredebitState.setTime(credebitState.getCreatetime());
        viewCredebitState.setUserName(credebitState.getUsers().getName());
        viewCredebitState.setStateStr(state);

        return viewCredebitState;
    }
}
