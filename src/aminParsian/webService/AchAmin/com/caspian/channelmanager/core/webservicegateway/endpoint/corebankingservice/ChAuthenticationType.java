
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chAuthenticationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chAuthenticationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STATIC_USERNAME_CHANNEL"/>
 *     &lt;enumeration value="OTP_1"/>
 *     &lt;enumeration value="OTP_2"/>
 *     &lt;enumeration value="OTP_3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chAuthenticationType")
@XmlEnum
public enum ChAuthenticationType {

    STATIC_USERNAME_CHANNEL,
    OTP_1,
    OTP_2,
    OTP_3;

    public String value() {
        return name();
    }

    public static ChAuthenticationType fromValue(String v) {
        return valueOf(v);
    }

}
