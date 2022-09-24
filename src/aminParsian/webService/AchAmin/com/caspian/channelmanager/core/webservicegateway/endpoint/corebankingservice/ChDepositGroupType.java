
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chDepositGroupType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chDepositGroupType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="JARI_ACCOUNT"/>
 *     &lt;enumeration value="SPECIAL_LONG_ACCOUNT"/>
 *     &lt;enumeration value="OTHERS"/>
 *     &lt;enumeration value="EDARE_SHODE"/>
 *     &lt;enumeration value="ANDOKHTE_ACCOUNT"/>
 *     &lt;enumeration value="SPECIAL_SHORT_ACCOUNT"/>
 *     &lt;enumeration value="PASANDAZ"/>
 *     &lt;enumeration value="SHORT_ACCOUNT"/>
 *     &lt;enumeration value="LONG_ACCOUNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chDepositGroupType")
@XmlEnum
public enum ChDepositGroupType {

    JARI_ACCOUNT,
    SPECIAL_LONG_ACCOUNT,
    OTHERS,
    EDARE_SHODE,
    ANDOKHTE_ACCOUNT,
    SPECIAL_SHORT_ACCOUNT,
    PASANDAZ,
    SHORT_ACCOUNT,
    LONG_ACCOUNT;

    public String value() {
        return name();
    }

    public static ChDepositGroupType fromValue(String v) {
        return valueOf(v);
    }

}
