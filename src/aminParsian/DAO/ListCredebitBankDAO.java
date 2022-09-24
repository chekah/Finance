package aminParsian.DAO;

import aminParsian.displaytag.PaginatedListImpl;
import aminParsian.displaytag.PagingUtil;
import aminParsian.model.Credebit;
import aminParsian.model.CredebitState;
import aminParsian.model.ListCredebitBank;
import aminParsian.util.BaseDAO;
import aminParsian.util.DateUtil;
import aminParsian.viewModel.ViewCredebit;
import aminParsian.viewModel.ViewCredebitState;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by ach on 12/29/2018.
 */
public class ListCredebitBankDAO extends BaseDAO {
    private CredebitStateDAO credebitStateDAO;
    private CredebitDAO credebitDAO;

    //-----------------------------------------------------------------------------------------------------------------------------------------

    public CredebitDAO getCredebitDAO() {
        return credebitDAO;
    }

    public void setCredebitDAO(CredebitDAO credebitDAO) {
        this.credebitDAO = credebitDAO;
    }

    public CredebitStateDAO getCredebitStateDAO() {
        return credebitStateDAO;
    }

    public void setCredebitStateDAO(CredebitStateDAO credebitStateDAO) {
        this.credebitStateDAO = credebitStateDAO;
    }

    //------------------------------------------------------------------------------------------------------------------------------------------

    public ListCredebitBank findById(BigDecimal id)
    {
        return (ListCredebitBank) super.findById(ListCredebitBank.class,id);
    }

    public  ListCredebitBank  saveOrUpdate(ListCredebitBank i) {
        super.saveOrUpdate(i);
        return (ListCredebitBank) super.findById(ListCredebitBank.class ,currentSession().getIdentifier(i));
    }


