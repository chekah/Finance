package aminParsian.model;


import aminParsian.util.Constants;
import aminParsian.util.DateUtil;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.*;

@Entity
@Table(name = "PolicyCredebit")
@NamedQueries({
        @NamedQuery(name = "PolicyCredebit.findAll", query = "SELECT c FROM PolicyCredebit c")})

public class PolicyCredebit implements Serializable, Comparable, java.util.Comparator {
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

    @Column(name = "SARRESIDDATE")
    private Long sarresiddate;

    @Column(name = "MOHLAT")
    private Long mohlat;

    @Column(name = "MABLAGH")
    private BigInteger mablagh;

    @JoinColumn(name = "CREDEBITTYPEID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private CredebitType credebitType;

    @JoinColumn(name = "ENTRYUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users entryuser;

    @Column(name = "ENTRYDATE")
    private Long entrydate;

    @Column(name = "ENTRYTIME")
    private String entrytime;

    @Column(name = "SANAMCREDEBITID")
    private String sanamcredebitid;

    @JoinColumn(name = "CONFIRMUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users confirmuser;

    @Column(name = "CONFIRMDATE")
    private Long confirmdate;

    @Column(name = "CONFIRMTIME")
    private String confirmtime;

    @Column(name = "VOSOOLDATE")
    private Long vosooldate;

    @JoinColumn(name = "InvoiceID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Invoice invoice;

    @JoinColumn(name="PolicyID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Policy policy;

    public PolicyCredebit () {
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

    public Long getSarresiddate () {
        return sarresiddate;
    }

    public void setSarresiddate (Long sarresiddate) {
        this.sarresiddate = sarresiddate;
    }

    public Long getMohlat () {
        return mohlat;
    }

    public void setMohlat (Long mohlat) {
        this.mohlat = mohlat;
    }

    public java.math.BigInteger getMablagh () {
        return mablagh;
    }

    public void setMablagh (java.math.BigInteger mablagh) {
        this.mablagh = mablagh;
    }

    public aminParsian.model.CredebitType getCredebitType () {
        return credebitType;
    }

    public void setCredebitType (aminParsian.model.CredebitType credebitType) {
        this.credebitType = credebitType;
    }

    public aminParsian.model.Users getEntryuser () {
        return entryuser;
    }

    public void setEntryuser (aminParsian.model.Users entryuser) {
        this.entryuser = entryuser;
    }

    public Long getEntrydate () {
        return entrydate;
    }

    public void setEntrydate (Long entrydate) {
        this.entrydate = entrydate;
    }

    public String getEntrytime () {
        return entrytime;
    }

    public void setEntrytime (String entrytime) {
        this.entrytime = entrytime;
    }

    public String getSanamcredebitid () {
        return sanamcredebitid;
    }

    public void setSanamcredebitid (String sanamcredebitid) {
        this.sanamcredebitid = sanamcredebitid;
    }

    public aminParsian.model.Users getConfirmuser () {
        return confirmuser;
    }

    public void setConfirmuser (aminParsian.model.Users confirmuser) {
        this.confirmuser = confirmuser;
    }

    public Long getConfirmdate () {
        return confirmdate;
    }

    public void setConfirmdate (Long confirmdate) {
        this.confirmdate = confirmdate;
    }

    public String getConfirmtime () {
        return confirmtime;
    }

    public void setConfirmtime (String confirmtime) {
        this.confirmtime = confirmtime;
    }

    public Long getVosooldate () {
        return vosooldate;
    }

    public void setVosooldate (Long vosooldate) {
        this.vosooldate = vosooldate;
    }

    public Invoice getInvoice () {
        return invoice;
    }

    public void setInvoice (Invoice invoice) {
        this.invoice = invoice;
    }

    public aminParsian.model.Policy getPolicy () {
        return policy;
    }

    public void setPolicy (aminParsian.model.Policy policy) {
        this.policy = policy;
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
