
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chRelatedDepositOfCardBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chRelatedDepositOfCardBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardDepositType" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chCardDepositType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="depositNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chRelatedDepositOfCardBean", propOrder = {
    "cardDepositType",
    "depositNumber"
})
public class ChRelatedDepositOfCardBean {

    protected ChCardDepositType cardDepositType;
    protected String depositNumber;

    /**
     * Gets the value of the cardDepositType property.
     * 
     * @return
     *     possible object is
     *     {@link ChCardDepositType }
     *     
     */
    public ChCardDepositType getCardDepositType() {
        return cardDepositType;
    }

    /**
     * Sets the value of the cardDepositType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChCardDepositType }
     *     
     */
    public void setCardDepositType(ChCardDepositType value) {
        this.cardDepositType = value;
    }

    /**
     * Gets the value of the depositNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositNumber() {
        return depositNumber;
    }

    /**
     * Sets the value of the depositNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositNumber(String value) {
        this.depositNumber = value;
    }

}
