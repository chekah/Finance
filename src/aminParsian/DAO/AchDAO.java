package aminParsian.DAO;

import aminParsian.displaytag.PaginatedListImpl;
import aminParsian.displaytag.PagingUtil;
import aminParsian.model.Users;
import aminParsian.util.BaseDAO;
import aminParsian.util.DateUtil;
import aminParsian.viewModel.ViewCredebit;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import aminParsian.model.Credebit;

/**
 * Created by a-naderi on 7/25/2017.
 */
public class AchDAO extends BaseDAO {


    /*public PaginatedListImpl<ViewCredebit> fanniManager() {
        String headerStr ="SELECT c.policyno, c.orgname, c.nationalid, c.personname, c.invoiceno, c.mablagh, dfn.namefarsi, c.entrydate, u.name, c.id ";
        String fromStr = " FROM credebit c inner join (SELECT * FROM dictionary where pid=1000) dfn on c.state=dfn.code inner join users u on u.id=c.entryuserid ";
        String whereStr = " where (1=1) ";


        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(headerStr+fromStr+whereStr);

        PaginatedListImpl<ViewCredebit> resultList=new PaginatedListImpl<ViewCredebit>();
        int page = PagingUtil.getPageNumberFromContext("page");
        List<Object[]> result;
        if(isExport()){
            result = query.list();
            resultList.setPageNumber(1);
            resultList.setObjectsPerPage(Integer.MAX_VALUE);
            resultList.setFullListSize(result.size());
        }
        else{
            resultList.setObjectsPerPage(30);
            resultList.setPageNumber(page);
            int firstResult = resultList.getObjectsPerPage() * (resultList.getPageNumber() - 1);
            query.setFirstResult(firstResult);
            query.setMaxResults(30);
            result =query.list();
            Query queryCount = getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery("select count(*) "+fromStr+whereStr);
            Long num = Long.parseLong(queryCount.list().get(0).toString());
            resultList.setFullListSize(num.intValue());
        }


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
            String invoiceNo = (String)temp[4];
            BigDecimal mablagh = (BigDecimal)temp[5];
            String state = (String) temp[6];
            String entryDate = DateUtil.getStrDate(((BigDecimal)temp[7]).longValue());
            String entryUser = (String) temp[8];
            BigDecimal credebitID = (BigDecimal)temp[9];

            ViewCredebit viewCredebit = new ViewCredebit(policyNo, orgName, nationalID, personName, invoiceNo, mablagh, state, entryDate, entryUser, credebitID);
            viewCredebitList.add(viewCredebit);
        }
        resultList.setList(viewCredebitList);
        return resultList;
    }


    public PaginatedListImpl<ViewCredebit> searchFanniManager(String invoiceNo, String nationalNO, String policyNO) {
        String headerStr ="SELECT c.policyno, c.orgname, c.nationalid, c.personname, c.invoiceno, c.mablagh, dfn.namefarsi, c.entrydate, u.name, c.id ";
        String fromStr = " FROM credebit c inner join (SELECT * FROM dictionary where pid=1000) dfn on c.state=dfn.code inner join users u on u.id=c.entryuserid ";
        String whereStr = " where (1=1) ";
        if(invoiceNo != null && !invoiceNo.equals("")){
            whereStr += " and c.invoiceno='" + invoiceNo + "' ";
        }
        if(nationalNO != null && !nationalNO.equals("")){
            whereStr += " and c.nationalid='" + nationalNO + "' ";
        }
        if(policyNO != null && !policyNO.equals("")){
            whereStr += " and c.policyno='" + policyNO + "' ";
        }

        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(headerStr+fromStr+whereStr);

        PaginatedListImpl<ViewCredebit> resultList=new PaginatedListImpl<ViewCredebit>();
        int page = PagingUtil.getPageNumberFromContext("page");
        List<Object[]> result;
        if(isExport()){
            result = query.list();
            resultList.setPageNumber(1);
            resultList.setObjectsPerPage(Integer.MAX_VALUE);
            resultList.setFullListSize(result.size());
        }
        else{
            resultList.setObjectsPerPage(30);
            resultList.setPageNumber(page);
            int firstResult = resultList.getObjectsPerPage() * (resultList.getPageNumber() - 1);
            query.setFirstResult(firstResult);
            query.setMaxResults(30);
            result =query.list();
            Query queryCount = getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery("select count(*) "+fromStr+whereStr);
            Long num = Long.parseLong(queryCount.list().get(0).toString());
            resultList.setFullListSize(num.intValue());
        }


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
            String invoiceNo1 = (String)temp[4];
            BigDecimal mablagh = (BigDecimal)temp[5];
            String state = (String) temp[6];
            String entryDate = DateUtil.getStrDate(((BigDecimal)temp[7]).longValue());
            String entryUser = (String) temp[8];
            BigDecimal credebitID = (BigDecimal)temp[9];

            ViewCredebit viewCredebit = new ViewCredebit(policyNo, orgName, nationalID, personName, invoiceNo1, mablagh, state, entryDate, entryUser, credebitID);
            viewCredebitList.add(viewCredebit);
        }
        resultList.setList(viewCredebitList);
        return resultList;
    }


    public PaginatedListImpl<ViewCredebit> maliManager() {
        String headerStr ="SELECT c.policyno, c.orgname, c.nationalid, c.personname, c.invoiceno, c.mablagh, dfn.namefarsi, c.entrydate, u.name, c.id ";
        String fromStr = " FROM credebit c inner join (SELECT * FROM dictionary where pid=1000) dfn on c.state=dfn.code inner join users u on u.id=c.entryuserid ";
        String whereStr = " where (1=1) and c.state in (3, 4, 5, 6) ";


        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(headerStr+fromStr+whereStr);

        PaginatedListImpl<ViewCredebit> resultList=new PaginatedListImpl<ViewCredebit>();
        int page = PagingUtil.getPageNumberFromContext("page");
        List<Object[]> result;
        if(isExport()){
            result = query.list();
            resultList.setPageNumber(1);
            resultList.setObjectsPerPage(Integer.MAX_VALUE);
            resultList.setFullListSize(result.size());
        }
        else{
            resultList.setObjectsPerPage(30);
            resultList.setPageNumber(page);
            int firstResult = resultList.getObjectsPerPage() * (resultList.getPageNumber() - 1);
            query.setFirstResult(firstResult);
            query.setMaxResults(30);
            result =query.list();
            Query queryCount = getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery("select count(*) "+fromStr+whereStr);
            Long num = Long.parseLong(queryCount.list().get(0).toString());
            resultList.setFullListSize(num.intValue());
        }


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
            String invoiceNo = (String)temp[4];
            BigDecimal mablagh = (BigDecimal)temp[5];
            String state = (String) temp[6];
            String entryDate = DateUtil.getStrDate(((BigDecimal)temp[7]).longValue());
            String entryUser = (String) temp[8];
            BigDecimal credebitID = (BigDecimal)temp[9];

            ViewCredebit viewCredebit = new ViewCredebit(policyNo, orgName, nationalID, personName, invoiceNo, mablagh, state, entryDate, entryUser, credebitID);
            viewCredebitList.add(viewCredebit);
        }
        resultList.setList(viewCredebitList);
        return resultList;
    }


    public PaginatedListImpl<ViewCredebit> searchMaliManager(String invoiceNo, String nationalNO, String policyNO) {
        String headerStr ="SELECT c.policyno, c.orgname, c.nationalid, c.personname, c.invoiceno, c.mablagh, dfn.namefarsi, c.entrydate, u.name, c.id ";
        String fromStr = " FROM credebit c inner join (SELECT * FROM dictionary where pid=1000) dfn on c.state=dfn.code inner join users u on u.id=c.entryuserid ";
        String whereStr = " where (1=1) and c.state in (3, 4, 5, 6) ";
        if(invoiceNo != null && !invoiceNo.equals("")){
            whereStr += " and c.invoiceno='" + invoiceNo + "' ";
        }
        if(nationalNO != null && !nationalNO.equals("")){
            whereStr += " and c.nationalid='" + nationalNO + "' ";
        }
        if(policyNO != null && !policyNO.equals("")){
            whereStr += " and c.policyno='" + policyNO + "' ";
        }

        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(headerStr+fromStr+whereStr);

        PaginatedListImpl<ViewCredebit> resultList=new PaginatedListImpl<ViewCredebit>();
        int page = PagingUtil.getPageNumberFromContext("page");
        List<Object[]> result;
        if(isExport()){
            result = query.list();
            resultList.setPageNumber(1);
            resultList.setObjectsPerPage(Integer.MAX_VALUE);
            resultList.setFullListSize(result.size());
        }
        else{
            resultList.setObjectsPerPage(30);
            resultList.setPageNumber(page);
            int firstResult = resultList.getObjectsPerPage() * (resultList.getPageNumber() - 1);
            query.setFirstResult(firstResult);
            query.setMaxResults(30);
            result =query.list();
            Query queryCount = getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery("select count(*) "+fromStr+whereStr);
            Long num = Long.parseLong(queryCount.list().get(0).toString());
            resultList.setFullListSize(num.intValue());
        }


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
            String invoiceNo2 = (String)temp[4];
            BigDecimal mablagh = (BigDecimal)temp[5];
            String state = (String) temp[6];
            String entryDate = DateUtil.getStrDate(((BigDecimal)temp[7]).longValue());
            String entryUser = (String) temp[8];
            BigDecimal credebitID = (BigDecimal)temp[9];

            ViewCredebit viewCredebit = new ViewCredebit(policyNo, orgName, nationalID, personName, invoiceNo2, mablagh, state, entryDate, entryUser, credebitID);
            viewCredebitList.add(viewCredebit);
        }
        resultList.setList(viewCredebitList);
        return resultList;
    }


    public PaginatedListImpl<ViewCredebit> fanniSubManager() {
        String headerStr ="SELECT c.policyno, c.orgname, c.nationalid, c.personname, c.invoiceno, c.mablagh, dfn.namefarsi, c.entrydate, u.name, c.id ";
        String fromStr = " FROM credebit c inner join (SELECT * FROM dictionary where pid=1000) dfn on c.state=dfn.code inner join users u on u.id=c.entryuserid ";
        String whereStr = " where (1=1) and c.state=1 ";


        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(headerStr+fromStr+whereStr);

        PaginatedListImpl<ViewCredebit> resultList=new PaginatedListImpl<ViewCredebit>();
        int page = PagingUtil.getPageNumberFromContext("page");
        List<Object[]> result;
        if(isExport()){
            result = query.list();
            resultList.setPageNumber(1);
            resultList.setObjectsPerPage(Integer.MAX_VALUE);
            resultList.setFullListSize(result.size());
        }
        else{
            resultList.setObjectsPerPage(30);
            resultList.setPageNumber(page);
            int firstResult = resultList.getObjectsPerPage() * (resultList.getPageNumber() - 1);
            query.setFirstResult(firstResult);
            query.setMaxResults(30);
            result =query.list();
            Query queryCount = getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery("select count(*) "+fromStr+whereStr);
            Long num = Long.parseLong(queryCount.list().get(0).toString());
            resultList.setFullListSize(num.intValue());
        }


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
            String invoiceNo = (String)temp[4];
            BigDecimal mablagh = (BigDecimal)temp[5];
            String state = (String) temp[6];
            String entryDate = DateUtil.getStrDate(((BigDecimal)temp[7]).longValue());
            String entryUser = (String) temp[8];
            BigDecimal credebitID = (BigDecimal)temp[9];

            ViewCredebit viewCredebit = new ViewCredebit(policyNo, orgName, nationalID, personName, invoiceNo, mablagh, state, entryDate, entryUser, credebitID);
            viewCredebitList.add(viewCredebit);
        }
        resultList.setList(viewCredebitList);
        return resultList;
    }
*/

