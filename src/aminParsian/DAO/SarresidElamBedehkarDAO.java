package aminParsian.DAO;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import aminParsian.model.*;
import aminParsian.util.BaseDAO;
import aminParsian.util.DataValidation;
import aminParsian.viewModel.*;
import aminParsian.util.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.*;


public class SarresidElamBedehkarDAO  extends BaseDAO {

    public List<ViewSarresidElamBedehi> getListSarresidElamBedehkar (String date, String policyNo, String insured) {
        String sqlQuery = "select * from v_sarresidelambedehi where sarresid='"+date+"'";
        if(policyNo != "" && policyNo != null && !policyNo.isEmpty()){
            sqlQuery += " and policyNo ='"+policyNo+"'";
        }

        if(insured != "" && insured != null && !insured.isEmpty()){
            insured = insured.substring(insured.length()-7);
            sqlQuery += " and bimegozar like '%"+insured+"%'";
        }
        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sqlQuery);
        List<Object[]> result = query.list();
        List<aminParsian.viewModel.ViewSarresidElamBedehi> sarresidElamBedehiList = new java.util.ArrayList<>();
        int resultSize = 0;
        if(result != null){
            resultSize = result.size();
        }
        ArrayList<String> months = new java.util.ArrayList<String>();

        months.add("");
        months.add("فروردین");months.add("اردیبهشت");months.add("خرداد");
        months.add("تیر");months.add("مرداد");months.add("شهریور");
        months.add("مهر");months.add("آبان");months.add("آذر");
        months.add("دی");months.add("بهمن");months.add("اسفند");

        for(int i=0; i<resultSize; i++){
            Object[] temp = result.get(i);

            String policyno=(String)temp[0];
            String sarresid=(String)temp[1];
            Long mablaghElhaghie = ((java.math.BigDecimal)temp[2]).longValue();
            Long mablagh = ((java.math.BigDecimal)temp[3]).longValue();
            Long mablaghBimename = ((java.math.BigDecimal)temp[4]).longValue();
            String shenaseBank=(String)temp[5];
            String title=(String)temp[6];
            String matn=(String)temp[7];


            String year = sarresid.substring(0,4);
            String month = sarresid.substring(5);

            int index = new java.math.BigDecimal(month).intValue();
            sarresid = months.get(index) +" "+year;


            ViewSarresidElamBedehi viewSarresidElamBedehi= new ViewSarresidElamBedehi(
                    policyno, sarresid, mablaghElhaghie, mablagh, mablaghBimename, shenaseBank,title,matn);


            viewSarresidElamBedehi.setDate(aminParsian.util.DateUtil.getCurrentDate());
            System.out.println(policyno);
            viewSarresidElamBedehi.setLetterno(year+"-"+month+"-"+policyno.substring(16));
            sarresidElamBedehiList.add(viewSarresidElamBedehi);
        }

