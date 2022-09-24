
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chPaymentRequestBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chPaymentRequestBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="cardAuthorizeParams" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chCardAuthorizeParamsBean" minOccurs="0" form="unqualified"/>
 *         &lt;element name="channelType" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}channelType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="inputParameters" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chPaymentInputParameterBean" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="mobileNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="pan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="paymentServiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="requireVerification" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="unqualified"/>
 *         &lt;element name="trackingNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="verificationExpirationTimeOut" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chPaymentRequestBean", propOrder = {
    "amount",
    "cardAuthorizeParams",
    "channelType",
    "email",
    "inputParameters",
    "mobileNo",
    "pan",
    "paymentServiceId",
    "requireVerification",
    "trackingNo",
    "verificationExpirationTimeOut"
})
public class ChPaymentRequestBean {

    protected BigDecimal amount;
    protected ChCardAuthorizeParamsBean cardAuthorizeParams;
    protected ChannelType channelType;
    protected String email;
    @XmlElement(nillable = true)
    protected List<ChPaymentInputParameterBean> inputParameters;
    protected String mobileNo;
    protected String pan;
    protected String paymentServiceId;
    protected Boolean requireVerification;
    protected String trackingNo;
    protected Long verificationExpirationTimeOut;

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
     * Gets the value of the channelType property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelType }
     *     
     */
    public ChannelType getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelType }
     *     
     */
    public void setChannelType(ChannelType value) {
        this.channelType = value;
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
     * Gets the value of the inputParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inputParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInputParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChPaymentInputParameterBean }
     * 
     * 
     */
    public List<ChPaymentInputParameterBean> getInputParameters() {
        if (inputParameters == null) {
            inputParameters = new ArrayList<ChPaymentInputParameterBean>();
        }
        return this.inputParameters;
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
     * Gets the value of the paymentServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentServiceId() {
        return paymentServiceId;
    }

    /**
     * Sets the value of the paymentServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentServiceId(String value) {
        this.paymentServiceId = value;
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
