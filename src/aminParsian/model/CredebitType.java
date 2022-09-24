
package aminParsian.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "CREDEBITTYPE")
@NamedQueries({
        @NamedQuery(name = "Credebittype.findAll", query = "SELECT c FROM CredebitType c")})
public class CredebitType implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;

    @Column(name = "CREATEDATE")
    private String createdate;

    @Column(name = "CREATETIME")
    private String createtime;

    @Column(name = "CREDITORDEBT")
    private Long creditordebt;

    @Column(name = "LATINNAME")
    private String latinname;

    @Column(name = "PERSIANNAME")
    private String persianname;

    @Column(name = "RECIEVEDCONDITION")
    private Long recievedcondition;

    @JoinColumn(name = "CREATEUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    @OneToMany(mappedBy = "credebittype", fetch = FetchType.LAZY)
    private transient Collection<aminParsian.model.Credebit> credebitCollection;

    public CredebitType() {
    }

    public CredebitType(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
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

    public Long getCreditordebt() {
        return creditordebt;
    }

    public void setCreditordebt(Long creditordebt) {
        this.creditordebt = creditordebt;
    }

    public String getLatinname() {
        return latinname;
    }

    public void setLatinname(String latinname) {
        this.latinname = latinname;
    }

    public String getPersianname() {
        return persianname;
    }

    public void setPersianname(String persianname) {
        this.persianname = persianname;
    }

    public Long getRecievedcondition() {
        return recievedcondition;
    }

    public void setRecievedcondition(Long recievedcondition) {
        this.recievedcondition = recievedcondition;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Collection<aminParsian.model.Credebit> getCredebitCollection() {
        return credebitCollection;
    }

    public void setCredebitCollection(Collection<aminParsian.model.Credebit> credebitCollection) {
        this.credebitCollection = credebitCollection;
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
        if (!(object instanceof CredebitType)) {
            return false;
        }
        CredebitType other = (CredebitType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Credebittype[ id=" + id + " ]";
    }

}
