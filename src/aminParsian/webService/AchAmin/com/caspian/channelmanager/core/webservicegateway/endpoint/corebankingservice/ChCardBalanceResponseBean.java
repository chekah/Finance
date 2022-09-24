
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chCardBalanceResponseBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chCardBalanceResponseBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availableBalance" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chAmountBean" minOccurs="0" form="unqualified"/>
 *         &lt;element name="ledgerBalance" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chAmountBean" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chCardBalanceResponseBean", propOrder = {
    "availableBalance",
    "ledgerBalance"
})
public class ChCardBalanceResponseBean {

    protected ChAmountBean availableBalance;
    protected ChAmountBean ledgerBalance;

    /**
     * Gets the value of the availableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link ChAmountBean }
     *     
     */
    public ChAmountBean getAvailableBalance() {
        return availableBalance;
    }

    /**
     * Sets the value of the availableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChAmountBean }
     *     
     */
    public void setAvailableBalance(ChAmountBean value) {
        this.availableBalance = value;
    }

    /**
     * Gets the value of the ledgerBalance property.
     * 
     * @return
     *     possible object is
     *     {@link ChAmountBean }
     *     
     */
    public ChAmountBean getLedgerBalance() {
        return ledgerBalance;
    }

    /**
     * Sets the value of the ledgerBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChAmountBean }
     *     
     */
    public void setLedgerBalance(ChAmountBean value) {
        this.ledgerBalance = value;
    }

}
