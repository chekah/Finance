
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chSecondPasswordType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chSecondPasswordType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OTP"/>
 *     &lt;enumeration value="TRANSFER_SECOND_PASS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chSecondPasswordType")
@XmlEnum
public enum ChSecondPasswordType {

    OTP,
    TRANSFER_SECOND_PASS;

    public String value() {
        return name();
    }

    public static ChSecondPasswordType fromValue(String v) {
        return valueOf(v);
    }

}
