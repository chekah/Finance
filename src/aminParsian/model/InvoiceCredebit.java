package aminParsian.model;

import java.math.*;
import javax.persistence.*;

@Entity
@Table(name = "InvoiceCredebit")
@NamedQueries(
        {@NamedQuery(name = "InvoiceCredebit.findAll", query = "select ic from InvoiceCredebit  ic")}
)
public class InvoiceCredebit implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column (name = "id")
    @SequenceGenerator(name="ID", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="ID")
    private BigDecimal id;

    @Column (name = "vosoulDate")
    private String vosoulDate;

//    @Column (name = "time")
//    private String time;

    @Column (name = "shenase")
    private String shenase;

    @Column (name = "shenaseBank")
    private String shenaseBank;

    @Column (name = "mablagh")
    private Long mablagh;

    @Column (name = "invoiceID")
    private BigDecimal invoiceID;

    @Column (name = "createDate")
    private String createDate;

    @Column (name = "createTime")
    private String createTime;

    @JoinColumn(name = "CREATEUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    public InvoiceCredebit () {
    }

    public java.math.BigDecimal getId () {
        return id;
    }

    public void setId (java.math.BigDecimal id) {
        this.id = id;
    }

    public String getVosoulDate () {
        return vosoulDate;
    }

    public void setVosoulDate (String vosoulDate) {
        this.vosoulDate = vosoulDate;
    }

//    public String getTime () {
//        return time;
//    }
//
//    public void setTime (String time) {
//        this.time = time;
//    }

    public String getShenase () {
        return shenase;
    }

    public void setShenase (String shenase) {
        this.shenase = shenase;
    }

    public String getShenaseBank () {
        return shenaseBank;
    }

    public void setShenaseBank (String shenaseBank) {
        this.shenaseBank = shenaseBank;
    }

    public Long getMablagh () {
        return mablagh;
    }

    public void setMablagh (Long mablagh) {
        this.mablagh = mablagh;
    }

    public java.math.BigDecimal getInvoiceID () {
        return invoiceID;
    }

    public void setInvoiceID (java.math.BigDecimal invoiceID) {
        this.invoiceID = invoiceID;
    }

    public String getCreateDate () {
        return createDate;
    }

    public void setCreateDate (String createDate) {
        this.createDate = createDate;
    }

    public String getCreateTime () {
        return createTime;
    }

    public void setCreateTime (String createTime) {
        this.createTime = createTime;
    }

    public aminParsian.model.Users getUsers () {
        return users;
    }

    public void setUsers (aminParsian.model.Users users) {
        this.users = users;
    }
}
