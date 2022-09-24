
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
 *         &lt;element name="getStatementResult" type="{http://www.parsian-bank.ir/}getStatementResult" minOccurs="0"/>
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
    "getStatementResult"
})
@XmlRootElement(name = "getStatementResponse")
public class GetStatementResponse {

    protected GetStatementResult getStatementResult;

    /**
     * Gets the value of the getStatementResult property.
     * 
     * @return
     *     possible object is
     *     {@link GetStatementResult }
     *     
     */
    public GetStatementResult getGetStatementResult() {
        return getStatementResult;
    }

    /**
     * Sets the value of the getStatementResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetStatementResult }
     *     
     */
    public void setGetStatementResult(GetStatementResult value) {
        this.getStatementResult = value;
    }

}
