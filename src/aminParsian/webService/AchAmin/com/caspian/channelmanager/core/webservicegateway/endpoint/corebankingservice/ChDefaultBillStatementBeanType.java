
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chDefaultBillStatementBeanType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chDefaultBillStatementBeanType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FROM_LAST_VIEW_BILL_DATE"/>
 *     &lt;enumeration value="LAST_N_DAY"/>
 *     &lt;enumeration value="LAST_N_COUNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chDefaultBillStatementBeanType")
@XmlEnum
public enum ChDefaultBillStatementBeanType {

    FROM_LAST_VIEW_BILL_DATE,
    LAST_N_DAY,
    LAST_N_COUNT;

    public String value() {
        return name();
    }

    public static ChDefaultBillStatementBeanType fromValue(String v) {
        return valueOf(v);
    }

}
