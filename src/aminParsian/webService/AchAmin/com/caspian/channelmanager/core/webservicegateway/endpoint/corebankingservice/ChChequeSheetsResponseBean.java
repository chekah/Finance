
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chChequeSheetsResponseBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chChequeSheetsResponseBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chequeSheetBeans" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chChequeSheetBean" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="totalRecord" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chChequeSheetsResponseBean", propOrder = {
    "chequeSheetBeans",
    "totalRecord"
})
public class ChChequeSheetsResponseBean {

    @XmlElement(nillable = true)
    protected List<ChChequeSheetBean> chequeSheetBeans;
    protected Long totalRecord;

    /**
     * Gets the value of the chequeSheetBeans property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chequeSheetBeans property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChequeSheetBeans().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChChequeSheetBean }
     * 
     * 
     */
    public List<ChChequeSheetBean> getChequeSheetBeans() {
        if (chequeSheetBeans == null) {
            chequeSheetBeans = new ArrayList<ChChequeSheetBean>();
        }
        return this.chequeSheetBeans;
    }

    /**
     * Gets the value of the totalRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTotalRecord() {
        return totalRecord;
    }

    /**
     * Sets the value of the totalRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTotalRecord(Long value) {
        this.totalRecord = value;
    }

}
