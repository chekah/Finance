package aminParsian.DAO;

import aminParsian.util.*;
import aminParsian.model.*;
import java.math.*;

public class HoldingDAO extends BaseDAO {

    public Holding findById(BigDecimal id){
        return (Holding) super.findById(Holding.class, id);
    }

    public Holding saveOrUpdate(Holding h){
        super.saveOrUpdate(h);
        return (Holding) super.findById(aminParsian.model.Holding.class, currentSession().getIdentifier(h));
    }
}
