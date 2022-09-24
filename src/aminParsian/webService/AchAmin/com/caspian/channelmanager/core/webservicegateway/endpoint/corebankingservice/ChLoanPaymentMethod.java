
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chLoanPaymentMethod.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chLoanPaymentMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AUTO_GET_DEPOSIT"/>
 *     &lt;enumeration value="CUSTOM_DEPOSIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chLoanPaymentMethod")
@XmlEnum
public enum ChLoanPaymentMethod {

    AUTO_GET_DEPOSIT,
    CUSTOM_DEPOSIT;

    public String value() {
        return name();
    }

    public static ChLoanPaymentMethod fromValue(String v) {
        return valueOf(v);
    }

}
