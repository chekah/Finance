
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chStatementSearchDirection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chStatementSearchDirection">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="START_TO_END"/>
 *     &lt;enumeration value="END_TO_START"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chStatementSearchDirection")
@XmlEnum
public enum ChStatementSearchDirection {

    START_TO_END,
    END_TO_START;

    public String value() {
        return name();
    }

    public static ChStatementSearchDirection fromValue(String v) {
        return valueOf(v);
    }

}
