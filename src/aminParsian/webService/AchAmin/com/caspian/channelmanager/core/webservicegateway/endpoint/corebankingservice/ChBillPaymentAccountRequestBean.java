
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chBillPaymentAccountRequestBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chBillPaymentAccountRequestBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chBillInfoSearchRequestBean">
 *       &lt;sequence>
 *         &lt;element name="accountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="chSecondPasswordType" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chSecondPasswordType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="customerNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="requireVerification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="unqualified"/>
 *         &lt;element name="secondPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chBillPaymentAccountRequestBean", propOrder = {
    "accountNumber",
    "chSecondPasswordType",
    "customerNumber",
    "email",
    "requireVerification",
    "secondPassword"
})
public class ChBillPaymentAccountRequestBean
    extends ChBillInfoSearchRequestBean
{

    protected String accountNumber;
    protected ChSecondPasswordType chSecondPasswordType;
    protected Long customerNumber;
    protected String email;
    protected Boolean requireVerification;
    protected String secondPassword;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
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
     * Gets the value of the customerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Sets the value of the customerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerNumber(Long value) {
        this.customerNumber = value;
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
     * Gets the value of the requireVerification property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireVerification() {
        return requireVerification;
    }

    /**
     * Sets the value of the requireVerification property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireVerification(Boolean value) {
        this.requireVerification = value;
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

}
