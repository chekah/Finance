
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chCardOwnerRequestBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chCardOwnerRequestBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardAuthorizeParams" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chCardAuthorizeParamsBean" minOccurs="0" form="unqualified"/>
 *         &lt;element name="destinationPan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="pan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chCardOwnerRequestBean", propOrder = {
    "cardAuthorizeParams",
    "destinationPan",
    "pan"
})
public class ChCardOwnerRequestBean {

    protected ChCardAuthorizeParamsBean cardAuthorizeParams;
    protected String destinationPan;
    protected String pan;

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
     * Gets the value of the destinationPan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationPan() {
        return destinationPan;
    }

    /**
     * Sets the value of the destinationPan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationPan(String value) {
        this.destinationPan = value;
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

}
