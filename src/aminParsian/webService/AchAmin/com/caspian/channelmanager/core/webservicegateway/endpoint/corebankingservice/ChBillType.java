
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chBillType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chBillType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UNKNOWN"/>
 *     &lt;enumeration value="WATER"/>
 *     &lt;enumeration value="ELECTRICITY"/>
 *     &lt;enumeration value="GAS"/>
 *     &lt;enumeration value="IMMOBILE_PHONE"/>
 *     &lt;enumeration value="MOBILE_PHONE"/>
 *     &lt;enumeration value="MUNICIPALITY_DUE"/>
 *     &lt;enumeration value="CUSTOM"/>
 *     &lt;enumeration value="MUNICIPALITY_7"/>
 *     &lt;enumeration value="TAX"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chBillType")
@XmlEnum
public enum ChBillType {

    UNKNOWN,
    WATER,
    ELECTRICITY,
    GAS,
    IMMOBILE_PHONE,
    MOBILE_PHONE,
    MUNICIPALITY_DUE,
    CUSTOM,
    MUNICIPALITY_7,
    TAX;

    public String value() {
        return name();
    }

    public static ChBillType fromValue(String v) {
        return valueOf(v);
    }

}
