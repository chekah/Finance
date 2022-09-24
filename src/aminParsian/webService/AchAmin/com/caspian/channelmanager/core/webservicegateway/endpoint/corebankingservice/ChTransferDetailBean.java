
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for chTransferDetailBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chTransferDetailBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="branchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="branchName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="destinationBank" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chBankBean" minOccurs="0" form="unqualified"/>
 *         &lt;element name="destinationDepositNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="registerDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="serial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="sourceDepositNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="status" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chRtgsTransferStatus" minOccurs="0" form="unqualified"/>
 *         &lt;element name="systemCode" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chRtgsSystemCode" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chTransferDetailBean", propOrder = {
    "amount",
    "branchCode",
    "branchName",
    "destinationBank",
    "destinationDepositNumber",
    "registerDate",
    "serial",
    "sourceDepositNumber",
    "status",
    "systemCode"
})
public class ChTransferDetailBean {

    protected BigDecimal amount;
    protected String branchCode;
    protected String branchName;
    protected ChBankBean destinationBank;
    protected String destinationDepositNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registerDate;
    protected String serial;
    protected String sourceDepositNumber;
    protected ChRtgsTransferStatus status;
    protected ChRtgsSystemCode systemCode;

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
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the branchName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchName() {
        return branchName;
    }

    /**
     * Sets the value of the branchName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchName(String value) {
        this.branchName = value;
    }

    /**
     * Gets the value of the destinationBank property.
     * 
     * @return
     *     possible object is
     *     {@link ChBankBean }
     *     
     */
    public ChBankBean getDestinationBank() {
        return destinationBank;
    }

    /**
     * Sets the value of the destinationBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChBankBean }
     *     
     */
    public void setDestinationBank(ChBankBean value) {
        this.destinationBank = value;
    }

    /**
     * Gets the value of the destinationDepositNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationDepositNumber() {
        return destinationDepositNumber;
    }

    /**
     * Sets the value of the destinationDepositNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationDepositNumber(String value) {
        this.destinationDepositNumber = value;
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
     * Gets the value of the serial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerial() {
        return serial;
    }

    /**
     * Sets the value of the serial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerial(String value) {
        this.serial = value;
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
     *     {@link ChRtgsTransferStatus }
     *     
     */
    public ChRtgsTransferStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChRtgsTransferStatus }
     *     
     */
    public void setStatus(ChRtgsTransferStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the systemCode property.
     * 
     * @return
     *     possible object is
     *     {@link ChRtgsSystemCode }
     *     
     */
    public ChRtgsSystemCode getSystemCode() {
        return systemCode;
    }

    /**
     * Sets the value of the systemCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChRtgsSystemCode }
     *     
     */
    public void setSystemCode(ChRtgsSystemCode value) {
        this.systemCode = value;
    }

}
