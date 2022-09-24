
package aminParsian.webService.AchAmin.ir.parsian_bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="rtgsNormalTransferResult" type="{http://www.parsian-bank.ir/}rtgsNormalTransferResult" minOccurs="0"/>
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
    "rtgsNormalTransferResult"
})
@XmlRootElement(name = "rtgsNormalTransferResponse")
public class RtgsNormalTransferResponse {

    protected RtgsNormalTransferResult rtgsNormalTransferResult;

    /**
     * Gets the value of the rtgsNormalTransferResult property.
     * 
     * @return
     *     possible object is
     *     {@link RtgsNormalTransferResult }
     *     
     */
    public RtgsNormalTransferResult getRtgsNormalTransferResult() {
        return rtgsNormalTransferResult;
    }

    /**
     * Sets the value of the rtgsNormalTransferResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RtgsNormalTransferResult }
     *     
     */
    public void setRtgsNormalTransferResult(RtgsNormalTransferResult value) {
        this.rtgsNormalTransferResult = value;
    }

}
