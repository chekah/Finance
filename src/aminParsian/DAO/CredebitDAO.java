package aminParsian.DAO;

import aminParsian.displaytag.PaginatedListImpl;
import aminParsian.displaytag.PagingUtil;
import aminParsian.model.CredebitState;
import aminParsian.util.BaseDAO;
import aminParsian.util.DateUtil;
import aminParsian.viewModel.ViewCredebit;
import aminParsian.viewModel.ViewCredebitState;
import aminParsian.viewModel.ViewSanad;
import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import aminParsian.model.Credebit;
import org.hibernate.type.ArrayType;
import org.springframework.web.servlet.View;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Created by a-naderi on 7/26/2017.
 */


public class CredebitDAO extends BaseDAO {

    private CredebitStateDAO credebitStateDAO;



//    -------------------------------------------------------------------------------------------------------------------------------------------

    public CredebitStateDAO getCredebitStateDAO() {
        return credebitStateDAO;
    }

    public void setCredebitStateDAO(CredebitStateDAO credebitStateDAO) {
        this.credebitStateDAO = credebitStateDAO;
    }

//    -------------------------------------------------------------------------------------------------------------------------------------------


    public Credebit findById(BigDecimal id)
    {
        return (Credebit) super.findById(Credebit.class,id);
    }

    public  Object  saveOrUpdate(Credebit i) {
        super.saveOrUpdate(i);
        return super.findById(Credebit.class ,currentSession().getIdentifier(i));
    }


