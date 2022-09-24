package aminParsian.util;

/**
 * Created by IntelliJ IDEA.
 * User: Arron1
 * Date: 3/6/11
 * Time: 4:57 PM
 */

import aminParsian.viewModel.ViewReceptionExcel;
import com.opensymphony.xwork2.ActionContext;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.FlushMode;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.ReplicationMode;
import org.hibernate.criterion.*;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.hql.internal.ast.ASTQueryTranslatorFactory;
import org.hibernate.hql.spi.QueryTranslator;
import org.hibernate.hql.spi.QueryTranslatorFactory;
import org.hibernate.internal.CriteriaImpl;
import org.hibernate.internal.SessionImpl;
import org.hibernate.loader.OuterJoinLoader;
import org.hibernate.loader.criteria.CriteriaLoader;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.persister.entity.OuterJoinLoadable;
import org.hibernate.sql.JoinType;
import org.hibernate.type.EntityType;
import org.hibernate.type.Type;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.util.StringUtils;
import aminParsian.displaytag.PaginatedListImpl;

import aminParsian.model.*;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


public abstract class BaseDAO  extends HibernateDaoSupport {
    protected Logger getLogger(){
        Logger logger = Logger.getLogger("generalLogger");
        return logger;
    }


    public void save(Object obj) {
        if (obj == null) return;
        getHibernateTemplate().save(obj);

    }


    public void update(Object obj) {
        getHibernateTemplate().merge(obj);
    }

    public void saveOrUpdate(Object obj) {
//        getHibernateTemplate().getSessionFactory().getCurrentSession().setFlushMode(FlushMode.COMMIT);
        getHibernateTemplate().saveOrUpdate(obj);
    }


//    public void saveOrUpdateAll(Collection coll) {
//        if (coll == null || coll.isEmpty()) return;
//
//        getHibernateTemplate().saveOrUpdateAll(coll);
//
////        for(Object o : coll) {
////            getHibernateTemplate().getSessionFactory().getCurrentSession().saveOrUpdate(o);
////        }
//
//    }

    public void delete(Object obj) {
        getHibernateTemplate().delete(obj);
    }

    public void deleteById(Class className, Serializable id) {
        Object object = findById(className, id);
        if (object != null) {
            delete(object);
        }
    }



    public void deleteAll(Collection coll) {
        getHibernateTemplate().deleteAll(coll);
    }

    public Object findById(Class className, Serializable id) {
        return getHibernateTemplate().get(className, id);
    }

    public List findAll(Class className) {
        return getHibernateTemplate().loadAll(className);
    }

    public List findAllWithOrderByAsc(Class className, String orderBy) {
        return getHibernateTemplate().findByCriteria(
                DetachedCriteria.forClass(className).addOrder(Order.asc(orderBy)));
    }

    public List findAllWithOrderByDesc(Class className, String orderBy) {
        return getHibernateTemplate().findByCriteria(
                DetachedCriteria.forClass(className).addOrder(Order.desc(orderBy)));
    }

    public List findByProperty(Class className, String property, Object obj) {
        return getHibernateTemplate().findByCriteria(
                DetachedCriteria.forClass(className).add(
                        Restrictions.eq(property, obj)));
    }

    public List findByPropertyWithOrderBy(Class className, String property, Object obj, String orderBy) {
        return getHibernateTemplate().findByCriteria(
                DetachedCriteria.forClass(className).add(
                        Restrictions.eq(property, obj)).addOrder(
                        Order.asc(orderBy)));
    }

    public List findByPropertyWithOrderByDesc(Class className, String property, Object obj, String orderBy) {
        return getHibernateTemplate().findByCriteria(
                DetachedCriteria.forClass(className).add(
                        Restrictions.eq(property, obj)).addOrder(
                        Order.desc(orderBy)));
    }

    public Object findObjectByProperty(Class className, String property, Object obj) {
        return DataAccessUtils.requiredUniqueResult(getHibernateTemplate()
                .findByCriteria(
                        DetachedCriteria.forClass(className).add(
                                Restrictions.eq(property, obj))));
    }

    public Object findObjectByPropertyWithOrderBy(Class className, String property, Object obj, String orderBy) {
        return DataAccessUtils.requiredUniqueResult(getHibernateTemplate()
                .findByCriteria(
                        DetachedCriteria.forClass(className).add(
                                Restrictions.eq(property, obj)).addOrder(
                                Order.asc(orderBy))));
    }

    public List findByProperties(Class className, String[] propertyName, Object[] propertyValue) {
        if (propertyName.length == 0 || propertyValue.length == 0) return null;
        Criterion criterion = Restrictions.eq(propertyName[0], propertyValue[0]);
        for (int i = 1; i < propertyName.length; i++) {
            criterion = Restrictions.and(criterion, Restrictions.eq(propertyName[i], propertyValue[i]));
        }
        return getHibernateTemplate().findByCriteria(
                DetachedCriteria.forClass(className).add(criterion));
    }

