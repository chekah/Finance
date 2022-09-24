package aminParsian.DAO;
import org.hibernate.Query;
import aminParsian.model.Contact;
import aminParsian.model.CredebitState;
import aminParsian.model.Errors;
import aminParsian.util.BaseDAO;
import aminParsian.util.DataValidation;
import aminParsian.model.Person;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ContactDAO extends BaseDAO {
	private ErrorsDAO errorsDAO;

	public ErrorsDAO getErrorsDAO() {
		return errorsDAO;
	}

	public void setErrorsDAO(ErrorsDAO errorsDAO) {
		this.errorsDAO = errorsDAO;
	}



	public Contact findById(BigDecimal id)
	{
		return (Contact) super.findById(Contact.class,id);
	}

	public  Object saveOrUpdate(Contact i)
	{
		super.saveOrUpdate(i);

		return super.findById(Contact.class ,currentSession().getIdentifier(i));

	}

	/*public  void saveOrUpdate(Contact i)
	{
		super.saveOrUpdate(i);

		//return super.findById(Contact.class ,currentSession().getIdentifier(i));

	}*/

	public List<Errors> doDataValidation(Contact contact){
		List<Errors> errors = new ArrayList<Errors>();
		if( contact.getFax() != null && DataValidation.isNumeric(contact.getFax().toString() )==false){
			Errors error = (Errors)errorsDAO.findById(Errors.class, new BigDecimal(4));
			error.setMsg(error.getMsg().replace("[thisfield]", "فکس"));
			errors.add(error);
		}

		if(contact.getMobile() != null && DataValidation.ValidateMobileNumber("0"+contact.getMobile().toString()) != 1){
			Errors error = (Errors)errorsDAO.findById(Errors.class, new BigDecimal(4));
			error.setMsg("شماره موبایل معتبر نمی باشد");
			errors.add(error);
		}

		return errors;
	}



	public Contact findByPersonIdFamily(BigDecimal id) {
		String hql = " select c from Contact c where c.person.id =:ID order by c.id DESC";

		Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
		query.setParameter("ID", id);
		if (query.list().size() > 0) {
			Contact contact = (Contact) query.list().get(0);
			return contact;
		}
		return null;
	}
}
