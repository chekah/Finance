/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aminParsian.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.*;


@Entity
@Table(name = "SEMATROLE")
@NamedQueries({
    @NamedQuery(name = "Sematrole.findAll", query = "SELECT s FROM SematRole s")})
public class SematRole implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name="ID", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="ID")
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "BEGINDATE")
    private Long begindate;
    @Column(name = "CREATEDATE")
    private String createdate;
    @Column(name = "CREATETIME")
    private String createtime;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "ENDDATE")
    private Long enddate;
    @Column(name = "STATE")
    private BigInteger state;
    @JoinColumn(name = "CREATEUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;
    @JoinColumn(name = "SEMATID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Semat semat;
    @JoinColumn(name = "ROLEID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Role role;

    public SematRole() {
    }

    public SematRole(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Long getBegindate() {
        return begindate;
    }

    public void setBegindate(Long begindate) {
        this.begindate = begindate;
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

    public Long getEnddate() {
        return enddate;
    }

    public void setEnddate(Long enddate) {
        this.enddate = enddate;
    }

    public BigInteger getState() {
        return state;
    }

    public void setState(BigInteger state) {
        this.state = state;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Semat getSemat() {
        return semat;
    }

    public void setSemat(Semat semat) {
        this.semat = semat;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
        if (!(object instanceof SematRole)) {
            return false;
        }
        SematRole other = (SematRole) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Sematrole[ id=" + id + " ]";
    }
    
}
