
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for chAchTransactionBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chAchTransactionBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="cancelable" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/>
 *         &lt;element name="changeable" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="factorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="ibanNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="ibanOwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="resumeable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="unqualified"/>
 *         &lt;element name="sourceIbanNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="status" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chTransactionStatus" minOccurs="0" form="unqualified"/>
 *         &lt;element name="suspendable" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chAchTransactionBean", propOrder = {
    "amount",
    "cancelable",
    "changeable",
    "currency",
    "description",
    "factorNumber",
    "ibanNumber",
    "ibanOwnerName",
    "id",
    "issueDate",
    "referenceId",
    "resumeable",
    "sourceIbanNumber",
    "status",
    "suspendable"
})
public class ChAchTransactionBean {

    protected BigDecimal amount;
    protected boolean cancelable;
    protected boolean changeable;
    protected String currency;
    protected String description;
    protected String factorNumber;
    protected String ibanNumber;
    protected String ibanOwnerName;
    protected String id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
    protected String referenceId;
    protected Boolean resumeable;
    protected String sourceIbanNumber;
    protected ChTransactionStatus status;
    protected boolean suspendable;

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
     * Gets the value of the cancelable property.
     * 
     */
    public boolean isCancelable() {
        return cancelable;
    }

    /**
     * Sets the value of the cancelable property.
     * 
     */
    public void setCancelable(boolean value) {
        this.cancelable = value;
    }

    /**
     * Gets the value of the changeable property.
     * 
     */
    public boolean isChangeable() {
        return changeable;
    }

    /**
     * Sets the value of the changeable property.
     * 
     */
    public void setChangeable(boolean value) {
        this.changeable = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
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
     * Gets the value of the ibanNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbanNumber() {
        return ibanNumber;
    }

    /**
     * Sets the value of the ibanNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbanNumber(String value) {
        this.ibanNumber = value;
    }

    /**
     * Gets the value of the ibanOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIbanOwnerName() {
        return ibanOwnerName;
    }

    /**
     * Sets the value of the ibanOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIbanOwnerName(String value) {
        this.ibanOwnerName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the resumeable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isResumeable() {
        return resumeable;
    }

    /**
     * Sets the value of the resumeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setResumeable(Boolean value) {
        this.resumeable = value;
    }

    /**
     * Gets the value of the sourceIbanNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceIbanNumber() {
        return sourceIbanNumber;
    }

    /**
     * Sets the value of the sourceIbanNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceIbanNumber(String value) {
        this.sourceIbanNumber = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ChTransactionStatus }
     *     
     */
    public ChTransactionStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChTransactionStatus }
     *     
     */
    public void setStatus(ChTransactionStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the suspendable property.
     * 
     */
    public boolean isSuspendable() {
        return suspendable;
    }

    /**
     * Sets the value of the suspendable property.
     * 
     */
    public void setSuspendable(boolean value) {
        this.suspendable = value;
    }

}
