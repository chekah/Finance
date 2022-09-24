
package aminParsian.webService.AchAmin.ir.parsian_bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice.ChBatchTransferResponseBean;


/**
 * <p>Java class for batchTransferResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="batchTransferResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="response" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chBatchTransferResponseBean" minOccurs="0"/>
 *         &lt;element name="error" type="{http://www.parsian-bank.ir/}errType"/>
 *         &lt;element name="error_dpsORprop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "batchTransferResult", propOrder = {
    "response",
    "error",
    "errorDpsORprop"
})
public class BatchTransferResult {

    protected ChBatchTransferResponseBean response;
    @XmlElement(required = true)
    protected ErrType error;
    @XmlElement(name = "error_dpsORprop")
    protected String errorDpsORprop;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ChBatchTransferResponseBean }
     *     
     */
    public ChBatchTransferResponseBean getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChBatchTransferResponseBean }
     *     
     */
    public void setResponse(ChBatchTransferResponseBean value) {
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

    /**
     * Gets the value of the errorDpsORprop property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorDpsORprop() {
        return errorDpsORprop;
    }

    /**
     * Sets the value of the errorDpsORprop property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorDpsORprop(String value) {
        this.errorDpsORprop = value;
    }

}
