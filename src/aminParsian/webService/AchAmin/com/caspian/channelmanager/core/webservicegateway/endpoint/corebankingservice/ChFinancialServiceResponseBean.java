
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for chFinancialServiceResponseBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chFinancialServiceResponseBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deposit" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chCardDepositBean" minOccurs="0" form="unqualified"/>
 *         &lt;element name="switchResponseRRN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
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
@XmlType(name = "chFinancialServiceResponseBean", propOrder = {
    "deposit",
    "switchResponseRRN",
    "transactionDate",
    "transactionNumber"
})
@XmlSeeAlso({
    ChCustomReturnResponseBean.class
})
public class ChFinancialServiceResponseBean {

    protected ChCardDepositBean deposit;
    protected String switchResponseRRN;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    protected String transactionNumber;

    /**
     * Gets the value of the deposit property.
     * 
     * @return
     *     possible object is
     *     {@link ChCardDepositBean }
     *     
     */
    public ChCardDepositBean getDeposit() {
        return deposit;
    }

    /**
     * Sets the value of the deposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChCardDepositBean }
     *     
     */
    public void setDeposit(ChCardDepositBean value) {
        this.deposit = value;
    }

    /**
     * Gets the value of the switchResponseRRN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwitchResponseRRN() {
        return switchResponseRRN;
    }

    /**
     * Sets the value of the switchResponseRRN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwitchResponseRRN(String value) {
        this.switchResponseRRN = value;
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
