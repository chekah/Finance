
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chAchTransferStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="chAchTransferStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WAIT_FOR_CUSTOMER_ACCEPT"/>
 *     &lt;enumeration value="WAIT_FOR_BRANCH_ACCEPT"/>
 *     &lt;enumeration value="BRANCH_REJECT"/>
 *     &lt;enumeration value="READY_TO_TRANSFER"/>
 *     &lt;enumeration value="SUSPEND"/>
 *     &lt;enumeration value="CANCEL"/>
 *     &lt;enumeration value="PROCESSED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "chAchTransferStatus")
@XmlEnum
public enum ChAchTransferStatus {

    WAIT_FOR_CUSTOMER_ACCEPT,
    WAIT_FOR_BRANCH_ACCEPT,
    BRANCH_REJECT,
    READY_TO_TRANSFER,
    SUSPEND,
    CANCEL,
    PROCESSED;

    public String value() {
        return name();
    }

    public static ChAchTransferStatus fromValue(String v) {
        return valueOf(v);
    }

}
