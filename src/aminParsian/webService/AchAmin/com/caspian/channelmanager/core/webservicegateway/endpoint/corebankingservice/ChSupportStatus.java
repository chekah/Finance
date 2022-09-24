
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chSupportStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chSupportStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACCOUNT"/>
 *     &lt;enumeration value="DEPOSIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chSupportStatus")
@XmlEnum
public enum ChSupportStatus {

    ACCOUNT,
    DEPOSIT;

    public String value() {
        return name();
    }

    public static ChSupportStatus fromValue(String v) {
        return valueOf(v);
    }

}
