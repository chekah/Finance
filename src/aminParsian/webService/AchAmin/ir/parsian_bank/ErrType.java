
package aminParsian.webService.AchAmin.ir.parsian_bank;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for errType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="errType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="SrvExceedMaxCountDay"/>
 *     &lt;enumeration value="SrvExceedMaxCountWeek"/>
 *     &lt;enumeration value="SrvExceedMaxCountMonth"/>
 *     &lt;enumeration value="SrvExceedMaxCountYear"/>
 *     &lt;enumeration value="SrvExceedMaxCountTotal"/>
 *     &lt;enumeration value="SrvExceedMinAmntTrnx"/>
 *     &lt;enumeration value="SrvExceedMaxAmntTrnx"/>
 *     &lt;enumeration value="SrvExceedMaxAmntDay"/>
 *     &lt;enumeration value="SrvExceedMaxAmntWeek"/>
 *     &lt;enumeration value="SrvExceedMaxAmntMonth"/>
 *     &lt;enumeration value="SrvExceedMaxAmntYear"/>
 *     &lt;enumeration value="SrvExceedMaxAmntTotal"/>
 *     &lt;enumeration value="AcntSrcExceedMaxCountDay"/>
 *     &lt;enumeration value="AcntSrcExceedMaxCountWeek"/>
 *     &lt;enumeration value="AcntSrcExceedMaxCountMonth"/>
 *     &lt;enumeration value="AcntSrcExceedMaxCountYear"/>
 *     &lt;enumeration value="AcntSrcExceedMaxCountTotal"/>
 *     &lt;enumeration value="AcntSrcExceedMinAmntTrnx"/>
 *     &lt;enumeration value="AcntSrcExceedMaxAmntTrnx"/>
 *     &lt;enumeration value="AcntSrcExceedMaxAmntDay"/>
 *     &lt;enumeration value="AcntSrcExceedMaxAmntWeek"/>
 *     &lt;enumeration value="AcntSrcExceedMaxAmntMonth"/>
 *     &lt;enumeration value="AcntSrcExceedMaxAmntYear"/>
 *     &lt;enumeration value="AcntSrcExceedMaxAmntTotal"/>
 *     &lt;enumeration value="CardSrcExceedMaxCountDay"/>
 *     &lt;enumeration value="CardSrcExceedMaxCountWeek"/>
 *     &lt;enumeration value="CardSrcExceedMaxCountMonth"/>
 *     &lt;enumeration value="CardSrcExceedMaxCountYear"/>
 *     &lt;enumeration value="CardSrcExceedMaxCountTotal"/>
 *     &lt;enumeration value="CardSrcExceedMinAmntTrnx"/>
 *     &lt;enumeration value="CardSrcExceedMaxAmntTrnx"/>
 *     &lt;enumeration value="CardSrcExceedMaxAmntDay"/>
 *     &lt;enumeration value="CardSrcExceedMaxAmntWeek"/>
 *     &lt;enumeration value="CardSrcExceedMaxAmntMonth"/>
 *     &lt;enumeration value="CardSrcExceedMaxAmntYear"/>
 *     &lt;enumeration value="CardSrcExceedMaxAmntTotal"/>
 *     &lt;enumeration value="AcntDstExceedMaxCountDay"/>
 *     &lt;enumeration value="AcntDstExceedMaxCountWeek"/>
 *     &lt;enumeration value="AcntDstExceedMaxCountMonth"/>
 *     &lt;enumeration value="AcntDstExceedMaxCountYear"/>
 *     &lt;enumeration value="AcntDstExceedMaxCountTotal"/>
 *     &lt;enumeration value="AcntDstExceedMinAmntTrnx"/>
 *     &lt;enumeration value="AcntDstExceedMaxAmntTrnx"/>
 *     &lt;enumeration value="AcntDstExceedMaxAmntDay"/>
 *     &lt;enumeration value="AcntDstExceedMaxAmntWeek"/>
 *     &lt;enumeration value="AcntDstExceedMaxAmntMonth"/>
 *     &lt;enumeration value="AcntDstExceedMaxAmntYear"/>
 *     &lt;enumeration value="AcntDstExceedMaxAmntTotal"/>
 *     &lt;enumeration value="CardDstExceedMaxCountDay"/>
 *     &lt;enumeration value="CardDstExceedMaxCountWeek"/>
 *     &lt;enumeration value="CardDstExceedMaxCountMonth"/>
 *     &lt;enumeration value="CardDstExceedMaxCountYear"/>
 *     &lt;enumeration value="CardDstExceedMaxCountTotal"/>
 *     &lt;enumeration value="CardDstExceedMinAmntTrnx"/>
 *     &lt;enumeration value="CardDstExceedMaxAmntTrnx"/>
 *     &lt;enumeration value="CardDstExceedMaxAmntDay"/>
 *     &lt;enumeration value="CardDstExceedMaxAmntWeek"/>
 *     &lt;enumeration value="CardDstExceedMaxAmntMonth"/>
 *     &lt;enumeration value="CardDstExceedMaxAmntYear"/>
 *     &lt;enumeration value="CardDstExceedMaxAmntTotal"/>
 *     &lt;enumeration value="InvalidSrcAcnt"/>
 *     &lt;enumeration value="InvalidDstAcnt"/>
 *     &lt;enumeration value="DatabaseFail"/>
 *     &lt;enumeration value="InvalidAmount"/>
 *     &lt;enumeration value="InvalidSessionId"/>
 *     &lt;enumeration value="InvalidMethodCall"/>
 *     &lt;enumeration value="InvalidPropertyValue"/>
 *     &lt;enumeration value="InvalidSrcCard"/>
 *     &lt;enumeration value="InvalidDstCard"/>
 *     &lt;enumeration value="InvalidCustomerNumber"/>
 *     &lt;enumeration value="InternalException"/>
 *     &lt;enumeration value="ImbalanceException"/>
 *     &lt;enumeration value="AccessDenied"/>
 *     &lt;enumeration value="InvalidLoanNumber"/>
 *     &lt;enumeration value="LoanNumberExceedMaxCountDay"/>
 *     &lt;enumeration value="LoanNumberExceedMaxCountWeek"/>
 *     &lt;enumeration value="LoanNumberExceedMaxCountMonth"/>
 *     &lt;enumeration value="LoanNumberExceedMaxCountYear"/>
 *     &lt;enumeration value="LoanNumberExceedMaxCountTotal"/>
 *     &lt;enumeration value="LoanNumberExceedMinAmntTrnx"/>
 *     &lt;enumeration value="LoanNumberExceedMaxAmntTrnx"/>
 *     &lt;enumeration value="LoanNumberExceedMaxAmntDay"/>
 *     &lt;enumeration value="LoanNumberExceedMaxAmntWeek"/>
 *     &lt;enumeration value="LoanNumberExceedMaxAmntMonth"/>
 *     &lt;enumeration value="LoanNumberExceedMaxAmntYear"/>
 *     &lt;enumeration value="LoanNumberExceedMaxAmntTotal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "errType")
