package aminParsian.DAO;

import aminParsian.util.*;
import aminParsian.model.*;
import java.math.*;

public class OrganizationDAO extends BaseDAO {
    public Organization findById(java.math.BigDecimal id){
        return (aminParsian.model.Organization) super.findById(aminParsian.model.Organization.class, id);
    }

    public aminParsian.model.Organization saveOrUpdate(aminParsian.model.Organization h){
        super.saveOrUpdate(h);
        return (aminParsian.model.Organization) super.findById(aminParsian.model.Organization.class, currentSession().getIdentifier(h));
    }
}
