package aminParsian.model;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import aminParsian.util.DateUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


@Entity
@Table(name = "PolicyPrm")
@NamedQueries({
        @NamedQuery(name = "PolicyPrm.findAll", query = "SELECT p FROM PolicyPrm p")})
public class PolicyPrm implements Serializable, Comparator, Comparable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name = "bimeGozar")
    private String bimeGozar;

    @Column(name = "policyno")
    private String policyno;

    @Column(name = "prm")
    private Long  prm;

    @Column(name = "shobe")
    private String shobe;

    public PolicyPrm () {
    }

    public java.math.BigDecimal getId () {
        return id;
    }

    public void setId (java.math.BigDecimal id) {
        this.id = id;
    }

    public String getBimeGozar () {
        return bimeGozar;
    }

    public void setBimeGozar (String bimeGozar) {
        this.bimeGozar = bimeGozar;
    }

    public String getPolicyno () {
        return policyno;
    }

    public void setPolicyno (String policyno) {
        this.policyno = policyno;
    }

    public Long getPrm () {
        return prm;
    }

    public void setPrm (Long prm) {
        this.prm = prm;
    }

    public String getShobe () {
        return shobe;
    }

    public void setShobe (String shobe) {
        this.shobe = shobe;
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