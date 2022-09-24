
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
@Table(name = "ROLE")
@NamedQueries({
    @NamedQuery(name = "Role.findAll", query = "SELECT r FROM Role r")})
public class Role implements Serializable {

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
    @Column(name = "ROLENAME")
    private String rolename;
    @Column(name = "PERSIANROLENAME")
    private String persianrolename;
    @Column(name = "STATE")
    private Long state;
    @Column(name = "SUBSYSTEMID")
    private BigInteger subsystemid;
    @Column(name = "TYPE")
    private BigInteger type;

    @JoinColumn(name = "CREATEUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    @OneToMany(mappedBy = "role", fetch = FetchType.LAZY)
    private transient Collection<SematRole> sematRoleCollection;

    @JoinColumn(name = "MODULE", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Tab module;

    @JoinColumn(name = "SIDETAB", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Tab sidetab;

    @JoinColumn(name = "Action", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ActionReq action;


    public Role() {
    }

    public Role(BigDecimal id) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

  public String getPersianrolename() {
        return persianrolename;
    }

    public void setPersianrolename(String persianrolename) {
        this.persianrolename = persianrolename;
    }


    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public BigInteger getSubsystemid() {
        return subsystemid;
    }

    public void setSubsystemid(BigInteger subsystemid) {
        this.subsystemid = subsystemid;
    }

    public BigInteger getType() {
        return type;
    }

    public void setType(BigInteger type) {
        this.type = type;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Collection<SematRole> getSematRoleCollection() {
        return sematRoleCollection;
    }

    public void setSematRoleCollection(Collection<SematRole> sematRoleCollection) {
        this.sematRoleCollection = sematRoleCollection;
    }

    public ActionReq getAction() {
        return action;
    }

    public void setAction(ActionReq action) {
        this.action = action;
    }

    public Tab getSidetab() {
        return sidetab;
    }

    public void setSidetab(Tab sidetab) {
        this.sidetab = sidetab;
    }

    public Tab getModule() {
        return module;
    }

    public void setModule(Tab module) {
        this.module = module;
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
        if (!(object instanceof Role)) {
            return false;
        }
        Role other = (Role) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Role[ id=" + id + " ]";
    }
    
}
