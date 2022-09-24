
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for chChequeBookBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chChequeBookBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="numberOfPartialCashCheque" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0" form="unqualified"/>
 *         &lt;element name="numberOfPassCheque" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0" form="unqualified"/>
 *         &lt;element name="numberOfPermanentBlockedCheque" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0" form="unqualified"/>
 *         &lt;element name="numberOfRejectCheque" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0" form="unqualified"/>
 *         &lt;element name="numberOfTemporaryBlockCheque" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0" form="unqualified"/>
 *         &lt;element name="numberOfUnusedCheque" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0" form="unqualified"/>
 *         &lt;element name="pageCount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chChequeBookBean", propOrder = {
    "issueDate",
    "number",
    "numberOfPartialCashCheque",
    "numberOfPassCheque",
    "numberOfPermanentBlockedCheque",
    "numberOfRejectCheque",
    "numberOfTemporaryBlockCheque",
    "numberOfUnusedCheque",
    "pageCount"
})
public class ChChequeBookBean {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issueDate;
    protected String number;
    protected Short numberOfPartialCashCheque;
    protected Short numberOfPassCheque;
    protected Short numberOfPermanentBlockedCheque;
    protected Short numberOfRejectCheque;
    protected Short numberOfTemporaryBlockCheque;
    protected Short numberOfUnusedCheque;
    protected Long pageCount;

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the numberOfPartialCashCheque property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumberOfPartialCashCheque() {
        return numberOfPartialCashCheque;
    }

    /**
     * Sets the value of the numberOfPartialCashCheque property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumberOfPartialCashCheque(Short value) {
        this.numberOfPartialCashCheque = value;
    }

    /**
     * Gets the value of the numberOfPassCheque property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumberOfPassCheque() {
        return numberOfPassCheque;
    }

    /**
     * Sets the value of the numberOfPassCheque property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumberOfPassCheque(Short value) {
        this.numberOfPassCheque = value;
    }

    /**
     * Gets the value of the numberOfPermanentBlockedCheque property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumberOfPermanentBlockedCheque() {
        return numberOfPermanentBlockedCheque;
    }

    /**
     * Sets the value of the numberOfPermanentBlockedCheque property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumberOfPermanentBlockedCheque(Short value) {
        this.numberOfPermanentBlockedCheque = value;
    }

    /**
     * Gets the value of the numberOfRejectCheque property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumberOfRejectCheque() {
        return numberOfRejectCheque;
    }

    /**
     * Sets the value of the numberOfRejectCheque property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumberOfRejectCheque(Short value) {
        this.numberOfRejectCheque = value;
    }

    /**
     * Gets the value of the numberOfTemporaryBlockCheque property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumberOfTemporaryBlockCheque() {
        return numberOfTemporaryBlockCheque;
    }

    /**
     * Sets the value of the numberOfTemporaryBlockCheque property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumberOfTemporaryBlockCheque(Short value) {
        this.numberOfTemporaryBlockCheque = value;
    }

    /**
     * Gets the value of the numberOfUnusedCheque property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumberOfUnusedCheque() {
        return numberOfUnusedCheque;
    }

    /**
     * Sets the value of the numberOfUnusedCheque property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumberOfUnusedCheque(Short value) {
        this.numberOfUnusedCheque = value;
    }

    /**
     * Gets the value of the pageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPageCount() {
        return pageCount;
    }

    /**
     * Sets the value of the pageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPageCount(Long value) {
        this.pageCount = value;
    }

}
