
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chOtpLoginRequestBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chOtpLoginRequestBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chUserInfoRequestBean">
 *       &lt;sequence>
 *         &lt;element name="authenticationType" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chAuthenticationType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="challengeIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="signedPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chOtpLoginRequestBean", propOrder = {
    "authenticationType",
    "challengeIdentifier",
    "signedPassword"
})
public class ChOtpLoginRequestBean
    extends ChUserInfoRequestBean
{

    protected ChAuthenticationType authenticationType;
    protected String challengeIdentifier;
    protected String signedPassword;

    /**
     * Gets the value of the authenticationType property.
     * 
     * @return
     *     possible object is
     *     {@link ChAuthenticationType }
     *     
     */
    public ChAuthenticationType getAuthenticationType() {
        return authenticationType;
    }

    /**
     * Sets the value of the authenticationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChAuthenticationType }
     *     
     */
    public void setAuthenticationType(ChAuthenticationType value) {
        this.authenticationType = value;
    }

    /**
     * Gets the value of the challengeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChallengeIdentifier() {
        return challengeIdentifier;
    }

    /**
     * Sets the value of the challengeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChallengeIdentifier(String value) {
        this.challengeIdentifier = value;
    }

    /**
     * Gets the value of the signedPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignedPassword() {
        return signedPassword;
    }

    /**
     * Sets the value of the signedPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedPassword(String value) {
        this.signedPassword = value;
    }

}
