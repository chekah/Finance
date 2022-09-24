
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
 *         &lt;element name="getDestinationCardOwnerResult" type="{http://www.parsian-bank.ir/}getDestinationCardOwnerResult" minOccurs="0"/>
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
    "getDestinationCardOwnerResult"
})
@XmlRootElement(name = "getDestinationCardOwnerResponse")
public class GetDestinationCardOwnerResponse {

    protected GetDestinationCardOwnerResult getDestinationCardOwnerResult;

    /**
     * Gets the value of the getDestinationCardOwnerResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetDestinationCardOwnerResult }
     *     
     */
    public GetDestinationCardOwnerResult getGetDestinationCardOwnerResult() {
        return getDestinationCardOwnerResult;
    }

    /**
     * Sets the value of the getDestinationCardOwnerResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDestinationCardOwnerResult }
     *     
     */
    public void setGetDestinationCardOwnerResult(GetDestinationCardOwnerResult value) {
        this.getDestinationCardOwnerResult = value;
    }

}
