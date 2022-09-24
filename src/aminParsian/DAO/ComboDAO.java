package aminParsian.DAO;

import aminParsian.conf.Constants;
import com.google.gson.Gson;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.util.StringUtil;
import org.hibernate.Query;
import org.json.simple.JSONObject;
import org.springframework.security.core.context.SecurityContextHolder;
import aminParsian.model.ComboResponse;

import aminParsian.util.BaseDAO;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComboDAO extends BaseDAO {

    public String getList(String searchTerm , int page, String QueryID,String haveWhere,Object value) {
        ComboResponse response= new ComboResponse();
        JSONObject jObj = null;
        String json = "";
        String columName;
        String limiterWhereClause="";
        Integer limit     = Constants.COMBO_OBJECT_PER_PAGE;
        String SQL        = "";
        String sql        = "";
        String getqry= "select id,queryStr, comboName from queries q where id = " + Long.parseLong(QueryID);

        List<Object[]> resultList  = super.getSessionFactory().getCurrentSession().createSQLQuery(getqry).list();
        String ComboQuery   = (String)resultList.get(0)[1];

        ComboQuery = ComboQuery.replaceAll("#", SecurityContextHolder.getContext().getAuthentication().getName());

        String[] queryCollArr;
        String delimiter = "@";
        queryCollArr = ComboQuery.split(delimiter);
        int inputSize = queryCollArr.length;
        int columnsize= (inputSize-1)/2;
        String whereClause  = " where "+" "+"(";
        for (int i = 1; i<inputSize; i+=2) {
            if(i != 1)
                whereClause += " or ";
            whereClause += queryCollArr[i] +" like '%"+ searchTerm + "%' ";

        }
        whereClause +=" "+")";
        if(StringUtils.isNotBlank(haveWhere)) {
            if (haveWhere.contains("u")) {
            columName="userID";
            limiterWhereClause +="  AND "+columName+"="+value;

        }
            if (haveWhere.contains("o") || haveWhere.equals("c")) {
            columName=queryCollArr[queryCollArr.length-2];
            limiterWhereClause +="  AND "+columName+"="+value;
            }
            if (haveWhere.contains("m")) {
            columName=queryCollArr[queryCollArr.length-2];
            limiterWhereClause +="  AND "+columName+" in("+value+")";
            }
            if (haveWhere.contains("q")) {
            columName=queryCollArr[queryCollArr.length-2];
            limiterWhereClause +="  AND "+value;
            }
        }

        SQL = queryCollArr[0] + whereClause+limiterWhereClause;

        List<?> listQuery = super.getSessionFactory().getCurrentSession().createSQLQuery(SQL).list();

        Integer count     = listQuery.size();
        Float total_pages  ;
        if( count >0 ) {
            if(count > limit)
                total_pages = (float)(Math.ceil(count/limit));
            else total_pages = Float.parseFloat("1");
        } else {
            total_pages = Float.parseFloat("0");
        }

        if (page > total_pages) page = total_pages.intValue();
        Integer start = 0; // do not put $limit*($page - 1)
        if (page > 0)
            start = limit * page - limit;
        Integer end = start + limit;
        if(total_pages!=0)
            sql = "select * from(" + queryCollArr[0] + whereClause + limiterWhereClause+") "+
                    " where ROWNUM <= " + end;

        else sql = queryCollArr[0] +  whereClause+limiterWhereClause;

        Query Str= super.getSessionFactory().getCurrentSession().createSQLQuery(sql);

        if(page <= 0) page=0;
        response.setPage(page);

        response.setTotal(total_pages.intValue());
        response.setRecords(count);
        List<Object[]> tempList = (List<Object[]>)Str.list();

        List<Map> allRows = new ArrayList<Map>();

        for(int i=start; i<tempList.size(); i++){
            Map<String,String> row = new HashMap<String, String>();
            for(int j=0; j<columnsize; j++) {
                if(queryCollArr[j*2+2].toLowerCase().equals("int")){
                    BigDecimal num = (BigDecimal)tempList.get(i)[j];
                    if(num==null)
                    {
                        row.put(queryCollArr[j * 2 + 1].toString(), "");
                    }
                    else {
        	            row.put(queryCollArr[j*2+1].toString() ,num.toString());
            	    }
                }
                else if(queryCollArr[j*2+2].toLowerCase().equals("string")){
                    String str = (String)tempList.get(i)[j];
                    row.put(queryCollArr[j*2+1].toString() ,str);
                }
            }
            allRows.add(row);
        }

        response.setRows(allRows);
        Gson gson = new Gson();
        return gson.toJson(response);

    }

}
