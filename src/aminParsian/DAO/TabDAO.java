package aminParsian.DAO;
import org.hibernate.Query;
import aminParsian.model.Tab;
import aminParsian.util.BaseDAO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TabDAO extends BaseDAO {
	public Tab findById(BigDecimal id)
	{
		return (Tab) super.findById(Tab.class,id);
	}
	public  void saveOrUpdate(Tab i)
	{
		super.saveOrUpdate(i);
	}

	public List<Tab> getTopTabs(BigDecimal userId) {
		List<Object[]> listTabs;
		List<Tab> resultListTabs = new ArrayList<Tab>();
		String s;

//		s = "SELECT t.id,t.title,t.tabName,t.type, t.SequencNum FROM Tab t INNER JOIN tabrole tr ON tr.tabID=t.ID INNER JOIN " +
//				" userrole ur ON ur.roleID=tr.roleID INNER JOIN " +
//				" users u ON u.id = ur.userID  WHERE t.type=:type AND u.username=:username ";

		s = "SELECT t.ID,t.title,t.tabName,t.TYPE, t.SequencNum FROM Tab t " +
				" INNER JOIN ROLE r ON r.module = t.ID " +
				"JOIN sematrole sr ON sr.roleid = r.ID JOIN semat s  ON sr.sematid = s.ID join users u ON u.sematid = s.id" +
				"  WHERE t.type=:type AND u.id=:username "+
				" and r.sidetab is null ";


		Query query = super.getSessionFactory().getCurrentSession().createSQLQuery(s).setParameter("type", 1);
		query.setParameter("username", userId);
		listTabs = query.list();

		int listTabsSize = 0;
		if (listTabs != null)
			listTabsSize = listTabs.size();

		for (int i = 0; i < listTabsSize; i++) {
			BigDecimal id = ((BigDecimal) listTabs.get(i)[0]);
			String title = (String) listTabs.get(i)[1];
			String tabName = (String) listTabs.get(i)[2];
			Long type = ((BigDecimal) listTabs.get(i)[3]).longValue();
			Long topTabSequenceNum = ((BigDecimal) listTabs.get(i)[4]).longValue();
//            resultListTabs.add(i, new Tab(id, title, tabName, type, topTabSequenceNum));
			Tab tab = new Tab();
			tab.setId(id);
			tab.setTitle(title);
			tab.setTabname(tabName);
			tab.setType(type);
			tab.setSequencnum(topTabSequenceNum);
			resultListTabs.add(i, tab);

		}

		return resultListTabs;
	}


}