    /*public PaginatedListImpl<ViewCredebit> searchFanniSubManager(String invoiceNo, String nationalNO, String policyNO) {
        String headerStr ="SELECT c.policyno, c.orgname, c.nationalid, c.personname, c.invoiceno, c.mablagh, dfn.namefarsi, c.entrydate, u.name, c.id ";
        String fromStr = " FROM credebit c inner join (SELECT * FROM dictionary where pid=1000) dfn on c.state=dfn.code inner join users u on u.id=c.entryuserid ";
        String whereStr = " where (1=1) and c.state=1 ";
        if(invoiceNo != null && !invoiceNo.equals("")){
            whereStr += " and c.invoiceno='" + invoiceNo + "' ";
        }
        if(nationalNO != null && !nationalNO.equals("")){
            whereStr += " and c.nationalid='" + nationalNO + "' ";
        }
        if(policyNO != null && !policyNO.equals("")){
            whereStr += " and c.policyno='" + policyNO + "' ";
        }

        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(headerStr+fromStr+whereStr);

        PaginatedListImpl<ViewCredebit> resultList=new PaginatedListImpl<ViewCredebit>();
        int page = PagingUtil.getPageNumberFromContext("page");
        List<Object[]> result;
        if(isExport()){
            result = query.list();
            resultList.setPageNumber(1);
            resultList.setObjectsPerPage(Integer.MAX_VALUE);
            resultList.setFullListSize(result.size());
        }
        else{
            resultList.setObjectsPerPage(30);
            resultList.setPageNumber(page);
            int firstResult = resultList.getObjectsPerPage() * (resultList.getPageNumber() - 1);
            query.setFirstResult(firstResult);
            query.setMaxResults(30);
            result =query.list();
            Query queryCount = getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery("select count(*) "+fromStr+whereStr);
            Long num = Long.parseLong(queryCount.list().get(0).toString());
            resultList.setFullListSize(num.intValue());
        }


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
            String invoiceNo3 = (String)temp[4];
            BigDecimal mablagh = (BigDecimal)temp[5];
            String state = (String) temp[6];
            String entryDate = DateUtil.getStrDate(((BigDecimal)temp[7]).longValue());
            String entryUser = (String) temp[8];
            BigDecimal credebitID = (BigDecimal)temp[9];

            ViewCredebit viewCredebit = new ViewCredebit(policyNo, orgName, nationalID, personName, invoiceNo3, mablagh, state, entryDate, entryUser, credebitID);
            viewCredebitList.add(viewCredebit);
        }
        resultList.setList(viewCredebitList);
        return resultList;
    }
*/
/*

    public PaginatedListImpl<ViewCredebit> maliSubManager() {
        String headerStr ="SELECT c.policyno, c.orgname, c.nationalid, c.personname, c.invoiceno, c.mablagh, dfn.namefarsi, c.entrydate, u.name, c.id ";
        String fromStr = " FROM credebit c inner join (SELECT * FROM dictionary where pid=1000) dfn on c.state=dfn.code inner join users u on u.id=c.entryuserid ";
        String whereStr = " where (1=1) and c.state=2 ";


        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(headerStr+fromStr+whereStr);

        PaginatedListImpl<ViewCredebit> resultList=new PaginatedListImpl<ViewCredebit>();
        int page = PagingUtil.getPageNumberFromContext("page");
        List<Object[]> result;
        if(isExport()){
            result = query.list();
            resultList.setPageNumber(1);
            resultList.setObjectsPerPage(Integer.MAX_VALUE);
            resultList.setFullListSize(result.size());
        }
        else{
            resultList.setObjectsPerPage(30);
            resultList.setPageNumber(page);
            int firstResult = resultList.getObjectsPerPage() * (resultList.getPageNumber() - 1);
            query.setFirstResult(firstResult);
            query.setMaxResults(30);
            result =query.list();
            Query queryCount = getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery("select count(*) "+fromStr+whereStr);
            Long num = Long.parseLong(queryCount.list().get(0).toString());
            resultList.setFullListSize(num.intValue());
        }


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
            String invoiceNo = (String)temp[4];
            BigDecimal mablagh = (BigDecimal)temp[5];
            String state = (String) temp[6];
            String entryDate = DateUtil.getStrDate(((BigDecimal)temp[7]).longValue());
            String entryUser = (String) temp[8];
            BigDecimal credebitID = (BigDecimal)temp[9];

            ViewCredebit viewCredebit = new ViewCredebit(policyNo, orgName, nationalID, personName, invoiceNo, mablagh, state, entryDate, entryUser, credebitID);
            viewCredebitList.add(viewCredebit);
        }
        resultList.setList(viewCredebitList);
        return resultList;
    }
*/

