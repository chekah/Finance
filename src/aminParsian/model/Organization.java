package aminParsian.model;

import javax.persistence.*;
import java.math.*;
import java.io.*;

@javax.persistence.Entity
@javax.persistence.Table(name = "Organization")
@javax.persistence.NamedQueries({
        @javax.persistence.NamedQuery(name="Organization.findAll", query = "select o from Organization o")
})
public class Organization implements Serializable, Comparable, java.util.Comparator {

    @Id
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name="orgName")
    private String orgName;

    @Column(name="nationalCode")
    private String nationalCode;

    @JoinColumn(name="holdingID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Holding holding;

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



    public Organization(){

    }

    public java.math.BigDecimal getId () {
        return id;
    }

    public void setId (java.math.BigDecimal id) {
        this.id = id;
    }

    public String getOrgName () {
        return orgName;
    }

    public void setOrgName (String orgName) {
        this.orgName = orgName;
    }

    public String getNationalCode () {
        return nationalCode;
    }

    public void setNationalCode (String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public Holding getHolding () {
        return holding;
    }

    public void setHolding (Holding holding) {
        this.holding = holding;
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

    @Override
    public int compareTo (Object o) {
        return 0;
    }

    @Override
    public int compare (Object o1, Object o2) {
        return 0;
    }


}
