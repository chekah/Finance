
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
 *         &lt;element name="payLoanResult" type="{http://www.parsian-bank.ir/}payLoanResult" minOccurs="0"/>
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
    "payLoanResult"
})
@XmlRootElement(name = "payLoanResponse")
public class PayLoanResponse {

    protected PayLoanResult payLoanResult;

    /**
     * Gets the value of the payLoanResult property.
     * 
     * @return
     *     possible object is
     *     {@link PayLoanResult }
     *     
     */
    public PayLoanResult getPayLoanResult() {
        return payLoanResult;
    }

    /**
     * Sets the value of the payLoanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayLoanResult }
     *     
     */
    public void setPayLoanResult(PayLoanResult value) {
        this.payLoanResult = value;
    }

}
