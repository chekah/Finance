
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chDepositOrPan.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chDepositOrPan">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PAN"/>
 *     &lt;enumeration value="DEPOSIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chDepositOrPan")
@XmlEnum
public enum ChDepositOrPan {

    PAN,
    DEPOSIT;

    public String value() {
        return name();
    }

    public static ChDepositOrPan fromValue(String v) {
        return valueOf(v);
    }

}
