
package aminParsian.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "QUERIES")
@NamedQueries({
    @NamedQuery(name = "Queries.findAll", query = "SELECT q FROM Queries q")})
public class Queries implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "COMBONAME")
    private String comboname;
    @Column(name = "CREATEDATE")
    private String createdate;
    @Column(name = "CREATETIME")
    private String createtime;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "QUERYSTR")
    private String querystr;
    @Column(name = "STATE")
    private Long state;
    @JoinColumn(name = "CREATEUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    public Queries() {
    }

    public Queries(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getComboname() {
        return comboname;
    }

    public void setComboname(String comboname) {
        this.comboname = comboname;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuerystr() {
        return querystr;
    }

    public void setQuerystr(String querystr) {
        this.querystr = querystr;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
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
        if (!(object instanceof Queries)) {
            return false;
        }
        Queries other = (Queries) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Queries[ id=" + id + " ]";
    }
    
}
