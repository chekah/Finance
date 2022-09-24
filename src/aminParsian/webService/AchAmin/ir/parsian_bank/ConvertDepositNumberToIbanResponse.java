
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
 *         &lt;element name="convertDepositNumberToIbanResult" type="{http://www.parsian-bank.ir/}convertDepositNumberToIbanResult" minOccurs="0"/>
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
    "convertDepositNumberToIbanResult"
})
@XmlRootElement(name = "convertDepositNumberToIbanResponse")
public class ConvertDepositNumberToIbanResponse {

    protected ConvertDepositNumberToIbanResult convertDepositNumberToIbanResult;

    /**
     * Gets the value of the convertDepositNumberToIbanResult property.
     * 
     * @return
     *     possible object is
     *     {@link ConvertDepositNumberToIbanResult }
     *     
     */
    public ConvertDepositNumberToIbanResult getConvertDepositNumberToIbanResult() {
        return convertDepositNumberToIbanResult;
    }

    /**
     * Sets the value of the convertDepositNumberToIbanResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConvertDepositNumberToIbanResult }
     *     
     */
    public void setConvertDepositNumberToIbanResult(ConvertDepositNumberToIbanResult value) {
        this.convertDepositNumberToIbanResult = value;
    }

}
