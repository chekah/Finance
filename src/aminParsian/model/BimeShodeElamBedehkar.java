package aminParsian.model;

import java.math.*;
import javax.persistence.*;

@Entity
@Table (name = "BimeShodeElamBedehkar")
@NamedQueries ({
        @NamedQuery (name = "BimeShodeElamBedehkar.findAll", query = "SELECT a FROM BimeShodeElamBedehkar a")})

public class BimeShodeElamBedehkar  implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

   /* @Id
    @Basic (optional = false)
    @Column (name = "ID")
    private BigDecimal id;
*/
    @Column (name = "radif")
    private BigDecimal radif;

    @Column (name = "elatpayan")
    private String elatpayan;

    @Column (name = "begindate")
    private String begindate;

    @Column (name = "name")
    private String name;

    @Column (name = "enddate")
    private String enddate;

    @Id
    @Column (name = "nationalcode")
    private String nationalcode;


    @Column (name = "bimegozar")
    private String bimegozar;

    @Column (name = "nesbat")
    private String nesbat;

    @Column (name = "personelcode")
    private String personelcode;

    @Id
    @Column (name = "policyno")
    private String policyno;

    @Column (name = "prm")
    private Long prm;

    @Column (name = "tarh")
    private String tarh;


    public BimeShodeElamBedehkar () {
    }

    public static long getSerialVersionUID () {
        return serialVersionUID;
    }

/*
    public BigDecimal getId () {
        return id;
    }

    public void setId (BigDecimal id) {
        this.id = id;
    }
*/


    public BigDecimal getRadif () {
        return radif;
    }

    public void setRadif (BigDecimal radif) {
        this.radif = radif;
    }

    public String getElatpayan () {
        return elatpayan;
    }

    public void setElatpayan (String elatpayan) {
        this.elatpayan = elatpayan;
    }

    public String getBegindate () {
        return begindate;
    }

    public void setBegindate (String begindate) {
        this.begindate = begindate;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getEnddate () {
        return enddate;
    }

    public void setEnddate (String enddate) {
        this.enddate = enddate;
    }


    public String getNationalcode () {
        return nationalcode;
    }

    public void setNationalcode (String nationalcode) {
        this.nationalcode = nationalcode;
    }

    public String getBimegozar () {
        return bimegozar;
    }

    public void setBimegozar (String bimegozar) {
        this.bimegozar = bimegozar;
    }

    public String getNesbat () {
        return nesbat;
    }

    public void setNesbat (String nesbat) {
        this.nesbat = nesbat;
    }

    public String getPersonelcode () {
        return personelcode;
    }

    public void setPersonelcode (String personelcode) {
        this.personelcode = personelcode;
    }

    public String getPolicyno () {
        return policyno;
    }

    public void setPolicyno (String policyno) {
        this.policyno = policyno;
    }

    public Long getPrm () {
        return prm;
    }

    public void setPrm (Long prm) {
        this.prm = prm;
    }

    public String getTarh () {
        return tarh;
    }

    public void setTarh (String tarh) {
        this.tarh = tarh;
    }
}
