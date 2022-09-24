
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
 *         &lt;element name="getChequeBookListResult" type="{http://www.parsian-bank.ir/}getChequeBookListResult" minOccurs="0"/>
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
    "getChequeBookListResult"
})
@XmlRootElement(name = "getChequeBookListResponse")
public class GetChequeBookListResponse {

    protected GetChequeBookListResult getChequeBookListResult;

    /**
     * Gets the value of the getChequeBookListResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetChequeBookListResult }
     *     
     */
    public GetChequeBookListResult getGetChequeBookListResult() {
        return getChequeBookListResult;
    }

    /**
     * Sets the value of the getChequeBookListResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetChequeBookListResult }
     *     
     */
    public void setGetChequeBookListResult(GetChequeBookListResult value) {
        this.getChequeBookListResult = value;
    }

}
