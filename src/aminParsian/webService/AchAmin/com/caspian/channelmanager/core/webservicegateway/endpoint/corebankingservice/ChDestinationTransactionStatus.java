
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chDestinationTransactionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chDestinationTransactionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCEPTED"/>
 *     &lt;enumeration value="ERROR_DUPLICATE"/>
 *     &lt;enumeration value="ERROR_GENERAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chDestinationTransactionStatus")
@XmlEnum
public enum ChDestinationTransactionStatus {

    ACCEPTED,
    ERROR_DUPLICATE,
    ERROR_GENERAL;

    public String value() {
        return name();
    }

    public static ChDestinationTransactionStatus fromValue(String v) {
        return valueOf(v);
    }

}