        return sarresidElamBedehiList;
    }

    public List<ViewBimeShodeElamBedehkar> getListBimeShodeElamBedehkar (String date, String insured, String tarhSearch, String policyNo, String shobe) {
        String sqlQieryForShenase = "select " +
                "case when length(shomarebimename)=1 then '2110/410522/401/00000'||shomarebimename " +
                "        when length(shomarebimename)=2 then '2110/410522/401/0000'||shomarebimename " +
                "        when length(shomarebimename)=3 then '2110/410522/401/000'||shomarebimename " +
                "        when length(shomarebimename)=4 then '2110/410522/401/00'||shomarebimename " +
                "        end as policyno, " +
                "        shenasebank " +
                "from sarresidhayeelamiebedehkar where sarresiddate like '"+date+"%'  and bimename  not like '%الحاقيه%'and vaziatelamiebedehkar not like '%ابطال%'";
        Query queryForShenase = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sqlQieryForShenase);
        List<Object[]> resultForShenase = queryForShenase.list();


        String sqlQuery = "select begindate, bimeGozar, endDate, prm, elatPayan, name, nationalCode, nesbat, personelCode, policyno, radif, tarh";
        sqlQuery += ",z1,z2,z3,z4,z5,z6,z7,z8,z9,z10,z11,z12,title ";
        sqlQuery += " from v_sarresidelambedehiBimeShode where 1=1 ";

        if(insured != "" && insured != null && !insured.isEmpty()){
            insured = insured.substring(insured.length()-7);
            sqlQuery += " and bimegozar like '%"+insured+"%'";
        }

        if(policyNo != "" && policyNo != null && !policyNo.isEmpty()){

            sqlQuery += " and policyno like '%"+policyNo+"%'";
        }


        if(tarhSearch != "" && tarhSearch != null && !tarhSearch.isEmpty()){
            sqlQuery += " and tarh like '%"+tarhSearch+"%'";
        }

        if(shobe != "" && shobe != null && !shobe.isEmpty()){
            sqlQuery += " and shobe like '%"+shobe+"%'";
        }

        sqlQuery += " order by policyNo desc";

        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sqlQuery);
        List<Object[]> result = query.list();
        List<aminParsian.viewModel.ViewBimeShodeElamBedehkar> sarresidElamBedehiList = new ArrayList<>();
        int resultSize = 0;
        if(result != null){
            resultSize = result.size();
        }
        ArrayList<String> months = new java.util.ArrayList<String>();

        months.add("");
        months.add("فروردین");months.add("اردیبهشت");months.add("خرداد");
        months.add("تیر");months.add("مرداد");months.add("شهریور");
        months.add("مهر");months.add("آبان");months.add("آذر");
        months.add("دی");months.add("بهمن");months.add("اسفند");

        String year = date.substring(0,4);
        String month = date.substring(5);
        Long[] z = new Long[13];

        date = date+"/28";
        for(int i=0; i<resultSize; i++){
            long allprm = 0l;
            Object[] temp = result.get(i);

            String beginDate = (String)temp[0];
            String bimeGozar = (String)temp[1];
            String endDate = (String)temp[2];
            Long prm = ((java.math.BigDecimal)temp[3]).longValue();;
            String elatPayan = (String)temp[4];
            String name = (String)temp[5];
            String nationalCode = (String)temp[6];
            String nesbat = (String)temp[7];
            String personelCode = (String)temp[8];
            String policyno = (String)temp[9];
            Long radif = ((java.math.BigDecimal)temp[10]).longValue();;
            String tarh = (String)temp[11];
            z[1] = ((java.math.BigDecimal)temp[12]).longValue();
            z[2] = ((java.math.BigDecimal)temp[13]).longValue();
            z[3] = ((java.math.BigDecimal)temp[14]).longValue();
            z[4] = ((java.math.BigDecimal)temp[15]).longValue();
            z[5] = ((java.math.BigDecimal)temp[16]).longValue();
            z[6] = ((java.math.BigDecimal)temp[17]).longValue();
            z[7] = ((java.math.BigDecimal)temp[18]).longValue();
            z[8] = ((java.math.BigDecimal)temp[19]).longValue();
            z[9] = ((java.math.BigDecimal)temp[20]).longValue();
            z[10] = ((java.math.BigDecimal)temp[21]).longValue();
            z[11] = ((java.math.BigDecimal)temp[22]).longValue();
            z[12] = ((java.math.BigDecimal)temp[23]).longValue();
            String title = (String)temp[24];
//            String enddateMonth = endDate.substring(0,7);
//            String begindateMonth = beginDate.substring(0,7);


            if(elatPayan != "" && elatPayan != null && !elatPayan.isEmpty()){

                if(elatPayan.indexOf("با")>0){

                    if(date.compareTo(endDate)<=0 && date.compareTo(beginDate)>=0){
                        allprm = prm.longValue();
                    }
                    if(endDate.compareTo(beginDate)==0){
                        allprm = 0;
                    }
                }
                else{
                    allprm = prm.longValue();
                }
            }
            else{
                if(date.compareTo(endDate)<0 && date.compareTo(beginDate)>=0){
                    allprm = prm.longValue();
                }
                else if(endDate.compareTo(beginDate)==0){
                    allprm = 0;
                }
                else{
                    allprm = 0;
                }
            }

            int index = new java.math.BigDecimal(month).intValue();
            allprm = allprm * z[index];
            String date2 = months.get(index) +" "+year;


            ViewBimeShodeElamBedehkar viewSarresidElamBedehi= new
                    ViewBimeShodeElamBedehkar (beginDate, bimeGozar, endDate, allprm, elatPayan, name, nationalCode, nesbat, personelCode, policyno, radif, tarh, date2);

            viewSarresidElamBedehi.setDate(aminParsian.util.DateUtil.getCurrentDate());
            viewSarresidElamBedehi.setTitle(title);
            System.out.println(policyno);
            viewSarresidElamBedehi.setLetterNo(year+"-"+month+"-"+policyno.substring(16));

            sarresidElamBedehiList.add(viewSarresidElamBedehi);
        }

        HashMap<String, List<ViewBimeShodeElamBedehkar>> hashMap = new HashMap<String, java.util.List<aminParsian.viewModel.ViewBimeShodeElamBedehkar>>();

        for(Iterator k = sarresidElamBedehiList.iterator();k.hasNext(); ) {
            ViewBimeShodeElamBedehkar bimeShodeElamBedehkar = (ViewBimeShodeElamBedehkar) k.next();
            String policyNo1 = bimeShodeElamBedehkar.getPolicyno();
            if (! hashMap.containsKey(policyNo1)) {
                List<ViewBimeShodeElamBedehkar> list = new ArrayList<ViewBimeShodeElamBedehkar>();
                list.add(bimeShodeElamBedehkar);

                hashMap.put(policyNo1, list);
            } else {
                hashMap.get(policyNo1).add(bimeShodeElamBedehkar);
            }
        }

        List<aminParsian.viewModel.ViewBimeShodeElamBedehkar> sarresidElamBedehis = new ArrayList<>();



        for(java.util.Map.Entry<String, List<ViewBimeShodeElamBedehkar>> entry:hashMap.entrySet()){
            long count = 0;
            ViewBimeShodeElamBedehkar viewBimeShodeElamBedehkar = new aminParsian.viewModel.ViewBimeShodeElamBedehkar();
            ArrayList<ViewBimeShodeElamBedehkar> viewBimeShodeElamBedehkarArrayList = (java.util.ArrayList<ViewBimeShodeElamBedehkar>) entry.getValue();
            ViewBimeShodeElamBedehkar first = viewBimeShodeElamBedehkarArrayList.get(0);
            viewBimeShodeElamBedehkar.setPolicyno(first.getPolicyno());
            viewBimeShodeElamBedehkar.setBeginDate(first.getBeginDate());
            viewBimeShodeElamBedehkar.setDate(DateUtil.getCurrentDate());
            viewBimeShodeElamBedehkar.setBimeGozar(first.getBimeGozar());
            viewBimeShodeElamBedehkar.setElatPayan(first.getElatPayan());
            viewBimeShodeElamBedehkar.setEndDate(first.getEndDate());
            viewBimeShodeElamBedehkar.setName(first.getName());
            viewBimeShodeElamBedehkar.setNationalCode(first.getNationalCode());
            viewBimeShodeElamBedehkar.setNesbat(first.getNesbat());
            viewBimeShodeElamBedehkar.setPersonelCode(first.getPersonelCode());
            viewBimeShodeElamBedehkar.setSarresid(date);
            viewBimeShodeElamBedehkar.setTarh(first.getTarh());
            viewBimeShodeElamBedehkar.setLetterNo(first.getLetterNo());
            viewBimeShodeElamBedehkar.setTitle(first.getTitle());


            long prmKol = 0l;
            for( ViewBimeShodeElamBedehkar viewBimeShodeElamBedehkar1:viewBimeShodeElamBedehkarArrayList){
                prmKol += viewBimeShodeElamBedehkar1.getPrm().longValue();
                if(viewBimeShodeElamBedehkar1.getPrm().longValue() > 0)
                    count ++;
            }
            viewBimeShodeElamBedehkar.setCount(count);
            viewBimeShodeElamBedehkar.setPrm(prmKol);

            for(int i=0; i<resultForShenase.size(); i++){
                String tempPolicyNo =resultForShenase.get(i)[0].toString();
                if(viewBimeShodeElamBedehkar.getPolicyno().equals(tempPolicyNo)){
                    viewBimeShodeElamBedehkar.setShenase((resultForShenase.get(i)[1]).toString());
                }
            }


            if(prmKol>0) {
                sarresidElamBedehis.add(viewBimeShodeElamBedehkar);
            }
        }

         Collections.sort(sarresidElamBedehis);

        return sarresidElamBedehis;

    }

    public  Object saveOrUpdate(BimeShodeElamBedehkar i)
    {
        super.saveOrUpdate(i);

        return super.findById(BimeShodeElamBedehkar.class ,currentSession().getIdentifier(i));

    }



}
