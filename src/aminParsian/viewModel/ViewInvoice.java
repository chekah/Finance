package aminParsian.viewModel;

public class ViewInvoice {
    private String invoiceNo;
    private String policyNo;
    private String bimeGozar;
    private String sarresid;
    private String shenase;
    private String createDate;
    private String createUser;
    private Long prm;
    private Long count;
    private String shobe;

    public ViewInvoice (String invoiceNo, String policyNo, String bimeGozar, String sarresid, String shenase, String createDate, String createUser, Long prm, Long count, String shobe) {
        this.invoiceNo = invoiceNo;
        this.policyNo = policyNo;
        this.bimeGozar = bimeGozar;
        this.sarresid = sarresid;
        this.shenase = shenase;
        this.createDate = createDate;
        this.createUser = createUser;
        this.prm = prm;
        this.count = count;
        this.shobe = shobe;
    }

    public String getShobe () {
        return shobe;
    }

    public void setShobe (String shobe) {
        this.shobe = shobe;
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

    public String getSarresid () {
        return sarresid;
    }

    public void setSarresid (String sarresid) {
        this.sarresid = sarresid;
    }

    public String getShenase () {
        return shenase;
    }

    public void setShenase (String shenase) {
        this.shenase = shenase;
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
}
