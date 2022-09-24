
package aminParsian.webService.AchAmin.ir.parsian_bank;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBatchAcntTransferDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBatchAcntTransferDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="batchAcntTransferDetail" type="{http://www.parsian-bank.ir/}batchAcntTransferDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBatchAcntTransferDetail", propOrder = {
    "batchAcntTransferDetail"
})
public class ArrayOfBatchAcntTransferDetail {

    @XmlElement(nillable = true)
    protected List<BatchAcntTransferDetail> batchAcntTransferDetail;

    /**
     * Gets the value of the batchAcntTransferDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the batchAcntTransferDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBatchAcntTransferDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BatchAcntTransferDetail }
     * 
     * 
     */
    public List<BatchAcntTransferDetail> getBatchAcntTransferDetail() {
        if (batchAcntTransferDetail == null) {
            batchAcntTransferDetail = new ArrayList<BatchAcntTransferDetail>();
        }
        return this.batchAcntTransferDetail;
    }

}
