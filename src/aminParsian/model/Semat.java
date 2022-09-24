/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aminParsian.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Set;
import javax.persistence.*;


@Entity
@Table(name = "SEMAT")
@NamedQueries({
    @NamedQuery(name = "Semat.findAll", query = "SELECT s FROM Semat s")})
public class Semat implements Serializable {

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
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LATINNAME")
    private String latinname;
    @Column(name = "PERSIANNAME")
    private String persianname;
    @Column(name = "STATE")
    private Long state;
    @Column(name = "SYSTEM")
    private Long system;

    @JoinColumn(name = "CREATEUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "SematRole", joinColumns = {@JoinColumn(name = "sematid", referencedColumnName = "id")}, inverseJoinColumns = {@JoinColumn(name = "roleid", referencedColumnName = "id")})
    @Fetch(FetchMode.SUBSELECT)
    private Set<Role> roles;

    public Semat() {
    }

    public Semat(BigDecimal id) {
        this.id = id;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public Long getSystem() {
        return system;
    }

    public void setSystem(Long system) {
        this.system = system;
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
        if (!(object instanceof Semat)) {
            return false;
        }
        Semat other = (Semat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Semat[ id=" + id + " ]";
    }
    
}
