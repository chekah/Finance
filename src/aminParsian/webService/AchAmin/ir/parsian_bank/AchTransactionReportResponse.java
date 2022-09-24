
package aminParsian.webService.AchAmin.ir.parsian_bank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="achTransactionReportResult" type="{http://www.parsian-bank.ir/}achTransactionReportResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "achTransactionReportResult"
})
@XmlRootElement(name = "achTransactionReportResponse")
public class AchTransactionReportResponse {

    protected AchTransactionReportResult achTransactionReportResult;

    /**
     * Gets the value of the achTransactionReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link AchTransactionReportResult }
     *     
     */
    public AchTransactionReportResult getAchTransactionReportResult() {
        return achTransactionReportResult;
    }

    /**
     * Sets the value of the achTransactionReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link AchTransactionReportResult }
     *     
     */
    public void setAchTransactionReportResult(AchTransactionReportResult value) {
        this.achTransactionReportResult = value;
    }

}
