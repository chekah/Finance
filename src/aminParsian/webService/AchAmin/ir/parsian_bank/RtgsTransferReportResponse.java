
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
 *         &lt;element name="rtgsTransferReportResult" type="{http://www.parsian-bank.ir/}rtgsTransferReportResult" minOccurs="0"/>
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
    "rtgsTransferReportResult"
})
@XmlRootElement(name = "rtgsTransferReportResponse")
public class RtgsTransferReportResponse {

    protected RtgsTransferReportResult rtgsTransferReportResult;

    /**
     * Gets the value of the rtgsTransferReportResult property.
     * 
     * @return
     *     possible object is
     *     {@link RtgsTransferReportResult }
     *     
     */
    public RtgsTransferReportResult getRtgsTransferReportResult() {
        return rtgsTransferReportResult;
    }

    /**
     * Sets the value of the rtgsTransferReportResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RtgsTransferReportResult }
     *     
     */
    public void setRtgsTransferReportResult(RtgsTransferReportResult value) {
        this.rtgsTransferReportResult = value;
    }

}
