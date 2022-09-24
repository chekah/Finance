
package aminParsian.webService.AchAmin.ir.parsian_bank;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice.ChCardStatementBean;


/**
 * <p>Java class for ArrayOfChCardStatementBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfChCardStatementBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="chCardStatementBean" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chCardStatementBean" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfChCardStatementBean", propOrder = {
    "chCardStatementBean"
})
public class ArrayOfChCardStatementBean {

    @XmlElement(nillable = true)
    protected List<ChCardStatementBean> chCardStatementBean;

    /**
     * Gets the value of the chCardStatementBean property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chCardStatementBean property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChCardStatementBean().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChCardStatementBean }
     * 
     * 
     */
    public List<ChCardStatementBean> getChCardStatementBean() {
        if (chCardStatementBean == null) {
            chCardStatementBean = new ArrayList<ChCardStatementBean>();
        }
        return this.chCardStatementBean;
    }

}
