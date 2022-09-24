
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chTransactionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chTransactionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="READY_FOR_PROCESS"/>
 *     &lt;enumeration value="SUSPENDED"/>
 *     &lt;enumeration value="CANCELED"/>
 *     &lt;enumeration value="PROCESS_FAIL"/>
 *     &lt;enumeration value="READY_TO_TRANSFER"/>
 *     &lt;enumeration value="TRANSFERRED"/>
 *     &lt;enumeration value="SETTLED"/>
 *     &lt;enumeration value="NOT_SETTLED"/>
 *     &lt;enumeration value="REJECTED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chTransactionStatus")
@XmlEnum
public enum ChTransactionStatus {

    READY_FOR_PROCESS,
    SUSPENDED,
    CANCELED,
    PROCESS_FAIL,
    READY_TO_TRANSFER,
    TRANSFERRED,
    SETTLED,
    NOT_SETTLED,
    REJECTED;

    public String value() {
        return name();
    }

    public static ChTransactionStatus fromValue(String v) {
        return valueOf(v);
    }

}
