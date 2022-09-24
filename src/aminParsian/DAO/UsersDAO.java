package aminParsian.DAO;

import org.hibernate.FetchMode;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import aminParsian.model.*;
import aminParsian.util.BaseDAO;
import aminParsian.viewModel.ViewUser;

import java.lang.Exception;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class UsersDAO extends BaseDAO {
	public Users findById(BigDecimal id)
	{
		return (Users) super.findById(Users.class,id);
	}
	public  void saveOrUpdate(Users i)
	{
		super.saveOrUpdate(i);
	}


	private TabRelationDAO tabRelationDAO;
	private RoleDAO roleDAO;


	private BigDecimal id;
	private String userName;
	private BigDecimal stateID;
	private BigDecimal typeID;
	private String agencyName;
	private String name;
	private String family;
	private String nationalId;
	private BigDecimal sematID;
	private String sematName;
	private BigDecimal agencyID;
	private String state;
	private String type;
	private String password;

//	@Autowired
//	SessionFactory sessionFactory;

	public RoleDAO getRoleDAO() {
		return roleDAO;
	}

	public void setRoleDAO(RoleDAO roleDAO) {
		this.roleDAO = roleDAO;
	}

	public TabRelationDAO getTabRelationDAO() {
		return tabRelationDAO;
	}

	public void setTabRelationDAO(TabRelationDAO tabRelationDAO) {
		this.tabRelationDAO = tabRelationDAO;
	}

	public TabRelation setCurrentTabRelation(String actionName){
		Map<Tab, List<TabRelation> > tabsList = null;


		TabRelation activeTabRelation;
		activeTabRelation= tabRelationDAO.getActiveTabRelationID(actionName);
		return activeTabRelation;
	}

	public Users findUserByUsername(String username)throws UsernameNotFoundException {
		if(username == null || username.equals("anonymousUser")){
			return null;
		}
		Users user=null;
		try {
		String sql = " select u.id as userid, r.id as roleid from Users u" +
					" join Semat s on u.sematid = s.id " +
					" join SematRole sr on sr.sematid = s.id" +
					" join role r on sr.roleid = r.id " +
					" where u.username=:username";

		Query query =   super.getSessionFactory().getCurrentSession().createSQLQuery(sql);
		query.setParameter("username",username);
		List<Object[]> results = query.list();
		BigDecimal id = (BigDecimal) results.get(0)[0];
		user = findById(id);

			String roleQueryStr ="select r from SematRole sr join sr.role r where sr.semat.id="+user.getSemat().getId();
			Query roleQuery = super.getSessionFactory().getCurrentSession().createQuery(roleQueryStr);
			List<Role> roles = roleQuery.list();

		user.setRoleCollection(roles);
		if (user == null) {
			throw new UsernameNotFoundException("User with username '" + username + "' does not exist.");
		}
		}catch (Exception ex){
			return null;
		}
		return user;
	}

	public Users findUserByUsernameForCurrentUser(String username)throws UsernameNotFoundException {
		if(username == null || username.equals("anonymousUser")){
			return null;
		}
		Users user=null;
		try {
			String sql = "select u from Users u where u.username=:username";

			Query query =   super.getSessionFactory().getCurrentSession().createQuery(sql);
			query.setParameter("username",username);
			user = (Users) query.uniqueResult();
			if (user == null) {
				throw new UsernameNotFoundException("User with username '" + username + "' does not exist.");
			}
		}catch (Exception ex){
			return null;
		}
		return user;
	}

	public List<ViewUser> searchUserByUserID(BigDecimal userID){

			 Object tempList[]= new Object[10];
			ViewUser viewUser = new ViewUser();
			List<ViewUser> viewUserList = new ArrayList<ViewUser>();

			 String sql  =  " select u.id , u.username , stateID.NameFarsi as state,typeID.NameFarsi as type , person.name as person  , person.family , person.nationalid , semat.persianname, agency.agencyno , agency.name as agency " +
		    "from Users u "+
			"inner join Agency agency ON  u.agencyid  = agency.id "+
			"inner join person person ON u.personid = person.id "+
			"inner join Semat semat ON u.sematid = semat.id "+
			"LEFT  JOIN  (SELECT * FROM dictionary WHERE pid=10001  )stateID "+
			"ON u.state = stateID.id "+
			"LEFT  JOIN (SELECT * FROM dictionary WHERE pid=10000 )typeID "+
			"ON u.type = typeID.id  where u.id = "+userID +"";

			Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sql);
			     tempList =(Object[]) query.uniqueResult();

			if(tempList != null) {

				if (tempList[0] != null)
					viewUser.setId(new BigDecimal(tempList[0].toString()));

				if (tempList[1] != null)
					viewUser.setUserName(tempList[1].toString());

				if (tempList[4] != null)
					viewUser.setName(tempList[4].toString());

				if (tempList[5] != null)
					viewUser.setFamily(tempList[5].toString());

				if (tempList[6] != null)
					viewUser.setNationalId(tempList[6].toString());

				if (tempList[7] != null)
					viewUser.setSematName(tempList[7].toString());

				if (tempList[8] != null)
					viewUser.setAgencyNo(new BigInteger(tempList[8].toString()));

				if (tempList[9] != null)
					viewUser.setAgencyName(tempList[9].toString());


				if (tempList[3] != null)
					viewUser.setType(tempList[3].toString());


				if (tempList[2] != null)
					viewUser.setState(tempList[2].toString());

				viewUserList.add(viewUser);
			}

             return viewUserList;
		}

	public Users findOnlyByUsername(String username)
	{    Users user = null;
		try
		{
			user = (Users)getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(Users.class).add(Restrictions.eq("username", username)).uniqueResult();
		}
		catch (Exception ex)
		{
			ex.getStackTrace();
		}
		return user;
	}


	/*-------------------------------------------------------------------------------------------------------------------------------------------------------------*/

	public void saveUser(Users user){
		 super.saveOrUpdate(user);
	}


}
