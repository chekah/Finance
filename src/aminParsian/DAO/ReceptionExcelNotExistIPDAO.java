package aminParsian.DAO;

import aminParsian.displaytag.PaginatedListImpl;
import aminParsian.displaytag.PagingUtil;
import aminParsian.model.InsuredPerson;
import aminParsian.model.Policy;
import aminParsian.model.ReceptionExcel;
import aminParsian.model.ReceptionExcelNotExistIP;
import aminParsian.util.BaseDAO;
import aminParsian.util.DateUtil;
import aminParsian.viewModel.ViewReceptionExcel;
import org.hibernate.Query;
import org.springframework.web.servlet.View;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by asadi on 5/22/2020.
 */
public class ReceptionExcelNotExistIPDAO extends BaseDAO {
    public ReceptionExcelNotExistIP findById(BigDecimal id)
    {
        return (ReceptionExcelNotExistIP) super.findById(ReceptionExcelNotExistIP.class,id);
    }

    public  Object saveOrUpdate(ReceptionExcelNotExistIP i) {
        super.saveOrUpdate(i);
        return super.findById(ReceptionExcelNotExistIP.class ,currentSession().getIdentifier(i));
    }

    public boolean checkDuplicateReceptionExcel(String nationalID, Policy policy, String noeBimari, BigInteger hazineElami, Long tarikhBimari, boolean bimarestani){

        String hql = "select r from ReceptionExcelNotExistIP r" +
                " where  r.nationalID=:nationalID" +
                " and r.policy.id=:policyID" +
                " and r.noeBimari=:noeBimari " +
                "   and r.tarikhBimari=:tarikhBimari " +
                "   and r.state< 100 ";
        if(bimarestani) {
            hql+=" and r.hazineBimarestaniElami=:hazineElami " ;
        }else{
            hql+=" and r.hazineParaElami=:hazineElami " ;
        }

        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
        query.setParameter("nationalID", nationalID);
        query.setParameter("policyID", policy.getId());
        query.setParameter("noeBimari", noeBimari);
        query.setParameter("hazineElami", hazineElami);
        query.setParameter("tarikhBimari", tarikhBimari);

        List<ReceptionExcelNotExistIP> receptionExcelNotExistIPList = query.list();

        if(receptionExcelNotExistIPList!=null && receptionExcelNotExistIPList.size()>0){
            return true;
        }else{
            return false;
        }

    }

    public  List<ViewReceptionExcel> findReceptionExcelForComplete() {
        String sql = " select r.CREATEDATE,r.CREATETIME,r.NOEHAVALE,r.SHOMAREHAVALE,r.TARIKHHAVALE,r.SHOMAREPARVANDE,r.VAHEDEPARDAKHT,r.NOETARH," +
                " r.BIMEGOZAR,r.RADIF,r.VAHEDSAZMANI,r.CODEBIMESHODE,r.CODERAYANEBIMENAME,r.SERIALMOAREFINAME,r.PARDAKHTAZMAHAL,r.CODETARH," +
                "r.TASVIESHODE,r.SHOMAREBAYGANI,r.GROUHKARIBIMEGOZAR,r.TARIKHBIMARI,r.TARIKHELAMKHESARAT,r.NOEBIMARI,r.KARSHENASPARVANDE," +
                " r.CODEKARSHENAS,r.VAHEDESODOUR,r.VAHEDEMOAREF,r.NAMEKARSHENAS,r.NAMEMARKAZDARMANI,r.NOETAHVILMADAREK,r.HAZINEPARAELAMI," +
                " r.HAZINEPARAPARDAKHTI,r.MALIAT,r.FRANSHIZ,r.POLICYID,r.HAZINEBIMARESTANIELAMI,r.HAZINEBIMARESTANIPARDAKHTI,r.BIMARESTANI," +
                " r.NATIONALID,r.NATIONALASLI,r.NAMEBIMESHODE,r.NAMEBIMESHODEASLI,r.PERSONELID,r.id,r.NAMETARH,r.POLICYNO,r.VAZEIATPARVANDE," +
                " r.KARBARSABTEPARVANDE,r.GRUHEBIMARI,r.CODERAYANEMOREDKHESARAT,r.MABLGHMOTABEGHTAREFE, r.SHEBA " +
                " from receptionexcelnotexistip r " +
                " inner join policy po on r.policyid=po.id "+
                "inner join person p " +
                "on r.nationalid = p.nationalID " +
                "inner join insuredperson ip " +
                "on p.id = ip.personid   and ip.policyid = po.id " +
                "inner join insuredperson mip " +
                "on mip.id = ip.mainpersonid " +
                "inner join account a " +
                "on a.insuredpersonid = mip.id " +
                "where a.sheba is not null and r.state < 2 and a.state < 100";


        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sql);

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
                if(temp[50] != null){
                    viewDBReceptionExcel.setSheba( temp[50].toString());
                }

