
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for servicesCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="servicesCode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CARD_TRANSFER"/>
 *     &lt;enumeration value="NORMAL_TRANSFER"/>
 *     &lt;enumeration value="ACH_NORMAL_TRANSFER"/>
 *     &lt;enumeration value="RTGS_NORMAL_TRANSFER"/>
 *     &lt;enumeration value="GET_STATEMENT"/>
 *     &lt;enumeration value="GET_DEPOSITS"/>
 *     &lt;enumeration value="BILL_PAYMENT_BY_ACCOUNT"/>
 *     &lt;enumeration value="ADD_PERIOD_PERSONS"/>
 *     &lt;enumeration value="OFFLINE_STATEMENT_REQUEST"/>
 *     &lt;enumeration value="OFFLINE_STATEMENT_REQUEST_WITH_PAYMENT_ID"/>
 *     &lt;enumeration value="STATEMENT_WITH_REFERENCE_CODE_REPORT"/>
 *     &lt;enumeration value="REFERENCE_CODE_STATEMENT_BY_CHEQUE"/>
 *     &lt;enumeration value="TRANSFER_CHEQUE_LIST"/>
 *     &lt;enumeration value="PAY_BILL_BY_ACCOUNT"/>
 *     &lt;enumeration value="PERIOD_LIST"/>
 *     &lt;enumeration value="LOAD_PERIOD_PERSONS"/>
 *     &lt;enumeration value="BATCH_BILL_PAYMENT_BY_ACCOUNT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "servicesCode")
@XmlEnum
public enum ServicesCode {

    CARD_TRANSFER,
    NORMAL_TRANSFER,
    ACH_NORMAL_TRANSFER,
    RTGS_NORMAL_TRANSFER,
    GET_STATEMENT,
    GET_DEPOSITS,
    BILL_PAYMENT_BY_ACCOUNT,
    ADD_PERIOD_PERSONS,
    OFFLINE_STATEMENT_REQUEST,
    OFFLINE_STATEMENT_REQUEST_WITH_PAYMENT_ID,
    STATEMENT_WITH_REFERENCE_CODE_REPORT,
    REFERENCE_CODE_STATEMENT_BY_CHEQUE,
    TRANSFER_CHEQUE_LIST,
    PAY_BILL_BY_ACCOUNT,
    PERIOD_LIST,
    LOAD_PERIOD_PERSONS,
    BATCH_BILL_PAYMENT_BY_ACCOUNT;

    public String value() {
        return name();
    }

    public static ServicesCode fromValue(String v) {
        return valueOf(v);
    }

}
