
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for chCardTransferResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chCardTransferResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ledgerBalance" type="{http://service.webservicegateway.core.channelmanager.caspian.com/}chSwitchAmount" minOccurs="0" form="unqualified"/>
 *         &lt;element name="totalBalance" type="{http://service.webservicegateway.core.channelmanager.caspian.com/}chSwitchAmount" minOccurs="0" form="unqualified"/>
 *         &lt;element name="trackingId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="trackingNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="transactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="transactionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chCardTransferResponse", propOrder = {
    "ledgerBalance",
    "totalBalance",
    "trackingId",
    "trackingNo",
    "transactionDate",
    "transactionNumber"
})
public class ChCardTransferResponse {

    protected ChSwitchAmount ledgerBalance;
    protected ChSwitchAmount totalBalance;
    protected String trackingId;
    protected String trackingNo;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    protected String transactionNumber;

    /**
     * Gets the value of the ledgerBalance property.
     * 
     * @return
     *     possible object is
     *     {@link ChSwitchAmount }
     *     
     */
    public ChSwitchAmount getLedgerBalance() {
        return ledgerBalance;
    }

    /**
     * Sets the value of the ledgerBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChSwitchAmount }
     *     
     */
    public void setLedgerBalance(ChSwitchAmount value) {
        this.ledgerBalance = value;
    }

    /**
     * Gets the value of the totalBalance property.
     * 
     * @return
     *     possible object is
     *     {@link ChSwitchAmount }
     *     
     */
    public ChSwitchAmount getTotalBalance() {
        return totalBalance;
    }

    /**
     * Sets the value of the totalBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChSwitchAmount }
     *     
     */
    public void setTotalBalance(ChSwitchAmount value) {
        this.totalBalance = value;
    }

    /**
     * Gets the value of the trackingId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingId() {
        return trackingId;
    }

    /**
     * Sets the value of the trackingId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingId(String value) {
        this.trackingId = value;
    }

    /**
     * Gets the value of the trackingNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingNo() {
        return trackingNo;
    }

    /**
     * Sets the value of the trackingNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingNo(String value) {
        this.trackingNo = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the transactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionNumber() {
        return transactionNumber;
    }

    /**
     * Sets the value of the transactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionNumber(String value) {
        this.transactionNumber = value;
    }

}
