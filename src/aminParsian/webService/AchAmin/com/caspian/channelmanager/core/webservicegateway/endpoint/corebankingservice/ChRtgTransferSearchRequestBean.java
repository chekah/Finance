
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chRtgTransferSearchRequestBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chRtgTransferSearchRequestBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chSearchBean">
 *       &lt;sequence>
 *         &lt;element name="cif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="clientTrackingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="status" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chRtgsTransferStatus" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chRtgTransferSearchRequestBean", propOrder = {
    "cif",
    "clientTrackingCode",
    "status"
})
public class ChRtgTransferSearchRequestBean
    extends ChSearchBean
{

    protected String cif;
    protected String clientTrackingCode;
    protected ChRtgsTransferStatus status;

    /**
     * Gets the value of the cif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCif() {
        return cif;
    }

    /**
     * Sets the value of the cif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCif(String value) {
        this.cif = value;
    }

    /**
     * Gets the value of the clientTrackingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientTrackingCode() {
        return clientTrackingCode;
    }

    /**
     * Sets the value of the clientTrackingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientTrackingCode(String value) {
        this.clientTrackingCode = value;
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

}
