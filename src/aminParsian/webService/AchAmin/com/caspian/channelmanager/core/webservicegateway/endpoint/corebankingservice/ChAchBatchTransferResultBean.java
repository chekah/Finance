
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chAchBatchTransferResultBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chAchBatchTransferResultBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="sourceIbanNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="status" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chAchTransferStatus" minOccurs="0" form="unqualified"/>
 *         &lt;element name="transactions" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chDestinationAchTransactionResultBean" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
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
@XmlType(name = "chAchBatchTransferResultBean", propOrder = {
    "currency",
    "referenceId",
    "sourceIbanNumber",
    "status",
    "transactions",
    "transferDescription"
})
public class ChAchBatchTransferResultBean {

    protected String currency;
    protected String referenceId;
    protected String sourceIbanNumber;
    protected ChAchTransferStatus status;
    @XmlElement(nillable = true)
    protected List<ChDestinationAchTransactionResultBean> transactions;
    protected String transferDescription;

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
     * {@link ChDestinationAchTransactionResultBean }
     * 
     * 
     */
    public List<ChDestinationAchTransactionResultBean> getTransactions() {
        if (transactions == null) {
            transactions = new ArrayList<ChDestinationAchTransactionResultBean>();
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
