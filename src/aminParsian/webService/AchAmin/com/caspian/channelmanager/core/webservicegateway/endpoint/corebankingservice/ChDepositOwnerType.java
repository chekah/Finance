
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chDepositOwnerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chDepositOwnerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MOSHTARAK"/>
 *     &lt;enumeration value="BE_TANHAYI"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chDepositOwnerType")
@XmlEnum
public enum ChDepositOwnerType {

    MOSHTARAK,
    BE_TANHAYI;

    public String value() {
        return name();
    }

    public static ChDepositOwnerType fromValue(String v) {
        return valueOf(v);
    }

}
