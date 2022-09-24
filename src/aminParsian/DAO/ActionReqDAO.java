package aminParsian.DAO;
import aminParsian.model.ActionReq;
import aminParsian.util.BaseDAO;

import java.math.BigDecimal;

public class ActionReqDAO extends BaseDAO {
	public ActionReq findById(BigDecimal id)
	{
		return (ActionReq) super.findById(ActionReq.class,id);
	}
	public  void saveOrUpdate(ActionReq i)
	{
		super.saveOrUpdate(i);
	}
}
