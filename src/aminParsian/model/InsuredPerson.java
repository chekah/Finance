/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aminParsian.model;

import org.hibernate.Hibernate;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import aminParsian.util.DateUtil;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;


@Entity
@Table(name = "INSUREDPERSON")
@NamedQueries({
    @NamedQuery(name = "Insuredperson.findAll", query = "SELECT i FROM InsuredPerson i")})
public class InsuredPerson implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @SequenceGenerator(name="ID", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="ID")
    @Basic(optional = false)
    @Column(name = "ID" , unique = true, nullable = false)
    private BigDecimal id;
    @Column(name = "CARDTYPE")
    private Long cardtype;
    @Column(name = "CREATEDATE")
    private String createdate;
    @Column(name = "CREATETIME")
    private String createtime;
    @Column(name = "EMPLOYMENTDATE")
    private Long employmentdate;
    @Column(name = "FAMILYRELATION")
    private Long familyrelation;
    @Column(name = "PERSONELID")
    private String personelid;
    @Column(name = "STATE")
    private Long state;
    @Column(name = "CASEID")
    private Long caseid;
    @Column(name = "FAMILYRELATIONID")
    private Long familyrelationid;


    @JoinColumn(name = "CREATEUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;
    @JoinColumn(name = "POLICYID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Policy policy;
    @JoinColumn(name = "PERSONID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Person person;

    @OneToMany(mappedBy = "insuredPerson", fetch = FetchType.LAZY)
    private transient Collection<InsuredPerson> insuredPersonCollection;
    @JoinColumn(name = "INSUREDPERSONID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private InsuredPerson insuredPerson;//use for endorse
    @OneToMany(mappedBy = "insuredPerson1", fetch = FetchType.LAZY)
    private transient Collection<InsuredPerson> insuredPersonCollection1;
    @JoinColumn(name = "MAINPERSONID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private InsuredPerson mainInsuredPerson;//sarparast

    @Column(name = "COVERTYPE")
    private Integer coverType;




    @OneToMany(mappedBy = "insuredPerson", fetch = FetchType.LAZY)
    @Fetch(FetchMode.SUBSELECT)
    private Collection<Account> accounts;



    @Column(name = "FILEID1")
    private  String file1 ;

    @Column(name = "FILEID2")
    private String file2;

    @Column(name = "FILEID3")
    private String file3;

    @Column(name = "DESCRIPTION")
    private String description;


    @JoinColumn(name = "LASTEDITUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users lastEditUserID;

    @Column(name = "LASTEDITDATE")
    private String lastEditDate;

    @Column(name = "LASTEDITTIME")
    private String lastEditTime;

    @Column(name = "ACTION")
    private String action;

    @Column(name = "IP")
    private String ip;




    @Transient
    private Account account;




    public InsuredPerson() {
    }

    public InsuredPerson(InsuredPerson ip) {
        this.cardtype = ip.getCardtype();
        this.createdate = ip.getCreatedate();
        this.createtime = ip.getCreatetime();
        this.employmentdate = ip.getEmploymentdate();
        this.familyrelation = ip.getFamilyrelation();
        this.personelid = ip.getPersonelid();
        this.state = ip.getState();
        this.caseid = ip.getCaseid();
        this.familyrelationid = ip.getFamilyrelationid();
       this.users = ip.getUsers();
        this.policy = ip.getPolicy();
        this.person = ip.getPerson();
        this.insuredPerson = ip.getInsuredPerson();
        this.mainInsuredPerson = ip.getMainInsuredPerson();
        this.coverType = ip.getCoverType();
        this.description = ip.getDescription();


        Hibernate.initialize(this.getPolicy());
        Hibernate.initialize(this.getPerson());
        Hibernate.initialize(this.getInsuredPerson());
        Hibernate.initialize(this.getMainInsuredPerson());


    }

    public InsuredPerson(BigDecimal id) {
        this.id = id;
    }



    public InsuredPerson(InsuredPerson ip, Policy policy) {
        this.cardtype = ip.getCardtype();
        this.employmentdate = ip.getEmploymentdate();
        this.familyrelation = ip.getFamilyrelation();
        this.personelid = ip.getPersonelid();
        this.person = ip.getPerson();
        this.coverType = ip.getCoverType();
        this.policy = policy;
    }

    public InsuredPerson(Long cardtype, String createdate, String createtime, Long employmentdate, Long familyrelation, String personelid, Long state, Long caseid, Long familyrelationid, Users users, Policy policy, Person person,InsuredPerson insuredPerson, InsuredPerson mainInsuredPerson, Integer coverType) {
        this.cardtype = cardtype;
        this.createdate = createdate;
        this.createtime = createtime;
        this.employmentdate = employmentdate;
        this.familyrelation = familyrelation;
        this.personelid = personelid;
        this.state = state;
        this.caseid = caseid;
        this.familyrelationid = familyrelationid;
        this.users = users;
        this.policy = policy;
        this.person = person;
        this.insuredPerson = insuredPerson;
        this.mainInsuredPerson = mainInsuredPerson;
        this.coverType = coverType;
    }




    public Collection<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Collection<Account> accounts) {
        this.accounts = accounts;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Long getCardtype() {
        return cardtype;
    }

    public void setCardtype(Long cardtype) {
        this.cardtype = cardtype;
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

    public Long getEmploymentdate() {
        return employmentdate;
    }

    public void setEmploymentdate(Long employmentdate) {
        this.employmentdate = employmentdate;
    }

    public Long getFamilyrelation() {
        return familyrelation;
    }

    public void setFamilyrelation(Long familyrelation) {
        this.familyrelation = familyrelation;
    }

    public String getPersonelid() {
        return personelid;
    }

    public void setPersonelid(String personelid) {
        this.personelid = personelid;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }


    public Long getCaseid() {
        return caseid;
    }

    public void setCaseid(Long caseid) {
        this.caseid = caseid;
    }

    public Long getFamilyrelationid() {
        return familyrelationid;
    }

    public void setFamilyrelationid(Long familyrelationid) {
        this.familyrelationid = familyrelationid;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }



    public Collection<InsuredPerson> getInsuredPersonCollection() {
        return insuredPersonCollection;
    }

    public void setInsuredPersonCollection(Collection<InsuredPerson> insuredPersonCollection) {
        this.insuredPersonCollection = insuredPersonCollection;
    }

    public InsuredPerson getInsuredPerson() {
        return insuredPerson;
    }

    public void setInsuredPerson(InsuredPerson insuredPerson) {
        this.insuredPerson = insuredPerson;
    }

    public Collection<InsuredPerson> getInsuredPersonCollection1() {
        return insuredPersonCollection1;
    }

    public void setInsuredPersonCollection1(Collection<InsuredPerson> insuredPersonCollection1) {
        this.insuredPersonCollection1 = insuredPersonCollection1;
    }

    public InsuredPerson getMainInsuredPerson() {
        return mainInsuredPerson;
    }

        public void setMainInsuredPerson(InsuredPerson mainInsuredPerson) {
        this.mainInsuredPerson = mainInsuredPerson;
    }


    public Integer getCoverType() {
        return coverType;
    }

    public void setCoverType(Integer coverType) {
        this.coverType = coverType;
    }


    public String getFile1() {
        return file1;
    }

    public void setFile1(String file1) {
        this.file1 = file1;
    }

    public String getFile2() {
        return file2;
    }

    public void setFile2(String file2) {
        this.file2 = file2;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getFile3() {
        return file3;
    }

    public void setFile3(String file3) {
        this.file3 = file3;
    }

    public Users getLastEditUserID() {
        return lastEditUserID;
    }

    public void setLastEditUserID(Users lastEditUserID) {
        this.lastEditUserID = lastEditUserID;
    }

    public String getLastEditDate() {
        return lastEditDate;
    }

    public void setLastEditDate(String lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public String getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(String lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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
        if (!(object instanceof InsuredPerson)) {
            return false;
        }
        InsuredPerson other = (InsuredPerson) object;
        if ((this.person.getNationalid() == null && other.person.getNationalid() != null) || (this.person.getNationalid() != null && !this.person.getNationalid().equals(other.person.getNationalid()))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Insuredperson[ id=" + id + " ]";
    }
    
}
