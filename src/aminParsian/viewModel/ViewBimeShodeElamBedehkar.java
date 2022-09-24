package aminParsian.viewModel;

public class ViewBimeShodeElamBedehkar implements Comparable {

    private String policyno;
    private String date;
    private String bimeGozar;
    private String sarresid;

    private String beginDate;
    private String endDate;
    private Long prm;
    private String elatPayan;
    private String name;
    private String nationalCode;
    private String nesbat;
    private String personelCode;
    private String letterNo;
    private Long radif;
    private String tarh;
    private String shenase;
    private String title;
    private Long count;


    public ViewBimeShodeElamBedehkar () {
    }

    public ViewBimeShodeElamBedehkar (String beginDate, String bimeGozar, String endDate, Long prm, String elatPayan, String name, String nationalCode, String nesbat, String personelCode, String policyno, Long radif, String tarh, String sarresid) {
        this.beginDate = beginDate;
        this.bimeGozar = bimeGozar;
        this.endDate = endDate;
        this.prm = prm;
        this.elatPayan = elatPayan;
        this.name = name;
        this.nationalCode = nationalCode;
        this.nesbat = nesbat;
        this.personelCode = personelCode;
        this.policyno = policyno;
        this.radif = radif;
        this.tarh = tarh;
        this.sarresid = sarresid;
    }

    public Long getCount () {
        return count;
    }

    public void setCount (Long count) {
        this.count = count;
    }

    public String getShenase () {
        return shenase;
    }

    public void setShenase (String shenase) {
        this.shenase = shenase;
    }

    public String getLetterNo () {
        return letterNo;
    }

    public void setLetterNo (String letterNo) {
        this.letterNo = letterNo;
    }

    public String getSarresid () {
        return sarresid;
    }

    public void setSarresid (String sarresid) {
        this.sarresid = sarresid;
    }

    public String getDate () {
        return date;
    }

    public void setDate (String date) {
        this.date = date;
    }

    public String getBeginDate () {
        return beginDate;
    }

    public void setBeginDate (String beginDate) {
        this.beginDate = beginDate;
    }

    public String getBimeGozar () {
        return bimeGozar;
    }

    public void setBimeGozar (String bimeGozar) {
        this.bimeGozar = bimeGozar;
    }

    public String getEndDate () {
        return endDate;
    }

    public void setEndDate (String endDate) {
        this.endDate = endDate;
    }

    public Long getPrm () {
        return prm;
    }

    public void setPrm (Long prm) {
        this.prm = prm;
    }

    public String getElatPayan () {
        return elatPayan;
    }

    public void setElatPayan (String elatPayan) {
        this.elatPayan = elatPayan;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getNationalCode () {
        return nationalCode;
    }

    public void setNationalCode (String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getNesbat () {
        return nesbat;
    }

    public void setNesbat (String nesbat) {
        this.nesbat = nesbat;
    }

    public String getPersonelCode () {
        return personelCode;
    }

    public void setPersonelCode (String personelCode) {
        this.personelCode = personelCode;
    }

    public String getPolicyno () {
        return policyno;
    }

    public void setPolicyno (String policyno) {
        this.policyno = policyno;
    }

    public Long getRadif () {
        return radif;
    }

    public void setRadif (Long radif) {
        this.radif = radif;
    }

    public String getTarh () {
        return tarh;
    }

    public void setTarh (String tarh) {
        this.tarh = tarh;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    @Override
    public int compareTo (Object o) {
        ViewBimeShodeElamBedehkar b1 = (ViewBimeShodeElamBedehkar)o;
        return this.getPolicyno().compareTo(b1.getPolicyno());
    }
}