    public PaginatedListImpl<ViewCredebit> searchCredebits(String invoiceNo, String nationalNO, String policyNO, Long state, Long type, String createDateFrom, String createDateTo, String elamBeMaliDateFrom, String elamBeMaliDateTo) {
        String headerStr ="SELECT c.policyno, c.orgname, c.nationalid, c.personname, c.invoiceno, c.mablagh, dfn.namefarsi, c.entrydate, u.name, c.id, c.elambemalidate, c.receptiondate, c.secretariatdate, c.sheba,c.sanamcredebitid,  cs2.createdate as cs2createdate,  cs3.createdate as cs3createdate ";
        String fromStr = " FROM credebit c "+
                " left join (select * from credebitstate where state=2) cs2 on c.id = cs2.credebitid " +
                " left join (select * from credebitstate where state=3) cs3 on c.id = cs3.credebitid "+
                " inner join (SELECT * FROM dictionary where pid=1000) dfn on c.state=dfn.code inner join users u on u.id=c.entryuserid ";
        String whereStr = " where (1=1) ";

        switch (type.intValue()){
            case 4://معاون فني
                whereStr += " and c.state = 1 and c.mablagh>0 ";
                break;
            case 5://معاون مالي
                whereStr += " and c.state = 2 and c.mablagh>0 ";
                break;
            case 3://مدير مالي
                whereStr += " and c.state in (3, 4, 5, 6)  and c.mablagh<400000000 and c.mablagh>0 ";
                break;
        }
        if(invoiceNo != null && !invoiceNo.equals("")){
            whereStr += " and c.invoiceno like'%" + invoiceNo + "%' ";
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
/*        else{
            resultList.setObjectsPerPage(30);
            resultList.setPageNumber(page);
            int firstResult = resultList.getObjectsPerPage() * (resultList.getPageNumber() - 1);
            query.setFirstResult(firstResult);
            query.setMaxResults(30);
            result =query.list();
            Query queryCount = getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery("select count(*) "+fromStr+whereStr);
            Long num = Long.parseLong(queryCount.list().get(0).toString());
            resultList.setFullListSize(num.intValue());
        }*/


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
            String sanamCredebitId = (String) temp[14];
            String cs2CreateDate = (String) temp[15];
            String cs3CreateDate = (String) temp[16];

            ViewCredebit viewCredebit = new ViewCredebit(policyNo, orgName, nationalID, personName, invoiceNo4, mablagh, stateStr, entryDate, entryUser, credebitID,
                                                                                elamBeMaliDate, receptionDate, secretariatDate, sheba);
            if(sanamCredebitId != null) {
                viewCredebit.setSanamCredebitId(sanamCredebitId);
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
        viewCredebit.setSanamCredebitId(credebit.getSanamcredebitid());
        viewCredebit.setPardakhtdate(DateUtil.getDateFromLong(credebit.getPardakhtdate()));

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

	public Credebit findBySanamCredebitID(String invoiceNo, String NationalID, BigInteger mablagh) {
        String hqlQuery = "select c from Credebit c where invoiceNo = '"+ invoiceNo+"' AND nationalID='"+NationalID+"' AND mablagh="+mablagh;
        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hqlQuery);
        List<Credebit> result =query.list();
        if(result != null && result.size()>0){
            return result.get(0);
        }
        else
            return null;
    }

	public Credebit manualSaveOrUpdate (Credebit credebit){

        Session session = getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.setFlushMode(FlushMode.AUTO);

            session.saveOrUpdate(credebit);
            tx.commit();
            credebit = (Credebit) session.get(Credebit.class, session.getIdentifier(credebit));
            session.close();

            return credebit;
        }catch (Exception e){
            return null;
        }

    }


    public List<Credebit> searchCredebitsForTeedGrouhi(String invoiceNo, String nationalNO, String policyNO, Long state, Long type, String createDateFrom, String createDateTo, String elamBeMaliDateFrom, String elamBeMaliDateTo) {

        String queryStr ="SELECT c FROM Credebit c inner join c.entryuser u  where (1=1) and c.mablagh<400000000 and c.mablagh>0 ";

        switch (type.intValue()){
            case 4://معاون فني
                queryStr += " and c.state = 1 ";
                break;
            case 5://معاون مالي
                queryStr += " and c.state = 2 ";
                break;
            case 3://مدير مالي
                queryStr += " and c.state in (3, 4, 5, 6)  ";
                break;
        }
        if(invoiceNo != null && !invoiceNo.equals("")){
            queryStr += " and c.invoiceNo='" + invoiceNo + "' ";
        }
        if(nationalNO != null && !nationalNO.equals("")){
            queryStr += " and c.nationalID='" + nationalNO.replaceAll("-","") + "' ";
        }
        if(policyNO != null && !policyNO.equals("")){
            queryStr += " and c.policyNo='" + policyNO + "' ";
        }
        if(state != null && !state.equals("")){
            queryStr += " and c.state=" + state ;
        }
        if(createDateFrom != null && !createDateFrom.equals("")){
            queryStr += " and c.createdate>='" + createDateFrom + "' " ;
        }
        if(createDateTo != null && !createDateTo.equals("")){
            queryStr += " and c.createdate<='" + createDateTo + "' " ;
        }
        if(elamBeMaliDateFrom != null && !elamBeMaliDateFrom.equals("")){
            queryStr += " and c.elamBeMaliDate>='" + elamBeMaliDateFrom + "' " ;
        }
        if(elamBeMaliDateTo != null && !elamBeMaliDateTo.equals("")){
            queryStr += " and c.elamBeMaliDate<='" + elamBeMaliDateTo + "' " ;
        }

        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(queryStr);
        List<Credebit> credebitList = query.list();
        return  credebitList;
    }


    public PaginatedListImpl<ViewCredebit> searchCredebitsForPardakhtCheck(String invoiceNo, String nationalNO, String policyNO, Long state, Long type , String createDateFrom, String createDateTo, String elamBeMaliDateFrom, String elamBeMaliDateTo) {
        String headerStr ="SELECT c.policyno, c.orgname, c.nationalid, c.personname, c.invoiceno, c.mablagh, dfn.namefarsi, c.entrydate, u.name, c.id, c.elambemalidate, c.receptiondate, c.secretariatdate, c.sheba ";
        String fromStr = " FROM credebit c inner join (SELECT * FROM dictionary where pid=1000) dfn on c.state=dfn.code inner join users u on u.id=c.entryuserid ";
        String whereStr = " where (1=1)  and c.state in (3)  and c.mablagh>=400000000 ";

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
            BigInteger mablagh = ((BigDecimal)temp[5]).toBigInteger();
            String stateStr = (String) temp[6];
            String entryDate = DateUtil.getStrDate(((BigDecimal)temp[7]).longValue());
            String entryUser = (String) temp[8];
            BigDecimal credebitID = (BigDecimal)temp[9];
            String elamBeMaliDate = (String) temp[10];
            String receptionDate = (String) temp[11];
            String secretariatDate = (String) temp[12];
            String sheba = (String) temp[13];

            ViewCredebit viewCredebit = new ViewCredebit(policyNo, orgName, nationalID, personName, invoiceNo4, mablagh, stateStr, entryDate, entryUser, credebitID,
                    elamBeMaliDate, receptionDate, secretariatDate, sheba);
            viewCredebitList.add(viewCredebit);
        }
        resultList.setList(viewCredebitList);
        return resultList;
    }


