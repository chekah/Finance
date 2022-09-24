
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
 *         &lt;element name="achNormalTransferResult" type="{http://www.parsian-bank.ir/}achNormalTransferResult" minOccurs="0"/>
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
    "achNormalTransferResult"
})
@XmlRootElement(name = "achNormalTransferResponse")
public class AchNormalTransferResponse {

    protected AchNormalTransferResult achNormalTransferResult;

    /**
     * Gets the value of the achNormalTransferResult property.
     * 
     * @return
     *     possible object is
     *     {@link AchNormalTransferResult }
     *     
     */
    public AchNormalTransferResult getAchNormalTransferResult() {
        return achNormalTransferResult;
    }

    /**
     * Sets the value of the achNormalTransferResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AchNormalTransferResult }
     *     
     */
    public void setAchNormalTransferResult(AchNormalTransferResult value) {
        this.achNormalTransferResult = value;
    }

}
