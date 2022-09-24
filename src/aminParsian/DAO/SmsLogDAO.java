package aminParsian.DAO;

/**
 * Created by ach on 10/17/2018.
 */
import aminParsian.model.Errors;
import aminParsian.model.SmsLog;
import aminParsian.util.BaseDAO;
import aminParsian.util.DataValidation;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class SmsLogDAO extends BaseDAO {

    private ErrorsDAO errorsDAO;
    private String mobile;
    private String smsResult;
    private String smsError;


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSmsResult() {
        return smsResult;
    }

    public void setSmsResult(String smsResult) {
        this.smsResult = smsResult;
    }

    public String getSmsError() {
        return smsError;
    }

    public void setSmsError(String smsError) {
        this.smsError = smsError;
    }

    public ErrorsDAO getErrorsDAO() {
        return errorsDAO;
    }

    public void setErrorsDAO(ErrorsDAO errorsDAO) {
        this.errorsDAO = errorsDAO;
    }



    public SmsLog findById(BigDecimal id) {
        return (SmsLog) super.findById(SmsLog.class, id);
    }

    public SmsLog findBySmsResult(String smsResult) {

        String s = "select a from SmsLog a  where   a.SMSRESULT='" + smsResult + "' ";

        return (SmsLog) super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(s).uniqueResult();

    }

    public SmsLog findByMobile(String mobile) {

        String s = "select a from SmsLog a  where   a.MOBILE='" + mobile + "' ";

        return (SmsLog) super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(s).uniqueResult();

    }

    public void saveOrUpdate(SmsLog i) {
        super.saveOrUpdate(i);
    }

    public List<Errors> doDataValidation(String mobile) {
        List<Errors> errors = new ArrayList<Errors>();

        // Numberic Validation
        if (DataValidation.isNumeric(mobile) == false) {
            Errors error = (Errors) errorsDAO.findById(Errors.class, new BigDecimal(11));
            //error.setMsg(error.getMsg().replace("[thisfield]", " کد نمايندگي"));
            errors.add(error);
        }
        return errors;
    }


}
