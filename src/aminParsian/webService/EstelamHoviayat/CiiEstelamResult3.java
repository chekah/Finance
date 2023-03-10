
package aminParsian.webService.EstelamHoviayat;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CiiEstelamResult3 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CiiEstelamResult3">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}CiiEstelamResult">
 *       &lt;sequence>
 *         &lt;element name="DeathDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExceptionMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CiiEstelamResult3", propOrder = {
    "deathDate",
    "exceptionMessage"
})
public class CiiEstelamResult3
    extends CiiEstelamResult
{

    @XmlElementRef(name = "DeathDate", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deathDate;
    @XmlElementRef(name = "ExceptionMessage", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exceptionMessage;

    /**
     * Gets the value of the deathDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeathDate() {
        return deathDate;
    }

    /**
     * Sets the value of the deathDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeathDate(JAXBElement<String> value) {
        this.deathDate = value;
    }

    /**
     * Gets the value of the exceptionMessage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExceptionMessage() {
        return exceptionMessage;
    }

    /**
     * Sets the value of the exceptionMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExceptionMessage(JAXBElement<String> value) {
        this.exceptionMessage = value;
    }

}
