
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chCardDepositResponseBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chCardDepositResponseBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deposits" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chRelatedDepositOfCardBean" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
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
@XmlType(name = "chCardDepositResponseBean", propOrder = {
    "deposits",
    "totalRecord"
})
public class ChCardDepositResponseBean {

    @XmlElement(nillable = true)
    protected List<ChRelatedDepositOfCardBean> deposits;
    protected Long totalRecord;

    /**
     * Gets the value of the deposits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deposits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeposits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChRelatedDepositOfCardBean }
     * 
     * 
     */
    public List<ChRelatedDepositOfCardBean> getDeposits() {
        if (deposits == null) {
            deposits = new ArrayList<ChRelatedDepositOfCardBean>();
        }
        return this.deposits;
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
