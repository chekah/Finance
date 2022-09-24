package aminParsian.viewModel;

import aminParsian.model.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Created by asadi on 5/21/2020.
 */
public class ViewReceptionExcel implements Serializable {

    private String createdate;
    private String createtime;
    private Long state;
    private String description;
    private String patientName;
    private String asliFullName;
    private String personelID;
    private String patientNationalID;
    private String asliNationalID;
    private Long policyno;
    private String policyName;
    private String karshenasParvande;
    private String noeTahvilMadarek;
    private String vehedeSodour;
    private String vehedeMoaref;
    private String nameKarshenas;
    private String nameMarkazDarmani;
    private String grouhKariBimeGozar;
    private String vahedeSazmani;
    private String bimeGozar;
    private String vahedePardakhti;
    private String noeHavale;
    private String serialMoarefiName;
    private String pardakhtAzMahal;
    private String tasvieShode;
    private String noeTarh;
    private String noeBimari;
    private String tarikhBimari;
    private String tarikhElamKhesarat;
    private Long shomareBaygani;
    private Long shomareParvande;
    private Long codeTarh;
    private String tarikhHavale;
    private Long radif;
    private Long codeRayaneBimeName;
    private Long codeBimeShode;
    private Long codeKarshenas;
    private Long bimarestani;
    private Long maliat;
    private Long shomareHavale;
    private BigInteger franshiz;
    private BigInteger hazineBimarestaniElami;
    private BigInteger hazineBimarestaniPardakhti;
    private BigInteger hazineParaPardakhti;
    private BigInteger hazineParaElami;
    private ReceptionExcel receptionExcel;
    private ReceptionExcelNotExistIP receptionExcelNotExistIP;
    private BigInteger invoiceExcelID;
    private Policy policy;
    private Person person;
    private InsuredPerson insuredPerson;
    private String vazeiatParvande ;
    private String karbarSabteParvande ;
    private String gruheBimari;
    private BigDecimal codeRayaneMoredKhesarat ;
    private BigInteger mablaghMohasebeSodeMotabeghTarefe ;
    private BigDecimal policyID;
    private BigDecimal receptionExcelNotExistIPID;


    private String stateStr;
    private BigDecimal id;

    private String sheba;


//*************************************************************


    public String getSheba() {
        return sheba;
    }

    public void setSheba(String sheba) {
        this.sheba = sheba;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getReceptionExcelNotExistIPID() {
        return receptionExcelNotExistIPID;
    }

    public void setReceptionExcelNotExistIPID(BigDecimal receptionExcelNotExistIPID) {
        this.receptionExcelNotExistIPID = receptionExcelNotExistIPID;
    }

    public BigDecimal getPolicyID() {
        return policyID;
    }

    public void setPolicyID(BigDecimal policyID) {
        this.policyID = policyID;
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

    public String getVazeiatParvande() {
        return vazeiatParvande;
    }

    public void setVazeiatParvande(String vazeiatParvande) {
        this.vazeiatParvande = vazeiatParvande;
    }

    public BigInteger getMablaghMohasebeSodeMotabeghTarefe() {
        return mablaghMohasebeSodeMotabeghTarefe;
    }

    public void setMablaghMohasebeSodeMotabeghTarefe(BigInteger mablaghMohasebeSodeMotabeghTarefe) {
        this.mablaghMohasebeSodeMotabeghTarefe = mablaghMohasebeSodeMotabeghTarefe;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public InsuredPerson getInsuredPerson() {
        return insuredPerson;
    }

    public void setInsuredPerson(InsuredPerson insuredPerson) {
        this.insuredPerson = insuredPerson;
    }

    public Policy getPolicy() {
        return policy;
    }

    public void setPolicy(Policy policy) {
        this.policy = policy;
    }

    public BigInteger getInvoiceExcelID() {
        return invoiceExcelID;
    }

    public void setInvoiceExcelID(BigInteger invoiceExcelID) {
        this.invoiceExcelID = invoiceExcelID;
    }

    public ReceptionExcelNotExistIP getReceptionExcelNotExistIP() {
        return receptionExcelNotExistIP;
    }

    public void setReceptionExcelNotExistIP(ReceptionExcelNotExistIP receptionExcelNotExistIP) {
        this.receptionExcelNotExistIP = receptionExcelNotExistIP;
    }

    public ReceptionExcel getReceptionExcel() {
        return receptionExcel;
    }

    public void setReceptionExcel(ReceptionExcel receptionExcel) {
        this.receptionExcel = receptionExcel;
    }

    public String getTarikhBimari() {
        return tarikhBimari;
    }

    public String getTarikhElamKhesarat() {
        return tarikhElamKhesarat;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getAsliFullName() {
        return asliFullName;
    }

    public void setAsliFullName(String asliFullName) {
        this.asliFullName = asliFullName;
    }

    public String getPersonelID() {
        return personelID;
    }

    public void setPersonelID(String personelID) {
        this.personelID = personelID;
    }

    public String getPatientNationalID() {
        return patientNationalID;
    }

    public void setPatientNationalID(String patientNationalID) {
        this.patientNationalID = patientNationalID;
    }

    public String getAsliNationalID() {
        return asliNationalID;
    }

    public void setAsliNationalID(String asliNationalID) {
        this.asliNationalID = asliNationalID;
    }

    public Long getPolicyno() {
        return policyno;
    }

    public void setPolicyno(Long policyno) {
        this.policyno = policyno;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public void setTarikhBimari(String tarikhBimari) {
        this.tarikhBimari = tarikhBimari;
    }

    public void setTarikhElamKhesarat(String tarikhElamKhesarat) {
        this.tarikhElamKhesarat = tarikhElamKhesarat;
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


    public String getVehedeSodour() {
        return vehedeSodour;
    }

    public void setVehedeSodour(String vehedeSodour) {
        this.vehedeSodour = vehedeSodour;
    }

    public String getVehedeMoaref() {
        return vehedeMoaref;
    }

    public void setVehedeMoaref(String vehedeMoaref) {
        this.vehedeMoaref = vehedeMoaref;
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

    public String getTarikhHavale() {
        return tarikhHavale;
    }

    public void setTarikhHavale(String tarikhHavale) {
        this.tarikhHavale = tarikhHavale;
    }

    public Long getRadif() {
        return radif;
    }

    public void setRadif(Long radif) {
        this.radif = radif;
    }

    public Long getCodeRayaneBimeName() {
        return codeRayaneBimeName;
    }

    public void setCodeRayaneBimeName(Long codeRayaneBimeName) {
        this.codeRayaneBimeName = codeRayaneBimeName;
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


}


