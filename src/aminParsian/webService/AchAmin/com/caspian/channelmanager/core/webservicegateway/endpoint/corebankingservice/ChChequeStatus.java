
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chChequeStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chChequeStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="USED"/>
 *     &lt;enumeration value="CASH"/>
 *     &lt;enumeration value="REJECT"/>
 *     &lt;enumeration value="RETURN"/>
 *     &lt;enumeration value="PAY"/>
 *     &lt;enumeration value="HOLD"/>
 *     &lt;enumeration value="INTERBANK_BLOCK"/>
 *     &lt;enumeration value="INVALID"/>
 *     &lt;enumeration value="REGISTER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chChequeStatus")
@XmlEnum
public enum ChChequeStatus {

    USED,
    CASH,
    REJECT,
    RETURN,
    PAY,
    HOLD,
    INTERBANK_BLOCK,
    INVALID,
    REGISTER;

    public String value() {
        return name();
    }

    public static ChChequeStatus fromValue(String v) {
        return valueOf(v);
    }

}
