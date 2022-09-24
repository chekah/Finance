package aminParsian.DAO;
import aminParsian.model.Queries;
import aminParsian.util.BaseDAO;

import java.math.BigDecimal;

public class QueriesDAO extends BaseDAO {
	public Queries findById(BigDecimal id)
	{
		return (Queries) super.findById(Queries.class,id);
	}
	public  void saveOrUpdate(Queries i)
	{
		super.saveOrUpdate(i);
	}
}
