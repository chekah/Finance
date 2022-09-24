
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
 *         &lt;element name="getCardOwnerResult" type="{http://www.parsian-bank.ir/}getCardOwnerResult" minOccurs="0"/>
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
    "getCardOwnerResult"
})
@XmlRootElement(name = "getCardOwnerResponse")
public class GetCardOwnerResponse {

    protected GetCardOwnerResult getCardOwnerResult;

    /**
     * Gets the value of the getCardOwnerResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCardOwnerResult }
     *     
     */
    public GetCardOwnerResult getGetCardOwnerResult() {
        return getCardOwnerResult;
    }

    /**
     * Sets the value of the getCardOwnerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardOwnerResult }
     *     
     */
    public void setGetCardOwnerResult(GetCardOwnerResult value) {
        this.getCardOwnerResult = value;
    }

}
