
package aminParsian.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.*;


@Entity
@Table(name = "PERSON")
@NamedQueries({
    @NamedQuery(name = "Person.findAll", query = "SELECT p FROM Person p")})
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @SequenceGenerator(name="ID", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Basic(optional = false)
    @Column(name = "ID" , unique = true, nullable = false)
    private BigDecimal id;
    @Column(name = "BIRTHCITYID")
    private Long birthcityid;
    @Column(name = "CREATEDATE")
    private String createdate;
    @Column(name = "LASTUSE")
    private String lastUse;
    @Column(name = "CREATETIME")
    private String createtime;
    @Column(name = "DEGREE")
    private Long degree;
    @Column(name = "FAMILY")
    private String family;
    @Column(name = "FATHERNAME")
    private String fathername;
    @Column(name = "GENDER")
    private Long gender;
    @Column(name = "GREGORIANBIRTHDATE")
    private String gregorianbirthdate;
    @Column(name = "IDNO")
    private String idno;
    @Column(name = "JOBID")
    private Long jobid;
    @Column(name = "LATINNAME")
    private String latinname;
    @Column(name = "NAME")
    private String name;
    @Column(name = "NATIONALID")
    private String nationalid;
    @Column(name = "NATIONALITY")
    private Long nationality;
    @Column(name = "PERSIANBIRTHDATE")
    private Long persianbirthdate;
    @Column(name = "SHEBA")
    private String sheba;
//    @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)

    @JoinColumn(name = "CREATEUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    @Column(name = "state")
    private Long state;
   /* @Transient
    private transient Long age;
*/
   @OneToMany(mappedBy = "person", fetch = FetchType.LAZY)
   @Fetch(FetchMode.SUBSELECT)
   private Collection<InsuredPerson> insuredPerson;

    @Transient
    private String fullName;

    public String getFullName() {
        return name+" "+ family+" "+nationalid;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Person() {
    }

    public Collection<InsuredPerson> getInsuredPerson() {
        return insuredPerson;
    }

    public void setInsuredPerson(Collection<InsuredPerson> insuredPerson) {
        this.insuredPerson = insuredPerson;
    }

    public String getLastUse() {
        return lastUse;
    }

    public void setLastUse(String lastUse) {
        this.lastUse = lastUse;
    }

    public Person(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Long getBirthcityid() {
        return birthcityid;
    }

    public void setBirthcityid(Long birthcityid) {
        this.birthcityid = birthcityid;
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

    public Long getDegree() {
        return degree;
    }

    public void setDegree(Long degree) {
        this.degree = degree;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        fathername = fathername.replaceAll("ي","ی");
        fathername = fathername.replaceAll("ك","ک");
        this.fathername = fathername;
    }

    public Long getGender() {
        return gender;
    }

    public void setGender(Long gender) {
        this.gender = gender;
    }

    public String getGregorianbirthdate() {
        return gregorianbirthdate;
    }

    public void setGregorianbirthdate(String gregorianbirthdate) {
        this.gregorianbirthdate = gregorianbirthdate;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public Long getJobid() {
        return jobid;
    }

    public void setJobid(Long jobid) {
        this.jobid = jobid;
    }

    public String getLatinname() {
        return latinname;
    }

    public void setLatinname(String latinname) {
        latinname = latinname.replaceAll("ي","ی");
        latinname = latinname.replaceAll("ك","ک");
        this.latinname = latinname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name.replaceAll("ي","ی");
        name = name.replaceAll("ك","ک");
        this.name = name;
    }

    public String getNationalid() {
        return nationalid;
    }

    public void setNationalid(String nationalid) {
        this.nationalid = nationalid;
    }

    public Long getNationality() {
        return nationality;
    }

    public void setNationality(Long nationality) {
        this.nationality = nationality;
    }

    public Long getPersianbirthdate() {
        return persianbirthdate;
    }

    public void setPersianbirthdate(Long persianbirthdate) {
        this.persianbirthdate = persianbirthdate;
    }

    public String getSheba() {
        return sheba;
    }

    public void setSheba(String sheba) {
        this.sheba = sheba;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
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
        if (!(object instanceof Person)) {
            return false;
        }
        Person other = (Person) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Person[ id=" + id + " ]";
    }
    
}
