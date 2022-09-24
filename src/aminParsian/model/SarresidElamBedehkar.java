package aminParsian.model;

import aminParsian.util.Constants;
import aminParsian.util.DateUtil;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name="SarresidElamBedehkar")
@NamedQueries({
        @NamedQuery(name="SarresidElamBedehkar.findAll", query = "select se from SarresidElamBedehkar se ")
}
)
public class SarresidElamBedehkar implements Serializable, Comparator, Comparable{
    private static final long serialVersionUID = 1L;




    @Column(name = "BIMEGOZAR")
    private String bimeGozar;

    @Column(name = "BIMENAME")
    private String bimename;

    @Id
    @Column(name = "CODERAYANE")
    private Long codeRayane;

    @Column(name = "CODERAYANEELAMBEDEHKAR")
    private Long codeRayaneElambedehkar;

    @Column(name = "CODERAYANEGHARARDAD")
    private Long codeRayaneGharardad;

    @Column(name = "CODERAYANESODOOR")
    private Long codeRayaneSodoor;

    @Column(name = "CREATEDATE")
    private String createdate;

    @JoinColumn(name = "CREATEUSERID", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Users users;

    @Column(name = "INVOICEID")
    private Long invoiceID;

    @Column(name = "MABLAGH")
    private Long mablagh;

    @Column(name = "MABLAGHMANDE")
    private Long mablaghMande;

    @Column(name = "RADIF")
    private Long radif;

    @Column(name = "RESHTE")
    private String reshte;

    @Column(name = "SARRESIDDATE")
    private String sarresidDate;

    @Column(name = "SHENASEBANK")
    private String shenaseBank;

    @Column(name = "SHOMAREBIMENAME")
    private String shomareBimename;

    @Column(name = "STATE")
    private Long state;

    @Column(name = "VAHEDESODOOR")
    private String vahedesodoor;

    @Column(name = "VAZIATELAMIEBEDEHKAR")
    private String vaziatElamieBedehkar;

    public SarresidElamBedehkar () {
    }

    public SarresidElamBedehkar (String bimeGozar, String bimename, Long codeRayane, Long codeRayaneElambedehkar, Long codeRayaneGharardad, Long codeRayaneSodoor, Long invoiceID, Long mablagh, Long mablaghMande, Long radif, String reshte, String sarresidDate, String shenaseBank, String shomareBimename, Long state, String vahedesodoor, String vaziatElamieBedehkar, String createdate, aminParsian.model.Users users) {
        this.bimeGozar = bimeGozar;
        this.bimename = bimename;
        this.codeRayane = codeRayane;
        this.codeRayaneElambedehkar = codeRayaneElambedehkar;
        this.codeRayaneGharardad = codeRayaneGharardad;
        this.codeRayaneSodoor = codeRayaneSodoor;
        this.invoiceID = invoiceID;
        this.mablagh = mablagh;
        this.mablaghMande = mablaghMande;
        this.radif = radif;
        this.reshte = reshte;
        this.sarresidDate = sarresidDate;
        this.shenaseBank = shenaseBank;
        this.shomareBimename = shomareBimename;
        this.state = state;
        this.vahedesodoor = vahedesodoor;
        this.vaziatElamieBedehkar = vaziatElamieBedehkar;
        this.createdate = createdate;
        this.users = users;
    }

    public static long getSerialVersionUID () {
        return serialVersionUID;
    }

    public String getBimeGozar () {
        return bimeGozar;
    }

    public void setBimeGozar (String bimeGozar) {
        this.bimeGozar = bimeGozar;
    }

    public String getBimename () {
        return bimename;
    }

    public void setBimename (String bimename) {
        this.bimename = bimename;
    }

    public Long getCodeRayane () {
        return codeRayane;
    }

    public void setCodeRayane (Long codeRayane) {
        this.codeRayane = codeRayane;
    }

    public Long getCodeRayaneElambedehkar () {
        return codeRayaneElambedehkar;
    }

    public void setCodeRayaneElambedehkar (Long codeRayaneElambedehkar) {
        this.codeRayaneElambedehkar = codeRayaneElambedehkar;
    }

    public Long getCodeRayaneGharardad () {
        return codeRayaneGharardad;
    }

    public void setCodeRayaneGharardad (Long codeRayaneGharardad) {
        this.codeRayaneGharardad = codeRayaneGharardad;
    }

    public Long getCodeRayaneSodoor () {
        return codeRayaneSodoor;
    }

    public void setCodeRayaneSodoor (Long codeRayaneSodoor) {
        this.codeRayaneSodoor = codeRayaneSodoor;
    }

    public String getCreatedate () {
        return createdate;
    }

    public void setCreatedate (String createdate) {
        this.createdate = createdate;
    }

    public aminParsian.model.Users getUsers () {
        return users;
    }

    public void setUsers (aminParsian.model.Users users) {
        this.users = users;
    }

    public Long getInvoiceID () {
        return invoiceID;
    }

    public void setInvoiceID (Long invoiceID) {
        this.invoiceID = invoiceID;
    }

    public Long getMablagh () {
        return mablagh;
    }

    public void setMablagh (Long mablagh) {
        this.mablagh = mablagh;
    }

    public Long getMablaghMande () {
        return mablaghMande;
    }

    public void setMablaghMande (Long mablaghMande) {
        this.mablaghMande = mablaghMande;
    }

    public Long getRadif () {
        return radif;
    }

    public void setRadif (Long radif) {
        this.radif = radif;
    }

    public String getReshte () {
        return reshte;
    }

    public void setReshte (String reshte) {
        this.reshte = reshte;
    }

    public String getSarresidDate () {
        return sarresidDate;
    }

    public void setSarresidDate (String sarresidDate) {
        this.sarresidDate = sarresidDate;
    }

    public String getShenaseBank () {
        return shenaseBank;
    }

    public void setShenaseBank (String shenaseBank) {
        this.shenaseBank = shenaseBank;
    }

    public String getShomareBimename () {
        return shomareBimename;
    }

    public void setShomareBimename (String shomareBimename) {
        this.shomareBimename = shomareBimename;
    }

    public Long getState () {
        return state;
    }

    public void setState (Long state) {
        this.state = state;
    }

    public String getVahedesodoor () {
        return vahedesodoor;
    }

    public void setVahedesodoor (String vahedesodoor) {
        this.vahedesodoor = vahedesodoor;
    }

    public String getVaziatElamieBedehkar () {
        return vaziatElamieBedehkar;
    }

    public void setVaziatElamieBedehkar (String vaziatElamieBedehkar) {
        this.vaziatElamieBedehkar = vaziatElamieBedehkar;
    }

    @Override
    public int compareTo (Object o) {
        return 0;
    }

    @Override
    public int compare (Object o1, Object o2) {
        return 0;
    }
}
