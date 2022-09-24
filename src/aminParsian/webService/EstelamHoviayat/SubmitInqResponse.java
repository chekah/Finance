
package aminParsian.webService.EstelamHoviayat;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
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
 *         &lt;element name="SubmitInqResult" type="{http://schemas.datacontract.org/2004/07/SabtLogic}SabtInqRes" minOccurs="0"/>
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
    "submitInqResult"
})
@XmlRootElement(name = "SubmitInqResponse")
public class SubmitInqResponse {

    @XmlElementRef(name = "SubmitInqResult", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<SabtInqRes> submitInqResult;

    /**
     * Gets the value of the submitInqResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SabtInqRes }{@code >}
     *     
     */
    public JAXBElement<SabtInqRes> getSubmitInqResult() {
        return submitInqResult;
    }

    /**
     * Sets the value of the submitInqResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SabtInqRes }{@code >}
     *     
     */
    public void setSubmitInqResult(JAXBElement<SabtInqRes> value) {
        this.submitInqResult = value;
    }

}
