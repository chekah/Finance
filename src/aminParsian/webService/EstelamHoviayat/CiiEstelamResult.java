
package aminParsian.webService.EstelamHoviayat;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CiiEstelamResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CiiEstelamResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Family" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FatherName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shenasnameseri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Shenasnameserial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ShenasnameNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OfficeCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BookNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BookRow" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DeathStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Message" type="{http://tempuri.org/}ArrayOfString" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CiiEstelamResult", propOrder = {
    "nin",
    "name",
    "family",
    "fatherName",
    "shenasnameseri",
    "shenasnameserial",
    "shenasnameNo",
    "birthDate",
    "gender",
    "officeCode",
    "bookNo",
    "bookRow",
    "deathStatus",
    "message"
})
@XmlSeeAlso({
    CiiEstelamResult3 .class
})
public class CiiEstelamResult {

    @XmlElement(name = "Nin")
    protected long nin;
    @XmlElementRef(name = "Name", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "Family", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> family;
    @XmlElementRef(name = "FatherName", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fatherName;
    @XmlElementRef(name = "Shenasnameseri", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> shenasnameseri;
    @XmlElement(name = "Shenasnameserial")
    protected int shenasnameserial;
    @XmlElement(name = "ShenasnameNo")
    protected int shenasnameNo;
    @XmlElement(name = "BirthDate")
    protected int birthDate;
    @XmlElement(name = "Gender")
    protected int gender;
    @XmlElement(name = "OfficeCode")
    protected int officeCode;
    @XmlElement(name = "BookNo")
    protected int bookNo;
    @XmlElement(name = "BookRow")
    protected int bookRow;
    @XmlElement(name = "DeathStatus")
    protected int deathStatus;
    @XmlElementRef(name = "Message", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfString> message;

    /**
     * Gets the value of the nin property.
     * 
     */
    public long getNin() {
        return nin;
    }

    /**
     * Sets the value of the nin property.
     * 
     */
    public void setNin(long value) {
        this.nin = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the family property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFamily(JAXBElement<String> value) {
        this.family = value;
    }

    /**
     * Gets the value of the fatherName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFatherName() {
        return fatherName;
    }

    /**
     * Sets the value of the fatherName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFatherName(JAXBElement<String> value) {
        this.fatherName = value;
    }

    /**
     * Gets the value of the shenasnameseri property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getShenasnameseri() {
        return shenasnameseri;
    }

    /**
     * Sets the value of the shenasnameseri property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setShenasnameseri(JAXBElement<String> value) {
        this.shenasnameseri = value;
    }

    /**
     * Gets the value of the shenasnameserial property.
     * 
     */
    public int getShenasnameserial() {
        return shenasnameserial;
    }

    /**
     * Sets the value of the shenasnameserial property.
     * 
     */
    public void setShenasnameserial(int value) {
        this.shenasnameserial = value;
    }

    /**
     * Gets the value of the shenasnameNo property.
     * 
     */
    public int getShenasnameNo() {
        return shenasnameNo;
    }

    /**
     * Sets the value of the shenasnameNo property.
     * 
     */
    public void setShenasnameNo(int value) {
        this.shenasnameNo = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     */
    public int getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     */
    public void setBirthDate(int value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     */
    public int getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     */
    public void setGender(int value) {
        this.gender = value;
    }

    /**
     * Gets the value of the officeCode property.
     * 
     */
    public int getOfficeCode() {
        return officeCode;
    }

    /**
     * Sets the value of the officeCode property.
     * 
     */
    public void setOfficeCode(int value) {
        this.officeCode = value;
    }

    /**
     * Gets the value of the bookNo property.
     * 
     */
    public int getBookNo() {
        return bookNo;
    }

    /**
     * Sets the value of the bookNo property.
     * 
     */
    public void setBookNo(int value) {
        this.bookNo = value;
    }

    /**
     * Gets the value of the bookRow property.
     * 
     */
    public int getBookRow() {
        return bookRow;
    }

    /**
     * Sets the value of the bookRow property.
     * 
     */
    public void setBookRow(int value) {
        this.bookRow = value;
    }

    /**
     * Gets the value of the deathStatus property.
     * 
     */
    public int getDeathStatus() {
        return deathStatus;
    }

    /**
     * Sets the value of the deathStatus property.
     * 
     */
    public void setDeathStatus(int value) {
        this.deathStatus = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setMessage(JAXBElement<ArrayOfString> value) {
        this.message = value;
    }

}
