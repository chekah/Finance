
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
 *         &lt;element name="getCardStatementInquiryResult" type="{http://www.parsian-bank.ir/}getCardStatementInquiryResult" minOccurs="0"/>
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
    "getCardStatementInquiryResult"
})
@XmlRootElement(name = "getCardStatementInquiryResponse")
public class GetCardStatementInquiryResponse {

    protected GetCardStatementInquiryResult getCardStatementInquiryResult;

    /**
     * Gets the value of the getCardStatementInquiryResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetCardStatementInquiryResult }
     *     
     */
    public GetCardStatementInquiryResult getGetCardStatementInquiryResult() {
        return getCardStatementInquiryResult;
    }

    /**
     * Sets the value of the getCardStatementInquiryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCardStatementInquiryResult }
     *     
     */
    public void setGetCardStatementInquiryResult(GetCardStatementInquiryResult value) {
        this.getCardStatementInquiryResult = value;
    }

}
