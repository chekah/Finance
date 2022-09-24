
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
 *         &lt;element name="payBillResult" type="{http://www.parsian-bank.ir/}payBillResult" minOccurs="0"/>
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
    "payBillResult"
})
@XmlRootElement(name = "payBillResponse")
public class PayBillResponse {

    protected PayBillResult payBillResult;

    /**
     * Gets the value of the payBillResult property.
     * 
     * @return
     *     possible object is
     *     {@link PayBillResult }
     *     
     */
    public PayBillResult getPayBillResult() {
        return payBillResult;
    }

    /**
     * Sets the value of the payBillResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayBillResult }
     *     
     */
    public void setPayBillResult(PayBillResult value) {
        this.payBillResult = value;
    }

}
