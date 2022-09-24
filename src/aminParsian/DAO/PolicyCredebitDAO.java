package aminParsian.DAO;

import aminParsian.util.*;
import aminParsian.model.*;
import java.math.*;

public class PolicyCredebitDAO extends BaseDAO {

    public PolicyCredebit findById(java.math.BigDecimal id){
        return (aminParsian.model.PolicyCredebit) super.findById(aminParsian.model.PolicyCredebit.class, id);
    }

    public aminParsian.model.PolicyCredebit saveOrUpdate(aminParsian.model.PolicyCredebit h){
        super.saveOrUpdate(h);
        return (aminParsian.model.PolicyCredebit) super.findById(aminParsian.model.PolicyCredebit.class, currentSession().getIdentifier(h));
    }
    
}
