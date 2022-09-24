
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chDepositStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chDepositStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLOSE"/>
 *     &lt;enumeration value="OPEN"/>
 *     &lt;enumeration value="NEGATIVE_BLOCK"/>
 *     &lt;enumeration value="POSITIVE_BLOCK"/>
 *     &lt;enumeration value="BLOCK"/>
 *     &lt;enumeration value="RESTING_AND_NEGATIVE_BLOCK"/>
 *     &lt;enumeration value="RESTING_AND_POSITIVE_BLOCK"/>
 *     &lt;enumeration value="RESTING_AND_BLOCK"/>
 *     &lt;enumeration value="RESTING"/>
 *     &lt;enumeration value="OLD"/>
 *     &lt;enumeration value="OPENING"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chDepositStatus")
@XmlEnum
public enum ChDepositStatus {

    CLOSE,
    OPEN,
    NEGATIVE_BLOCK,
    POSITIVE_BLOCK,
    BLOCK,
    RESTING_AND_NEGATIVE_BLOCK,
    RESTING_AND_POSITIVE_BLOCK,
    RESTING_AND_BLOCK,
    RESTING,
    OLD,
    OPENING;

    public String value() {
        return name();
    }

    public static ChDepositStatus fromValue(String v) {
        return valueOf(v);
    }

}