   /* public PaginatedListImpl<ViewCredebit> searchCredebits(String invoiceNo, String nationalNO, String policyNO, Long state, Long type, String createDateFrom, String createDateTo, String elamBeMaliDateFrom, String elamBeMaliDateTo) {
        String headerStr ="SELECT c.policyno, c.orgname, c.nationalid, c.personname, c.invoiceno, c.mablagh, dfn.namefarsi, c.entrydate, u.name, c.id, c.elambemalidate, c.receptiondate, c.secretariatdate, c.sheba,c.sanamcredebitid,  cs2.createdate as cs2createdate,  cs3.createdate as cs3createdate ";
        String fromStr = " FROM credebit c "+
                " left join (select * from credebitstate where state=2) cs2 on c.id = cs2.credebitid " +
                " left join (select * from credebitstate where state=3) cs3 on c.id = cs3.credebitid "+
                " inner join (SELECT * FROM dictionary where pid=1000) dfn on c.state=dfn.code inner join users u on u.id=c.entryuserid ";
        String whereStr = " where (1=1) ";

        switch (type.intValue()){
            case 4://معاون فني
                whereStr += " and c.state = 1 ";
                break;
            case 5://معاون مالي
                whereStr += " and c.state = 2 ";
                break;
            case 3://مدير مالي
                whereStr += " and c.state in (3, 4, 5, 6)  and c.mablagh<200000000 and c.mablagh>0 ";
                break;
        }
        if(invoiceNo != null && !invoiceNo.equals("")){
            whereStr += " and c.invoiceno='" + invoiceNo + "' ";
        }
        if(nationalNO != null && !nationalNO.equals("")){
            whereStr += " and c.nationalid='" + nationalNO.replaceAll("-","") + "' ";
        }
        if(policyNO != null && !policyNO.equals("")){
            whereStr += " and c.policyno='" + policyNO + "' ";
        }
        if(state != null && !state.equals("")){
            whereStr += " and c.state=" + state ;
        }
        if(createDateFrom != null && !createDateFrom.equals("")){
            whereStr += " and c.createdate>='" + createDateFrom + "' " ;
        }
        if(createDateTo != null && !createDateTo.equals("")){
            whereStr += " and c.createdate<='" + createDateTo + "' " ;
        }
        if(elamBeMaliDateFrom != null && !elamBeMaliDateFrom.equals("")){
            whereStr += " and c.elambemalidate>='" + elamBeMaliDateFrom + "' " ;
        }
        if(elamBeMaliDateTo != null && !elamBeMaliDateTo.equals("")){
            whereStr += " and c.elambemalidate<='" + elamBeMaliDateTo + "' " ;
        }

        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(headerStr+fromStr+whereStr);

        PaginatedListImpl<ViewCredebit> resultList=new PaginatedListImpl<ViewCredebit>();
        int page = PagingUtil.getPageNumberFromContext("page");
        List<Object[]> result;
//        if(isExport()){
        result = query.list();
        resultList.setPageNumber(1);
        resultList.setObjectsPerPage(Integer.MAX_VALUE);
        resultList.setFullListSize(result.size());
//        }
*//*        else{
            resultList.setObjectsPerPage(30);
            resultList.setPageNumber(page);
            int firstResult = resultList.getObjectsPerPage() * (resultList.getPageNumber() - 1);
            query.setFirstResult(firstResult);
            query.setMaxResults(30);
            result =query.list();
            Query queryCount = getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery("select count(*) "+fromStr+whereStr);
            Long num = Long.parseLong(queryCount.list().get(0).toString());
            resultList.setFullListSize(num.intValue());
        }*//*


        List<ViewCredebit> viewCredebitList = new ArrayList<ViewCredebit>();

        int resultSize = 0;
        if(result != null){
            resultSize = result.size();
        }
        for(int i=0; i<resultSize; i++) {
            Object[] temp = result.get(i);

            String policyNo = (String)temp[0];
            String orgName = (String)temp[1];
            String nationalID = (String)temp[2];
            String personName = (String)temp[3];
            String invoiceNo4 = (String)temp[4];
            BigInteger mablagh = ((BigDecimal)temp[5]).toBigInteger();
            String stateStr = (String) temp[6];
            String entryDate = DateUtil.getStrDate(((BigDecimal)temp[7]).longValue());
            String entryUser = (String) temp[8];
            BigDecimal credebitID = (BigDecimal)temp[9];
            String elamBeMaliDate = (String) temp[10];
            String receptionDate = (String) temp[11];
            String secretariatDate = (String) temp[12];
            String sheba = (String) temp[13];
            BigDecimal sanamCredebitId = (BigDecimal)temp[14];
            String cs2CreateDate = (String) temp[15];
            String cs3CreateDate = (String) temp[16];

            ViewCredebit viewCredebit = new ViewCredebit(policyNo, orgName, nationalID, personName, invoiceNo4, mablagh, stateStr, entryDate, entryUser, credebitID,
                    elamBeMaliDate, receptionDate, secretariatDate, sheba);
            if(sanamCredebitId != null) {
                viewCredebit.setSanamCredebitId(sanamCredebitId.toBigInteger());
            }

            viewCredebit.setCs2CreateDate(cs2CreateDate);
            viewCredebit.setCs3CreateDate(cs3CreateDate);

            viewCredebitList.add(viewCredebit);
        }
        resultList.setList(viewCredebitList);
        return resultList;
    }

    public ViewCredebit getViewCredebit(Credebit credebit) {
        ViewCredebit viewCredebit = new ViewCredebit();

        String queryStr = "select nameFarsi from dictionary where pid=1000 AND code = "+credebit.getState();
        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(queryStr);
        String state = (String)query.uniqueResult();

        viewCredebit.setCredebitID(credebit.getId());
        viewCredebit.setPolicyNo(credebit.getPolicyNo());
        viewCredebit.setOrgName(credebit.getOrgNmae());
        viewCredebit.setInvoiceNo(credebit.getInvoiceNo());
        viewCredebit.setMablagh(credebit.getMablagh());
        viewCredebit.setState(state);
        viewCredebit.setEntryDate(DateUtil.getDateFromLong(credebit.getEntrydate()));
        viewCredebit.setEntryTime(credebit.getEntrytime());
        viewCredebit.setEntryUser(credebit.getUsers().getName());
        viewCredebit.setNationalID(credebit.getNationalID());
        viewCredebit.setPersonName(credebit.getPersonName());

        Criteria criteria = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(CredebitState.class);
        criteria.add(Restrictions.ne("state",100l));
        criteria.add(Restrictions.eq("credebit.id",credebit.getId()));
        List<CredebitState> csList = criteria.list();
        Collections.sort(csList);

        int csListSize = 0;
        if(csList != null){
            csListSize=csList.size();
        }
        ArrayList<ViewCredebitState> viewCredebitStateArrayList = new ArrayList<ViewCredebitState>();
        for(int i = 0; i<csListSize; i++){
            viewCredebitStateArrayList.add(credebitStateDAO.getViewCredebitState(csList.get(i)));
        }

        viewCredebit.setCredebitStateArrayList(viewCredebitStateArrayList);

        return viewCredebit;
    }

*/

    public ListCredebitBank manualSaveOrUpdate (ListCredebitBank listCredebitBank){

        Session session = getSessionFactory().getCurrentSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.setFlushMode(FlushMode.AUTO);

            session.saveOrUpdate(listCredebitBank);
            tx.commit();
            listCredebitBank = (ListCredebitBank) session.get(Credebit.class, session.getIdentifier(listCredebitBank));
            session.close();

            return listCredebitBank;
        }catch (Exception e){
            return null;
        }

    }

    public ListCredebitBank findByUniqueCode(String uniqeCode) {
        String hqlQuery = "select lcb from ListCredebitBank lcb where lcb.uniqueCode.id = "+ uniqeCode;
        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hqlQuery);
        List<ListCredebitBank> result =query.list();
        if(result != null && result.size()>0){
            return result.get(0);
        }
        else
            return null;
    }

    public List<ListCredebitBank> findListToErsalBeBank() {
        String hqlQuery = "select lcb from ListCredebitBank lcb where lcb.state = 1 and lcb.sanamcredebitid is null";
        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hqlQuery);
        query.setMaxResults(30);
        List<ListCredebitBank> result =query.list();
        if(result != null && result.size()>0){
            return result;
        }
        else
            return null;
    }
}
