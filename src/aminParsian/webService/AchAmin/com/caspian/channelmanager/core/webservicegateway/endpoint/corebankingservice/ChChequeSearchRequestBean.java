
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for chChequeSearchRequestBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chChequeSearchRequestBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chequeAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="chequeBookNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="chequeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="depositNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="fromStatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *         &lt;element name="payeeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="showStopped" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="unqualified"/>
 *         &lt;element name="statusComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="statuses" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chChequeStatus" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="toStatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chChequeSearchRequestBean", propOrder = {
    "chequeAmount",
    "chequeBookNumber",
    "chequeNumber",
    "depositNumber",
    "fromStatusDate",
    "length",
    "offset",
    "payeeName",
    "showStopped",
    "statusComment",
    "statuses",
    "toStatusDate"
})
public class ChChequeSearchRequestBean {

    protected BigDecimal chequeAmount;
    protected String chequeBookNumber;
    protected String chequeNumber;
    protected String depositNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromStatusDate;
    protected Long length;
    protected Long offset;
    protected String payeeName;
    protected Boolean showStopped;
    protected String statusComment;
    @XmlElement(nillable = true)
    protected List<ChChequeStatus> statuses;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toStatusDate;

    /**
     * Gets the value of the chequeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChequeAmount() {
        return chequeAmount;
    }

    /**
     * Sets the value of the chequeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChequeAmount(BigDecimal value) {
        this.chequeAmount = value;
    }

    /**
     * Gets the value of the chequeBookNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChequeBookNumber() {
        return chequeBookNumber;
    }

    /**
     * Sets the value of the chequeBookNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChequeBookNumber(String value) {
        this.chequeBookNumber = value;
    }

    /**
     * Gets the value of the chequeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChequeNumber() {
        return chequeNumber;
    }

    /**
     * Sets the value of the chequeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChequeNumber(String value) {
        this.chequeNumber = value;
    }

    /**
     * Gets the value of the depositNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositNumber() {
        return depositNumber;
    }

    /**
     * Sets the value of the depositNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositNumber(String value) {
        this.depositNumber = value;
    }

    /**
     * Gets the value of the fromStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromStatusDate() {
        return fromStatusDate;
    }

    /**
     * Sets the value of the fromStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromStatusDate(XMLGregorianCalendar value) {
        this.fromStatusDate = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLength(Long value) {
        this.length = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOffset(Long value) {
        this.offset = value;
    }

    /**
     * Gets the value of the payeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * Sets the value of the payeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeName(String value) {
        this.payeeName = value;
    }

    /**
     * Gets the value of the showStopped property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShowStopped() {
        return showStopped;
    }

    /**
     * Sets the value of the showStopped property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowStopped(Boolean value) {
        this.showStopped = value;
    }

    /**
     * Gets the value of the statusComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusComment() {
        return statusComment;
    }

    /**
     * Sets the value of the statusComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusComment(String value) {
        this.statusComment = value;
    }

    /**
     * Gets the value of the statuses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statuses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatuses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChChequeStatus }
     * 
     * 
     */
    public List<ChChequeStatus> getStatuses() {
        if (statuses == null) {
            statuses = new ArrayList<ChChequeStatus>();
        }
        return this.statuses;
    }

    /**
     * Gets the value of the toStatusDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToStatusDate() {
        return toStatusDate;
    }

    /**
     * Sets the value of the toStatusDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToStatusDate(XMLGregorianCalendar value) {
        this.toStatusDate = value;
    }

}
