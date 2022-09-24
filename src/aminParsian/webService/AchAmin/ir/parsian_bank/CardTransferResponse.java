
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
 *         &lt;element name="cardTransferResult" type="{http://www.parsian-bank.ir/}cardTransferResult" minOccurs="0"/>
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
    "cardTransferResult"
})
@XmlRootElement(name = "cardTransferResponse")
public class CardTransferResponse {

    protected CardTransferResult cardTransferResult;

    /**
     * Gets the value of the cardTransferResult property.
     * 
     * @return
     *     possible object is
     *     {@link CardTransferResult }
     *     
     */
    public CardTransferResult getCardTransferResult() {
        return cardTransferResult;
    }

    /**
     * Sets the value of the cardTransferResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardTransferResult }
     *     
     */
    public void setCardTransferResult(CardTransferResult value) {
        this.cardTransferResult = value;
    }

}
