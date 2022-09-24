
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chNormalTransferRequestBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chNormalTransferRequestBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalDocumentDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="chSecondPasswordType" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chSecondPasswordType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="checkUniqueTrackingCode" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/>
 *         &lt;element name="cif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="destinationComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="destinationDeposit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="referenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="secondPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="sourceComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="sourceDeposit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
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
@XmlType(name = "chNormalTransferRequestBean", propOrder = {
    "additionalDocumentDesc",
    "amount",
    "chSecondPasswordType",
    "checkUniqueTrackingCode",
    "cif",
    "currencyCode",
    "destinationComment",
    "destinationDeposit",
    "email",
    "referenceNumber",
    "secondPassword",
    "sourceComment",
    "sourceDeposit",
    "uniqueTrackingCode"
})
public class ChNormalTransferRequestBean {

    protected String additionalDocumentDesc;
    protected BigDecimal amount;
    protected ChSecondPasswordType chSecondPasswordType;
    protected boolean checkUniqueTrackingCode;
    protected String cif;
    protected String currencyCode;
    protected String destinationComment;
    protected String destinationDeposit;
    protected String email;
    protected String referenceNumber;
    protected String secondPassword;
    protected String sourceComment;
    protected String sourceDeposit;
    protected String uniqueTrackingCode;

    /**
     * Gets the value of the additionalDocumentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalDocumentDesc() {
        return additionalDocumentDesc;
    }

    /**
     * Sets the value of the additionalDocumentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalDocumentDesc(String value) {
        this.additionalDocumentDesc = value;
    }

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
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the destinationComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationComment() {
        return destinationComment;
    }

    /**
     * Sets the value of the destinationComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationComment(String value) {
        this.destinationComment = value;
    }

    /**
     * Gets the value of the destinationDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationDeposit() {
        return destinationDeposit;
    }

    /**
     * Sets the value of the destinationDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationDeposit(String value) {
        this.destinationDeposit = value;
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
     * Gets the value of the referenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceNumber() {
        return referenceNumber;
    }

    /**
     * Sets the value of the referenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceNumber(String value) {
        this.referenceNumber = value;
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
     * Gets the value of the sourceComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceComment() {
        return sourceComment;
    }

    /**
     * Sets the value of the sourceComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceComment(String value) {
        this.sourceComment = value;
    }

    /**
     * Gets the value of the sourceDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDeposit() {
        return sourceDeposit;
    }

    /**
     * Sets the value of the sourceDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDeposit(String value) {
        this.sourceDeposit = value;
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
