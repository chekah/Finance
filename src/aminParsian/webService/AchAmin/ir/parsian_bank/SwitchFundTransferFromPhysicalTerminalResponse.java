
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
 *         &lt;element name="switchFundTransferFromPhysicalTerminalResult" type="{http://www.parsian-bank.ir/}switchFundTransferFromPhysicalTerminalResult" minOccurs="0"/>
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
    "switchFundTransferFromPhysicalTerminalResult"
})
@XmlRootElement(name = "switchFundTransferFromPhysicalTerminalResponse")
public class SwitchFundTransferFromPhysicalTerminalResponse {

    protected SwitchFundTransferFromPhysicalTerminalResult switchFundTransferFromPhysicalTerminalResult;

    /**
     * Gets the value of the switchFundTransferFromPhysicalTerminalResult property.
     * 
     * @return
     *     possible object is
     *     {@link SwitchFundTransferFromPhysicalTerminalResult }
     *     
     */
    public SwitchFundTransferFromPhysicalTerminalResult getSwitchFundTransferFromPhysicalTerminalResult() {
        return switchFundTransferFromPhysicalTerminalResult;
    }

    /**
     * Sets the value of the switchFundTransferFromPhysicalTerminalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwitchFundTransferFromPhysicalTerminalResult }
     *     
     */
    public void setSwitchFundTransferFromPhysicalTerminalResult(SwitchFundTransferFromPhysicalTerminalResult value) {
        this.switchFundTransferFromPhysicalTerminalResult = value;
    }

}
