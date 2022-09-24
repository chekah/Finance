
package aminParsian.webService.EstelamHoviayat;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CiiPersonInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CiiPersonInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nin" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Family" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Fathername" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Shenasnameseri" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Shenasnameserial" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="ShenasnameNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DateHasPostfix" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OfficeCode" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BookNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NameHasPrefix" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="NameHasPostFix" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FamilyHasPrefix" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="FamilyHasPostFix" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CiiPersonInfo", propOrder = {
    "nin",
    "name",
    "family",
    "fathername",
    "shenasnameseri",
    "shenasnameserial",
    "shenasnameNo",
    "birthDate",
    "dateHasPostfix",
    "gender",
    "officeCode",
    "bookNo",
    "nameHasPrefix",
    "nameHasPostFix",
    "familyHasPrefix",
    "familyHasPostFix"
})
public class CiiPersonInfo {

    @XmlElement(name = "Nin")
    protected long nin;
    @XmlElementRef(name = "Name", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> name;
    @XmlElementRef(name = "Family", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> family;
    @XmlElementRef(name = "Fathername", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> fathername;
    @XmlElementRef(name = "Shenasnameseri", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> shenasnameseri;
    @XmlElement(name = "Shenasnameserial")
    protected int shenasnameserial;
    @XmlElement(name = "ShenasnameNo")
    protected int shenasnameNo;
    @XmlElement(name = "BirthDate")
    protected int birthDate;
    @XmlElement(name = "DateHasPostfix")
    protected int dateHasPostfix;
    @XmlElement(name = "Gender")
    protected int gender;
    @XmlElement(name = "OfficeCode")
    protected int officeCode;
    @XmlElement(name = "BookNo")
    protected int bookNo;
    @XmlElement(name = "NameHasPrefix")
    protected int nameHasPrefix;
    @XmlElement(name = "NameHasPostFix")
    protected int nameHasPostFix;
    @XmlElement(name = "FamilyHasPrefix")
    protected int familyHasPrefix;
    @XmlElement(name = "FamilyHasPostFix")
    protected int familyHasPostFix;

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
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setName(JAXBElement<byte[]> value) {
        this.name = value;
    }

    /**
     * Gets the value of the family property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getFamily() {
        return family;
    }

    /**
     * Sets the value of the family property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setFamily(JAXBElement<byte[]> value) {
        this.family = value;
    }

    /**
     * Gets the value of the fathername property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getFathername() {
        return fathername;
    }

    /**
     * Sets the value of the fathername property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setFathername(JAXBElement<byte[]> value) {
        this.fathername = value;
    }

    /**
     * Gets the value of the shenasnameseri property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getShenasnameseri() {
        return shenasnameseri;
    }

    /**
     * Sets the value of the shenasnameseri property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setShenasnameseri(JAXBElement<byte[]> value) {
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
     * Gets the value of the dateHasPostfix property.
     * 
     */
    public int getDateHasPostfix() {
        return dateHasPostfix;
    }

    /**
     * Sets the value of the dateHasPostfix property.
     * 
     */
    public void setDateHasPostfix(int value) {
        this.dateHasPostfix = value;
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
     * Gets the value of the nameHasPrefix property.
     * 
     */
    public int getNameHasPrefix() {
        return nameHasPrefix;
    }

    /**
     * Sets the value of the nameHasPrefix property.
     * 
     */
    public void setNameHasPrefix(int value) {
        this.nameHasPrefix = value;
    }

    /**
     * Gets the value of the nameHasPostFix property.
     * 
     */
    public int getNameHasPostFix() {
        return nameHasPostFix;
    }

    /**
     * Sets the value of the nameHasPostFix property.
     * 
     */
    public void setNameHasPostFix(int value) {
        this.nameHasPostFix = value;
    }

    /**
     * Gets the value of the familyHasPrefix property.
     * 
     */
    public int getFamilyHasPrefix() {
        return familyHasPrefix;
    }

    /**
     * Sets the value of the familyHasPrefix property.
     * 
     */
    public void setFamilyHasPrefix(int value) {
        this.familyHasPrefix = value;
    }

    /**
     * Gets the value of the familyHasPostFix property.
     * 
     */
    public int getFamilyHasPostFix() {
        return familyHasPostFix;
    }

    /**
     * Sets the value of the familyHasPostFix property.
     * 
     */
    public void setFamilyHasPostFix(int value) {
        this.familyHasPostFix = value;
    }

}
