package aminParsian.DAO;

//import org.apache.axis.utils.StringUtils;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import aminParsian.displaytag.PaginatedListImpl;
import aminParsian.displaytag.PagingUtil;
import aminParsian.model.*;
//import aminParsian.model.Dictionary;
import aminParsian.util.BaseDAO;
import aminParsian.util.DataValidation;
import aminParsian.util.DateUtil;
import aminParsian.viewModel.*;

import java.lang.Exception;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class PolicyPrmDAO extends BaseDAO {
    private ErrorsDAO errorsDAO;



    public ErrorsDAO getErrorsDAO() {
        return errorsDAO;
    }

    public void setErrorsDAO(ErrorsDAO errorsDAO) {
        this.errorsDAO = errorsDAO;
    }


    public PolicyPrm findById(BigDecimal id) {
        return (PolicyPrm) super.findById(PolicyPrm.class, id);
    }

    public Object saveOrUpdate(PolicyPrm i) {
        super.saveOrUpdate(i);
        return super.findById(PolicyPrm.class, currentSession().getIdentifier(i));

    }

    public PolicyPrm findByPolicyNo(String policyNo) {

        try {
            String s = "select pp from PolicyPrm pp  where pp.policyno='" + policyNo + "'";

            return (PolicyPrm) super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(s).uniqueResult();
        } catch (Throwable e) {
            return new PolicyPrm();
        }
    }

    public List<PolicyPrm> searchBimeGozar (String policyNo) {
        try {
            String s = "select pp from PolicyPrm pp  where 1=1 ";
            if(policyNo != null && policyNo!=""){
                s += "and pp.policyno='" + policyNo + "'";
            }

            return  super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(s).list();
        } catch (Throwable e) {
            return null;
        }
    }
}