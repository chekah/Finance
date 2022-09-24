package aminParsian.viewModel;

public class ViewResid {
    private String title;
    private String invoiceNo;
    private String policyNo;
    private String bimeGozar;
    private String shobe;
    private String sarresid;
    private String sarresidStr;
    private Long prm;
    private Long count;
    private Long mablagh;
    private String shenase;
    private String shenaseBank;
    private String vosoulDate;
    private String createDate;
    private String createUser;

    public ViewResid (String invoiceNo, String policyNo, String bimeGozar, String shobe, String sarresid, Long prm, Long count, Long mablagh, String shenase, String shenaseBank, String vosoulDate, String createDate, String createUser) {
        this.invoiceNo = invoiceNo;
        this.policyNo = policyNo;
        this.bimeGozar = bimeGozar;
        this.shobe = shobe;
        this.sarresid = sarresid;
        this.prm = prm;
        this.count = count;
        this.mablagh = mablagh;
        this.shenase = shenase;
        this.shenaseBank = shenaseBank;
        this.vosoulDate = vosoulDate;
        this.createDate = createDate;
        this.createUser = createUser;
    }

    public String getTitle () {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public String getSarresidStr () {
        return sarresidStr;
    }

    public void setSarresidStr (String sarresidStr) {
        this.sarresidStr = sarresidStr;
    }

    public String getInvoiceNo () {
        return invoiceNo;
    }

    public void setInvoiceNo (String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public String getPolicyNo () {
        return policyNo;
    }

    public void setPolicyNo (String policyNo) {
        this.policyNo = policyNo;
    }

    public String getBimeGozar () {
        return bimeGozar;
    }

    public void setBimeGozar (String bimeGozar) {
        this.bimeGozar = bimeGozar;
    }

    public String getShobe () {
        return shobe;
    }

    public void setShobe (String shobe) {
        this.shobe = shobe;
    }

    public String getSarresid () {
        return sarresid;
    }

    public void setSarresid (String sarresid) {
        this.sarresid = sarresid;
    }

    public Long getPrm () {
        return prm;
    }

    public void setPrm (Long prm) {
        this.prm = prm;
    }

    public Long getCount () {
        return count;
    }

    public void setCount (Long count) {
        this.count = count;
    }

    public Long getMablagh () {
        return mablagh;
    }

    public void setMablagh (Long mablagh) {
        this.mablagh = mablagh;
    }

    public String getShenase () {
        return shenase;
    }

    public void setShenase (String shenase) {
        this.shenase = shenase;
    }

    public String getShenaseBank () {
        return shenaseBank;
    }

    public void setShenaseBank (String shenaseBank) {
        this.shenaseBank = shenaseBank;
    }

    public String getVosoulDate () {
        return vosoulDate;
    }

    public void setVosoulDate (String vosoulDate) {
        this.vosoulDate = vosoulDate;
    }

    public String getCreateDate () {
        return createDate;
    }

    public void setCreateDate (String createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser () {
        return createUser;
    }

    public void setCreateUser (String createUser) {
        this.createUser = createUser;
    }
}
