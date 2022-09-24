package aminParsian.model;

/**
 * Created by ach on 10/17/2018.
 */
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.*;


@Entity
@Table(name = "SMSLOG")
@NamedQueries({
        @NamedQuery(name = "SMSLOG.findAll", query = "SELECT a FROM SmsLog a")})


public class SmsLog implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @SequenceGenerator(name="ID", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="ID")
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "INVOICENO")
    private String invoiceNo;
    @Column(name = "STATE")
    private Long state;
    @Column(name = "MOBILE")
    private String mobile;
    @Column(name = "MABLAGH")
    private BigInteger mablagh;
    @Column(name = "PARDAKHTDATE")
    private Long pardakhtdate;
    @Column(name = "CREATEDATE")
    private String createdate;
    @Column(name = "CREATETIME")
    private String createtime;
    @Column(name = "SHEBA")
    private String sheba;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "SMSRESULT")
    private String smsresult;
    @Column(name = "SMSERROR")
    private String smserror;

    @JoinColumn(name = "CREDEBITID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY) //OneToMany ???
    private Credebit credebit;


    public SmsLog() {
    }  //Default Constructor


    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public BigInteger getMablagh() {
        return mablagh;
    }

    public void setMablagh(BigInteger mablagh) {
        this.mablagh = mablagh;
    }

    public Long getPardakhtdate() {
        return pardakhtdate;
    }

    public void setPardakhtdate(Long pardakhtdate) {
        this.pardakhtdate = pardakhtdate;
    }

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate;
    }

    public String getCreatetime() {
        return createtime;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public String getSheba() {
        return sheba;
    }

    public void setSheba(String sheba) {
        this.sheba = sheba;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSmsresult() {
        return smsresult;
    }

    public void setSmsresult(String smsresult) {
        this.smsresult = smsresult;
    }

    public String getSmserror() {
        return smserror;
    }

    public void setSmserror(String smserror) {
        this.smserror = smserror;
    }


    public Credebit getCredebit() {
        return credebit;
    }

    public void setCredebit(Credebit credebit) {
        this.credebit = credebit;
    }




    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SmsLog)) {
            return false;
        }
        SmsLog other = (SmsLog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.SmsLog[ id=" + id + " ]";
    }

}

