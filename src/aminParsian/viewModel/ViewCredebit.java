package aminParsian.viewModel;

import aminParsian.model.CredebitState;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created by a-naderi on 7/25/2017.
 */
public class ViewCredebit {

    private BigDecimal credebitID;
    private String policyNo;
    private String orgName;
    private String nationalID;
    private String personName;
    private String invoiceNo;
    private BigInteger mablagh;
    private String state;
    private String entryDate;
    private String entryTime;
    private String elamBeMaliDate;
    private String receptionDate;
    private String secretariatDate;
    private String entryUser;
    private String sheba;
    private String sanamCredebitId;
    private String cs2CreateDate;
    private String cs3CreateDate;
    ArrayList<ViewCredebitState> credebitStateArrayList;
    private String pardakhtdate;

    private String fileType;

//---------------------------------------------------------------------------------------------------------------------------------------------------


    public String getPardakhtdate() {
        return pardakhtdate;
    }

    public void setPardakhtdate(String pardakhtdate) {
        this.pardakhtdate = pardakhtdate;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getCs2CreateDate() {
        return cs2CreateDate;
    }

    public void setCs2CreateDate(String cs2CreateDate) {
        this.cs2CreateDate = cs2CreateDate;
    }

    public String getCs3CreateDate() {
        return cs3CreateDate;
    }

    public void setCs3CreateDate(String cs3CreateDate) {
        this.cs3CreateDate = cs3CreateDate;
    }

    public String getSanamCredebitId() {
        return sanamCredebitId;
    }

    public void setSanamCredebitId(String sanamCredebitId) {
        this.sanamCredebitId = sanamCredebitId;
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

    public ArrayList<ViewCredebitState> getCredebitStateArrayList() {
        return credebitStateArrayList;
    }

    public void setCredebitStateArrayList(ArrayList<ViewCredebitState> credebitStateArrayList) {
        this.credebitStateArrayList = credebitStateArrayList;

    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getNationalID() {
        return nationalID;
    }

    public void setNationalID(String nationalID) {
        this.nationalID = nationalID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public BigInteger getMablagh() {
        return mablagh;
    }

    public void setMablagh(BigInteger mablagh) {
        this.mablagh = mablagh;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(String entryDate) {
        this.entryDate = entryDate;
    }

    public String getEntryUser() {
        return entryUser;
    }

    public void setEntryUser(String entryUser) {
        this.entryUser = entryUser;
    }

    public BigDecimal getCredebitID() {
        return credebitID;
    }

    public void setCredebitID(BigDecimal credebitID) {
        this.credebitID = credebitID;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(String entryTime) {
        this.entryTime = entryTime;
    }

    //    ---------------------------------------------------------------------------------------------------------------------------------------------------

    public ViewCredebit(){

    }

    public ViewCredebit(String policyNo, String orgName, String nationalID, String personName, String invoiceNo, BigInteger mablagh, String state, String entryDate,
                        String entryUser, BigDecimal credebitID, String elamBeMaliDate, String receptionDate, String secretariatDate, String sheba) {
        this.policyNo = policyNo;
        this.orgName = orgName;
        this.nationalID = nationalID;
        this.personName = personName;
        this.invoiceNo = invoiceNo;
        this.mablagh = mablagh;
        this.state = state;
        this.entryDate = entryDate;
        this.entryUser = entryUser;
        this.credebitID=credebitID;
        this.elamBeMaliDate=elamBeMaliDate;
        this.receptionDate=receptionDate;
        this.secretariatDate=secretariatDate;
        this.sheba=sheba;
    }
}
