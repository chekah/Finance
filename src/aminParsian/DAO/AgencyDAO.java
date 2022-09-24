package aminParsian.DAO;
import aminParsian.model.Agency;
import aminParsian.model.Errors;
import aminParsian.util.BaseDAO;
import aminParsian.util.DataValidation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AgencyDAO extends BaseDAO {
	private UsersDAO usersDAO;
	private 	ErrorsDAO errorsDAO;

	public ErrorsDAO getErrorsDAO() {
		return errorsDAO;
	}

	public void setErrorsDAO(ErrorsDAO errorsDAO) {
		this.errorsDAO = errorsDAO;
	}

	public Agency findById(BigDecimal id)
	{
		return (Agency) super.findById(Agency.class,id);
	}
	public  void saveOrUpdate(Agency i)
	{
		super.saveOrUpdate(i);
	}


	public void setUsersDAO(UsersDAO UsersDAO) {
		usersDAO = UsersDAO;
	}


	public UsersDAO getUsersDAO() {
		return usersDAO;
	}



	public List<Errors> doDataValidation(Agency agency){
		List<Errors> errors = new ArrayList<Errors>();

         //Date validation
		if(DataValidation.isValidJalaliDate(agency.getActivebegindate().toString() ) != 1){
			Errors error = (Errors)errorsDAO.findById(Errors.class, new BigDecimal(2));
			error.setMsg(error.getMsg().replace("[thisfield]", " تاريخ شروع فعاليت"));
			errors.add(error);
		}

		// Numberic Validation
		if(DataValidation.isNumeric(agency.getAgencyno().toString() )==false){
			Errors error = (Errors)errorsDAO.findById(Errors.class, new BigDecimal(4));
			error.setMsg(error.getMsg().replace("[thisfield]", " کد نمايندگي"));
			errors.add(error);
		}

		if(DataValidation.isNumeric(agency.getFourdigitcode().toString() )==false){
			Errors error = (Errors)errorsDAO.findById(Errors.class, new BigDecimal(4));
			error.setMsg(error.getMsg().replace("[thisfield]", "کد چهار رقمي"));
			errors.add(error);
		}
		return errors;
	}

	public Agency findByAgencyNO(String agencyNO){

		String s="select a from Agency a  where   a.agencyno='"+agencyNO+"' ";

		return (Agency) super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(s).uniqueResult();

	}
}