    public List findLikesByProperties(Class className, String[] propertyName, Object[] propertyValue) {
        if (propertyName.length == 0 || propertyValue.length == 0) return null;
        Criterion criterion = Restrictions.like(propertyName[0], (String) propertyValue[0], MatchMode.START);
        for (int i = 1; i < propertyName.length; i++) {
            if ((String) propertyValue[i] != null && !((String) propertyValue[i]).isEmpty()) {
                criterion = Restrictions.and(criterion, Restrictions.like(propertyName[i], (String) propertyValue[i], MatchMode.START));
            }
        }
        return getHibernateTemplate().findByCriteria(
                DetachedCriteria.forClass(className).add(criterion), 0, 10);
    }

    public List findByProperties(Class classObj, String propertyName, Object[] propertyValue) {
        Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(classObj);
        Criterion criterion = null;
        for (int i = 0; i < propertyValue.length; ++i) {
            if (criterion == null) criterion = Restrictions.eq(propertyName, propertyValue[i]);
            else criterion = Restrictions.or(criterion, Restrictions.eq(propertyName, propertyValue[i]));
        }
        return criteria.add(criterion).setCacheable(true).list();
    }

    public List findByPropertiesWithOrderBy(Class classObj, String propertyName, Object[] propertyValue, String orderBy) {
        Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(classObj);
        Criterion criterion = null;
        for (int i = 0; i < propertyValue.length; ++i) {
            if (criterion == null) criterion = Restrictions.eq(propertyName, propertyValue[i]);
            else criterion = Restrictions.or(criterion, Restrictions.eq(propertyName, propertyValue[i]));
        }
        criteria = criteria.addOrder(Order.asc(orderBy));
        return criteria.add(criterion).setCacheable(true).list();
    }

    public List findByProperties(Class classObj, String propertyName, String[] propertyValue) {
        Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(classObj);
        Criterion criterion = null;
        for (int i = 0; i < propertyValue.length; ++i) {
            if (criterion == null) criterion = Restrictions.eq(propertyName, propertyValue[i]);
            else criterion = Restrictions.or(criterion, Restrictions.eq(propertyName, propertyValue[i]));
        }
        return criteria.setCacheable(true).add(criterion).list();
    }

    public List findByPropertiesWithOrderBy(Class classObj, String propertyName, String[] propertyValue, String orderBy) {
        Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(classObj);
        Criterion criterion = null;
        for (int i = 0; i < propertyValue.length; ++i) {
            if (criterion == null) criterion = Restrictions.eq(propertyName, propertyValue[i]);
            else criterion = Restrictions.or(criterion, Restrictions.eq(propertyName, propertyValue[i]));
        }
        criteria = criteria.addOrder(Order.asc(orderBy));
        return criteria.add(criterion).setCacheable(true).list();
    }

    public List findByPropertyOfProperty(Class classObj, String property, String propertyOfProperty, Object value) {
        return getHibernateTemplate().getSessionFactory().getCurrentSession()
                .createCriteria(classObj)
                .createCriteria(property)
                .add(Restrictions.eq(propertyOfProperty, value)).setCacheable(true)
                .list();
    }

    public List findByPropertyOfPropertyWithOrderBy(Class classObj, String property, String propertyOfProperty, Object value, String orderBy) {
        return getHibernateTemplate().getSessionFactory().getCurrentSession()
                .createCriteria(classObj)
                .createCriteria(property)
                .add(Restrictions.eq(propertyOfProperty, value))
                .addOrder(Order.asc(orderBy)).setCacheable(true)
                .list();
    }


    public void merge(Object obj) {
        getHibernateTemplate().merge(obj);
    }


    public String criteriaToSql(Criteria criteria){
        CriteriaImpl c = (CriteriaImpl)criteria;
        SessionImpl s = (SessionImpl)c.getSession();
        SessionFactoryImplementor factory = (SessionFactoryImplementor)s.getSessionFactory();
        String[] implementors = factory.getImplementors( c.getEntityOrClassName() );
        CriteriaLoader loader = new CriteriaLoader((OuterJoinLoadable)factory.getEntityPersister(implementors[0]),
                factory, c, implementors[0], s.getLoadQueryInfluencers());
        Field f = null;
        try {
            f = OuterJoinLoader.class.getDeclaredField("sql");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        f.setAccessible(true);
        String sql = null;
        try {
            sql = (String)f.get(loader);
        } catch (IllegalAccessException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return sql;
    }

    public String hqlToSql(String hql){
        if (hql!=null && hql.trim().length()>0){
            final QueryTranslatorFactory translatorFactory = new ASTQueryTranslatorFactory();
            final SessionFactoryImplementor factory =
                    (SessionFactoryImplementor) getSessionFactory();
            final QueryTranslator translator = translatorFactory.
                    createQueryTranslator(hql,hql,Collections.EMPTY_MAP, factory);
            translator.compile(Collections.EMPTY_MAP, false);

            return translator.getSQLString();
        }
        return null;
    }

    public boolean isExport() {
        if (ActionContext.getContext().getParameters().size() > 0) {
            Set<String> qs = ActionContext.getContext().getParameters().keySet();
            for (String name : qs) {
                // Export parameter is of the form 'd-5314487-e'
                if ((name.startsWith("d-") && name.endsWith("-e"))) {
                    return true;
                }
            }
        }
        return false;
    }


}
