
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chProblemType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chProblemType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INVALID_DEPOSIT_NUMBER"/>
 *     &lt;enumeration value="INVALID_PRICE"/>
 *     &lt;enumeration value="USER_PERMISSION_DENIED"/>
 *     &lt;enumeration value="INVALID_CURRENCY"/>
 *     &lt;enumeration value="INSUFFICIENT_FUNDS"/>
 *     &lt;enumeration value="ILLEGAL_DEPOSIT_STATE"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chProblemType")
@XmlEnum
public enum ChProblemType {

    INVALID_DEPOSIT_NUMBER,
    INVALID_PRICE,
    USER_PERMISSION_DENIED,
    INVALID_CURRENCY,
    INSUFFICIENT_FUNDS,
    ILLEGAL_DEPOSIT_STATE,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ChProblemType fromValue(String v) {
        return valueOf(v);
    }

}
