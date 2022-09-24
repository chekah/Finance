package aminParsian.viewModel;

import java.io.Serializable;

public class ViewInvoiceLetter implements Serializable {
    private String policyno;
    private String sarresid;
    private Long mablaghElhaghie;
    private Long mablaghKol;
    private Long mablaghBimename;
    private String shenasebank;
    private String title;
    private String matnname;

    public ViewInvoiceLetter (String policyno, String sarresid, Long mablaghElhaghie, Long mablaghKol, Long mablaghBimename, String shenasebank, String title, String matnname) {
        this.policyno = policyno;
        this.sarresid = sarresid;
        this.mablaghElhaghie = mablaghElhaghie;
        this.mablaghKol = mablaghKol;
        this.mablaghBimename = mablaghBimename;
        this.shenasebank = shenasebank;
        this.title = title;
        this.matnname = matnname;
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

    public Long getMablaghKol () {
        return mablaghKol;
    }

    public void setMablaghKol (Long mablaghKol) {
        this.mablaghKol = mablaghKol;
    }

    public Long getMablaghBimename () {
        return mablaghBimename;
    }

    public void setMablaghBimename (Long mablaghBimename) {
        this.mablaghBimename = mablaghBimename;
    }

    public String getShenasebank () {
        return shenasebank;
    }

    public void setShenasebank (String shenasebank) {
        this.shenasebank = shenasebank;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getMatnname () {
        return matnname;
    }

    public void setMatnname (String matnname) {
        this.matnname = matnname;
    }
}
