
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chCardDepositType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chCardDepositType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MAIN"/>
 *     &lt;enumeration value="SECONDARY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chCardDepositType")
@XmlEnum
public enum ChCardDepositType {

    MAIN,
    SECONDARY;

    public String value() {
        return name();
    }

    public static ChCardDepositType fromValue(String v) {
        return valueOf(v);
    }

}
