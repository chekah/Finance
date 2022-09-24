package aminParsian.DAO;

/**
 * Created by asadi on 5/21/2020.
 */

import aminParsian.displaytag.PaginatedListImpl;
import aminParsian.displaytag.PagingUtil;
import aminParsian.viewModel.ViewReceptionExcel;
import org.hibernate.Query;
import aminParsian.model.InsuredPerson;
import aminParsian.model.ReceptionExcel;
import aminParsian.util.BaseDAO;
import org.hibernate.service.jta.platform.internal.BorlandEnterpriseServerJtaPlatform;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


public class ReceptionExcelDAO extends BaseDAO {

    public ReceptionExcel findById(BigDecimal id)
    {
        return (ReceptionExcel) super.findById(ReceptionExcel.class,id);
    }

    public  Object saveOrUpdate(ReceptionExcel i) {
        super.saveOrUpdate(i);
        return super.findById(ReceptionExcel.class ,currentSession().getIdentifier(i));
    }

    public boolean checkDuplicateReceptionExcel(InsuredPerson insuredPerson,String noeBimari,BigInteger hazineElami,Long tarikhBimari,boolean bimarestani){

        String hql = "select r from ReceptionExcel r" +
                " where  r.insuredPerson.id=:insuredPersonID" +
                " and r.noeBimari=:noeBimari " +
                "   and r.tarikhBimari=:tarikhBimari " +
                "   and r.state< 100 ";
                if(bimarestani) {
                    hql+=" and r.hazineBimarestaniElami=:hazineElami " ;
                }else{
                    hql+=" and r.hazineParaElami=:hazineElami " ;
                }



        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
        query.setParameter("insuredPersonID", insuredPerson.getId());
        query.setParameter("noeBimari", noeBimari);
        query.setParameter("hazineElami", hazineElami);
        query.setParameter("tarikhBimari", tarikhBimari);

        List<ReceptionExcel> receptionExcelList=query.list();

        if(receptionExcelList!=null && receptionExcelList.size()>0){
            return true;
        }else{
            return false;
        }

    }


    public List<Object[]> findBaseCredebitsFromReceptionExcel(BigInteger invoiceExcelID) {
        String strQuery = "SELECT rp.shomarehavale, per.nationalid, po.policyname, po.policyno, per.name|| ' '|| per.family as fullName, rp.sheba " +
                " ,sum(nvl(rp.hazinebimarestanipardakhti,0))+sum(nvl(rp.hazineparapardakhti,0)) as mablagh, max(rp.id) as sanamId, min(c.mobile) as mobile " +
                "FROM  " +
                " (select re.* from receptionexcel re left join credebitreceptionexcel cre on re.id = cre.receptionexcelid where cre.id is null)rp  "+
                "INNER JOIN (select * from insuredperson where state=1) ip " +
                "ON rp.insuredpersonid=ip.id " +
                "inner join (select * from insuredperson where state=1) mainip on ip.mainpersonid=mainip.id " +
                "inner join person per on mainip.personid=per.id " +
//                "INNER JOIN (select * from account where state=1)acc " +
//                "ON mainip.id=acc.insuredpersonid  " +
                "inner join policy po on rp.policyid=po.id " +
                " left join (select * from contact where state=1) c on per.id = c.personid "+
                "where rp.state < 100 and ip.state < 100 and mainip.state < 100   and rp.serialMoarefiName is null and rp.invoiceexcelid='"+invoiceExcelID+"'"+
            //    " and po.policyno='2110/410510/398/000001' "+
                " group by rp.shomarehavale, per.nationalid, po.policyname, po.policyno, per.name|| ' '|| per.family, rp.sheba ";


        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(strQuery);
        return query.list();


    }

    public List<ReceptionExcel> findListByInvoiceExcelIDAndMainPerson(BigInteger invoiceExcelID, String nationalID, String policyNo, String invoiceNo) {
        String strQuery = "SELECT rp.id " +
                "FROM receptionexcel rp " +
                "INNER JOIN insuredperson ip " +
                "ON rp.insuredpersonid = ip.id " +
                "INNER JOIN policy po " +
                "ON ip.policyid=po.id " +
                "inner join insuredperson mainip on ip.mainpersonid=mainip.id " +
                "INNER JOIN person per " +
                "ON mainip.personid         = per.id ";
        strQuery += " WHERE rp.invoiceexcelid='"+invoiceExcelID+"'" +
                "AND po.policyno        ='"+policyNo+"' " +
                "AND per.nationalid     ='"+nationalID+"' " +
                " AND  rp.shomarehavale= '"+invoiceNo+"'" ;
        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(strQuery);
        List<Object> results = query.list();

        List<ReceptionExcel> receptionExcelList = new ArrayList<ReceptionExcel>();
        for(Object id : results){
            ReceptionExcel receptionExcel = findById((BigDecimal) id);
            receptionExcelList.add(receptionExcel);
        }
        return receptionExcelList;

    }

