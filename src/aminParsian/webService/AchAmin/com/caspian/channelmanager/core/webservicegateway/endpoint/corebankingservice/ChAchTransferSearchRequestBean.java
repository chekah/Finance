
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
 * <p>Java class for chAchTransferSearchRequestBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chAchTransferSearchRequestBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="clientTrackingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="destinationIbanNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="destinationOwnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="factorNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="fromIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="fromRegisterDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="fromTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *         &lt;element name="order" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chOrderStatus" minOccurs="0" form="unqualified"/>
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="sourceDepositIban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="sourceDepositNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="statusSet" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chAchTransferStatus" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="toIssueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="toRegisterDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="toTransactionAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="transactionStatusSet" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chTransactionStatus" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
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
@XmlType(name = "chAchTransferSearchRequestBean", propOrder = {
    "cif",
    "clientTrackingCode",
    "description",
    "destinationIbanNumber",
    "destinationOwnerName",
    "factorNumber",
    "fromIssueDate",
    "fromRegisterDate",
    "fromTransactionAmount",
    "length",
    "offset",
    "order",
    "referenceId",
    "sourceDepositIban",
    "sourceDepositNumber",
    "statusSet",
    "toIssueDate",
    "toRegisterDate",
    "toTransactionAmount",
    "transactionStatusSet",
    "transferDescription"
})
public class ChAchTransferSearchRequestBean {

    protected String cif;
    protected String clientTrackingCode;
    protected String description;
    protected String destinationIbanNumber;
    protected String destinationOwnerName;
    protected String factorNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromIssueDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromRegisterDate;
    protected BigDecimal fromTransactionAmount;
    protected Long length;
    protected Long offset;
    protected ChOrderStatus order;
    protected String referenceId;
    protected String sourceDepositIban;
    protected String sourceDepositNumber;
    @XmlElement(nillable = true)
    protected List<ChAchTransferStatus> statusSet;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toIssueDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toRegisterDate;
    protected BigDecimal toTransactionAmount;
    @XmlElement(nillable = true)
    protected List<ChTransactionStatus> transactionStatusSet;
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
     * Gets the value of the destinationOwnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationOwnerName() {
        return destinationOwnerName;
    }

    /**
     * Sets the value of the destinationOwnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationOwnerName(String value) {
        this.destinationOwnerName = value;
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
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link ChOrderStatus }
     *     
     */
    public ChOrderStatus getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChOrderStatus }
     *     
     */
    public void setOrder(ChOrderStatus value) {
        this.order = value;
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
     * Gets the value of the statusSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChAchTransferStatus }
     * 
     * 
     */
    public List<ChAchTransferStatus> getStatusSet() {
        if (statusSet == null) {
            statusSet = new ArrayList<ChAchTransferStatus>();
        }
        return this.statusSet;
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
     * Gets the value of the transactionStatusSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactionStatusSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactionStatusSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChTransactionStatus }
     * 
     * 
     */
    public List<ChTransactionStatus> getTransactionStatusSet() {
        if (transactionStatusSet == null) {
            transactionStatusSet = new ArrayList<ChTransactionStatus>();
        }
        return this.transactionStatusSet;
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