                viewDBReceptionExcelList.add(viewDBReceptionExcel);

            }
        }


        return viewDBReceptionExcelList;
    }



    public PaginatedListImpl<ViewReceptionExcel> receptionExcelNotExistIpReport(boolean flag, int page, BigDecimal policyID, String nationalID, String mainNationalID, String createDateFrom, String createDateTo) {
        String sql = " select r.CREATEDATE,r.CREATETIME,r.NOEHAVALE,r.SHOMAREHAVALE,r.TARIKHHAVALE,r.SHOMAREPARVANDE,r.VAHEDEPARDAKHT,r.NOETARH," +
                " r.BIMEGOZAR,r.RADIF,r.VAHEDSAZMANI,r.CODEBIMESHODE,r.CODERAYANEBIMENAME,r.SERIALMOAREFINAME,r.PARDAKHTAZMAHAL,r.CODETARH," +
                "r.TASVIESHODE,r.SHOMAREBAYGANI,r.GROUHKARIBIMEGOZAR,r.TARIKHBIMARI,r.TARIKHELAMKHESARAT,r.NOEBIMARI,r.KARSHENASPARVANDE," +
                " r.CODEKARSHENAS,r.VAHEDESODOUR,r.VAHEDEMOAREF,r.NAMEKARSHENAS,r.NAMEMARKAZDARMANI,r.NOETAHVILMADAREK,r.HAZINEPARAELAMI," +
                " r.HAZINEPARAPARDAKHTI,r.MALIAT,r.FRANSHIZ,r.POLICYID,r.HAZINEBIMARESTANIELAMI,r.HAZINEBIMARESTANIPARDAKHTI,r.BIMARESTANI," +
                " r.NATIONALID,r.NATIONALASLI,r.NAMEBIMESHODE,r.NAMEBIMESHODEASLI,r.PERSONELID,r.id,r.NAMETARH,r.POLICYNO,r.VAZEIATPARVANDE," +
                " r.KARBARSABTEPARVANDE,r.GRUHEBIMARI,r.CODERAYANEMOREDKHESARAT,r.MABLGHMOTABEGHTAREFE" +
                " from receptionexcelnotexistip r " +
                " left join person p " +
                " on r.nationalid = p.nationalID " +
                " left join insuredperson ip " +
                " on p.id = ip.personid " +
                " left join insuredperson mip " +
                " on mip.id = ip.mainpersonid " +
                " where   r.state =1 ";

        if (policyID != null) {

            sql += " AND r.policyID = " + policyID + "";
        }
        if (nationalID != null && nationalID.isEmpty() == false) {

            sql += " AND r.nationalID = '" + nationalID + "'";
        }
        if (mainNationalID != null  && mainNationalID.isEmpty() == false) {

            sql += " AND r.NATIONALASLI = '" + mainNationalID + "'";
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
//                if(temp[50] != null){
//                    viewDBReceptionExcel.setId(new BigDecimal( temp[50].toString()));
//                }

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
