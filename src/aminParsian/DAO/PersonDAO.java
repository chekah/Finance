package aminParsian.DAO;
import org.hibernate.Query;
import aminParsian.model.*;
import aminParsian.util.BaseDAO;
import aminParsian.util.DataValidation;

import java.lang.Exception;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class PersonDAO extends BaseDAO {
	private ErrorsDAO errorsDAO;

	public ErrorsDAO getErrorsDAO() {
		return errorsDAO;
	}

	public void setErrorsDAO(ErrorsDAO errorsDAO) {
		this.errorsDAO = errorsDAO;
	}

	public Person findById(BigDecimal id)
	{
		return (Person) super.findById(Person.class,id);
	}
	public  Object saveOrUpdate(Person i)
	{
		super.saveOrUpdate(i);
		return super.findById(Person.class, currentSession().getIdentifier(i));
	}

	public List<Errors> doDataValidation(Person person){
		List<Errors> errors = new ArrayList<Errors>();

		if(DataValidation.isValidJalaliDate(person.getGregorianbirthdate().toString() ) != 1){
			Errors error = (Errors)errorsDAO.findById(Errors.class, new BigDecimal(2));
			error.setMsg(error.getMsg().replace("[thisfield]", "تاريخ تولد ميلادي "));
			errors.add(error);
		}

		if(DataValidation.isValidJalaliDate(person.getPersianbirthdate().toString() ) != 1){
			Errors error = (Errors)errorsDAO.findById(Errors.class, new BigDecimal(2));
			error.setMsg(error.getMsg().replace("[thisfield]", "تاريخ تولد شمسي "));
			errors.add(error);
		}

		//Numberic Validation
		if(DataValidation.isNumeric(person.getDegree().toString() )==false){
			Errors error = (Errors)errorsDAO.findById(Errors.class, new BigDecimal(4));
			error.setMsg(error.getMsg().replace("[thisfield]", "مدرک تحصيلي"));
			errors.add(error);
		}


		return errors;
	}




	public Person findByNationalID(String nationalID){


		String hql = " select p from Person p where p.state<>100 and p.nationalid=:nationalid";

		Query query = super.getSessionFactory().getCurrentSession().createQuery(hql);
		query.setParameter("nationalid",nationalID);
		query.setMaxResults(1);
		return (Person) query.uniqueResult();

	}

	public InsuredPerson findMainInsuredPersonByNationalID(String nationalIDAsli) {
		String sql="select ip from InsuredPerson ip" +
				" join ip.person per " +
				" where ip.state < 100  and per.nationalid=:nationalID and ip.familyrelation=1  ";
		Query query=super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(sql);
		query.setParameter("nationalID",nationalIDAsli);
		try {
			return (InsuredPerson) query.list().get(0);
		}catch (Exception e){
			return null;
		}
	}


	public Contact findByPersonId(BigDecimal id) {

		String hql= " select c from Contact c where c.person.id =:ID and c.state < 100 ";

		Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
		query.setParameter("ID",id);

		Contact contact = (Contact) query.uniqueResult();
		return contact;
	}
}
