package aminParsian.service.implementation;

import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;
import aminParsian.DAO.ActionReqDAO;
import aminParsian.DAO.TabDAO;
import aminParsian.DAO.TabRelationDAO;
import aminParsian.model.Tab;
import aminParsian.model.TabRelation;
import aminParsian.service.ITabService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: f-haghighi
 * Date: 1/19/16
 * Time: 6:21 PM
 * To change this template use File | Settings | File Templates.
 */

@Transactional
public class TabService implements ITabService {
    private TabDAO tabDAO;
    private TabRelationDAO tabRelationDAO;
    private ActionReqDAO actionReqDAO;
    private SessionFactory sessionFactory;

    public TabDAO getTabDAO() {
        return tabDAO;
    }

    public void setTabDAO(TabDAO tabDAO) {
        this.tabDAO = tabDAO;
    }

    public TabRelationDAO getTabRelationDAO() {
        return tabRelationDAO;
    }

    public void setTabRelationDAO(TabRelationDAO tabRelationDAO) {
        this.tabRelationDAO = tabRelationDAO;
    }

    public ActionReqDAO getActionReqDAO() {
        return actionReqDAO;
    }

    public void setActionReqDAO(ActionReqDAO actionReqDAO) {
        this.actionReqDAO = actionReqDAO;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Map<Tab, List<TabRelation>> getAllTabs(BigDecimal userId) {
        Map<Tab, List<TabRelation>> tabsList = tabRelationDAO.getAllTabs(userId);

                //new HashMap<Tab, List<TabRelation>>();


      /*  List<Tab> topTabs;
        List<TabRelation> subTabs;


        topTabs = tabDAO.getTopTabs(userId);
        for (int i = 0; i < topTabs.size(); i++) {
            subTabs = tabRelationDAO.getSubTabs(topTabs.get(i).getId(), userId);
            tabsList.put(topTabs.get(i), subTabs);
        }
*/
        return tabsList;
    }

    @Override
    public Map<Tab, List<TabRelation>> getTabs(BigDecimal Id) {
        Map<Tab, List<TabRelation>> result = getAllTabs(Id);
        return result;
    }
}
