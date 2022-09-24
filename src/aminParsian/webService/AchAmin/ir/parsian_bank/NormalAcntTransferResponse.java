
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
 *         &lt;element name="normalAcntTransferResult" type="{http://www.parsian-bank.ir/}acntTransferResult" minOccurs="0"/>
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
    "normalAcntTransferResult"
})
@XmlRootElement(name = "normalAcntTransferResponse")
public class NormalAcntTransferResponse {

    protected AcntTransferResult normalAcntTransferResult;

    /**
     * Gets the value of the normalAcntTransferResult property.
     * 
     * @return
     *     possible object is
     *     {@link AcntTransferResult }
     *     
     */
    public AcntTransferResult getNormalAcntTransferResult() {
        return normalAcntTransferResult;
    }

    /**
     * Sets the value of the normalAcntTransferResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcntTransferResult }
     *     
     */
    public void setNormalAcntTransferResult(AcntTransferResult value) {
        this.normalAcntTransferResult = value;
    }

}
