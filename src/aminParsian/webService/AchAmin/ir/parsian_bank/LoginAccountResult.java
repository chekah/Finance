
package aminParsian.webService.AchAmin.ir.parsian_bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.caspian.moderngateway.core.webservicegateway.endpoint.internalbankservice.ChLoginResponseBean;


/**
 * <p>Java class for loginAccountResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loginAccountResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://internalbankservice.endpoint.webservicegateway.core.moderngateway.caspian.com/}chLoginResponseBean" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.parsian-bank.ir/}errType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginAccountResult", propOrder = {
    "response",
    "error"
})
public class LoginAccountResult {

    protected ChLoginResponseBean response;
    @XmlElement(required = true)
    protected ErrType error;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ChLoginResponseBean }
     *     
     */
    public ChLoginResponseBean getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChLoginResponseBean }
     *     
     */
    public void setResponse(ChLoginResponseBean value) {
        this.response = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ErrType }
     *     
     */
    public ErrType getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrType }
     *     
     */
    public void setError(ErrType value) {
        this.error = value;
    }

}
