package aminParsian.DAO;

import aminParsian.model.ExcelMapping;
import aminParsian.model.Queries;
import aminParsian.util.BaseDAO;
import org.hibernate.Query;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ach on 10/27/2020.
 */
public class ExcelMappingDAO extends BaseDAO {
    public ExcelMapping findById(BigDecimal id)
    {
        return (ExcelMapping) super.findById(ExcelMapping.class,id);
    }
    public  void saveOrUpdate(ExcelMapping i)
    {
        super.saveOrUpdate(i);
    }

    public Map<String,Long> getExcelMappingByType(Long type) {
        String hql = "select e from ExcelMapping e " +
                " where e.type=:type " +
                " and  e.state =1 ";

        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
        query.setParameter("type", type);
        List<ExcelMapping> excelMappings = query.list();
        Map<String,Long> excelMapping = new HashMap<>();
        if(excelMapping != null){
            for (ExcelMapping mapping : excelMappings) {
                excelMapping.put(mapping.getColumnName(),mapping.getColumnNumber());
            }
        }
        return excelMapping;

    }
}
