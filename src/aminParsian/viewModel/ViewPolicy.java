package aminParsian.viewModel;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by ach on 10/27/2020.
 */
public class ViewPolicy implements Serializable {

    private String policyNo;
    private BigDecimal codeRayaneBimehNameh;
    private String orgName;
    private BigDecimal codeSodour;
    private String beginDate;
    private String endDate;

/////////////////////////////////////////////////////
    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public BigDecimal getCodeRayaneBimehNameh() {
        return codeRayaneBimehNameh;
    }

    public void setCodeRayaneBimehNameh(BigDecimal codeRayaneBimehNameh) {
        this.codeRayaneBimehNameh = codeRayaneBimehNameh;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public BigDecimal getCodeSodour() {
        return codeSodour;
    }

    public void setCodeSodour(BigDecimal codeSodour) {
        this.codeSodour = codeSodour;
    }

    public String getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(String beginDate) {
        this.beginDate = beginDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
