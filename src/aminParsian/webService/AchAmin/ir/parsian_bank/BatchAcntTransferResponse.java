
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
 *         &lt;element name="batchAcntTransferResult" type="{http://www.parsian-bank.ir/}acntTransferResult" minOccurs="0"/>
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
    "batchAcntTransferResult"
})
@XmlRootElement(name = "batchAcntTransferResponse")
public class BatchAcntTransferResponse {

    protected AcntTransferResult batchAcntTransferResult;

    /**
     * Gets the value of the batchAcntTransferResult property.
     * 
     * @return
     *     possible object is
     *     {@link AcntTransferResult }
     *     
     */
    public AcntTransferResult getBatchAcntTransferResult() {
        return batchAcntTransferResult;
    }

    /**
     * Sets the value of the batchAcntTransferResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcntTransferResult }
     *     
     */
    public void setBatchAcntTransferResult(AcntTransferResult value) {
        this.batchAcntTransferResult = value;
    }

}
