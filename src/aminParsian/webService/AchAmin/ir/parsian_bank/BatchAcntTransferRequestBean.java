
package aminParsian.webService.AchAmin.ir.parsian_bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for batchAcntTransferRequestBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="batchAcntTransferRequestBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalDocumentDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceAccounts" type="{http://www.parsian-bank.ir/}ArrayOfBatchAcntTransferDetail" minOccurs="0"/>
 *         &lt;element name="destinationAccounts" type="{http://www.parsian-bank.ir/}ArrayOfBatchAcntTransferDetail" minOccurs="0"/>
 *         &lt;element name="uniqueTrackId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "batchAcntTransferRequestBean", propOrder = {
    "cif",
    "additionalDocumentDesc",
    "sourceAccounts",
    "destinationAccounts",
    "uniqueTrackId"
})
public class BatchAcntTransferRequestBean {

    protected String cif;
    protected String additionalDocumentDesc;
    protected ArrayOfBatchAcntTransferDetail sourceAccounts;
    protected ArrayOfBatchAcntTransferDetail destinationAccounts;
    protected String uniqueTrackId;

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
     * Gets the value of the sourceAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchAcntTransferDetail }
     *     
     */
    public ArrayOfBatchAcntTransferDetail getSourceAccounts() {
        return sourceAccounts;
    }

    /**
     * Sets the value of the sourceAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchAcntTransferDetail }
     *     
     */
    public void setSourceAccounts(ArrayOfBatchAcntTransferDetail value) {
        this.sourceAccounts = value;
    }

    /**
     * Gets the value of the destinationAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBatchAcntTransferDetail }
     *     
     */
    public ArrayOfBatchAcntTransferDetail getDestinationAccounts() {
        return destinationAccounts;
    }

    /**
     * Sets the value of the destinationAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBatchAcntTransferDetail }
     *     
     */
    public void setDestinationAccounts(ArrayOfBatchAcntTransferDetail value) {
        this.destinationAccounts = value;
    }

    /**
     * Gets the value of the uniqueTrackId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueTrackId() {
        return uniqueTrackId;
    }

    /**
     * Sets the value of the uniqueTrackId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueTrackId(String value) {
        this.uniqueTrackId = value;
    }

}
