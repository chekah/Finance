
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
 *         &lt;element name="batchTransferResult" type="{http://www.parsian-bank.ir/}batchTransferResult" minOccurs="0"/>
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
    "batchTransferResult"
})
@XmlRootElement(name = "batchTransferResponse")
public class BatchTransferResponse {

    protected BatchTransferResult batchTransferResult;

    /**
     * Gets the value of the batchTransferResult property.
     * 
     * @return
     *     possible object is
     *     {@link BatchTransferResult }
     *     
     */
    public BatchTransferResult getBatchTransferResult() {
        return batchTransferResult;
    }

    /**
     * Sets the value of the batchTransferResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchTransferResult }
     *     
     */
    public void setBatchTransferResult(BatchTransferResult value) {
        this.batchTransferResult = value;
    }

}
