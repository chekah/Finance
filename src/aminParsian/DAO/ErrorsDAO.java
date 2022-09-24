package aminParsian.DAO;
import aminParsian.model.Errors;
import aminParsian.util.BaseDAO;

import java.math.BigDecimal;

public class ErrorsDAO extends BaseDAO {
	public Errors findById(BigDecimal id)
	{
		return (Errors) super.findById(Errors.class,id);
	}
	public  void saveOrUpdate(Errors i)
	{
		super.saveOrUpdate(i);
	}
}
