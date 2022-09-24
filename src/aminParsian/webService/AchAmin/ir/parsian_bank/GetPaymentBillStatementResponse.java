
package aminParsian.webService.AchAmin.ir.parsian_bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getPaymentBillStatementResult" type="{http://www.parsian-bank.ir/}getPaymentBillStatementResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getPaymentBillStatementResult"
})
@XmlRootElement(name = "getPaymentBillStatementResponse")
public class GetPaymentBillStatementResponse {

    protected GetPaymentBillStatementResult getPaymentBillStatementResult;

    /**
     * Gets the value of the getPaymentBillStatementResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetPaymentBillStatementResult }
     *     
     */
    public GetPaymentBillStatementResult getGetPaymentBillStatementResult() {
        return getPaymentBillStatementResult;
    }

    /**
     * Sets the value of the getPaymentBillStatementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetPaymentBillStatementResult }
     *     
     */
    public void setGetPaymentBillStatementResult(GetPaymentBillStatementResult value) {
        this.getPaymentBillStatementResult = value;
    }

}
