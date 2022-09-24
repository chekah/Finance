
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chRtgsTransferStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chRtgsTransferStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SABT_SHODE"/>
 *     &lt;enumeration value="TAEED_SHOBE_SHODE"/>
 *     &lt;enumeration value="ADAM_TAEED_SHOBE"/>
 *     &lt;enumeration value="HAZF_SHODE"/>
 *     &lt;enumeration value="TAEED_SHOBE_SATNA"/>
 *     &lt;enumeration value="ADAM_TAEED_SHOBE_SATNA"/>
 *     &lt;enumeration value="ERSAL_SHODE"/>
 *     &lt;enumeration value="TASFIYEH_SHODE"/>
 *     &lt;enumeration value="TASFIYEH_NASHODE"/>
 *     &lt;enumeration value="ENTEZAR_BARAYE_TAEED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chRtgsTransferStatus")
@XmlEnum
public enum ChRtgsTransferStatus {

    SABT_SHODE,
    TAEED_SHOBE_SHODE,
    ADAM_TAEED_SHOBE,
    HAZF_SHODE,
    TAEED_SHOBE_SATNA,
    ADAM_TAEED_SHOBE_SATNA,
    ERSAL_SHODE,
    TASFIYEH_SHODE,
    TASFIYEH_NASHODE,
    ENTEZAR_BARAYE_TAEED;

    public String value() {
        return name();
    }

    public static ChRtgsTransferStatus fromValue(String v) {
        return valueOf(v);
    }

}
