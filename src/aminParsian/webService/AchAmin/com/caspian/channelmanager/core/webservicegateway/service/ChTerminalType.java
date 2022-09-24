
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chTerminalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chTerminalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MOBILE"/>
 *     &lt;enumeration value="VRU"/>
 *     &lt;enumeration value="INTERNET"/>
 *     &lt;enumeration value="PIN_PAD"/>
 *     &lt;enumeration value="KIOSK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chTerminalType")
@XmlEnum
public enum ChTerminalType {

    MOBILE,
    VRU,
    INTERNET,
    PIN_PAD,
    KIOSK;

    public String value() {
        return name();
    }

    public static ChTerminalType fromValue(String v) {
        return valueOf(v);
    }

}
