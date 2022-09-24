
package aminParsian.webService.AchAmin.ir.parsian_bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice.ChUserInfoRequestBean;
import aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice.ChannelServiceType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chUserInfoRequestBean" minOccurs="0"/>
 *         &lt;element name="channelType" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}channelServiceType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "channelType"
})
@XmlRootElement(name = "login")
public class Login {

    protected ChUserInfoRequestBean request;
    @XmlElement(required = true)
    protected ChannelServiceType channelType;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link ChUserInfoRequestBean }
     *     
     */
    public ChUserInfoRequestBean getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChUserInfoRequestBean }
     *     
     */
    public void setRequest(ChUserInfoRequestBean value) {
        this.request = value;
    }

    /**
     * Gets the value of the channelType property.
     * 
     * @return
     *     possible object is
     *     {@link ChannelServiceType }
     *     
     */
    public ChannelServiceType getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChannelServiceType }
     *     
     */
    public void setChannelType(ChannelServiceType value) {
        this.channelType = value;
    }

}
