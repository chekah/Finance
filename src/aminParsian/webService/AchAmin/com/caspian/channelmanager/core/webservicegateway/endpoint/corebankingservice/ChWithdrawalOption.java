
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chWithdrawalOption.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chWithdrawalOption">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NONE"/>
 *     &lt;enumeration value="MASHRUT"/>
 *     &lt;enumeration value="BE_TANHAYEE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chWithdrawalOption")
@XmlEnum
public enum ChWithdrawalOption {

    NONE,
    MASHRUT,
    BE_TANHAYEE;

    public String value() {
        return name();
    }

    public static ChWithdrawalOption fromValue(String v) {
        return valueOf(v);
    }

}
