
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
 *         &lt;element name="inquiryTxnStatusResult" type="{http://www.parsian-bank.ir/}inquiryTxnStatusResult" minOccurs="0"/>
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
    "inquiryTxnStatusResult"
})
@XmlRootElement(name = "inquiryTxnStatusResponse")
public class InquiryTxnStatusResponse {

    protected InquiryTxnStatusResult inquiryTxnStatusResult;

    /**
     * Gets the value of the inquiryTxnStatusResult property.
     * 
     * @return
     *     possible object is
     *     {@link InquiryTxnStatusResult }
     *     
     */
    public InquiryTxnStatusResult getInquiryTxnStatusResult() {
        return inquiryTxnStatusResult;
    }

    /**
     * Sets the value of the inquiryTxnStatusResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link InquiryTxnStatusResult }
     *     
     */
    public void setInquiryTxnStatusResult(InquiryTxnStatusResult value) {
        this.inquiryTxnStatusResult = value;
    }

}
