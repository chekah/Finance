
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
 *         &lt;element name="getChequeResult" type="{http://www.parsian-bank.ir/}getChequeResult" minOccurs="0"/>
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
    "getChequeResult"
})
@XmlRootElement(name = "getChequeResponse")
public class GetChequeResponse {

    protected GetChequeResult getChequeResult;

    /**
     * Gets the value of the getChequeResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetChequeResult }
     *     
     */
    public GetChequeResult getGetChequeResult() {
        return getChequeResult;
    }

    /**
     * Sets the value of the getChequeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetChequeResult }
     *     
     */
    public void setGetChequeResult(GetChequeResult value) {
        this.getChequeResult = value;
    }

}
