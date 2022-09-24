package aminParsian.DAO;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import aminParsian.model.ActionReq;
import aminParsian.model.Tab;
import aminParsian.model.TabRelation;
import aminParsian.util.BaseDAO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TabRelationDAO extends BaseDAO {
//	private ActionReqDAO actionReqDAO;
	private TabDAO tabDAO;
	private ActionReqDAO actionReqDAO;

	public TabRelation findById(BigDecimal id)
	{
		return (TabRelation) super.findById(TabRelation.class,id);
	}
	public  void saveOrUpdate(TabRelation i)
	{
		super.saveOrUpdate(i);
	}

	public ActionReqDAO getActionDAO() {
		return actionReqDAO;
	}

	public void setActionDAO(ActionReqDAO actionDAO) {
		this.actionReqDAO = actionDAO;
	}

	public TabDAO getTabDAO() {
		return tabDAO;
	}

	public void setTabDAO(TabDAO tabDAO) {
		this.tabDAO = tabDAO;
	}

	public TabRelation getActiveTabRelationID(String actionName)
	{
		String query="SELECT tr FROM  TabRelation tr join tr.actionReq  ac where ac.actionname='"+actionName+"'";
		List<TabRelation> tabRelations =getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(query).list();

		TabRelation tabRelation= tabRelations.get(0);
		Hibernate.initialize(tabRelation.getActionReq());
		Hibernate.initialize(tabRelation.getTopTab());
		Hibernate.initialize(tabRelation.getSideTab());
		Hibernate.initialize(tabRelation.getUsers());

		return tabRelation;
	}

	public List<TabRelation> getSubTabs(BigDecimal topTabID, BigDecimal userId) {
		List<Object[]> listTabs;
		List<TabRelation> resultListTabs = new ArrayList<TabRelation>();

		String s;


//		s = "SELECT DISTINCT tre.id, tre.toptab,tre.sidetab,tre.classname,tre.actionid,tre.sequencenum, tre.enable FROM TabRelation tre INNER JOIN TabRole tr  ON tr.tabID=tre.sideTab INNER JOIN UserRole ur ON tr.roleID= ur.roleID" +
//				" WHERE ur.userID=:userId AND tre.topTab=:topTabID ORDER BY tre.sequenceNum";

		s = "SELECT DISTINCT tre.id, tre.toptab,tre.sidetab,tre.classname,tre.actionid,tre.sequencenum, tre.enable FROM TabRelation tre " +
				" INNER JOIN ROLE r ON r.sidetab = tre.sideTab  " +
				"JOIN sematrole sr ON sr.roleid = r.ID JOIN semat s  ON sr.sematid = s.ID join users u ON u.sematid = s.id" +
				" WHERE u.id =:userId AND tre.topTab=:topTabID and r.action = tre.actionid  ORDER BY tre.sequenceNum";


		SessionFactory sf = (SessionFactory) super.getSessionFactory();
		Query query = sf.getCurrentSession().createSQLQuery(s);
		query.setParameter("userId", userId);
		query.setParameter("topTabID", topTabID);
		listTabs = query.list();

		int listTabsSize = 0;
		if(listTabs != null)
			listTabsSize = listTabs.size();

		for (int i = 0; i < listTabsSize; i++) {

			BigDecimal id = ((BigDecimal) listTabs.get(i)[0]);
			BigDecimal topTabId = ((BigDecimal) listTabs.get(i)[1]);
			BigDecimal sideTabId = ((BigDecimal) listTabs.get(i)[2]);
			String className = (String) listTabs.get(i)[3];
			BigDecimal actionID = ((BigDecimal) listTabs.get(i)[4]);
//            String systemName = (String) listTabs.get(i)[4];
			Long sequenceNum = ((BigDecimal) listTabs.get(i)[5]).longValue();
			Long enable=((BigDecimal) listTabs.get(i)[6]).longValue();

			Tab tab = tabDAO.findById(topTabId);
			Tab sideTab = tabDAO.findById(sideTabId);
			ActionReq act = actionReqDAO.findById(actionID);
//            resultListTabs.add(i, new TabRelation(id, tab, sideTab, className, "", sequenceNum, act));

			TabRelation tabRelation = new TabRelation();
			tabRelation.setId(id);
			tabRelation.setActionReq(act);
			tabRelation.setSequencenum(sequenceNum);
			tabRelation.setSideTab(sideTab);
			tabRelation.setTopTab(tab);
			tabRelation.setEnable(enable);

			resultListTabs.add(i, tabRelation);
			Hibernate.initialize(resultListTabs.get(i).getTopTab());
			Hibernate.initialize(resultListTabs.get(i).getSideTab());
			Hibernate.initialize(resultListTabs.get(i).getActionReq());
		}

		return resultListTabs;
	}

	public void setActionReqDAO(ActionReqDAO actionReqDAO) {
		this.actionReqDAO = actionReqDAO;
	}

	public ActionReqDAO getActionReqDAO() {
		return actionReqDAO;
	}

	public Map<Tab, List<TabRelation>> getAllTabs(BigDecimal userId) {
		String allTabsQueryStr = " select distinct tre from Users u join u.semat s join s.roles r join r.sidetab t join t.tabRelationCollection tre where u.id="+userId;
		allTabsQueryStr += " order by tre.topTab, tre.sequencenum ";
		Query allTabsQuery =  super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(allTabsQueryStr);
		List<TabRelation> tabRelations = allTabsQuery.list();
		Map<Tab, List<TabRelation>> relationMap = new HashMap<Tab, List<TabRelation>>();

		int tabRelationSize = 0;
		if(tabRelations != null && tabRelations.size()>0){
			tabRelationSize=tabRelations.size();
		}
		for(int i=0;i<tabRelationSize; i++){
			TabRelation tr = tabRelations.get(i);
			if(relationMap.containsKey(tr.getTopTab())){
				List<TabRelation> temp = relationMap.get(tr.getTopTab());
				temp.add(tr);
			}
			else{
				List<TabRelation> temp = new ArrayList<TabRelation>();
				temp.add(tr);
				relationMap.put(tr.getTopTab(), temp);
			}
		}
		return relationMap;
	}
}
