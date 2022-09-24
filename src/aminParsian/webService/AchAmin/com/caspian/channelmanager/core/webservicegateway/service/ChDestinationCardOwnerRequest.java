
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chDestinationCardOwnerRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chDestinationCardOwnerRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="chTerminalType" type="{http://service.webservicegateway.core.channelmanager.caspian.com/}chTerminalType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="destinationCardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chDestinationCardOwnerRequest", propOrder = {
    "cardNo",
    "chTerminalType",
    "destinationCardNo"
})
public class ChDestinationCardOwnerRequest {

    protected String cardNo;
    protected ChTerminalType chTerminalType;
    protected String destinationCardNo;

    /**
     * Gets the value of the cardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * Sets the value of the cardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
    }

    /**
     * Gets the value of the chTerminalType property.
     * 
     * @return
     *     possible object is
     *     {@link ChTerminalType }
     *     
     */
    public ChTerminalType getChTerminalType() {
        return chTerminalType;
    }

    /**
     * Sets the value of the chTerminalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChTerminalType }
     *     
     */
    public void setChTerminalType(ChTerminalType value) {
        this.chTerminalType = value;
    }

    /**
     * Gets the value of the destinationCardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationCardNo() {
        return destinationCardNo;
    }

    /**
     * Sets the value of the destinationCardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationCardNo(String value) {
        this.destinationCardNo = value;
    }

}
