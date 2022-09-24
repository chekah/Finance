package aminParsian.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.*;

@Entity
@Table(name = "USERS")
@NamedQueries({
    @NamedQuery(name = "Users.findAll", query = "SELECT u FROM Users u")})
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
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
    @Column(name = "lastModifiedDATE")
    private String lastModifieddate;
    @Column(name = "lastModifiedTIME")
    private String lastModifiedtime;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LATINNAME")
    private String latinname;
    @Column(name = "NAME")
    private String name;
    @Column(name = "PASSWORD")
    private String password;
    @Column(name = "STATE")
    private Long state;
    @Column(name = "TYPE")
    private Long type;
    @Column(name = "USERNAME")
    private String username;
    @Column(name = "PLACEID")
    private Long placeid;


    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY)
    private transient Collection<Role> roleCollection;

    @JoinColumn(name = "CREATEUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    @JoinColumn(name = "SEMATID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Semat semat;
    @JoinColumn(name = "PERSONID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Person person;
    @JoinColumn(name = "AGENCYID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Agency agency;

    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY)
    private transient Collection<SematRole> sematRoleCollection;

    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY)
    private transient Collection<Semat> sematCollection;


    public Users() {
    }

    public Users(BigDecimal id) {
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

    public String getLatinname() {
        return latinname;
    }

    public void setLatinname(String latinname) {
        this.latinname = latinname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getPlaceid() {
        return placeid;
    }

    public void setPlaceid(Long placeid) {
        this.placeid = placeid;
    }

       public Collection<Role> getRoleCollection() {
        return roleCollection;
    }

    public void setRoleCollection(Collection<Role> roleCollection) {
        this.roleCollection = roleCollection;
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



    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }





    public Collection<SematRole> getSematRoleCollection() {
        return sematRoleCollection;
    }

    public void setSematRoleCollection(Collection<SematRole> sematRoleCollection) {
        this.sematRoleCollection = sematRoleCollection;
    }


    public Collection<Semat> getSematCollection() {
        return sematCollection;
    }

    public void setSematCollection(Collection<Semat> sematCollection) {
        this.sematCollection = sematCollection;
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
        if (!(object instanceof Users)) {
            return false;
        }
        Users other = (Users) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }


    @Override
    public String toString() {
        return "model.Users[ id=" + id + " ]";
    }
    
    public String getLastModifieddate() {
        return lastModifieddate;
    }

    public void setLastModifieddate(String lastModifieddate) {
        this.lastModifieddate = lastModifieddate;
    }

    public String getLastModifiedtime() {
        return lastModifiedtime;
    }

    public void setLastModifiedtime(String lastModifiedtime) {
        this.lastModifiedtime = lastModifiedtime;
    }
}
