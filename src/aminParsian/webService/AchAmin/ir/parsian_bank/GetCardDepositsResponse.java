
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
 *         &lt;element name="getCardDepositsResult" type="{http://www.parsian-bank.ir/}getCardDepositsResult" minOccurs="0"/>
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
    "getCardDepositsResult"
})
@XmlRootElement(name = "getCardDepositsResponse")
public class GetCardDepositsResponse {

    protected GetCardDepositsResult getCardDepositsResult;

    /**
     * Gets the value of the getCardDepositsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCardDepositsResult }
     *     
     */
    public GetCardDepositsResult getGetCardDepositsResult() {
        return getCardDepositsResult;
    }

    /**
     * Sets the value of the getCardDepositsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardDepositsResult }
     *     
     */
    public void setGetCardDepositsResult(GetCardDepositsResult value) {
        this.getCardDepositsResult = value;
    }

}
