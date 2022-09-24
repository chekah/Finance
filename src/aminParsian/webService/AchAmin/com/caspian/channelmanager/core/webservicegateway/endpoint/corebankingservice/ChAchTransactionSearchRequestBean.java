
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for chAchTransactionSearchRequestBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chAchTransactionSearchRequestBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="clientTrackingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="factorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="fromIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="fromRegisterDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="fromTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="ibanNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="ibanOwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="includeTransactionStatus" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chTransactionStatus" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="sourceDepositIban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="sourceDepositNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="toIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="toRegisterDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="toTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="transferDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chAchTransactionSearchRequestBean", propOrder = {
    "cif",
    "clientTrackingCode",
    "description",
    "factorNumber",
    "fromIssueDate",
    "fromRegisterDate",
    "fromTransactionAmount",
    "ibanNumber",
    "ibanOwnerName",
    "includeTransactionStatus",
    "length",
    "offset",
    "referenceId",
    "sourceDepositIban",
    "sourceDepositNumber",
    "toIssueDate",
    "toRegisterDate",
    "toTransactionAmount",
    "transactionId",
    "transferDescription"
})
public class ChAchTransactionSearchRequestBean {

    protected String cif;
    protected String clientTrackingCode;
    protected String description;
    protected String factorNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromIssueDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromRegisterDate;
    protected BigDecimal fromTransactionAmount;
    protected String ibanNumber;
    protected String ibanOwnerName;
    @XmlElement(nillable = true)
    protected List<ChTransactionStatus> includeTransactionStatus;
    protected Long length;
    protected Long offset;
    protected String referenceId;
    protected String sourceDepositIban;
    protected String sourceDepositNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toIssueDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toRegisterDate;
    protected BigDecimal toTransactionAmount;
    protected String transactionId;
    protected String transferDescription;

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
     * Gets the value of the clientTrackingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientTrackingCode() {
        return clientTrackingCode;
    }

    /**
     * Sets the value of the clientTrackingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientTrackingCode(String value) {
        this.clientTrackingCode = value;
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
     * Gets the value of the fromIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromIssueDate() {
        return fromIssueDate;
    }

    /**
     * Sets the value of the fromIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromIssueDate(XMLGregorianCalendar value) {
        this.fromIssueDate = value;
    }

    /**
     * Gets the value of the fromRegisterDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromRegisterDate() {
        return fromRegisterDate;
    }

    /**
     * Sets the value of the fromRegisterDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromRegisterDate(XMLGregorianCalendar value) {
        this.fromRegisterDate = value;
    }

    /**
     * Gets the value of the fromTransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFromTransactionAmount() {
        return fromTransactionAmount;
    }

    /**
     * Sets the value of the fromTransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFromTransactionAmount(BigDecimal value) {
        this.fromTransactionAmount = value;
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
     * Gets the value of the includeTransactionStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeTransactionStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeTransactionStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChTransactionStatus }
     * 
     * 
     */
    public List<ChTransactionStatus> getIncludeTransactionStatus() {
        if (includeTransactionStatus == null) {
            includeTransactionStatus = new ArrayList<ChTransactionStatus>();
        }
        return this.includeTransactionStatus;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLength(Long value) {
        this.length = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOffset(Long value) {
        this.offset = value;
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
     * Gets the value of the sourceDepositIban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDepositIban() {
        return sourceDepositIban;
    }

    /**
     * Sets the value of the sourceDepositIban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDepositIban(String value) {
        this.sourceDepositIban = value;
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
     * Gets the value of the toIssueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToIssueDate() {
        return toIssueDate;
    }

    /**
     * Sets the value of the toIssueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToIssueDate(XMLGregorianCalendar value) {
        this.toIssueDate = value;
    }

    /**
     * Gets the value of the toRegisterDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToRegisterDate() {
        return toRegisterDate;
    }

    /**
     * Sets the value of the toRegisterDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToRegisterDate(XMLGregorianCalendar value) {
        this.toRegisterDate = value;
    }

    /**
     * Gets the value of the toTransactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getToTransactionAmount() {
        return toTransactionAmount;
    }

    /**
     * Sets the value of the toTransactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setToTransactionAmount(BigDecimal value) {
        this.toTransactionAmount = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the transferDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferDescription() {
        return transferDescription;
    }

    /**
     * Sets the value of the transferDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferDescription(String value) {
        this.transferDescription = value;
    }

}
