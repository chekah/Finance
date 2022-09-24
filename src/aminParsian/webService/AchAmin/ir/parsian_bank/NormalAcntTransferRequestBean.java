
package aminParsian.webService.AchAmin.ir.parsian_bank;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for normalAcntTransferRequestBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="normalAcntTransferRequestBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="additionalDocumentDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="destinationComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="destinationDeposit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sourceDeposit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "normalAcntTransferRequestBean", propOrder = {
    "cif",
    "additionalDocumentDesc",
    "amount",
    "destinationComment",
    "destinationDeposit",
    "sourceComment",
    "sourceDeposit",
    "uniqueTrackId"
})
public class NormalAcntTransferRequestBean {

    protected String cif;
    protected String additionalDocumentDesc;
    @XmlElement(required = true)
    protected BigDecimal amount;
    protected String destinationComment;
    protected String destinationDeposit;
    protected String sourceComment;
    protected String sourceDeposit;
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
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the destinationComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationComment() {
        return destinationComment;
    }

    /**
     * Sets the value of the destinationComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationComment(String value) {
        this.destinationComment = value;
    }

    /**
     * Gets the value of the destinationDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationDeposit() {
        return destinationDeposit;
    }

    /**
     * Sets the value of the destinationDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationDeposit(String value) {
        this.destinationDeposit = value;
    }

    /**
     * Gets the value of the sourceComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceComment() {
        return sourceComment;
    }

    /**
     * Sets the value of the sourceComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceComment(String value) {
        this.sourceComment = value;
    }

    /**
     * Gets the value of the sourceDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceDeposit() {
        return sourceDeposit;
    }

    /**
     * Sets the value of the sourceDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceDeposit(String value) {
        this.sourceDeposit = value;
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
