package aminParsian.model;

import aminParsian.util.Constants;
import aminParsian.util.DateUtil;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="SanadArticle")
@NamedQueries({
        @NamedQuery(name="SanadArticle.findAll", query = "select sa from SanadArticle sa where sa.state<100")
}
)
public class SanadArticle implements Serializable, Comparator, Comparable{
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

    @JoinColumn(name="bedehiID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PolicyCredebit bedehi;

    @JoinColumn(name="etebarID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private PolicyCredebit etebar;

    @Column(name="Amount")
    private Long amount;

    public SanadArticle () {
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

    public aminParsian.model.PolicyCredebit getBedehi () {
        return bedehi;
    }

    public void setBedehi (aminParsian.model.PolicyCredebit bedehi) {
        this.bedehi = bedehi;
    }

    public aminParsian.model.PolicyCredebit getEtebar () {
        return etebar;
    }

    public void setEtebar (aminParsian.model.PolicyCredebit etebar) {
        this.etebar = etebar;
    }

    public Long getAmount () {
        return amount;
    }

    public void setAmount (Long amount) {
        this.amount = amount;
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
