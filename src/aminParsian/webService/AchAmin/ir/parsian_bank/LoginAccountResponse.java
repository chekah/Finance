
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
 *         &lt;element name="loginAccountResult" type="{http://www.parsian-bank.ir/}loginAccountResult" minOccurs="0"/>
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
    "loginAccountResult"
})
@XmlRootElement(name = "loginAccountResponse")
public class LoginAccountResponse {

    protected LoginAccountResult loginAccountResult;

    /**
     * Gets the value of the loginAccountResult property.
     * 
     * @return
     *     possible object is
     *     {@link LoginAccountResult }
     *     
     */
    public LoginAccountResult getLoginAccountResult() {
        return loginAccountResult;
    }

    /**
     * Sets the value of the loginAccountResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoginAccountResult }
     *     
     */
    public void setLoginAccountResult(LoginAccountResult value) {
        this.loginAccountResult = value;
    }

}
