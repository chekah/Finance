package aminParsian.DAO;
import aminParsian.model.Role;
import aminParsian.util.BaseDAO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RoleDAO extends BaseDAO {
	public Role findById(BigDecimal id)
	{
		return (Role) super.findById(Role.class,id);
	}
	public  void saveOrUpdate(Role i)
	{
		super.saveOrUpdate(i);
	}

	List<Role> roleList=new ArrayList<Role>();

	public List<Role> findRoleByUserId(Long userId)
	{
		String hqlQuery="select role  from  UserRole userrole  inner join userrole.user user  inner join userrole.role role  where user.id=:userId ";

		org.hibernate.Query sql = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hqlQuery);
		sql.setParameter("userId", userId);
		roleList=  sql.list();
		return roleList;
	}
}
