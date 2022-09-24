package aminParsian.DAO;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import aminParsian.model.*;
import aminParsian.util.BaseDAO;
import aminParsian.util.DataValidation;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO extends BaseDAO {

	ErrorsDAO errorsDAO;

	public ErrorsDAO getErrorsDAO() {
		return errorsDAO;
	}

	public void setErrorsDAO(ErrorsDAO errorsDAO) {
		this.errorsDAO = errorsDAO;
	}

	public Account findById(BigDecimal id)
	{
		return (Account) super.findById(Account.class,id);
	}

	public  Object saveOrUpdate(Account i)
	{
		super.saveOrUpdate(i);
		return super.findById(Account.class ,currentSession().getIdentifier(i));
	}

	public List<Errors> doDataValidation(Account account){
		List<Errors> errors = new ArrayList<Errors>();

		//Date validation
		if(DataValidation.isValidJalaliDate(account.getBegindate().toString() ) != 1){
			Errors error = (Errors)errorsDAO.findById(Errors.class, new BigDecimal(2));
			error.setMsg(error.getMsg().replace("[thisfield]", " تاريخ شروع"));
			errors.add(error);
		}
		if(DataValidation.isValidJalaliDate(account.getEnddate().toString() ) != 1){
			Errors error = (Errors)errorsDAO.findById(Errors.class, new BigDecimal(2));
			error.setMsg(error.getMsg().replace("[thisfield]", " تاريخ پايان"));
			errors.add(error);
		}

		//Numberic Validation

		if(DataValidation.isNumeric(account.getAccountno().toString() )==false){
			Errors error = (Errors)errorsDAO.findById(Errors.class, new BigDecimal(4));
			error.setMsg(error.getMsg().replace("[thisfield]", "شماره حساب"));
			errors.add(error);
		}

		return errors;
	}

	public Account findActivePersonAccount(InsuredPerson insuredPerson){
		String hql = "select account from Account  account where account.insuredPerson=:insuredPeson and account.state=1 " +
//				" and account.changedEndorse is null " +
				" ORDER BY account.enddate DESC ";

		try {
			Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
			query.setParameter("insuredPeson", insuredPerson);
//			query.setParameter("state", insuredPerson.getState());
			query.setMaxResults(1);
			return (Account) query.uniqueResult();
		} catch (Throwable e) {
			return null;
		}
	}


	public String updateSate(Policy policy) {

		try {
			String sql = "UPDATE Account" +
					" SET state = 100" +
					" WHERE ID IN" +
					"  (SELECT a.ID" +
					" FROM Account a " +
					"  join insuredperson ip" +
					" on a.INSUREDPERSONID = ip.id" +
					"  WHERE ip.state    = 1" +
					" and ip.CHANGEDENDORSEID is null " +
					"  AND ip.policyid          =" +policy.getId()+
					"  )";
			Query query = getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sql);
			query.executeUpdate();
			return "success";
		} catch (Throwable e) {
			return "error";
		}
	}

	public ArrayList<Credebit> findCredebitsByAccount(Account account) {
		ArrayList<Credebit> credebits = new ArrayList<Credebit>();
		String hql = " select c From Credebit c" +
				" where c.account.id=:account and c.state = 3l ";
		Query query = getSessionFactory().getCurrentSession().createQuery(hql);
		query.setParameter("account",account.getId());
		credebits = (ArrayList<Credebit>) query.list();
		return credebits;
	}



	public List<Account> findAccountByPolicy(BigDecimal policyID1) {
		String hql = "select a FROM Account a where policy.id =:ID AND state<100 "  ;
		Query query =   super.getSessionFactory().getCurrentSession().createQuery(hql);
		query.setParameter("ID", policyID1);
		List<Account> accountList =query.list();
		if(accountList == null || accountList.size()==0)
			return null;
		return accountList;
	}


	public Account findActivePersonAccountForView(InsuredPerson insuredPerson) {
		String hql = "select account from Account  account where account.insuredPerson=:insuredPeson and (account.state=1 or account.state = 41 or account.state = 43)" +
//				" and account.changedEndorse is null " +
				" ORDER BY account.enddate DESC ";

		try {
			Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(hql);
			query.setParameter("insuredPeson", insuredPerson);
//			query.setParameter("state", insuredPerson.getState());
			query.setMaxResults(1);
			return (Account) query.uniqueResult();
		} catch (Throwable e) {
			return null;
		}
	}




}
