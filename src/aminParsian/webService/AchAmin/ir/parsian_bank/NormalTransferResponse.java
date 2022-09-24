
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
 *         &lt;element name="normalTransferResult" type="{http://www.parsian-bank.ir/}normalTransferResult" minOccurs="0"/>
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
    "normalTransferResult"
})
@XmlRootElement(name = "normalTransferResponse")
public class NormalTransferResponse {

    protected NormalTransferResult normalTransferResult;

    /**
     * Gets the value of the normalTransferResult property.
     * 
     * @return
     *     possible object is
     *     {@link NormalTransferResult }
     *     
     */
    public NormalTransferResult getNormalTransferResult() {
        return normalTransferResult;
    }

    /**
     * Sets the value of the normalTransferResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NormalTransferResult }
     *     
     */
    public void setNormalTransferResult(NormalTransferResult value) {
        this.normalTransferResult = value;
    }

}
