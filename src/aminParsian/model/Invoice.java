package aminParsian.model;

import aminParsian.util.Constants;
import aminParsian.util.DateUtil;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import javax.persistence.*;


@Entity
@Table(name = "Invoice")
@NamedQueries({
        @NamedQuery(name = "Invoice.findAll", query = "SELECT i FROM Invoice i")})

public class Invoice implements Serializable, Comparator, Comparable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name="ID", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="ID")
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name = "CREATEDATE")
    private String createdate;

    @Column(name = "CREATETIME")
    private String createtime;

    @JoinColumn(name = "CREATEUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "STATE")
    private Long state;

    @Column(name="invoiceNo")
    private String invoiceNo;

    @Column(name="policyNo")
    private String policyNo;

    @Column(name="prm")
    private Long prm;

    @Column(name="count")
    private Long count;

    @Column(name="shenase")
    private String shenase;

    @Column(name="sarresid")
    private String sarresid;

    @Column(name="BIMEGOZAR")
    private String bimegozar;

    public Invoice () {
    }

    public String getBimegozar () {
        return bimegozar;
    }

    public void setBimegozar (String bimegozar) {
        this.bimegozar = bimegozar;
    }

    public Long getPrm () {
        return prm;
    }

    public void setPrm (Long prm) {
        this.prm = prm;
    }

    public Long getCount () {
        return count;
    }

    public void setCount (Long count) {
        this.count = count;
    }

    public String getShenase () {
        return shenase;
    }

    public void setShenase (String shenase) {
        this.shenase = shenase;
    }

    public String getSarresid () {
        return sarresid;
    }

    public void setSarresid (String sarresid) {
        this.sarresid = sarresid;
    }

    public java.math.BigDecimal getId () {
        return id;
    }

    public void setId (java.math.BigDecimal id) {
        this.id = id;
    }

    public String getCreatedate () {
        return createdate;
    }

    public void setCreatedate (String createdate) {
        this.createdate = createdate;
    }

    public String getCreatetime () {
        return createtime;
    }

    public void setCreatetime (String createtime) {
        this.createtime = createtime;
    }

    public aminParsian.model.Users getUsers () {
        return users;
    }

    public void setUsers (aminParsian.model.Users users) {
        this.users = users;
    }

    public String getDescription () {
        return description;
    }

    public void setDescription (String description) {
        this.description = description;
    }

    public Long getState () {
        return state;
    }

    public void setState (Long state) {
        this.state = state;
    }

    public String getInvoiceNo () {
        return invoiceNo;
    }

    public void setInvoiceNo (String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getPolicyNo () {
        return policyNo;
    }

    public void setPolicyNo (String policyNo) {
        this.policyNo = policyNo;
    }

    @Override
    public int compareTo (Object o) {
        return 0;
    }

    @Override
    public int compare (Object o1, Object o2) {
        return 0;
    }


}