    public BigDecimal findBySanamCredebitIDFromLog(String invoiceNO, String nationalID, BigInteger amount2) {

        String credebitIdStr = "select id from credebitLog where invoiceNo='"+invoiceNO+"' AND nationalId = '"+nationalID+"' ";
        credebitIdStr += " AND mablagh="+amount2;

        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(credebitIdStr);
        List<BigDecimal> credebitIds = query.list();
        if(credebitIds == null || credebitIds.size()==0){
            return null;
        }
        return credebitIds.get(0);
    }

    public List<ViewSanad> mali_report_first(String createDateFrom, String createDateTo) {
        String sql = "select 1 ,t.createdate as sanaddate,'' AS RADIF,'بابت صورتحساب شماره ' ||' '|| invoiceno || ' '|| 'شرکت '|| orgname , 140071 , 331000 ," +
                " '' as sath5 , '' as sath6, T.mablagh , 0 as bestankar ,1 as arz,1 as arzmabna,'' as bedarz, '' as besarz, 'IRR' as onvanarz, 'IRR' as oam, T.invoiceNo , T.createdate " +
                " from  " +
                " ( " +
                " select T1.invoiceNo, SUM(mablagh) as mablagh,Min(orgname) as orgname, Min(createdate)as createdate from " +
                " ( " +
                " select cs.createdate, cre.invoiceno, cre.personname, cre.orgname, cre.mablagh, cre.nationalid, cre.createdate as elamBemaliDate " +
                " from credebit cre join (select * from credebitstate where state=3) cs on cre.id = cs.credebitid " +
                " where cre.state=4 and cre.pardakhtdate between "+ DateUtil.getLongDateFromStrDate(createDateFrom)+" and "+DateUtil.getLongDateFromStrDate(createDateTo)+
                " )T1 " +
                " group by T1.invoiceno " +
                " )T " +
                " union all " +
                " select 1 as sanadNo,t2.createdate as sanadDate,'' as radif, " +
                "'بابت صورتحساب شماره ' ||' '|| invoiceno || ' '|| 'شرکت '|| orgname || ' شماره بیمه نامه ' || T2.policyno || ' ' || T2.personname as sharh, 320071 as moein, 331000 as sath4, " +
                "'' as tafsil5, '' as tafsil6, 0 as bed, T2.mablagh as bes,1 as nerkharz,1 as nam, " +
                "'' as bedarz, '' as besarz, 'IRR' as onvanArz, 'IRR' as oam, t2.nationalid as peigiri, T2.createdate as peigiridate " +
                " from " +
                " ( " +
                " select T1.invoiceNo, mablagh ,orgname , createdate, personname, policyno,nationalid from " +
                " ( " +
                " select cs.createdate, cre.invoiceno, cre.personname, cre.orgname, cre.mablagh, cre.nationalid, cre.createdate as elamBemaliDate, cre.policyno " +
                " from credebit cre join (select * from credebitstate where state=3) cs on cre.id = cs.credebitid " +
                " where cre.state=4 and cre.pardakhtdate between "+ DateUtil.getLongDateFromStrDate(createDateFrom)+" and "+DateUtil.getLongDateFromStrDate(createDateTo)+
                " )T1 " +
                " )T2"
                ;
        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sql);
        List<Object[]> result = query.list();

