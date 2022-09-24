package aminParsian.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by asadi on 5/22/2020.
 */

@Entity
@Table(name = "ReceptionExcelNotExistIP")
@NamedQueries({
        @NamedQuery(name = "ReceptionExcelNotExistIP.findAll", query = "SELECT re  FROM ReceptionExcelNotExistIP  re")})
public class ReceptionExcelNotExistIP  implements Serializable {

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

    @Column(name = "STATE")
    private Long state;

    @Column(name = "DESCRIPTION")
    private String description;

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

    @Column(name = "NATIONALASLI")
    private String nationalIDAsli;

    @Column(name = "NATIONALID")
    private String nationalID;


    @Column(name = "PERSONELID")
    private String personelID;

    @Column(name = "NAMEBIMESHODE")
    private String nameBimeShode;

    @Column(name = "NAMEBIMESHODEASLI")
    private String nameBimeShodeAsli;

    @JoinColumn(name = "POLICYID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Policy policy;


    @Column(name = "KARSHENASPARVANDE")
    private String karshenasParvande;

    @Column(name = "NOETAHVILMADAREK")
    private String noeTahvilMadarek;


    @Column(name = "EXCEL")
    private byte[] excel;

    @Column(name = "VAHEDESODOUR")
    private String vahedeSodour;

    @Column(name = "VAHEDEMOAREF")
    private String vahedeMoaref;

    @Column(name = "NAMEKARSHENAS")
    private String nameKarshenas;

    @Column(name = "NAMEMARKAZDARMANI")
    private String nameMarkazDarmani;

    @Column(name = "GROUHKARIBIMEGOZAR")
    private String grouhKariBimeGozar;

    @Column(name = "VAHEDSAZMANI")
    private String vahedeSazmani;

    @Column(name = "BIMEGOZAR")
    private String bimeGozar;

    @Column(name = "VAHEDEPARDAKHT")
    private String vahedePardakhti;

    @Column(name = "NOEHAVALE")
    private String noeHavale;

    @Column(name = "SERIALMOAREFINAME")
    private String serialMoarefiName;

    @Column(name = "PARDAKHTAZMAHAL")
    private String pardakhtAzMahal;

    @Column(name = "TASVIESHODE")
    private String tasvieShode;

    @Column(name = "NOETARH")
    private String noeTarh;

    @Column(name = "NOEBIMARI")
    private String noeBimari;

    @Column(name = "TARIKHBIMARI")
    private Long tarikhBimari;

    @Column(name = "TARIKHELAMKHESARAT")
    private Long tarikhElamKhesarat;

    @Column(name = "SHOMAREBAYGANI")
    private Long shomareBaygani;

    @Column(name = "SHOMAREPARVANDE")
    private Long shomareParvande;

    @Column(name = "CODETARH")
    private Long codeTarh;

    @Column(name = "TARIKHHAVALE")
    private Long tarikhHavale;

    @Column(name = "RADIF")
    private Long radif;

    @Column(name = "POLICYNO")
    private Long policyNo;

    @Column(name = "CODEBIMESHODE")
    private Long codeBimeShode;

    @Column(name = "CODEKARSHENAS")
    private Long codeKarshenas;

    @Column(name = "BIMARESTANI")
    private Long bimarestani;

    @Column(name = "MALIAT")
    private Long maliat;

    @Column(name = "SHOMAREHAVALE")
    private Long shomareHavale;

    @Column(name = "FRANSHIZ")
    private BigInteger franshiz;

    @Column(name = "HAZINEBIMARESTANIELAMI")
    private BigInteger hazineBimarestaniElami;

    @Column(name = "HAZINEBIMARESTANIPARDAKHTI")
    private BigInteger hazineBimarestaniPardakhti;

    @Column(name = "HAZINEPARAPARDAKHTI")
    private BigInteger hazineParaPardakhti;

    @Column(name = "HAZINEPARAELAMI")
    private BigInteger hazineParaElami;

    @Column(name = "NAMETARH")
    private String nameTarh;

    @Column(name="INVOICEEXCELID")
    private BigInteger invoiceExcelID;

    @Column(name = "VAZEIATPARVANDE")
    private String vazeiatParvande;

    @Column(name = "KARBARSABTEPARVANDE")
    private String karbarSabteParvande;

    @Column(name = "GRUHEBIMARI")
    private String gruheBimari;

    @Column(name = "CODERAYANEMOREDKHESARAT")
    private BigDecimal codeRayaneMoredKhesarat;

    @Column(name = "MABLGHMOTABEGHTAREFE")
    private BigInteger mablaghMotabeghTarefe;

    @Column(name = "SHEBA")
    private String sheba;

    private transient String stateStr;


    public BigInteger getInvoiceExcelID() {
        return invoiceExcelID;
    }

    public void setInvoiceExcelID(BigInteger invoiceExcelID) {
        this.invoiceExcelID = invoiceExcelID;
    }

    public ReceptionExcelNotExistIP() {
    }
//*************************************************************
    public String getSheba() {
        return sheba;
    }

    public void setSheba(String sheba) {
        this.sheba = sheba;
    }

    public String getVazeiatParvande() {
        return vazeiatParvande;
    }

    public void setVazeiatParvande(String vazeiatParvande) {
        this.vazeiatParvande = vazeiatParvande;
    }

    public String getKarbarSabteParvande() {
        return karbarSabteParvande;
    }

    public void setKarbarSabteParvande(String karbarSabteParvande) {
        this.karbarSabteParvande = karbarSabteParvande;
    }

    public String getGruheBimari() {
        return gruheBimari;
    }

    public void setGruheBimari(String gruheBimari) {
        this.gruheBimari = gruheBimari;
    }


    public BigDecimal getCodeRayaneMoredKhesarat() {
        return codeRayaneMoredKhesarat;
    }

    public void setCodeRayaneMoredKhesarat(BigDecimal codeRayaneMoredKhesarat) {
        this.codeRayaneMoredKhesarat = codeRayaneMoredKhesarat;
    }

    public BigInteger getMablaghMotabeghTarefe() {
        return mablaghMotabeghTarefe;
    }

    public void setMablaghMotabeghTarefe(BigInteger mablaghMotabeghTarefe) {
        this.mablaghMotabeghTarefe = mablaghMotabeghTarefe;
    }

    public String getNameTarh() {
        return nameTarh;
    }

    public void setNameTarh(String nameTarh) {
        this.nameTarh = nameTarh;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getPersonelID() {
        return personelID;
    }

    public void setPersonelID(String personelID) {
        this.personelID = personelID;
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


    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public String getKarshenasParvande() {
        return karshenasParvande;
    }

    public void setKarshenasParvande(String karshenasParvande) {
        this.karshenasParvande = karshenasParvande;
    }

    public String getNoeTahvilMadarek() {
        return noeTahvilMadarek;
    }

    public void setNoeTahvilMadarek(String noeTahvilMadarek) {
        this.noeTahvilMadarek = noeTahvilMadarek;
    }

    public byte[] getExcel() {
        return excel;
    }

    public void setExcel(byte[] excel) {
        this.excel = excel;
    }

    public String getVahedeSodour() {
        return vahedeSodour;
    }

    public void setVahedeSodour(String vahedeSodour) {
        this.vahedeSodour = vahedeSodour;
    }

    public String getVahedeMoaref() {
        return vahedeMoaref;
    }

    public void setVahedeMoaref(String vahedeMoaref) {
        this.vahedeMoaref = vahedeMoaref;
    }

    public String getNameKarshenas() {
        return nameKarshenas;
    }

    public void setNameKarshenas(String nameKarshenas) {
        this.nameKarshenas = nameKarshenas;
    }

    public String getNameMarkazDarmani() {
        return nameMarkazDarmani;
    }

    public void setNameMarkazDarmani(String nameMarkazDarmani) {
        this.nameMarkazDarmani = nameMarkazDarmani;
    }

    public String getGrouhKariBimeGozar() {
        return grouhKariBimeGozar;
    }

    public void setGrouhKariBimeGozar(String grouhKariBimeGozar) {
        this.grouhKariBimeGozar = grouhKariBimeGozar;
    }

    public String getVahedeSazmani() {
        return vahedeSazmani;
    }

    public void setVahedeSazmani(String vahedeSazmani) {
        this.vahedeSazmani = vahedeSazmani;
    }

    public String getBimeGozar() {
        return bimeGozar;
    }

    public void setBimeGozar(String bimeGozar) {
        this.bimeGozar = bimeGozar;
    }

    public String getVahedePardakhti() {
        return vahedePardakhti;
    }

    public void setVahedePardakhti(String vahedePardakhti) {
        this.vahedePardakhti = vahedePardakhti;
    }

    public String getNoeHavale() {
        return noeHavale;
    }

    public void setNoeHavale(String noeHavale) {
        this.noeHavale = noeHavale;
    }

    public String getSerialMoarefiName() {
        return serialMoarefiName;
    }

    public void setSerialMoarefiName(String serialMoarefiName) {
        this.serialMoarefiName = serialMoarefiName;
    }

    public String getPardakhtAzMahal() {
        return pardakhtAzMahal;
    }

    public void setPardakhtAzMahal(String pardakhtAzMahal) {
        this.pardakhtAzMahal = pardakhtAzMahal;
    }

    public String getTasvieShode() {
        return tasvieShode;
    }

    public void setTasvieShode(String tasvieShode) {
        this.tasvieShode = tasvieShode;
    }

    public String getNoeTarh() {
        return noeTarh;
    }

    public void setNoeTarh(String noeTarh) {
        this.noeTarh = noeTarh;
    }

    public String getNoeBimari() {
        return noeBimari;
    }

    public void setNoeBimari(String noeBimari) {
        this.noeBimari = noeBimari;
    }

    public Long getTarikhBimari() {
        return tarikhBimari;
    }

    public void setTarikhBimari(Long tarikhBimari) {
        this.tarikhBimari = tarikhBimari;
    }

    public Long getTarikhElamKhesarat() {
        return tarikhElamKhesarat;
    }

    public void setTarikhElamKhesarat(Long tarikhElamKhesarat) {
        this.tarikhElamKhesarat = tarikhElamKhesarat;
    }

    public Long getShomareBaygani() {
        return shomareBaygani;
    }

    public void setShomareBaygani(Long shomareBaygani) {
        this.shomareBaygani = shomareBaygani;
    }

    public Long getShomareParvande() {
        return shomareParvande;
    }

    public void setShomareParvande(Long shomareParvande) {
        this.shomareParvande = shomareParvande;
    }

    public Long getCodeTarh() {
        return codeTarh;
    }

    public void setCodeTarh(Long codeTarh) {
        this.codeTarh = codeTarh;
    }

    public Long getTarikhHavale() {
        return tarikhHavale;
    }

    public void setTarikhHavale(Long tarikhHavale) {
        this.tarikhHavale = tarikhHavale;
    }

    public Long getRadif() {
        return radif;
    }

    public void setRadif(Long radif) {
        this.radif = radif;
    }

    public Long getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(Long policyNo) {
        this.policyNo = policyNo;
    }

    public Long getCodeBimeShode() {
        return codeBimeShode;
    }

    public void setCodeBimeShode(Long codeBimeShode) {
        this.codeBimeShode = codeBimeShode;
    }

    public Long getCodeKarshenas() {
        return codeKarshenas;
    }

    public void setCodeKarshenas(Long codeKarshenas) {
        this.codeKarshenas = codeKarshenas;
    }

    public Long getBimarestani() {
        return bimarestani;
    }

    public void setBimarestani(Long bimarestani) {
        this.bimarestani = bimarestani;
    }

    public Long getMaliat() {
        return maliat;
    }

    public void setMaliat(Long maliat) {
        this.maliat = maliat;
    }

    public Long getShomareHavale() {
        return shomareHavale;
    }

    public void setShomareHavale(Long shomareHavale) {
        this.shomareHavale = shomareHavale;
    }

    public BigInteger getFranshiz() {
        return franshiz;
    }

    public void setFranshiz(BigInteger franshiz) {
        this.franshiz = franshiz;
    }

    public BigInteger getHazineBimarestaniElami() {
        return hazineBimarestaniElami;
    }

    public void setHazineBimarestaniElami(BigInteger hazineBimarestaniElami) {
        this.hazineBimarestaniElami = hazineBimarestaniElami;
    }

    public BigInteger getHazineBimarestaniPardakhti() {
        return hazineBimarestaniPardakhti;
    }

    public void setHazineBimarestaniPardakhti(BigInteger hazineBimarestaniPardakhti) {
        this.hazineBimarestaniPardakhti = hazineBimarestaniPardakhti;
    }

    public BigInteger getHazineParaPardakhti() {
        return hazineParaPardakhti;
    }

    public void setHazineParaPardakhti(BigInteger hazineParaPardakhti) {
        this.hazineParaPardakhti = hazineParaPardakhti;
    }

    public BigInteger getHazineParaElami() {
        return hazineParaElami;
    }

    public void setHazineParaElami(BigInteger hazineParaElami) {
        this.hazineParaElami = hazineParaElami;
    }

    public String getStateStr() {
        return stateStr;
    }

    public void setStateStr(String stateStr) {
        this.stateStr = stateStr;
    }

    public String getNationalIDAsli() {
        return nationalIDAsli;
    }

    public void setNationalIDAsli(String nationalIDAsli) {
        this.nationalIDAsli = nationalIDAsli;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getNameBimeShode() {
        return nameBimeShode;
    }

    public void setNameBimeShode(String nameBimeShode) {
        this.nameBimeShode = nameBimeShode;
    }

    public String getNameBimeShodeAsli() {
        return nameBimeShodeAsli;
    }

    public void setNameBimeShodeAsli(String nameBimeShodeAsli) {
        this.nameBimeShodeAsli = nameBimeShodeAsli;
    }

//**********************************************************

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReceptionExcelNotExistIP)) {
            return false;
        }
        ReceptionExcelNotExistIP other = (ReceptionExcelNotExistIP) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.ReceptionExcelNotExistIP[ id=" + id + " ]";
    }
}
