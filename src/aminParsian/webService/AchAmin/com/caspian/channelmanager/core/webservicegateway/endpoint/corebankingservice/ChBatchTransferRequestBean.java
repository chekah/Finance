
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chBatchTransferRequestBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chBatchTransferRequestBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="additionalDocumentDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="chSecondPasswordType" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chSecondPasswordType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="checkUniqueTrackingCode" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/>
 *         &lt;element name="cif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="destinationBatchTransfers" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chDestinationBatchTransferBean" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="ignoreError" type="{http://www.w3.org/2001/XMLSchema}boolean" form="unqualified"/>
 *         &lt;element name="secondPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="sourceDepositNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="sourceDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="uniqueTrackingCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chBatchTransferRequestBean", propOrder = {
    "additionalDocumentDesc",
    "chSecondPasswordType",
    "checkUniqueTrackingCode",
    "cif",
    "destinationBatchTransfers",
    "ignoreError",
    "secondPassword",
    "sourceDepositNumber",
    "sourceDescription",
    "uniqueTrackingCode"
})
public class ChBatchTransferRequestBean {

    protected String additionalDocumentDesc;
    protected ChSecondPasswordType chSecondPasswordType;
    protected boolean checkUniqueTrackingCode;
    protected String cif;
    @XmlElement(nillable = true)
    protected List<ChDestinationBatchTransferBean> destinationBatchTransfers;
    protected boolean ignoreError;
    protected String secondPassword;
    protected String sourceDepositNumber;
    protected String sourceDescription;
    protected String uniqueTrackingCode;

    /**
     * Gets the value of the additionalDocumentDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalDocumentDesc() {
        return additionalDocumentDesc;
    }

    /**
     * Sets the value of the additionalDocumentDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalDocumentDesc(String value) {
        this.additionalDocumentDesc = value;
    }

    /**
     * Gets the value of the chSecondPasswordType property.
     * 
     * @return
     *     possible object is
     *     {@link ChSecondPasswordType }
     *     
     */
    public ChSecondPasswordType getChSecondPasswordType() {
        return chSecondPasswordType;
    }

    /**
     * Sets the value of the chSecondPasswordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChSecondPasswordType }
     *     
     */
    public void setChSecondPasswordType(ChSecondPasswordType value) {
        this.chSecondPasswordType = value;
    }

    /**
     * Gets the value of the checkUniqueTrackingCode property.
     * 
     */
    public boolean isCheckUniqueTrackingCode() {
        return checkUniqueTrackingCode;
    }

    /**
     * Sets the value of the checkUniqueTrackingCode property.
     * 
     */
    public void setCheckUniqueTrackingCode(boolean value) {
        this.checkUniqueTrackingCode = value;
    }

    /**
     * Gets the value of the cif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCif() {
        return cif;
    }

    /**
     * Sets the value of the cif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCif(String value) {
        this.cif = value;
    }

    /**
     * Gets the value of the destinationBatchTransfers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destinationBatchTransfers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestinationBatchTransfers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChDestinationBatchTransferBean }
     * 
     * 
     */
    public List<ChDestinationBatchTransferBean> getDestinationBatchTransfers() {
        if (destinationBatchTransfers == null) {
            destinationBatchTransfers = new ArrayList<ChDestinationBatchTransferBean>();
        }
        return this.destinationBatchTransfers;
    }

    /**
     * Gets the value of the ignoreError property.
     * 
     */
    public boolean isIgnoreError() {
        return ignoreError;
    }

    /**
     * Sets the value of the ignoreError property.
     * 
     */
    public void setIgnoreError(boolean value) {
        this.ignoreError = value;
    }

    /**
     * Gets the value of the secondPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondPassword() {
        return secondPassword;
    }

    /**
     * Sets the value of the secondPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondPassword(String value) {
        this.secondPassword = value;
    }

    /**
     * Gets the value of the sourceDepositNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDepositNumber() {
        return sourceDepositNumber;
    }

    /**
     * Sets the value of the sourceDepositNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDepositNumber(String value) {
        this.sourceDepositNumber = value;
    }

    /**
     * Gets the value of the sourceDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDescription() {
        return sourceDescription;
    }

    /**
     * Sets the value of the sourceDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDescription(String value) {
        this.sourceDescription = value;
    }

    /**
     * Gets the value of the uniqueTrackingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueTrackingCode() {
        return uniqueTrackingCode;
    }

    /**
     * Sets the value of the uniqueTrackingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueTrackingCode(String value) {
        this.uniqueTrackingCode = value;
    }

}
