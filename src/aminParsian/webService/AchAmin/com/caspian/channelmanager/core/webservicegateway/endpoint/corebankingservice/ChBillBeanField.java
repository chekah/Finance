
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chBillBeanField.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chBillBeanField">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEPOSIT_NUMBER"/>
 *     &lt;enumeration value="BALANCE"/>
 *     &lt;enumeration value="DOCUMENT_NUMBER"/>
 *     &lt;enumeration value="CHEQUE_NUMBER"/>
 *     &lt;enumeration value="DATE"/>
 *     &lt;enumeration value="NOTE"/>
 *     &lt;enumeration value="DEPOSIT_TITLE"/>
 *     &lt;enumeration value="DEBIT"/>
 *     &lt;enumeration value="CREDIT"/>
 *     &lt;enumeration value="TIME"/>
 *     &lt;enumeration value="AGENTBRANCH"/>
 *     &lt;enumeration value="REFERENCE_NUMBER"/>
 *     &lt;enumeration value="STATEMENT_DESCRIPTION"/>
 *     &lt;enumeration value="BRANCH"/>
 *     &lt;enumeration value="BILL_ROW_ID"/>
 *     &lt;enumeration value="TRANSACTION_CODE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chBillBeanField")
@XmlEnum
public enum ChBillBeanField {

    DEPOSIT_NUMBER,
    BALANCE,
    DOCUMENT_NUMBER,
    CHEQUE_NUMBER,
    DATE,
    NOTE,
    DEPOSIT_TITLE,
    DEBIT,
    CREDIT,
    TIME,
    AGENTBRANCH,
    REFERENCE_NUMBER,
    STATEMENT_DESCRIPTION,
    BRANCH,
    BILL_ROW_ID,
    TRANSACTION_CODE;

    public String value() {
        return name();
    }

    public static ChBillBeanField fromValue(String v) {
        return valueOf(v);
    }

}