   /* public PaginatedListImpl<ViewCredebit> searchMaliSubManager(String invoiceNo, String nationalNO, String policyNO) {
        String headerStr ="SELECT c.policyno, c.orgname, c.nationalid, c.personname, c.invoiceno, c.mablagh, dfn.namefarsi, c.entrydate, u.name, c.id ";
        String fromStr = " FROM credebit c inner join (SELECT * FROM dictionary where pid=1000) dfn on c.state=dfn.code inner join users u on u.id=c.entryuserid ";
        String whereStr = " where (1=1) and c.state=2 ";
        if(invoiceNo != null && !invoiceNo.equals("")){
            whereStr += " and c.invoiceno='" + invoiceNo + "' ";
        }
        if(nationalNO != null && !nationalNO.equals("")){
            whereStr += " and c.nationalid='" + nationalNO + "' ";
        }
        if(policyNO != null && !policyNO.equals("")){
            whereStr += " and c.policyno='" + policyNO + "' ";
        }

        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(headerStr+fromStr+whereStr);

        PaginatedListImpl<ViewCredebit> resultList=new PaginatedListImpl<ViewCredebit>();
        int page = PagingUtil.getPageNumberFromContext("page");
        List<Object[]> result;
        if(isExport()){
            result = query.list();
            resultList.setPageNumber(1);
            resultList.setObjectsPerPage(Integer.MAX_VALUE);
            resultList.setFullListSize(result.size());
        }
        else{
            resultList.setObjectsPerPage(30);
            resultList.setPageNumber(page);
            int firstResult = resultList.getObjectsPerPage() * (resultList.getPageNumber() - 1);
            query.setFirstResult(firstResult);
            query.setMaxResults(30);
            result =query.list();
            Query queryCount = getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery("select count(*) "+fromStr+whereStr);
            Long num = Long.parseLong(queryCount.list().get(0).toString());
            resultList.setFullListSize(num.intValue());
        }


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
            BigDecimal mablagh = (BigDecimal)temp[5];
            String state = (String) temp[6];
            String entryDate = DateUtil.getStrDate(((BigDecimal)temp[7]).longValue());
            String entryUser = (String) temp[8];
            BigDecimal credebitID = (BigDecimal)temp[9];

            ViewCredebit viewCredebit = new ViewCredebit(policyNo, orgName, nationalID, personName, invoiceNo4, mablagh, state, entryDate, entryUser, credebitID);
            viewCredebitList.add(viewCredebit);
        }
        resultList.setList(viewCredebitList);
        return resultList;
    }

*/
    public Credebit findCredebitByID(BigDecimal credebitID) {
        String hql = "select c FROM Credebit c where c.id =:ID"  ;
        Query query =   getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
        query.setParameter("ID", credebitID);
        return (Credebit) query.uniqueResult();
    }
}
