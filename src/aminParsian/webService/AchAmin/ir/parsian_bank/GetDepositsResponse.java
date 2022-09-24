
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
 *         &lt;element name="getDepositsResult" type="{http://www.parsian-bank.ir/}getDepositsResult" minOccurs="0"/>
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
    "getDepositsResult"
})
@XmlRootElement(name = "getDepositsResponse")
public class GetDepositsResponse {

    protected GetDepositsResult getDepositsResult;

    /**
     * Gets the value of the getDepositsResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetDepositsResult }
     *     
     */
    public GetDepositsResult getGetDepositsResult() {
        return getDepositsResult;
    }

    /**
     * Sets the value of the getDepositsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetDepositsResult }
     *     
     */
    public void setGetDepositsResult(GetDepositsResult value) {
        this.getDepositsResult = value;
    }

}
