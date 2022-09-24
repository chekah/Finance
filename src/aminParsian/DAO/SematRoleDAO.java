package aminParsian.DAO;
import aminParsian.model.*;
import aminParsian.util.BaseDAO;
import aminParsian.viewModel.ViewSematRole;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SematRoleDAO extends BaseDAO {
	public SematRole findById(BigDecimal id)
	{
		return (SematRole) super.findById(SematRole.class,id);
	}
	public  void saveOrUpdate(SematRole i)
	{
		super.saveOrUpdate(i);
	}

	public List<BigDecimal> findSematRole(BigDecimal sematID){
		List<BigDecimal> result = new ArrayList<BigDecimal>() ;
		String sql ="select id from SematRole where sematid="+ sematID;
		org.hibernate.Query query =   super.getSessionFactory().getCurrentSession().createSQLQuery(sql);
		List<Object> tempList = query.list();

		for(int i=0; i<tempList.size(); i++){
			BigDecimal id    = (BigDecimal)tempList.get(i);
			result.add(id);
		}

		return result;
	}

	public List<ViewSematRole> findSematRoles(BigDecimal sematid, BigDecimal roleid){
		String hql = "Select r.persianrolename, s.persianname from SematRole sr join sr.role r join sr.semat s where s.id = "+sematid+" or r.id = "+roleid;
		List<Object[]> queryresult = getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql).list();
		List<ViewSematRole> result = new ArrayList<ViewSematRole>();
		for(int i = 0; i<queryresult.size(); i++){
			String role = (String) queryresult.get(i)[0];
			String semat = (String) queryresult.get(i)[1];
			ViewSematRole sr = new ViewSematRole();
			sr.setRolename(role);
			sr.setSematname(semat);
			result.add(sr);

		}
		return result;
	}

}
