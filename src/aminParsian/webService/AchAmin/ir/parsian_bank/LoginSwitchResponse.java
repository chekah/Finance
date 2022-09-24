
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
 *         &lt;element name="loginSwitchResult" type="{http://www.parsian-bank.ir/}loginSwitchResult" minOccurs="0"/>
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
    "loginSwitchResult"
})
@XmlRootElement(name = "loginSwitchResponse")
public class LoginSwitchResponse {

    protected LoginSwitchResult loginSwitchResult;

    /**
     * Gets the value of the loginSwitchResult property.
     * 
     * @return
     *     possible object is
     *     {@link LoginSwitchResult }
     *     
     */
    public LoginSwitchResult getLoginSwitchResult() {
        return loginSwitchResult;
    }

    /**
     * Sets the value of the loginSwitchResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginSwitchResult }
     *     
     */
    public void setLoginSwitchResult(LoginSwitchResult value) {
        this.loginSwitchResult = value;
    }

}
