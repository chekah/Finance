package aminParsian.model;

import aminParsian.DAO.ListCredebitBankDAO;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name = "LISTCREDEBITBANKLOG")
@NamedQueries({
        @NamedQuery(name = "ListCredebitBankLog.findAll", query = "SELECT c FROM ListCredebitBank c")})
/**
 * Created by ach on 1/20/2019.
 */
public class ListCredebitBankLog implements Serializable{
    private static final long serialVersionUID = 1L;

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

    @JoinColumn(name = "CREATEUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "STATE")
    private Long state;

    @JoinColumn(name = "ENTRYUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users entryuser;

    @Column(name = "ENTRYDATE")
    private Long entrydate;

    @Column(name = "ENTRYTIME")
    private String entrytime;


    @Column(name = "PARDAKHTDATE")
    private Long pardakhtdate;


    @Column(name = "SANAMCREDEBITID")
    private String sanamcredebitid;


    @Column(name = "ERSALDATE")
    private String ErsalDate;

    @Column(name = "ERSALTIME")
    private String ErsalTime;

    @JoinColumn(name = "UNIQUECODE", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Credebit uniqueCode;

    @JoinColumn(name = "listCredebitBankId", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private ListCredebitBank listCredebitBank;


    public ListCredebitBankLog(){  }


    public ListCredebitBankLog(ListCredebitBank listCredebitBank){

        this.setCreatedate(listCredebitBank.getCreatedate());
        this.setCreatetime(listCredebitBank.getCreatetime());
        this.setUsers(listCredebitBank.getUsers());
        this.setDescription(listCredebitBank.getDescription());
        this.setEntrydate(listCredebitBank.getEntrydate());
        this.setEntrytime(listCredebitBank.getEntrytime());
        this.setEntryuser(listCredebitBank.getEntryuser());
        this.setPardakhtdate(listCredebitBank.getPardakhtdate());
        this.setSanamcredebitid(listCredebitBank.getSanamcredebitid());
        this.setState(listCredebitBank.getState());
        this.setUniqueCode(listCredebitBank.getUniqueCode());
        this.setListCredebitBank(listCredebitBank);
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

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
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

    public Users getEntryuser() {
        return entryuser;
    }

    public void setEntryuser(Users entryuser) {
        this.entryuser = entryuser;
    }

    public Long getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Long entrydate) {
        this.entrydate = entrydate;
    }

    public String getEntrytime() {
        return entrytime;
    }

    public void setEntrytime(String entrytime) {
        this.entrytime = entrytime;
    }

    public String getSanamcredebitid() {
        return sanamcredebitid;
    }

    public void setSanamcredebitid(String sanamcredebitid) {
        this.sanamcredebitid = sanamcredebitid;
    }


    public Long getPardakhtdate() {
        return pardakhtdate;
    }

    public void setPardakhtdate(Long pardakhtdate) {
        this.pardakhtdate = pardakhtdate;
    }

    public Credebit getUniqueCode() {
        return uniqueCode;
    }

    public void setUniqueCode(Credebit uniqueCode) {
        this.uniqueCode = uniqueCode;
    }


    public String getErsalDate() {
        return ErsalDate;
    }

    public void setErsalDate(String ersalDate) {
        ErsalDate = ersalDate;
    }

    public String getErsalTime() {
        return ErsalTime;
    }

    public void setErsalTime(String ersalTime) {
        ErsalTime = ersalTime;
    }

    public ListCredebitBank getListCredebitBank() {
        return listCredebitBank;
    }

    public void setListCredebitBank(ListCredebitBank listCredebitBank) {
        this.listCredebitBank = listCredebitBank;
    }

    @Override
    public String toString() {return "ListCredebitBank{" + "id=" + id +  ", uniqueCode=" + uniqueCode + '}';}

}
