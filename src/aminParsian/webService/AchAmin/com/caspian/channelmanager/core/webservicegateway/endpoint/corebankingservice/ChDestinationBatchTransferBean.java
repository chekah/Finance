
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chDestinationBatchTransferBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chDestinationBatchTransferBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destinationBatchTransferInfoBean" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chDestinationBatchTransferInfoBean" minOccurs="0" form="unqualified"/>
 *         &lt;element name="destinationDepositNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chDestinationBatchTransferBean", propOrder = {
    "destinationBatchTransferInfoBean",
    "destinationDepositNumber"
})
public class ChDestinationBatchTransferBean {

    protected ChDestinationBatchTransferInfoBean destinationBatchTransferInfoBean;
    protected String destinationDepositNumber;

    /**
     * Gets the value of the destinationBatchTransferInfoBean property.
     * 
     * @return
     *     possible object is
     *     {@link ChDestinationBatchTransferInfoBean }
     *     
     */
    public ChDestinationBatchTransferInfoBean getDestinationBatchTransferInfoBean() {
        return destinationBatchTransferInfoBean;
    }

    /**
     * Sets the value of the destinationBatchTransferInfoBean property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChDestinationBatchTransferInfoBean }
     *     
     */
    public void setDestinationBatchTransferInfoBean(ChDestinationBatchTransferInfoBean value) {
        this.destinationBatchTransferInfoBean = value;
    }

    /**
     * Gets the value of the destinationDepositNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationDepositNumber() {
        return destinationDepositNumber;
    }

    /**
     * Sets the value of the destinationDepositNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationDepositNumber(String value) {
        this.destinationDepositNumber = value;
    }

}
