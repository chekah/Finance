
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
 *         &lt;element name="institutionalTransferResult" type="{http://www.parsian-bank.ir/}institutionalTransferResult" minOccurs="0"/>
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
    "institutionalTransferResult"
})
@XmlRootElement(name = "institutionalTransferResponse")
public class InstitutionalTransferResponse {

    protected InstitutionalTransferResult institutionalTransferResult;

    /**
     * Gets the value of the institutionalTransferResult property.
     * 
     * @return
     *     possible object is
     *     {@link InstitutionalTransferResult }
     *     
     */
    public InstitutionalTransferResult getInstitutionalTransferResult() {
        return institutionalTransferResult;
    }

    /**
     * Sets the value of the institutionalTransferResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstitutionalTransferResult }
     *     
     */
    public void setInstitutionalTransferResult(InstitutionalTransferResult value) {
        this.institutionalTransferResult = value;
    }

}
