
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
 * <p>Java class for chAchTransferBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chAchTransferBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="acceptable" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/>
 *         &lt;element name="cancelable" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/>
 *         &lt;element name="confirmExpireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="registerDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="resumeable" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/>
 *         &lt;element name="sourceDepositNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="status" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chAchTransferStatus" minOccurs="0" form="unqualified"/>
 *         &lt;element name="suspendable" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/>
 *         &lt;element name="totalDebitAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="transactions" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chBriefAchTransactionBean" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
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
@XmlType(name = "chAchTransferBean", propOrder = {
    "acceptable",
    "cancelable",
    "confirmExpireDate",
    "currency",
    "referenceId",
    "registerDate",
    "resumeable",
    "sourceDepositNumber",
    "status",
    "suspendable",
    "totalDebitAmount",
    "transactions",
    "transferDescription"
})
public class ChAchTransferBean {

    protected boolean acceptable;
    protected boolean cancelable;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar confirmExpireDate;
    protected String currency;
    protected String referenceId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registerDate;
    protected boolean resumeable;
    protected String sourceDepositNumber;
    protected ChAchTransferStatus status;
    protected boolean suspendable;
    protected BigDecimal totalDebitAmount;
    @XmlElement(nillable = true)
    protected List<ChBriefAchTransactionBean> transactions;
    protected String transferDescription;

    /**
     * Gets the value of the acceptable property.
     * 
     */
    public boolean isAcceptable() {
        return acceptable;
    }

    /**
     * Sets the value of the acceptable property.
     * 
     */
    public void setAcceptable(boolean value) {
        this.acceptable = value;
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
     * Gets the value of the confirmExpireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getConfirmExpireDate() {
        return confirmExpireDate;
    }

    /**
     * Sets the value of the confirmExpireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setConfirmExpireDate(XMLGregorianCalendar value) {
        this.confirmExpireDate = value;
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
     * Gets the value of the registerDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegisterDate() {
        return registerDate;
    }

    /**
     * Sets the value of the registerDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegisterDate(XMLGregorianCalendar value) {
        this.registerDate = value;
    }

    /**
     * Gets the value of the resumeable property.
     * 
     */
    public boolean isResumeable() {
        return resumeable;
    }

    /**
     * Sets the value of the resumeable property.
     * 
     */
    public void setResumeable(boolean value) {
        this.resumeable = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ChAchTransferStatus }
     *     
     */
    public ChAchTransferStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChAchTransferStatus }
     *     
     */
    public void setStatus(ChAchTransferStatus value) {
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

    /**
     * Gets the value of the totalDebitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDebitAmount() {
        return totalDebitAmount;
    }

    /**
     * Sets the value of the totalDebitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDebitAmount(BigDecimal value) {
        this.totalDebitAmount = value;
    }

    /**
     * Gets the value of the transactions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transactions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransactions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChBriefAchTransactionBean }
     * 
     * 
     */
    public List<ChBriefAchTransactionBean> getTransactions() {
        if (transactions == null) {
            transactions = new ArrayList<ChBriefAchTransactionBean>();
        }
        return this.transactions;
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
