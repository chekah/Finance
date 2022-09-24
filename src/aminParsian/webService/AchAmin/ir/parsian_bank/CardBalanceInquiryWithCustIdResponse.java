
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
 *         &lt;element name="cardBalanceInquiryWithCustIdResult" type="{http://www.parsian-bank.ir/}cardBalanceInquiryWithCustIdResult" minOccurs="0"/>
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
    "cardBalanceInquiryWithCustIdResult"
})
@XmlRootElement(name = "cardBalanceInquiryWithCustIdResponse")
public class CardBalanceInquiryWithCustIdResponse {

    protected CardBalanceInquiryWithCustIdResult cardBalanceInquiryWithCustIdResult;

    /**
     * Gets the value of the cardBalanceInquiryWithCustIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link CardBalanceInquiryWithCustIdResult }
     *     
     */
    public CardBalanceInquiryWithCustIdResult getCardBalanceInquiryWithCustIdResult() {
        return cardBalanceInquiryWithCustIdResult;
    }

    /**
     * Sets the value of the cardBalanceInquiryWithCustIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardBalanceInquiryWithCustIdResult }
     *     
     */
    public void setCardBalanceInquiryWithCustIdResult(CardBalanceInquiryWithCustIdResult value) {
        this.cardBalanceInquiryWithCustIdResult = value;
    }

}
