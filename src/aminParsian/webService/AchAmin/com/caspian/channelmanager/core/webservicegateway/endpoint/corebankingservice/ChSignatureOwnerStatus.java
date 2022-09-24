
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chSignatureOwnerStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chSignatureOwnerStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DEPOSIT_OWNER"/>
 *     &lt;enumeration value="OWNER_OF_DEPOSIT_AND_SIGNATURE"/>
 *     &lt;enumeration value="SIGNATURE_OWNER"/>
 *     &lt;enumeration value="BROKER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chSignatureOwnerStatus")
@XmlEnum
public enum ChSignatureOwnerStatus {

    DEPOSIT_OWNER,
    OWNER_OF_DEPOSIT_AND_SIGNATURE,
    SIGNATURE_OWNER,
    BROKER;

    public String value() {
        return name();
    }

    public static ChSignatureOwnerStatus fromValue(String v) {
        return valueOf(v);
    }

}
