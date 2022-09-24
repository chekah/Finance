
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for chDefaultStatementResponseBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chDefaultStatementResponseBean">
 *   &lt;complexContent>
 *     &lt;extension base="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chStatementResponseBean">
 *       &lt;sequence>
 *         &lt;element name="billFields" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chBillBeanField" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="billPageSize" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0" form="unqualified"/>
 *         &lt;element name="defaultBillStatementType" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chDefaultBillStatementBeanType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="defaultLastN" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0" form="unqualified"/>
 *         &lt;element name="defaultOrder" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chOrderStatus" minOccurs="0" form="unqualified"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chDefaultStatementResponseBean", propOrder = {
    "billFields",
    "billPageSize",
    "defaultBillStatementType",
    "defaultLastN",
    "defaultOrder",
    "fromDate",
    "toDate"
})
public class ChDefaultStatementResponseBean
    extends ChStatementResponseBean
{

    @XmlElement(nillable = true)
    protected List<ChBillBeanField> billFields;
    protected Short billPageSize;
    protected ChDefaultBillStatementBeanType defaultBillStatementType;
    protected Short defaultLastN;
    protected ChOrderStatus defaultOrder;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fromDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar toDate;

    /**
     * Gets the value of the billFields property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billFields property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillFields().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChBillBeanField }
     * 
     * 
     */
    public List<ChBillBeanField> getBillFields() {
        if (billFields == null) {
            billFields = new ArrayList<ChBillBeanField>();
        }
        return this.billFields;
    }

    /**
     * Gets the value of the billPageSize property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getBillPageSize() {
        return billPageSize;
    }

    /**
     * Sets the value of the billPageSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setBillPageSize(Short value) {
        this.billPageSize = value;
    }

    /**
     * Gets the value of the defaultBillStatementType property.
     * 
     * @return
     *     possible object is
     *     {@link ChDefaultBillStatementBeanType }
     *     
     */
    public ChDefaultBillStatementBeanType getDefaultBillStatementType() {
        return defaultBillStatementType;
    }

    /**
     * Sets the value of the defaultBillStatementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChDefaultBillStatementBeanType }
     *     
     */
    public void setDefaultBillStatementType(ChDefaultBillStatementBeanType value) {
        this.defaultBillStatementType = value;
    }

    /**
     * Gets the value of the defaultLastN property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getDefaultLastN() {
        return defaultLastN;
    }

    /**
     * Sets the value of the defaultLastN property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setDefaultLastN(Short value) {
        this.defaultLastN = value;
    }

    /**
     * Gets the value of the defaultOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ChOrderStatus }
     *     
     */
    public ChOrderStatus getDefaultOrder() {
        return defaultOrder;
    }

    /**
     * Sets the value of the defaultOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChOrderStatus }
     *     
     */
    public void setDefaultOrder(ChOrderStatus value) {
        this.defaultOrder = value;
    }

    /**
     * Gets the value of the fromDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFromDate(XMLGregorianCalendar value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setToDate(XMLGregorianCalendar value) {
        this.toDate = value;
    }

}
