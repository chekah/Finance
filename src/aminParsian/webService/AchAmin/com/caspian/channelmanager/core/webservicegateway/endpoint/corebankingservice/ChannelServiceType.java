
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channelServiceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="channelServiceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INTERNET_BANK"/>
 *     &lt;enumeration value="MOBILE_BANK"/>
 *     &lt;enumeration value="TELEPHONE_BANK"/>
 *     &lt;enumeration value="THIRDPARTY"/>
 *     &lt;enumeration value="BOURSE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "channelServiceType")
@XmlEnum
public enum ChannelServiceType {

    INTERNET_BANK,
    MOBILE_BANK,
    TELEPHONE_BANK,
    THIRDPARTY,
    BOURSE;

    public String value() {
        return name();
    }

    public static ChannelServiceType fromValue(String v) {
        return valueOf(v);
    }

}
