
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chRtgsSystemCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chRtgsSystemCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TAVASOT_KARBAR_SHOBE"/>
 *     &lt;enumeration value="TAVASOT_SHOBE_TAEED_KONANDE"/>
 *     &lt;enumeration value="TAVASOT_KARBAR_SHOBE_SANTA"/>
 *     &lt;enumeration value="TAVASOT_BANKDARI_MODERN"/>
 *     &lt;enumeration value="TAVASOT_FERESTANDE_GIRANDE_SATNA"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chRtgsSystemCode")
@XmlEnum
public enum ChRtgsSystemCode {

    TAVASOT_KARBAR_SHOBE,
    TAVASOT_SHOBE_TAEED_KONANDE,
    TAVASOT_KARBAR_SHOBE_SANTA,
    TAVASOT_BANKDARI_MODERN,
    TAVASOT_FERESTANDE_GIRANDE_SATNA;

    public String value() {
        return name();
    }

    public static ChRtgsSystemCode fromValue(String v) {
        return valueOf(v);
    }

}