        int resultSize = 0;
        if(result != null && result.size()>0){
            resultSize=result.size();
        }
        List<ViewSanad> viewSanadList = new ArrayList<ViewSanad>();
        for(int i=0; i<resultSize; i++) {
            Object[] res = result.get(i);
            String sanadNo = ((BigDecimal) res[0]).toPlainString();
            String sanadDate = DateUtil.getStrDate((String)res[1]);
            String sanadRow = (String) res[2];
            String sharheGhalam = (String) res[3];
            String codeMoein = ((BigDecimal) res[4]).toPlainString();
            String codeTafsil4 = ((BigDecimal) res[5]).toPlainString();
            String codeTafsil5 = (String) res[6];
            String codeTafsil6 = (String) res[7];
            BigInteger mablaghBedehkar = ((BigDecimal) res[8]).toBigInteger();
            BigInteger mablaghBestankar = ((BigDecimal) res[9]).toBigInteger();
            Integer nerkhArz = new Integer("1");
            Integer nerkhArzMabna = new Integer("1");
            Integer mablaghBedehkarArz = new Integer("0");
            Integer mablaghBestankarArz = new Integer("0");
            String onvanArz = (String) res[14];
            String onvanArzMabna = (String) res[15];
            String shomarePeigiri = (String) res[16];
            String tarikhPeigiri = DateUtil.getStrDate((String) res[17]);

            ViewSanad viewSanad = new ViewSanad(sanadNo, sanadDate, sanadRow, sharheGhalam, codeMoein, codeTafsil4, codeTafsil5, codeTafsil6
                    , mablaghBedehkar, mablaghBestankar, nerkhArz, nerkhArzMabna, mablaghBedehkarArz, mablaghBestankarArz, onvanArz, onvanArzMabna
                    , shomarePeigiri, tarikhPeigiri);

            viewSanadList.add(viewSanad);

        }
        return  viewSanadList;
    }

    public List<ViewSanad> mali_report_sanadPardakht1(String createDateFrom, String createDateTo) {
        String sql = " select substr(cast(pardakhtdate as varchar(8)),7,8) as \"شماره سند\", pardakhtdate as \"تاریخ سند\",'' as \"ردیف سند\", 'بابت صورتحساب به شماره'|| ' '|| invoiceno || ' ' || 'شرکت '||orgname|| ' شماره بیمه نامه ' || policyno || ' ' || personname as \"شرح قلم\", " +
                " 320071 as \"کد معین\",331000 as \"کد تفضیل سطح 4\",'' as \"کد تفضیل سطح 5\",'' as \"کد تفضیل سطح 6\",mablagh as \"مبلغ بدهکار\",0 as \"مبلغ بستانکار\", " +
                " 1 as \"نرخ ارز\", 1 as \"نرخ ارز مبنا\",'' as \"مبلغ بدهکار ارز\",'' as \"مبلغ بستانکار_1\",'IRR' as \"عنوان ارز\",'IRR' as \"عنوان ارز مبنا\", " +
                " nationalid as \"شماره پیگیری\", createdate as \"تاریخ پیگیری\" " +
                " from " +
                " ( " +
                " select * from credebit where pardakhtdate between "+ DateUtil.getLongDateFromStrDate(createDateFrom)+" and "+DateUtil.getLongDateFromStrDate(createDateTo)+
                " union all " +
                " select * from credebitlog where pardakhtdate between "+ DateUtil.getLongDateFromStrDate(createDateFrom)+" and "+DateUtil.getLongDateFromStrDate(createDateTo)+
                " )T " +
                " union all " +
                " select substr(cast(pardakhtdate as varchar(8)),7,8) as \"شماره سند\", pardakhtdate,'', 'بابت صورتحساب به شماره'|| ' '|| invoiceno || ' ' || 'شرکت '||orgname|| ' شماره بیمه نامه ' || policyno || ' ' || personname, " +
                " 330990,331000,'','',0,mablagh,1, 1,'','','IRR','IRR',bankfeedback,createdate " +
                " from " +
                " ( " +
                " select * from credebit where pardakhtdate between "+ DateUtil.getLongDateFromStrDate(createDateFrom)+" and "+DateUtil.getLongDateFromStrDate(createDateTo)+
                " union all " +
                " select * from credebitlog where pardakhtdate between "+ DateUtil.getLongDateFromStrDate(createDateFrom)+" and "+DateUtil.getLongDateFromStrDate(createDateTo)+
                " )T1";
        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sql);
        List<Object[]> result = query.list();

        int resultSize = 0;
        if(result != null && result.size()>0){
            resultSize=result.size();
        }
        List<ViewSanad> viewSanadList = new ArrayList<ViewSanad>();
        for(int i=0; i<resultSize; i++) {
            Object[] res = result.get(i);
            String sanadNo = (String) res[0];
            String sanadDate = DateUtil.getStrDate(((BigDecimal)res[1]).longValue());
            String sanadRow = (String) res[2];
            String sharheGhalam = (String) res[3];
            String codeMoein = ((BigDecimal) res[4]).toPlainString();
            String codeTafsil4 = ((BigDecimal) res[5]).toPlainString();
            String codeTafsil5 = (String) res[6];
            String codeTafsil6 = (String) res[7];
            BigInteger mablaghBedehkar = ((BigDecimal) res[8]).toBigInteger();
            BigInteger mablaghBestankar = ((BigDecimal) res[9]).toBigInteger();
            Integer nerkhArz = new Integer("1");
            Integer nerkhArzMabna = new Integer("1");
            Integer mablaghBedehkarArz = new Integer("0");
            Integer mablaghBestankarArz = new Integer("0");
            String onvanArz = (String) res[14];
            String onvanArzMabna = (String) res[15];
            String shomarePeigiri = (String) res[16];
            String tarikhPeigiri = DateUtil.getStrDate((String) res[17]);

            ViewSanad viewSanad = new ViewSanad(sanadNo, sanadDate, sanadRow, sharheGhalam, codeMoein, codeTafsil4, codeTafsil5, codeTafsil6
                    , mablaghBedehkar, mablaghBestankar, nerkhArz, nerkhArzMabna, mablaghBedehkarArz, mablaghBestankarArz, onvanArz, onvanArzMabna
                    , shomarePeigiri, tarikhPeigiri);

            viewSanadList.add(viewSanad);

        }
        return  viewSanadList;
    }

    public List<ViewSanad> mali_report_sanadPardakht2(String createDateFrom, String createDateTo) {
        String sql = " select substr(cast(pardakhtdate as varchar(8)),7,8) as \"شماره سند\", pardakhtdate as \"تاریخ سند\",'' as \"ردیف سند\" " +
                ", '' as \"تحویل گیرنده\", '' as \"شماره فرعی\", '' as \"صندوق\", '' as \"شرح پرداخت\", '' as \"شرح دوم\" " +
                ",331000 as \" طرف مقابل\", " +
                "'' as \"حساب طرف مقابل\" " +
                ",5 as \"کد عملیات \", 330990 as \"عامل نقدینگی\", bankfeedback as \"ش اعلامیه برداشت\", pardakhtdate as \"تاریخ برداشت\", " +
                "'پارسیان' as \"نام بانک\", 1033 as \"کد شعبه\", '00200569078002' as \"شماره حساب\", mablagh as \"مبلغ\" " +
                ",'' as \"نرخ ارز\", '' as \"مبلغ ارز عملیاتی\", " +
                "'' as \"ارز مبنا\", '' as \"نرخ تبدیل\", '' as \"مبلغ به ارز مبنا\" " +
                ",'پرداخت طی سند ' || bankfeedback|| '|' || 'بابت صورتحساب به شماره'|| ' '|| invoiceno || ' ' || 'شرکت '||orgname|| ' شماره بیمه نامه ' || policyno || ' ' || personname as \"شرح قلم\" " +
                ",'' as \"شرح به زبان دوم\" " +
                " from (" +
                " select * from credebit where pardakhtdate between "+ DateUtil.getLongDateFromStrDate(createDateFrom)+" and "+DateUtil.getLongDateFromStrDate(createDateTo)+
                " union all " +
                " select * from credebitlog where pardakhtdate between "+ DateUtil.getLongDateFromStrDate(createDateFrom)+" and "+DateUtil.getLongDateFromStrDate(createDateTo)+
                ")T";
        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sql);
        List<Object[]> result = query.list();

        int resultSize = 0;
        if(result != null && result.size()>0){
            resultSize=result.size();
        }
        List<ViewSanad> viewSanadList = new ArrayList<ViewSanad>();
        for(int i=0; i<resultSize; i++) {
            Object[] res = result.get(i);
            String sanadNo = (String) res[0];
            String sanadDate = DateUtil.getStrDate(((BigDecimal)res[1]).longValue());
            String sanadRow = (String) res[2];
            String tahvilGirande=(String) res[3];
            String shomareFeri=(String) res[4];
            String sandoogh=(String) res[5];
            String sharhPardakht=(String) res[6];
            String sharhdovom=(String) res[7];
            String tarafeMoghabel=((BigDecimal) res[8]).toPlainString();
            String hesabtarafeMoghabel=(String) res[9];
            String codeAmaliat=((BigDecimal) res[10]).toPlainString();
            String AmeleNaghdinegi=((BigDecimal) res[11]).toPlainString();
            String elamieBardasht=(String) res[12];
            String tarikhBardasht=((BigDecimal) res[13]).toPlainString();
            String bankname=(String) res[14];
            String codeshobe=((BigDecimal) res[15]).toPlainString();
            String shomareHesab=(String) res[16];
            BigInteger mablaghBedehkar = ((BigDecimal) res[17]).toBigInteger();
            Integer nerkhArz = new Integer("1");
            Integer mablaghArzAmaliati = new Integer("1");
            Integer nerkhArzMabna = new Integer("1");
            Integer nerkhtabdil = new Integer("1");
            Integer mablaghBedehkarArz = new Integer("0");
            String sharheGhalam = (String) res[23];
            String sharbezabanDovom = (String) res[24];

            ViewSanad viewSanad = new ViewSanad(sanadNo, sanadDate, sanadRow, tahvilGirande, shomareFeri, sandoogh, sharhPardakht, sharhdovom
                    , tarafeMoghabel, hesabtarafeMoghabel, codeAmaliat, AmeleNaghdinegi, elamieBardasht, tarikhBardasht, bankname, codeshobe
                    , shomareHesab, mablaghBedehkar,nerkhArz,mablaghArzAmaliati,nerkhArzMabna,nerkhtabdil,mablaghBedehkarArz,sharheGhalam,sharbezabanDovom);

            viewSanadList.add(viewSanad);

        }
        return  viewSanadList;


    }

    public List<Credebit> getCredebitsForFeedBack() {
        String sql = "select c from Credebit c where c.state = 4 and c.pardakhtdate is null and length(c.sanamcredebitid)>15";//" is null";
        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(sql);
        return query.list();
    }

    public List<Credebit> getCredebitsForSendSms() {
        String sqlQuery = "select cre " +
                " from Credebit cre  where to_date(substr(sanamcredebitid,0,8), 'YYMMDD', 'nls_calendar=persian')>=to_char(current_date-21) " +
                " and state=4 and length(sanamcredebitid)>16 and pardakhtdate is not null and mobile is not null " +
                " and cre.id not in(select credebit.id from SmsLog smsLog where smsresult like '%\"Error\":null%')";

        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(sqlQuery);
        return query.list();
    }

    public List<Credebit> getCredebitsForTestSms() {
        String sqlQuery = "select c from Credebit c where mobile is not null ";

        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(sqlQuery);
        return query.list();
    }

    public List<ViewCredebit> findByPardakhtDate(Long longDateFromStrDate, Long longDateToStrDate) {
        String sqlQuery = "select cre from Credebit cre  where cre.state=4 and cre.pardakhtdate between "+longDateFromStrDate+" and " + longDateToStrDate;
        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(sqlQuery);
        List<Credebit> credebits =  query.list();
        if(credebits == null || credebits.size() == 0)
            return null;
        List<ViewCredebit> results = new ArrayList<ViewCredebit>();
        for(int i=0; i<credebits.size(); i++){
            results.add(getViewCredebit(credebits.get(i)));
        }
        return results;

    }

    public List<ViewCredebit> findByCreateDate(Long longDateFromStrDate, Long longDateToStrDate) {
        String sqlQuery = "select cre from Credebit cre  where cre.state=4 and cre.entrydate between "+longDateFromStrDate+" and " + longDateToStrDate;
        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(sqlQuery);
        List<Credebit> credebits =  query.list();
        if(credebits == null || credebits.size() == 0)
            return null;
        List<ViewCredebit> results = new ArrayList<ViewCredebit>();
        for(int i=0; i<credebits.size(); i++){
            results.add(getViewCredebit(credebits.get(i)));
        }
        return results;
    }

    public Credebit findByData(String nationalId, String invoiceNO, BigInteger mablaghPardakhti) {
        String sqlQuery = "select cre from Credebit cre  where cre.nationalID='"+nationalId+"' and cre.invoiceNo='"+invoiceNO+"' and " + " mablagh="+mablaghPardakhti;
        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(sqlQuery);
        List<Credebit> credebits =  query.list();
        if(credebits == null || credebits.size() == 0)
            return null;

        return credebits.get(0);
    }

    public List<Credebit> getCredebitsForSendSmsDuplicate() {
        /*String sqlQuery = "select cr.id" +
                " from receptionexcel re inner join credebitreceptionexcel cre on re.id = cre.receptionexcelid" +
                " inner join credebit cr on cr.id = cre.credebitid " +
                " where re.createdate>='1399/08/01' " +
                " group by cr.id, cr.mablagh,cr.nationalid " +
                " having mablagh-sum(nvl(re.hazinebimarestanipardakhti,0))-sum(nvl(re.hazineparapardakhti,0))>0";

        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sqlQuery);
        List<BigDecimal> credebitIds = query.list();

        List<Credebit> credebits = new ArrayList<Credebit>();
        for(int i=0; i<credebitIds.size(); i++){
            credebits.add(findById(credebitIds.get(i)));
        }

        return credebits;*/
        return  null;
    }
}
