
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chBillPaymentRequestBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chBillPaymentRequestBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chBillInfoSearchRequestBean">
 *       &lt;sequence>
 *         &lt;element name="cardAuthorizeParams" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chCardAuthorizeParamsBean" minOccurs="0" form="unqualified"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="mobileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="pan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="requireVerification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="unqualified"/>
 *         &lt;element name="verificationExpirationTimeOut" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chBillPaymentRequestBean", propOrder = {
    "cardAuthorizeParams",
    "email",
    "mobileNo",
    "pan",
    "requireVerification",
    "verificationExpirationTimeOut"
})
public class ChBillPaymentRequestBean
    extends ChBillInfoSearchRequestBean
{

    protected ChCardAuthorizeParamsBean cardAuthorizeParams;
    protected String email;
    protected String mobileNo;
    protected String pan;
    protected Boolean requireVerification;
    protected Long verificationExpirationTimeOut;

    /**
     * Gets the value of the cardAuthorizeParams property.
     * 
     * @return
     *     possible object is
     *     {@link ChCardAuthorizeParamsBean }
     *     
     */
    public ChCardAuthorizeParamsBean getCardAuthorizeParams() {
        return cardAuthorizeParams;
    }

    /**
     * Sets the value of the cardAuthorizeParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChCardAuthorizeParamsBean }
     *     
     */
    public void setCardAuthorizeParams(ChCardAuthorizeParamsBean value) {
        this.cardAuthorizeParams = value;
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
     * Gets the value of the mobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * Sets the value of the mobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNo(String value) {
        this.mobileNo = value;
    }

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPan() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPan(String value) {
        this.pan = value;
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
     * Gets the value of the verificationExpirationTimeOut property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVerificationExpirationTimeOut() {
        return verificationExpirationTimeOut;
    }

    /**
     * Sets the value of the verificationExpirationTimeOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVerificationExpirationTimeOut(Long value) {
        this.verificationExpirationTimeOut = value;
    }

}
