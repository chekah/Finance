
package aminParsian.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "AGENCY")
@NamedQueries({
    @NamedQuery(name = "Agency.findAll", query = "SELECT a FROM Agency a")})


public class Agency implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "ACTIVEBEGINDATE")
    private Long activebegindate;
    @Column(name = "AGENCYNO")
    private BigInteger agencyno;
    @Column(name = "AGENCYTYPE")
    private Long agencytype;
    @Column(name = "CREATEDATE")
    private String createdate;
    @Column(name = "CREATETIME")
    private String createtime;
    @Column(name = "FOURDIGITCODE")
    private Long fourdigitcode;
    @Column(name = "NAME")
    private String name;
    @Column(name = "STATE")
    private Long state;
    @Column(name = "PARENTID")
    private BigInteger parentid;

    @JoinColumn(name = "CREATEUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    @JoinColumn(name = "PARENTAGENCYID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Agency agency;

    public Agency() {
    }

    public Agency(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Long getActivebegindate() {
        return activebegindate;
    }

    public void setActivebegindate(Long activebegindate) {
        this.activebegindate = activebegindate;
    }

    public BigInteger getAgencyno() {
        return agencyno;
    }

    public void setAgencyno(BigInteger agencyno) {
        this.agencyno = agencyno;
    }

    public Long getAgencytype() {
        return agencytype;
    }

    public void setAgencytype(Long agencytype) {
        this.agencytype = agencytype;
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

    public Long getFourdigitcode() {
        return fourdigitcode;
    }

    public void setFourdigitcode(Long fourdigitcode) {
        this.fourdigitcode = fourdigitcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public BigInteger getParentid() {
        return parentid;
    }

    public void setParentid(BigInteger parentid) {
        this.parentid = parentid;
    }



    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }


    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
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
        if (!(object instanceof Agency)) {
            return false;
        }
        Agency other = (Agency) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Agency[ id=" + id + " ]";
    }
    
}
