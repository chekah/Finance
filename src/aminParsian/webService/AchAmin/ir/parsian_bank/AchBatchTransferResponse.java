
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
 *         &lt;element name="achBatchTransferResult" type="{http://www.parsian-bank.ir/}achBatchTransferResult" minOccurs="0"/>
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
    "achBatchTransferResult"
})
@XmlRootElement(name = "achBatchTransferResponse")
public class AchBatchTransferResponse {

    protected AchBatchTransferResult achBatchTransferResult;

    /**
     * Gets the value of the achBatchTransferResult property.
     * 
     * @return
     *     possible object is
     *     {@link AchBatchTransferResult }
     *     
     */
    public AchBatchTransferResult getAchBatchTransferResult() {
        return achBatchTransferResult;
    }

    /**
     * Sets the value of the achBatchTransferResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AchBatchTransferResult }
     *     
     */
    public void setAchBatchTransferResult(AchBatchTransferResult value) {
        this.achBatchTransferResult = value;
    }

}
