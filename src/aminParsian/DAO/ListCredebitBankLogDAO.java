package aminParsian.DAO;

import aminParsian.model.Credebit;
import aminParsian.model.ListCredebitBank;
import aminParsian.model.ListCredebitBankLog;
import aminParsian.util.BaseDAO;
import org.hibernate.FlushMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by ach on 1/20/2019.
 */
public class ListCredebitBankLogDAO extends BaseDAO {
    private CredebitStateDAO credebitStateDAO;
    private CredebitDAO credebitDAO;

    //-----------------------------------------------------------------------------------------------------------------------------------------

    public CredebitDAO getCredebitDAO() {
        return credebitDAO;
    }

    public void setCredebitDAO(CredebitDAO credebitDAO) {
        this.credebitDAO = credebitDAO;
    }

    public CredebitStateDAO getCredebitStateDAO() {
        return credebitStateDAO;
    }

    public void setCredebitStateDAO(CredebitStateDAO credebitStateDAO) {
        this.credebitStateDAO = credebitStateDAO;
    }

    //------------------------------------------------------------------------------------------------------------------------------------------

    public ListCredebitBankLog findById(BigDecimal id)
    {
        return (ListCredebitBankLog) super.findById(ListCredebitBankLog.class,id);
    }

    public  ListCredebitBankLog  saveOrUpdate(ListCredebitBankLog i) {
        super.saveOrUpdate(i);
        return (ListCredebitBankLog) super.findById(ListCredebitBankLog.class ,currentSession().getIdentifier(i));
    }


    public ListCredebitBankLog manualSaveOrUpdate (ListCredebitBankLog listCredebitBankLog){

        Session session = getSessionFactory().getCurrentSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.setFlushMode(FlushMode.AUTO);

            session.saveOrUpdate(listCredebitBankLog);
            tx.commit();
            listCredebitBankLog = (ListCredebitBankLog) session.get(Credebit.class, session.getIdentifier(listCredebitBankLog));
            session.close();

            return listCredebitBankLog;
        }catch (Exception e){
            return null;
        }

    }

}