    public List<BigDecimal> findReceptionExcelWithoutCredebit() {
        String strQuery = "select distinct r.invoiceExcelID from ReceptionExcel r " +
                " left join CredebitReceptionExcel cr " +
                " on r.id = cr.receptionexcelid " +
                " where cr.id is null and r.state < 100 ";

        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(strQuery);
        List<BigDecimal> results = query.list();
        return results;
    }

    public PaginatedListImpl<ViewReceptionExcel> receptionExcelReport(boolean flag, int page, BigDecimal policyID, String nationalID, String mainNationalID, String createDateFrom, String createDateTo) {
        String sql = " SELECT r.CREATEDATE , " +
                "  r.CREATETIME  , " +
                "  r.NOEHAVALE , " +
                "  r.SHOMAREHAVALE  , " +
                "  r.TARIKHHAVALE , " +
                "  r.SHOMAREPARVANDE, " +
                "  r.VAHEDEPARDAKHT , " +
                "  r.NOETARH, " +
                "  r.BIMEGOZAR, " +
                "  r.RADIF, " +
                "  r.VAHEDSAZMANI, " +
                "  r.CODEBIMESHODE, " +
                "  r.CODERAYANEBIMENAME, " +
                "  r.SERIALMOAREFINAME, " +
                "  r.PARDAKHTAZMAHAL, " +
                "  r.CODETARH, " +
                "  r.TASVIESHODE, " +
                "  r.SHOMAREBAYGANI, " +
                "  r.GROUHKARIBIMEGOZAR, " +
                "  r.TARIKHBIMARI, " +
                "  r.TARIKHELAMKHESARAT, " +
                "  r.NOEBIMARI, " +
                "  r.KARSHENASPARVANDE, " +
                "  r.CODEKARSHENAS, " +
                "  r.VAHEDESODOUR, " +
                "  r.VAHEDEMOAREF, " +
                "  r.NAMEKARSHENAS, " +
                "  r.NAMEMARKAZDARMANI, " +
                "  r.NOETAHVILMADAREK, " +
                "  r.HAZINEPARAELAMI as HAZINEPARAELAMI, " +
                "  r.HAZINEPARAPARDAKHTI as HAZINEPARAPARDAKHTI , " +
                "  r.MALIAT as MALIAT, " +
                "  r.FRANSHIZ as FRANSHIZ , " +
                "  r.POLICYID, " +
                "  r.HAZINEBIMARESTANIELAMI as HAZINEBIMARESTANIELAMI, " +
                "  r.HAZINEBIMARESTANIPARDAKHTI as HAZINEBIMARESTANIPARDAKHTI, " +
                "  r.BIMARESTANI, " +
                "  p.NATIONALID as PatientNATIONALID, " +
                "  mp.nationalid as mainNationalID, " +
                "  p.name || ' ' || p.family as fullname, " +
                "  mp.name  || ' ' || mp.family as fullnameasli, " +
                "  ip.PERSONELID, " +
                "  r.id, " +
                "  r.NAMETARH, " +
                "  r.POLICYNO, " +
                "  r.VAZEIATPARVANDE, " +
                "  r.KARBARSABTEPARVANDE, " +
                "  r.GRUHEBIMARI, " +
                "  r.CODERAYANEMOREDKHESARAT, " +
                "  r.MABLAGHMOTABEGHTAREFE as MABLAGHMOTABEGHTAREFE " +
                "FROM receptionexcel r " +
                "INNER JOIN person p " +
                "ON r.personid = p.id " +
                "INNER JOIN (select * from insuredperson where state=1) ip " +
                "ON r.insuredpersonid = ip.id " +
                "INNER JOIN (select * from insuredperson where state=1) mip " +
                "ON mip.id = ip.mainpersonid " +
                "INNER JOIN person Mp " +
                "ON mip.personid = Mp.id " +
                "INNER JOIN (SELECT * FROM account WHERE state=1) a " +
                "ON a.insuredpersonid = mip.id " +
                "WHERE r.state        < 2 " +
                "AND a.state          < 100";

        if (policyID != null) {

            sql += " AND r.policyID = " + policyID + "";
        }
        if (nationalID != null && nationalID.isEmpty() == false) {

            sql += " AND p.nationalID = '" + nationalID + "'";
        }
        if (mainNationalID != null  && mainNationalID.isEmpty() == false) {

            sql += " AND Mp.nationalID = '" + mainNationalID + "'";
        }
        if (createDateFrom != null && createDateFrom.isEmpty() == false) {
            sql += " AND r.createdate >='" + createDateFrom + "'";
        }

        if (createDateTo != null && createDateTo.isEmpty() == false) {
            sql += " AND r.createdate <='" + createDateTo + "'";
        }

        Query query=null;
        if (flag == true) {
            query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sql);
            query.setFirstResult(0);
            query.setMaxResults(10);
        } else {
            query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sql);
        }

        PaginatedListImpl<ViewReceptionExcel> resultList = new PaginatedListImpl<ViewReceptionExcel>();

        List<Object[]> result = query.list();
        List<ViewReceptionExcel> viewDBReceptionExcelList = new ArrayList<>();
        if(result!=null){
            int size = result.size();
            for(int i = 0  ; i < size ; i++){
                Object[] temp = result.get(i);


                ViewReceptionExcel viewDBReceptionExcel = new ViewReceptionExcel();

                if(temp[0] != null){
                    viewDBReceptionExcel.setCreatedate((String) temp[0]);
                }
                if(temp[1] != null){
                    viewDBReceptionExcel.setCreatetime((String) temp[1]);
                }
                if(temp[2] != null){
                    viewDBReceptionExcel.setNoeHavale((String) temp[2]);
                }
                if(temp[3] != null){
                    viewDBReceptionExcel.setShomareHavale(new Long( temp[3].toString()));
                }
                if(temp[4] != null){
                    viewDBReceptionExcel.setTarikhHavale(temp[4].toString());
                }
                if(temp[5] != null){
                    viewDBReceptionExcel.setShomareParvande(new Long( temp[5].toString()));
                }
                if(temp[6] != null){
                    viewDBReceptionExcel.setVahedePardakhti( temp[6].toString());
                }
                if(temp[7] != null){
                    viewDBReceptionExcel.setNoeTarh((String) temp[7]);
                }
                if(temp[8] != null){
                    viewDBReceptionExcel.setBimeGozar((String) temp[8]);
                }
                if(temp[9] != null){
                    viewDBReceptionExcel.setRadif(new Long( temp[9].toString()));
                }
                if(temp[10] != null){
                    viewDBReceptionExcel.setVahedeSazmani((String) temp[10]);
                }
                if(temp[11] != null){
                    viewDBReceptionExcel.setCodeBimeShode(new Long( temp[11].toString()));
                }
                if(temp[12] != null){
                    viewDBReceptionExcel.setCodeRayaneBimeName(new Long( temp[12].toString()));
                }
                if(temp[13] != null){
                    viewDBReceptionExcel.setSerialMoarefiName((String) temp[13]);
                }
                if(temp[14] != null){
                    viewDBReceptionExcel.setPardakhtAzMahal((String) temp[14]);
                }
                if(temp[15] != null){
                    viewDBReceptionExcel.setCodeTarh(new Long( temp[15].toString()));
                }
                if(temp[16] != null){
                    viewDBReceptionExcel.setTasvieShode((String) temp[16]);
                }
                if(temp[17] != null){
                    viewDBReceptionExcel.setShomareBaygani(new Long( temp[17].toString()));
                }
                if(temp[18] != null){
                    viewDBReceptionExcel.setGrouhKariBimeGozar((String) temp[18]);
                }
                if(temp[19] != null){
                    viewDBReceptionExcel.setTarikhBimari( temp[19].toString());
                }
                if(temp[20] != null){
                    viewDBReceptionExcel.setTarikhElamKhesarat( temp[20].toString());
                }
                if(temp[21] != null){
                    viewDBReceptionExcel.setNoeBimari((String) temp[21]);
                }
                if(temp[22] != null){
                    viewDBReceptionExcel.setKarshenasParvande((String) temp[22]);
                }
                if(temp[23] != null){
                    viewDBReceptionExcel.setCodeKarshenas(new Long( temp[23].toString()));
                }
                if(temp[24] != null){
                    viewDBReceptionExcel.setVehedeSodour((String) temp[24]);
                }
                if(temp[25] != null){
                    viewDBReceptionExcel.setVehedeMoaref((String) temp[25]);
                }
                if(temp[26] != null){
                    viewDBReceptionExcel.setNameKarshenas((String) temp[26]);
                }
                if(temp[27] != null){
                    viewDBReceptionExcel.setNameMarkazDarmani((String) temp[27]);
                }
                if(temp[28] != null){
                    viewDBReceptionExcel.setNoeTahvilMadarek((String) temp[28]);
                }
                if(temp[29] != null){
                    viewDBReceptionExcel.setHazineParaElami(new BigInteger( temp[29].toString()));
                }
                if(temp[30] != null){
                    viewDBReceptionExcel.setHazineParaPardakhti(new BigInteger( temp[30].toString()));
                }
                if(temp[31] != null){
                    viewDBReceptionExcel.setMaliat(new Long( temp[31].toString()));
                }
                if(temp[32] != null){
                    viewDBReceptionExcel.setFranshiz(new BigInteger( temp[32].toString()));
                }
                if(temp[33] != null){
                    viewDBReceptionExcel.setPolicyID(new BigDecimal( temp[33].toString()));
                }
                if(temp[34] != null){
                    viewDBReceptionExcel.setHazineBimarestaniElami(new BigInteger( temp[34].toString()));
                }
                if(temp[35] != null){
                    viewDBReceptionExcel.setHazineBimarestaniPardakhti(new BigInteger( temp[35].toString()));
                }
                if(temp[36] != null){
                    viewDBReceptionExcel.setBimarestani(new Long( temp[36].toString()));
                }
                if(temp[37] != null){
                    viewDBReceptionExcel.setPatientNationalID((String) temp[37]);
                }
                if(temp[38] != null){
                    viewDBReceptionExcel.setAsliNationalID((String) temp[38]);
                }
                if(temp[39] != null){
                    viewDBReceptionExcel.setPatientName((String) temp[39]);
                }
                if(temp[40] != null){
                    viewDBReceptionExcel.setAsliFullName((String) temp[40]);
                }
                if(temp[41] != null){
                    viewDBReceptionExcel.setPersonelID((String) temp[41]);
                }
                if(temp[42] != null){
                    viewDBReceptionExcel.setReceptionExcelNotExistIPID(new BigDecimal( temp[42].toString()));
                    viewDBReceptionExcel.setId(new BigDecimal(temp[42].toString()));
                }
                if(temp[43] != null){
                    viewDBReceptionExcel.setPolicyName((String) temp[43]);
                }
                if(temp[44] != null){
                    viewDBReceptionExcel.setPolicyno(new Long( temp[44].toString()));
                }
                if(temp[45] != null){
                    viewDBReceptionExcel.setVazeiatParvande((String) temp[45]);
                }
                if(temp[46] != null){
                    viewDBReceptionExcel.setKarbarSabteParvande((String) temp[46]);
                }
                if(temp[47] != null){
                    viewDBReceptionExcel.setGruheBimari((String) temp[47]);
                }
                if(temp[48] != null){
                    viewDBReceptionExcel.setCodeRayaneMoredKhesarat(new BigDecimal( temp[48].toString()));
                }
                if(temp[49] != null){
                    viewDBReceptionExcel.setMablaghMohasebeSodeMotabeghTarefe(new BigInteger( temp[49].toString()));
                }


                viewDBReceptionExcelList.add(viewDBReceptionExcel);

            }
        }


        if (!isExport()) {
            int pagesize = ((page - 1) * PagingUtil.MAX_OBJECTS_PER_PAGE) + PagingUtil.MAX_OBJECTS_PER_PAGE;
            int listsize = viewDBReceptionExcelList.size();
            if (listsize >= pagesize)
                resultList.setList(viewDBReceptionExcelList.subList(((page - 1) * PagingUtil.MAX_OBJECTS_PER_PAGE), pagesize));
            else
                resultList.setList(viewDBReceptionExcelList.subList(((page - 1) * PagingUtil.MAX_OBJECTS_PER_PAGE), listsize));

            resultList.setPageNumber(1);
            resultList.setObjectsPerPage(PagingUtil.MAX_OBJECTS_PER_PAGE);
        } else {
            resultList.setList(viewDBReceptionExcelList);

            resultList.setPageNumber(1);
            resultList.setObjectsPerPage(PagingUtil.MAX_OBJECTS_PER_PAGE);
        }
        resultList.setFullListSize(viewDBReceptionExcelList.size());
        return resultList;


    }
}
