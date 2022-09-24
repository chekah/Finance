package aminParsian.DAO;

import aminParsian.util.*;
import aminParsian.model.*;
import java.math.*;


public class SanadDAO extends BaseDAO{
    public Sanad findById(BigDecimal id){
        return (Sanad) super.findById(aminParsian.model.Sanad.class, id);
    }

    public Sanad saveOrUpdate(Sanad h){
        super.saveOrUpdate(h);
        return (aminParsian.model.Sanad) super.findById(aminParsian.model.Sanad.class, currentSession().getIdentifier(h));
    }
}
