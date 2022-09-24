
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="channelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PERSONAL_INTERNET_BANK"/>
 *     &lt;enumeration value="VALUABLE_CUSTOMER"/>
 *     &lt;enumeration value="TELEPHONE_BANK"/>
 *     &lt;enumeration value="MOBILE_BANK"/>
 *     &lt;enumeration value="OAUTH"/>
 *     &lt;enumeration value="BRANCH"/>
 *     &lt;enumeration value="KIOSK"/>
 *     &lt;enumeration value="SOFTWARE_AGENT"/>
 *     &lt;enumeration value="TI"/>
 *     &lt;enumeration value="BOURSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "channelType")
@XmlEnum
public enum ChannelType {

    PERSONAL_INTERNET_BANK,
    VALUABLE_CUSTOMER,
    TELEPHONE_BANK,
    MOBILE_BANK,
    OAUTH,
    BRANCH,
    KIOSK,
    SOFTWARE_AGENT,
    TI,
    BOURSE;

    public String value() {
        return name();
    }

    public static ChannelType fromValue(String v) {
        return valueOf(v);
    }

}
