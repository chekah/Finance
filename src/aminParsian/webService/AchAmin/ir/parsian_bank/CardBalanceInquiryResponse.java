
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
 *         &lt;element name="cardBalanceInquiryResult" type="{http://www.parsian-bank.ir/}cardBalanceInquiryResult" minOccurs="0"/>
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
    "cardBalanceInquiryResult"
})
@XmlRootElement(name = "cardBalanceInquiryResponse")
public class CardBalanceInquiryResponse {

    protected CardBalanceInquiryResult cardBalanceInquiryResult;

    /**
     * Gets the value of the cardBalanceInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link CardBalanceInquiryResult }
     *     
     */
    public CardBalanceInquiryResult getCardBalanceInquiryResult() {
        return cardBalanceInquiryResult;
    }

    /**
     * Sets the value of the cardBalanceInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardBalanceInquiryResult }
     *     
     */
    public void setCardBalanceInquiryResult(CardBalanceInquiryResult value) {
        this.cardBalanceInquiryResult = value;
    }

}
