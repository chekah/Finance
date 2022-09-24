
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chAchProblemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chAchProblemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_ACCOUNT_EXCEPTION"/>
 *     &lt;enumeration value="PERMISSION_EXCEPTION"/>
 *     &lt;enumeration value="ILLEGAL_SOURCE_DEPOSIT_STATE_EXCEPTION"/>
 *     &lt;enumeration value="INVALID_IBAN_EXCEPTION"/>
 *     &lt;enumeration value="ILLEGAL_DESTINATION_BANK_EXCEPTION"/>
 *     &lt;enumeration value="INCORRECT_CUSTOMER_INFORMATION_EXCEPTION"/>
 *     &lt;enumeration value="SERVICE_EXCEPTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chAchProblemType")
@XmlEnum
public enum ChAchProblemType {

    INVALID_ACCOUNT_EXCEPTION,
    PERMISSION_EXCEPTION,
    ILLEGAL_SOURCE_DEPOSIT_STATE_EXCEPTION,
    INVALID_IBAN_EXCEPTION,
    ILLEGAL_DESTINATION_BANK_EXCEPTION,
    INCORRECT_CUSTOMER_INFORMATION_EXCEPTION,
    SERVICE_EXCEPTION;

    public String value() {
        return name();
    }

    public static ChAchProblemType fromValue(String v) {
        return valueOf(v);
    }

}
