
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
 *         &lt;element name="doPaymentResult" type="{http://www.parsian-bank.ir/}doPaymentResult" minOccurs="0"/>
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
    "doPaymentResult"
})
@XmlRootElement(name = "doPaymentResponse")
public class DoPaymentResponse {

    protected DoPaymentResult doPaymentResult;

    /**
     * Gets the value of the doPaymentResult property.
     * 
     * @return
     *     possible object is
     *     {@link DoPaymentResult }
     *     
     */
    public DoPaymentResult getDoPaymentResult() {
        return doPaymentResult;
    }

    /**
     * Sets the value of the doPaymentResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link DoPaymentResult }
     *     
     */
    public void setDoPaymentResult(DoPaymentResult value) {
        this.doPaymentResult = value;
    }

}
