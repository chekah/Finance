
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chGender.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chGender">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MALE"/>
 *     &lt;enumeration value="FEMALE"/>
 *     &lt;enumeration value="LEGAL"/>
 *     &lt;enumeration value="PUBLIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chGender")
@XmlEnum
public enum ChGender {

    MALE,
    FEMALE,
    LEGAL,
    PUBLIC;

    public String value() {
        return name();
    }

    public static ChGender fromValue(String v) {
        return valueOf(v);
    }

}