@XmlEnum
public enum ErrType {

    OK("OK"),
    @XmlEnumValue("SrvExceedMaxCountDay")
    SRV_EXCEED_MAX_COUNT_DAY("SrvExceedMaxCountDay"),
    @XmlEnumValue("SrvExceedMaxCountWeek")
    SRV_EXCEED_MAX_COUNT_WEEK("SrvExceedMaxCountWeek"),
    @XmlEnumValue("SrvExceedMaxCountMonth")
    SRV_EXCEED_MAX_COUNT_MONTH("SrvExceedMaxCountMonth"),
    @XmlEnumValue("SrvExceedMaxCountYear")
    SRV_EXCEED_MAX_COUNT_YEAR("SrvExceedMaxCountYear"),
    @XmlEnumValue("SrvExceedMaxCountTotal")
    SRV_EXCEED_MAX_COUNT_TOTAL("SrvExceedMaxCountTotal"),
    @XmlEnumValue("SrvExceedMinAmntTrnx")
    SRV_EXCEED_MIN_AMNT_TRNX("SrvExceedMinAmntTrnx"),
    @XmlEnumValue("SrvExceedMaxAmntTrnx")
    SRV_EXCEED_MAX_AMNT_TRNX("SrvExceedMaxAmntTrnx"),
    @XmlEnumValue("SrvExceedMaxAmntDay")
    SRV_EXCEED_MAX_AMNT_DAY("SrvExceedMaxAmntDay"),
    @XmlEnumValue("SrvExceedMaxAmntWeek")
    SRV_EXCEED_MAX_AMNT_WEEK("SrvExceedMaxAmntWeek"),
    @XmlEnumValue("SrvExceedMaxAmntMonth")
    SRV_EXCEED_MAX_AMNT_MONTH("SrvExceedMaxAmntMonth"),
    @XmlEnumValue("SrvExceedMaxAmntYear")
    SRV_EXCEED_MAX_AMNT_YEAR("SrvExceedMaxAmntYear"),
    @XmlEnumValue("SrvExceedMaxAmntTotal")
    SRV_EXCEED_MAX_AMNT_TOTAL("SrvExceedMaxAmntTotal"),
    @XmlEnumValue("AcntSrcExceedMaxCountDay")
    ACNT_SRC_EXCEED_MAX_COUNT_DAY("AcntSrcExceedMaxCountDay"),
    @XmlEnumValue("AcntSrcExceedMaxCountWeek")
    ACNT_SRC_EXCEED_MAX_COUNT_WEEK("AcntSrcExceedMaxCountWeek"),
    @XmlEnumValue("AcntSrcExceedMaxCountMonth")
    ACNT_SRC_EXCEED_MAX_COUNT_MONTH("AcntSrcExceedMaxCountMonth"),
    @XmlEnumValue("AcntSrcExceedMaxCountYear")
    ACNT_SRC_EXCEED_MAX_COUNT_YEAR("AcntSrcExceedMaxCountYear"),
    @XmlEnumValue("AcntSrcExceedMaxCountTotal")
    ACNT_SRC_EXCEED_MAX_COUNT_TOTAL("AcntSrcExceedMaxCountTotal"),
    @XmlEnumValue("AcntSrcExceedMinAmntTrnx")
    ACNT_SRC_EXCEED_MIN_AMNT_TRNX("AcntSrcExceedMinAmntTrnx"),
    @XmlEnumValue("AcntSrcExceedMaxAmntTrnx")
    ACNT_SRC_EXCEED_MAX_AMNT_TRNX("AcntSrcExceedMaxAmntTrnx"),
    @XmlEnumValue("AcntSrcExceedMaxAmntDay")
    ACNT_SRC_EXCEED_MAX_AMNT_DAY("AcntSrcExceedMaxAmntDay"),
    @XmlEnumValue("AcntSrcExceedMaxAmntWeek")
    ACNT_SRC_EXCEED_MAX_AMNT_WEEK("AcntSrcExceedMaxAmntWeek"),
    @XmlEnumValue("AcntSrcExceedMaxAmntMonth")
    ACNT_SRC_EXCEED_MAX_AMNT_MONTH("AcntSrcExceedMaxAmntMonth"),
    @XmlEnumValue("AcntSrcExceedMaxAmntYear")
    ACNT_SRC_EXCEED_MAX_AMNT_YEAR("AcntSrcExceedMaxAmntYear"),
    @XmlEnumValue("AcntSrcExceedMaxAmntTotal")
    ACNT_SRC_EXCEED_MAX_AMNT_TOTAL("AcntSrcExceedMaxAmntTotal"),
    @XmlEnumValue("CardSrcExceedMaxCountDay")
    CARD_SRC_EXCEED_MAX_COUNT_DAY("CardSrcExceedMaxCountDay"),
    @XmlEnumValue("CardSrcExceedMaxCountWeek")
    CARD_SRC_EXCEED_MAX_COUNT_WEEK("CardSrcExceedMaxCountWeek"),
    @XmlEnumValue("CardSrcExceedMaxCountMonth")
    CARD_SRC_EXCEED_MAX_COUNT_MONTH("CardSrcExceedMaxCountMonth"),
    @XmlEnumValue("CardSrcExceedMaxCountYear")
    CARD_SRC_EXCEED_MAX_COUNT_YEAR("CardSrcExceedMaxCountYear"),
    @XmlEnumValue("CardSrcExceedMaxCountTotal")
    CARD_SRC_EXCEED_MAX_COUNT_TOTAL("CardSrcExceedMaxCountTotal"),
    @XmlEnumValue("CardSrcExceedMinAmntTrnx")
    CARD_SRC_EXCEED_MIN_AMNT_TRNX("CardSrcExceedMinAmntTrnx"),
    @XmlEnumValue("CardSrcExceedMaxAmntTrnx")
    CARD_SRC_EXCEED_MAX_AMNT_TRNX("CardSrcExceedMaxAmntTrnx"),
    @XmlEnumValue("CardSrcExceedMaxAmntDay")
    CARD_SRC_EXCEED_MAX_AMNT_DAY("CardSrcExceedMaxAmntDay"),
    @XmlEnumValue("CardSrcExceedMaxAmntWeek")
    CARD_SRC_EXCEED_MAX_AMNT_WEEK("CardSrcExceedMaxAmntWeek"),
    @XmlEnumValue("CardSrcExceedMaxAmntMonth")
    CARD_SRC_EXCEED_MAX_AMNT_MONTH("CardSrcExceedMaxAmntMonth"),
    @XmlEnumValue("CardSrcExceedMaxAmntYear")
    CARD_SRC_EXCEED_MAX_AMNT_YEAR("CardSrcExceedMaxAmntYear"),
    @XmlEnumValue("CardSrcExceedMaxAmntTotal")
    CARD_SRC_EXCEED_MAX_AMNT_TOTAL("CardSrcExceedMaxAmntTotal"),
    @XmlEnumValue("AcntDstExceedMaxCountDay")
    ACNT_DST_EXCEED_MAX_COUNT_DAY("AcntDstExceedMaxCountDay"),
    @XmlEnumValue("AcntDstExceedMaxCountWeek")
    ACNT_DST_EXCEED_MAX_COUNT_WEEK("AcntDstExceedMaxCountWeek"),
    @XmlEnumValue("AcntDstExceedMaxCountMonth")
    ACNT_DST_EXCEED_MAX_COUNT_MONTH("AcntDstExceedMaxCountMonth"),
    @XmlEnumValue("AcntDstExceedMaxCountYear")
    ACNT_DST_EXCEED_MAX_COUNT_YEAR("AcntDstExceedMaxCountYear"),
    @XmlEnumValue("AcntDstExceedMaxCountTotal")
    ACNT_DST_EXCEED_MAX_COUNT_TOTAL("AcntDstExceedMaxCountTotal"),
    @XmlEnumValue("AcntDstExceedMinAmntTrnx")
    ACNT_DST_EXCEED_MIN_AMNT_TRNX("AcntDstExceedMinAmntTrnx"),
    @XmlEnumValue("AcntDstExceedMaxAmntTrnx")
    ACNT_DST_EXCEED_MAX_AMNT_TRNX("AcntDstExceedMaxAmntTrnx"),
    @XmlEnumValue("AcntDstExceedMaxAmntDay")
    ACNT_DST_EXCEED_MAX_AMNT_DAY("AcntDstExceedMaxAmntDay"),
    @XmlEnumValue("AcntDstExceedMaxAmntWeek")
    ACNT_DST_EXCEED_MAX_AMNT_WEEK("AcntDstExceedMaxAmntWeek"),
    @XmlEnumValue("AcntDstExceedMaxAmntMonth")
    ACNT_DST_EXCEED_MAX_AMNT_MONTH("AcntDstExceedMaxAmntMonth"),
    @XmlEnumValue("AcntDstExceedMaxAmntYear")
    ACNT_DST_EXCEED_MAX_AMNT_YEAR("AcntDstExceedMaxAmntYear"),
    @XmlEnumValue("AcntDstExceedMaxAmntTotal")
    ACNT_DST_EXCEED_MAX_AMNT_TOTAL("AcntDstExceedMaxAmntTotal"),
    @XmlEnumValue("CardDstExceedMaxCountDay")
    CARD_DST_EXCEED_MAX_COUNT_DAY("CardDstExceedMaxCountDay"),
    @XmlEnumValue("CardDstExceedMaxCountWeek")
    CARD_DST_EXCEED_MAX_COUNT_WEEK("CardDstExceedMaxCountWeek"),
    @XmlEnumValue("CardDstExceedMaxCountMonth")
    CARD_DST_EXCEED_MAX_COUNT_MONTH("CardDstExceedMaxCountMonth"),
    @XmlEnumValue("CardDstExceedMaxCountYear")
    CARD_DST_EXCEED_MAX_COUNT_YEAR("CardDstExceedMaxCountYear"),
    @XmlEnumValue("CardDstExceedMaxCountTotal")
    CARD_DST_EXCEED_MAX_COUNT_TOTAL("CardDstExceedMaxCountTotal"),
    @XmlEnumValue("CardDstExceedMinAmntTrnx")
    CARD_DST_EXCEED_MIN_AMNT_TRNX("CardDstExceedMinAmntTrnx"),
    @XmlEnumValue("CardDstExceedMaxAmntTrnx")
    CARD_DST_EXCEED_MAX_AMNT_TRNX("CardDstExceedMaxAmntTrnx"),
    @XmlEnumValue("CardDstExceedMaxAmntDay")
    CARD_DST_EXCEED_MAX_AMNT_DAY("CardDstExceedMaxAmntDay"),
    @XmlEnumValue("CardDstExceedMaxAmntWeek")
    CARD_DST_EXCEED_MAX_AMNT_WEEK("CardDstExceedMaxAmntWeek"),
    @XmlEnumValue("CardDstExceedMaxAmntMonth")
    CARD_DST_EXCEED_MAX_AMNT_MONTH("CardDstExceedMaxAmntMonth"),
    @XmlEnumValue("CardDstExceedMaxAmntYear")
    CARD_DST_EXCEED_MAX_AMNT_YEAR("CardDstExceedMaxAmntYear"),
    @XmlEnumValue("CardDstExceedMaxAmntTotal")
    CARD_DST_EXCEED_MAX_AMNT_TOTAL("CardDstExceedMaxAmntTotal"),
    @XmlEnumValue("InvalidSrcAcnt")
    INVALID_SRC_ACNT("InvalidSrcAcnt"),
    @XmlEnumValue("InvalidDstAcnt")
    INVALID_DST_ACNT("InvalidDstAcnt"),
    @XmlEnumValue("DatabaseFail")
    DATABASE_FAIL("DatabaseFail"),
    @XmlEnumValue("InvalidAmount")
    INVALID_AMOUNT("InvalidAmount"),
    @XmlEnumValue("InvalidSessionId")
    INVALID_SESSION_ID("InvalidSessionId"),
    @XmlEnumValue("InvalidMethodCall")
    INVALID_METHOD_CALL("InvalidMethodCall"),
    @XmlEnumValue("InvalidPropertyValue")
    INVALID_PROPERTY_VALUE("InvalidPropertyValue"),
    @XmlEnumValue("InvalidSrcCard")
    INVALID_SRC_CARD("InvalidSrcCard"),
    @XmlEnumValue("InvalidDstCard")
    INVALID_DST_CARD("InvalidDstCard"),
    @XmlEnumValue("InvalidCustomerNumber")
    INVALID_CUSTOMER_NUMBER("InvalidCustomerNumber"),
    @XmlEnumValue("InternalException")
    INTERNAL_EXCEPTION("InternalException"),
    @XmlEnumValue("ImbalanceException")
    IMBALANCE_EXCEPTION("ImbalanceException"),
    @XmlEnumValue("AccessDenied")
    ACCESS_DENIED("AccessDenied"),
    @XmlEnumValue("InvalidLoanNumber")
    INVALID_LOAN_NUMBER("InvalidLoanNumber"),
    @XmlEnumValue("LoanNumberExceedMaxCountDay")
    LOAN_NUMBER_EXCEED_MAX_COUNT_DAY("LoanNumberExceedMaxCountDay"),
    @XmlEnumValue("LoanNumberExceedMaxCountWeek")
    LOAN_NUMBER_EXCEED_MAX_COUNT_WEEK("LoanNumberExceedMaxCountWeek"),
    @XmlEnumValue("LoanNumberExceedMaxCountMonth")
    LOAN_NUMBER_EXCEED_MAX_COUNT_MONTH("LoanNumberExceedMaxCountMonth"),
    @XmlEnumValue("LoanNumberExceedMaxCountYear")
    LOAN_NUMBER_EXCEED_MAX_COUNT_YEAR("LoanNumberExceedMaxCountYear"),
    @XmlEnumValue("LoanNumberExceedMaxCountTotal")
    LOAN_NUMBER_EXCEED_MAX_COUNT_TOTAL("LoanNumberExceedMaxCountTotal"),
    @XmlEnumValue("LoanNumberExceedMinAmntTrnx")
    LOAN_NUMBER_EXCEED_MIN_AMNT_TRNX("LoanNumberExceedMinAmntTrnx"),
    @XmlEnumValue("LoanNumberExceedMaxAmntTrnx")
    LOAN_NUMBER_EXCEED_MAX_AMNT_TRNX("LoanNumberExceedMaxAmntTrnx"),
    @XmlEnumValue("LoanNumberExceedMaxAmntDay")
    LOAN_NUMBER_EXCEED_MAX_AMNT_DAY("LoanNumberExceedMaxAmntDay"),
    @XmlEnumValue("LoanNumberExceedMaxAmntWeek")
    LOAN_NUMBER_EXCEED_MAX_AMNT_WEEK("LoanNumberExceedMaxAmntWeek"),
    @XmlEnumValue("LoanNumberExceedMaxAmntMonth")
    LOAN_NUMBER_EXCEED_MAX_AMNT_MONTH("LoanNumberExceedMaxAmntMonth"),
    @XmlEnumValue("LoanNumberExceedMaxAmntYear")
    LOAN_NUMBER_EXCEED_MAX_AMNT_YEAR("LoanNumberExceedMaxAmntYear"),
    @XmlEnumValue("LoanNumberExceedMaxAmntTotal")
    LOAN_NUMBER_EXCEED_MAX_AMNT_TOTAL("LoanNumberExceedMaxAmntTotal");
    private final String value;

    ErrType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErrType fromValue(String v) {
        for (ErrType c: ErrType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
