package aminParsian.DAO;

import org.hibernate.Query;
import aminParsian.model.Semat;
import aminParsian.util.BaseDAO;
import aminParsian.viewModel.ViewSematRole;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SematDAO extends BaseDAO {
	public Semat findById(BigDecimal id)
	{
		return (Semat) super.findById(Semat.class,id);
	}
	public  void saveOrUpdate(Semat i)
	{
		super.saveOrUpdate(i);
	}

    public List<ViewSematRole> selectSemat(BigDecimal sematID){
        List<ViewSematRole> result = new ArrayList<ViewSematRole>();
        String sql ="SELECT R.ID as rid, r.persianrolename , r.module, r.sidetab, r.action, t.title as title, t1.title as title1, a.persianname, CASE SR.SEMATID WHEN ";
        sql += sematID+" THEN SR.SEMATID else -1  END AS sID FROM role R left JOIN (select * from sematrole where sematid=";
        sql += sematID+")SR ON R.ID = sr.roleid  left join tab t on r.module= t.id left join tab t1 on r.sidetab = t1.id left join actionreq a on r.action = a.id ";
        sql += " ORDER  by r.module, r.sidetab desc , r.action desc";
        Query query =   super.getSessionFactory().getCurrentSession().createSQLQuery(sql);
        List<Object[]> tempList = query.list();

        for(int i=0; i<tempList.size(); i++){
            BigDecimal  roleid    = (BigDecimal)tempList.get(i)[0];
            String rolename = (String)tempList.get(i)[1];

            BigDecimal  moduleId    = (BigDecimal)tempList.get(i)[2];
            BigDecimal  sidetabId    = (BigDecimal)tempList.get(i)[3];
            BigDecimal  actionId    = (BigDecimal)tempList.get(i)[4];

            String module = (String)tempList.get(i)[5];
            String sidetab = (String)tempList.get(i)[6];
            String action  = (String)tempList.get(i)[7];

            BigDecimal  semat    = (BigDecimal)tempList.get(i)[8];
            Boolean isSelected = null;
            if(semat.equals(sematID)){
                isSelected = true;
            }
            else{
                isSelected = false;
            }
            BigDecimal sematid = new BigDecimal(sematID.intValue());
            result.add(new ViewSematRole(roleid ,rolename,isSelected,sematid, "d",moduleId,sidetabId,actionId,module,sidetab,action));

        }

        return result;

    }

}
