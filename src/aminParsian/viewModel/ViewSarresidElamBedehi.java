package aminParsian.viewModel;

public class ViewSarresidElamBedehi {

    private String policyno;
    private String sarresid;
    private Long mablaghElhaghie;
    private Long mablagh ;
    private Long mablaghBimename ;
    private String shenaseBank;
    private String title;
    private String matn;
    private String date;
    private String letterno;
    private String month;

    public ViewSarresidElamBedehi (String policyno, String sarresid, Long mablaghElhaghie, Long mablagh, Long mablaghBimename, String shenaseBank, String title, String matn) {
        this.policyno = policyno;
        this.sarresid = sarresid;
        this.mablaghElhaghie = mablaghElhaghie;
        this.mablagh = mablagh;
        this.mablaghBimename = mablaghBimename;
        this.shenaseBank = shenaseBank;
        this.title = title;
        this.matn = matn;
    }

    public String getMonth () {
        return month;
    }

    public void setMonth (String month) {
        this.month = month;
    }

    public String getDate () {
        return date;
    }

    public void setDate (String date) {
        this.date = date;
    }

    public String getLetterno () {
        return letterno;
    }

    public void setLetterno (String letterno) {
        this.letterno = letterno;
    }

    public String getPolicyno () {
        return policyno;
    }

    public void setPolicyno (String policyno) {
        this.policyno = policyno;
    }

    public String getSarresid () {
        return sarresid;
    }

    public void setSarresid (String sarresid) {
        this.sarresid = sarresid;
    }

    public Long getMablaghElhaghie () {
        return mablaghElhaghie;
    }

    public void setMablaghElhaghie (Long mablaghElhaghie) {
        this.mablaghElhaghie = mablaghElhaghie;
    }

    public Long getMablagh () {
        return mablagh;
    }

    public void setMablagh (Long mablagh) {
        this.mablagh = mablagh;
    }

    public Long getMablaghBimename () {
        return mablaghBimename;
    }

    public void setMablaghBimename (Long mablaghBimename) {
        this.mablaghBimename = mablaghBimename;
    }

    public String getShenaseBank () {
        return shenaseBank;
    }

    public void setShenaseBank (String shenaseBank) {
        this.shenaseBank = shenaseBank;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getMatn () {
        return matn;
    }

    public void setMatn (String matn) {
        this.matn = matn;
    }
}
