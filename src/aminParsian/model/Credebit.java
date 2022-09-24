
package aminParsian.model;

//import org.eclipse.jdt.internal.compiler.impl.Constant;
    import aminParsian.util.Constants;
    import aminParsian.util.DateUtil;

    import java.io.Serializable;
    import java.math.BigDecimal;
    import java.math.BigInteger;
    import java.util.Collection;
    import javax.persistence.*;


    @Entity
    @Table(name = "CREDEBIT")
    @NamedQueries({
            @NamedQuery(name = "Credebit.findAll", query = "SELECT c FROM Credebit c")})
    public class Credebit implements Serializable {

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

        @Column(name = "SARRESIDDATE")
        private Long sarresiddate;

        @Column(name = "MOHLAT")
        private Long mohlat;

        @Column(name = "MABLAGH")
        private BigInteger mablagh;

        @JoinColumn(name = "CREDEBITTYPEID", referencedColumnName = "ID")
        @ManyToOne(fetch = FetchType.LAZY)
        private CredebitType credebitType;

        @JoinColumn(name = "ENTRYUSERID", referencedColumnName = "ID")
        @ManyToOne(fetch = FetchType.LAZY)
        private Users entryuser;

        @Column(name = "ENTRYDATE")
        private Long entrydate;

        @Column(name = "ENTRYTIME")
        private String entrytime;

        @Column(name = "SANAMCREDEBITID")
        private String sanamcredebitid;

        @JoinColumn(name = "CONFIRMUSERID", referencedColumnName = "ID")
        @ManyToOne(fetch = FetchType.LAZY)
        private Users confirmuser;

        @Column(name = "CONFIRMDATE")
        private Long confirmdate;

        @Column(name = "CONFIRMTIME")
        private String confirmtime;

        @JoinColumn(name = "CREDEBITID", referencedColumnName = "ID")
        @ManyToOne(fetch = FetchType.LAZY)
        private Credebit credebit;

        @Column(name = "KARMOZD")
        private BigInteger karmozd;

        @Column(name = "HAGHESODOOR")
        private BigInteger haghesodoor;

        @Column(name = "MALIAT")
        private BigInteger maliat;

        @Column(name = "VOSOOLDATE")
        private Long vosooldate;

        @Column(name = "PARDAKHTDATE")
        private Long pardakhtdate;

        @Column(name = "INVOICENO")
        private String invoiceNo;

        @Column(name = "NATIONALID")
        private String nationalID;

        @Column(name = "ORGNAME")
        private String orgNmae;

        @Column(name = "POLICYNO")
        private String policyNo;

        @Column(name = "PERSONNAME")
        private String personName;

        @Column(name = "SHEBA")
        private String sheba;

        @Column(name = "ELAMBEMALIDATE")
        private String elamBeMaliDate;

        @Column(name = "RECEPTIONDATE")
        private String receptionDate;

        @Column(name = "SECRETARIATDATE")
        private String secretariatDate;

        @Column(name="MOBILE")
        private String mobile;

        @Transient
        private String persianstate;

        @Transient
        private String sarresiddateStr;

    public Credebit() {
    }

    public String getSarResidDateFA(){
        if(getSarresiddate()!=null)
            return DateUtil.getStrDate(getSarresiddate());
        return "";
    }

//    ----------------------------------------------------------------------------------------------------------------------


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public CredebitType getCredebitType() {
        return credebitType;
    }

    public void setCredebitType(CredebitType credebitType) {
        this.credebitType = credebitType;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public Long getSarresiddate() {
        return sarresiddate;
    }

    public void setSarresiddate(Long sarresiddate) {
        this.sarresiddate = sarresiddate;
    }

    public Long getMohlat() {
        return mohlat;
    }

    public void setMohlat(Long mohlat) {
        this.mohlat = mohlat;
    }

    public BigInteger getMablagh() {
        return mablagh;
    }

    public void setMablagh(BigInteger mablagh) {
        this.mablagh = mablagh;
    }

    public Users getEntryuser() {
        return entryuser;
    }

    public void setEntryuser(Users entryuser) {
        this.entryuser = entryuser;
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

    public Users getConfirmuser() {
        return confirmuser;
    }

    public void setConfirmuser(Users confirmuser) {
        this.confirmuser = confirmuser;
    }

    public String getConfirmtime() {
        return confirmtime;
    }

    public void setConfirmtime(String confirmtime) {
        this.confirmtime = confirmtime;
    }

    public Credebit getCredebit() {
        return credebit;
    }

    public void setCredebit(Credebit credebit) {
        this.credebit = credebit;
    }

    public Long getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(Long entrydate) {
        this.entrydate = entrydate;
    }

    public Long getConfirmdate() {
        return confirmdate;
    }

    public void setConfirmdate(Long confirmdate) {
        this.confirmdate = confirmdate;
    }

    public BigInteger getKarmozd() {
        return karmozd;
    }

    public void setKarmozd(BigInteger karmozd) {
        this.karmozd = karmozd;
    }

    public BigInteger getHaghesodoor() {
        return haghesodoor;
    }

    public void setHaghesodoor(BigInteger haghesodoor) {
        this.haghesodoor = haghesodoor;
    }

    public BigInteger getMaliat() {
        return maliat;
    }

    public void setMaliat(BigInteger maliat) {
        this.maliat = maliat;
    }

    public Long getVosooldate() {
        return vosooldate;
    }

    public void setVosooldate(Long vosooldate) {
        this.vosooldate = vosooldate;
    }

    public Long getPardakhtdate() {
        return pardakhtdate;
    }

    public void setPardakhtdate(Long pardakhtdate) {
        this.pardakhtdate = pardakhtdate;
    }

    public String getPersianstate() {
        return persianstate;
    }

    public void setPersianstate(String persianstate) {
        this.persianstate = persianstate;
    }

    public String getSarresiddateStr() {
        return sarresiddateStr;
    }

    public void setSarresiddateStr(String sarresiddateStr) {
        this.sarresiddateStr = sarresiddateStr;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getOrgNmae() {
        return orgNmae;
    }

    public void setOrgNmae(String orgNmae) {
        this.orgNmae = orgNmae;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getSheba() {
        return sheba;
    }

    public void setSheba(String sheba) {
        this.sheba = sheba;
    }

    public String getElamBeMaliDate() {
        return elamBeMaliDate;
    }

    public void setElamBeMaliDate(String elamBeMaliDate) {
        this.elamBeMaliDate = elamBeMaliDate;
    }

    public String getReceptionDate() {
        return receptionDate;
    }

    public void setReceptionDate(String receptionDate) {
        this.receptionDate = receptionDate;
    }

    public String getSecretariatDate() {
        return secretariatDate;
    }

    public void setSecretariatDate(String secretariatDate) {
        this.secretariatDate = secretariatDate;
    }


//    ---------------------------------------------------------------------------------------------------------------------------------------------

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Credebit)) {
            return false;
        }
        Credebit other = (Credebit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Credebit[ id=" + id + " ]";
    }

}
