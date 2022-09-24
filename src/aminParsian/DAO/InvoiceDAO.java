package aminParsian.DAO;

import aminParsian.util.*;
import aminParsian.model.*;
import java.math.*;
import java.util.*;
import org.hibernate.*;
import aminParsian.viewModel.*;

public class InvoiceDAO extends BaseDAO {
    public Invoice findById(BigDecimal id){
        return (Invoice) super.findById(Invoice.class, id);
    }

    public Invoice saveOrUpdate(Invoice h){
        super.saveOrUpdate(h);
        return (Invoice) super.findById(aminParsian.model.Invoice.class, currentSession().getIdentifier(h));
    }

    public Invoice findByInvoiceNO (String invoiceNo) {
        try {
            String s = "select i from Invoice i  where i.state<100 and i.invoiceNo='" + invoiceNo + "'";

            return (Invoice) super.getHibernateTemplate().getSessionFactory().getCurrentSession().createQuery(s).uniqueResult();
        } catch (Throwable e) {
            return null;
        }
    }

    public List<ViewInvoice> searchInvoices (String insured, String policyNo, String date, String invoiceNo, String tarh, String shobe) {

        String sql = "select inv.*, pp.shobe, u.name from invoice inv inner join policyprm pp on inv.policyno = pp.policyno";
        sql += " inner join users u on inv.createuserid=u.id ";

        String whereStr = " where (1=1) and inv.state <100 ";

        if(invoiceNo != null && !invoiceNo.equals("")){
            whereStr += " and invoiceno like '%"+invoiceNo+"%'";
        }
        if(policyNo != null && !policyNo.equals("")){
            whereStr += " and inv.policyNo like '%"+policyNo+"%'";
        }
        if(date != null && !date.equals("")){
            whereStr += " and inv.sarresid = '"+date+"'";
        }
        if(insured != null && !insured.equals("")){
            whereStr += " and pp.bimegozar like '%"+insured+"%'";
        }

        if(shobe != null && !shobe.equals("")){
            whereStr += " and pp.shobe like '%"+shobe+"%'";
        }
        
        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sql+whereStr + " order by inv.invoiceno asc ");
        List<Object[]> result = query.list();

        List<ViewInvoice> viewInvoiceList = new ArrayList<>();
        for(int i=0; i<result.size(); i++) {
            Object[] temp = result.get(i);

            String invoiceno = (String)temp[4];
            String policyno = (String)temp[6];
            String bimeGozar = (String)temp[12];
            String sarresid = (String)temp[10];
            String shenase = (String)temp[11];
            String createDate = (String)temp[1];
            String createUser = (String)temp[14];
            Long prm = ((BigDecimal)temp[9]).longValue();
            Long count =  ((BigDecimal)temp[8]).longValue();
            String shobeh = (String)temp[13];

            ViewInvoice viewInvoice = new ViewInvoice(invoiceno, policyno, bimeGozar, sarresid, shenase, createDate, createUser, prm, count, shobeh);

            viewInvoiceList.add(viewInvoice);
        }

        return viewInvoiceList;
    }

    public List<ViewResid> searchResids (String insured, String policyNo, String date, String invoiceNo, String tarh, String shobe, String shenase, Long isVosoul) {
        String sql = "select * from v_resid ";
        String whereStr = " where (1=1) ";

        if(invoiceNo != null && !invoiceNo.equals("")){
            whereStr += " and invoiceno like '%"+invoiceNo+"%'";
        }
        if(policyNo != null && !policyNo.equals("")){
            whereStr += " and policyNo like '%"+policyNo+"%'";
        }
        if(date != null && !date.equals("")){
            whereStr += " and sarresid = '"+date+"'";
        }
        if(insured != null && !insured.equals("")){
            whereStr += " and bimegozar like '%"+insured+"%'";
        }

        if(shobe != null && !shobe.equals("")){
            whereStr += " and shobe like '%"+shobe+"%'";
        }
        if(shenase != null && !shenase.equals("")){
            whereStr += " and shenase like '%"+shenase+"%'";
        }
        if(isVosoul != null){
            if(isVosoul.intValue() == 2){
                whereStr += " and shenasebank is not null ";
            }
            else if(isVosoul.intValue() == 3){
                whereStr += " and shenasebank is null ";
            }
        }

        Query query = super.getHibernateTemplate().getSessionFactory().getCurrentSession().createSQLQuery(sql+whereStr+" order by invoiceno");

        List<Object[]> result = query.list();

        List<ViewResid> viewResidList = new ArrayList<>();
        for(int i=0; i<result.size(); i++) {
            Object[] temp = result.get(i);

            String policyno = (String)temp[0];
            String bimeGozar = (String)temp[1];
            String shobeh = (String)temp[2];
            String shenaseh = (String)temp[3];
            String invoiceno = (String)temp[4];
            String sarresid = (String)temp[5];
            Long prm = ((BigDecimal)temp[6]).longValue();
            Long count =  ((BigDecimal)temp[7]).longValue();
            Long mablagh = null;
            if(temp[8]!=null)
                mablagh = ((BigDecimal)temp[8]).longValue();

            String shenasehBank = (String)temp[9];
            String vosoulDate = (String)temp[10];
            String createDate = (String)temp[11];
            String createUser = "";
            if(temp[12]!= null){
                createUser = (String)temp[12];
            }

            ViewResid viewResid = new ViewResid(invoiceno, policyno, bimeGozar, shobeh, sarresid, prm, count, mablagh, shenaseh, shenasehBank, vosoulDate, createDate, createUser);

            viewResidList.add(viewResid);
        }

        return viewResidList;
    }

    public Invoice deleteByInvoiceNo (String invoiceNo) {
        Invoice invoice = findByInvoiceNO(invoiceNo);
        invoice.setState(100l);
        return saveOrUpdate(invoice);
    }
}
