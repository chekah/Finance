
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chRtgsNormalTransferRequestBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chRtgsNormalTransferRequestBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="chSecondPasswordType" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chSecondPasswordType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="checkUniqueTrackingCode" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/>
 *         &lt;element name="cif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="destinationIbanNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="factorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="receiverFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="receiverName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="receiverTelephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="secondPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="sourceDepositNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="uniqueTrackingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chRtgsNormalTransferRequestBean", propOrder = {
    "amount",
    "chSecondPasswordType",
    "checkUniqueTrackingCode",
    "cif",
    "description",
    "destinationIbanNumber",
    "email",
    "factorNumber",
    "receiverFamily",
    "receiverName",
    "receiverTelephoneNumber",
    "secondPassword",
    "sourceDepositNumber",
    "uniqueTrackingCode"
})
public class ChRtgsNormalTransferRequestBean {

    protected BigDecimal amount;
    protected ChSecondPasswordType chSecondPasswordType;
    protected boolean checkUniqueTrackingCode;
    protected String cif;
    protected String description;
    protected String destinationIbanNumber;
    protected String email;
    protected String factorNumber;
    protected String receiverFamily;
    protected String receiverName;
    protected String receiverTelephoneNumber;
    protected String secondPassword;
    protected String sourceDepositNumber;
    protected String uniqueTrackingCode;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the chSecondPasswordType property.
     * 
     * @return
     *     possible object is
     *     {@link ChSecondPasswordType }
     *     
     */
    public ChSecondPasswordType getChSecondPasswordType() {
        return chSecondPasswordType;
    }

    /**
     * Sets the value of the chSecondPasswordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChSecondPasswordType }
     *     
     */
    public void setChSecondPasswordType(ChSecondPasswordType value) {
        this.chSecondPasswordType = value;
    }

    /**
     * Gets the value of the checkUniqueTrackingCode property.
     * 
     */
    public boolean isCheckUniqueTrackingCode() {
        return checkUniqueTrackingCode;
    }

    /**
     * Sets the value of the checkUniqueTrackingCode property.
     * 
     */
    public void setCheckUniqueTrackingCode(boolean value) {
        this.checkUniqueTrackingCode = value;
    }

    /**
     * Gets the value of the cif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCif() {
        return cif;
    }

    /**
     * Sets the value of the cif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCif(String value) {
        this.cif = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the destinationIbanNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationIbanNumber() {
        return destinationIbanNumber;
    }

    /**
     * Sets the value of the destinationIbanNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationIbanNumber(String value) {
        this.destinationIbanNumber = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the factorNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFactorNumber() {
        return factorNumber;
    }

    /**
     * Sets the value of the factorNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFactorNumber(String value) {
        this.factorNumber = value;
    }

    /**
     * Gets the value of the receiverFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverFamily() {
        return receiverFamily;
    }

    /**
     * Sets the value of the receiverFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverFamily(String value) {
        this.receiverFamily = value;
    }

    /**
     * Gets the value of the receiverName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverName() {
        return receiverName;
    }

    /**
     * Sets the value of the receiverName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverName(String value) {
        this.receiverName = value;
    }

    /**
     * Gets the value of the receiverTelephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverTelephoneNumber() {
        return receiverTelephoneNumber;
    }

    /**
     * Sets the value of the receiverTelephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverTelephoneNumber(String value) {
        this.receiverTelephoneNumber = value;
    }

    /**
     * Gets the value of the secondPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondPassword() {
        return secondPassword;
    }

    /**
     * Sets the value of the secondPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondPassword(String value) {
        this.secondPassword = value;
    }

    /**
     * Gets the value of the sourceDepositNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDepositNumber() {
        return sourceDepositNumber;
    }

    /**
     * Sets the value of the sourceDepositNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDepositNumber(String value) {
        this.sourceDepositNumber = value;
    }

    /**
     * Gets the value of the uniqueTrackingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueTrackingCode() {
        return uniqueTrackingCode;
    }

    /**
     * Sets the value of the uniqueTrackingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueTrackingCode(String value) {
        this.uniqueTrackingCode = value;
    }

}
