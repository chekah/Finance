package aminParsian.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;

/**
 * Created by ach on 10/27/2020.
 */

@Entity
@Table(name = "ReceptionExcelFiles")
@NamedQueries({
        @NamedQuery(name = "ReceptionExcelFiles.findAll", query = "SELECT ref FROM ReceptionExcelFiles ref")})
public class ReceptionExcelFiles implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @SequenceGenerator(name="ID", initialValue=1, allocationSize=1)
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="ID")
    @Basic(optional = false)
    @Column(name = "ID" , unique = true, nullable = false)
    private BigDecimal id;
    @Column(name = "CREATEDATE")
    private String createdate;
    @Column(name = "CREATETIME")
    private String createtime;
    @Column(name = "EXCELFILE")
    private byte[] excelFile;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "STATE")
    private Long state;

    @JoinColumn(name = "CREATEUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

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


    public ReceptionExcelFiles() {
    }
////////////////////////////////////////////////////////////////////////////////////////////////

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getExcelFile() {
        return excelFile;
    }

    public void setExcelFile(byte[] excelFile) {
        this.excelFile = excelFile;
    }

////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReceptionExcelFiles)) {
            return false;
        }
        ReceptionExcelFiles other = (ReceptionExcelFiles) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.ReceptionExcelFiles[ id=" + id + " ]";
    }

}
