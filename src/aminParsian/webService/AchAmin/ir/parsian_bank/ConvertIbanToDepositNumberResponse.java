
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
 *         &lt;element name="convertIbanToDepositNumberResult" type="{http://www.parsian-bank.ir/}convertIbanToDepositNumberResult" minOccurs="0"/>
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
    "convertIbanToDepositNumberResult"
})
@XmlRootElement(name = "convertIbanToDepositNumberResponse")
public class ConvertIbanToDepositNumberResponse {

    protected ConvertIbanToDepositNumberResult convertIbanToDepositNumberResult;

    /**
     * Gets the value of the convertIbanToDepositNumberResult property.
     * 
     * @return
     *     possible object is
     *     {@link ConvertIbanToDepositNumberResult }
     *     
     */
    public ConvertIbanToDepositNumberResult getConvertIbanToDepositNumberResult() {
        return convertIbanToDepositNumberResult;
    }

    /**
     * Sets the value of the convertIbanToDepositNumberResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConvertIbanToDepositNumberResult }
     *     
     */
    public void setConvertIbanToDepositNumberResult(ConvertIbanToDepositNumberResult value) {
        this.convertIbanToDepositNumberResult = value;
    }

}
