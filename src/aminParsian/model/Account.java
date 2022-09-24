/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aminParsian.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Table(name = "ACCOUNT")
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a")})
public class Account implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation

//    @SequenceGenerator(name="ID", initialValue=1, allocationSize=1)
//    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="ID")
    @Id
    @SequenceGenerator(name="ID", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="ID")
    @Basic(optional = false)
    private BigDecimal id;
    @Column(name = "ACCOUNTNO")
    private Long accountno;
    @Column(name = "TYPE")
    private Long type;
    @Column(name = "NAME")
    private String name;
    @Column(name = "BEGINDATE")
    private Long begindate;
    @Column(name = "ENDDATE")
    private Long enddate;
    @Column(name = "CREATEDATE")
    private String createdate;
    @Column(name = "CREATETIME")
    private String createtime;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "STATE")
    private Long state;
    @JoinColumn(name = "CREATEUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;
    @JoinColumn(name = "POLICYID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Policy policy;
    @JoinColumn(name = "INSUREDPERSONID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private InsuredPerson insuredPerson;
    @Column(name = "SHEBA")
    private String sheba;

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


    public Account() {
    }


    public Account(Account account) {

        this.accountno = account.getAccountno();
        this.type = account.getType();
        this.name = account.getName();
        this.begindate = account.getBegindate();
        this.enddate = account.getEnddate();
        this.createdate = account.getCreatedate();
        this.createtime = account.getCreatetime();
        this.description = account.getDescription();
        this.state = account.getState();
        this.users = account.getUsers();
        this.policy = account.getPolicy();
        this.insuredPerson = account.getInsuredPerson();
        this.sheba = account.getSheba();


    }

    public Account(BigDecimal id) {
        this.id = id;
    }

    public Account(BigDecimal id, Long accountno) {
        this.id = id;
        this.accountno = accountno;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public Long getAccountno() {
        return accountno;
    }

    public void setAccountno(Long accountno) {
        this.accountno = accountno;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getBegindate() {
        return begindate;
    }

    public void setBegindate(Long begindate) {
        this.begindate = begindate;
    }

    public Long getEnddate() {
        return enddate;
    }

    public void setEnddate(Long enddate) {
        this.enddate = enddate;
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

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public InsuredPerson getInsuredPerson() {
        return insuredPerson;
    }

    public void setInsuredPerson(InsuredPerson insuredPerson) {
        this.insuredPerson = insuredPerson;
    }


    public String getSheba() {
        return sheba;
    }

    public void setSheba(String sheba) {
        this.sheba = sheba;
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
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Account[ id=" + id + " ]";
    }
    
}
