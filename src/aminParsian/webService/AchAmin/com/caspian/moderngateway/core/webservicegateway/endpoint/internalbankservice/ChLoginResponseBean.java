
package com.caspian.moderngateway.core.webservicegateway.endpoint.internalbankservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for chLoginResponseBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chLoginResponseBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activities" type="{http://internalbankservice.endpoint.webservicegateway.core.moderngateway.caspian.com/}activityDto" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="clientType" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" minOccurs="0" form="unqualified"/>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="customerNo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *         &lt;element name="foreignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="gender" type="{http://internalbankservice.endpoint.webservicegateway.core.moderngateway.caspian.com/}chGender" minOccurs="0" form="unqualified"/>
 *         &lt;element name="lastLoginTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="menu" type="{http://internalbankservice.endpoint.webservicegateway.core.moderngateway.caspian.com/}menuDto" minOccurs="0" form="unqualified"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="requiredChangeSecondPassword" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="unqualified"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="userProfile" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chLoginResponseBean", propOrder = {
    "activities",
    "clientType",
    "code",
    "customerNo",
    "foreignName",
    "gender",
    "lastLoginTime",
    "menu",
    "name",
    "requiredChangeSecondPassword",
    "sessionId",
    "title",
    "userProfile"
})
public class ChLoginResponseBean {

    @XmlElement(nillable = true)
    protected List<ActivityDto> activities;
    @XmlSchemaType(name = "unsignedShort")
    protected Integer clientType;
    protected String code;
    protected Long customerNo;
    protected String foreignName;
    protected ChGender gender;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastLoginTime;
    protected MenuDto menu;
    protected String name;
    protected Boolean requiredChangeSecondPassword;
    protected String sessionId;
    protected String title;
    protected byte[] userProfile;

    /**
     * Gets the value of the activities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivityDto }
     * 
     * 
     */
    public List<ActivityDto> getActivities() {
        if (activities == null) {
            activities = new ArrayList<ActivityDto>();
        }
        return this.activities;
    }

    /**
     * Gets the value of the clientType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getClientType() {
        return clientType;
    }

    /**
     * Sets the value of the clientType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setClientType(Integer value) {
        this.clientType = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the customerNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerNo() {
        return customerNo;
    }

    /**
     * Sets the value of the customerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerNo(Long value) {
        this.customerNo = value;
    }

    /**
     * Gets the value of the foreignName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignName() {
        return foreignName;
    }

    /**
     * Sets the value of the foreignName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignName(String value) {
        this.foreignName = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link ChGender }
     *     
     */
    public ChGender getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChGender }
     *     
     */
    public void setGender(ChGender value) {
        this.gender = value;
    }

    /**
     * Gets the value of the lastLoginTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * Sets the value of the lastLoginTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastLoginTime(XMLGregorianCalendar value) {
        this.lastLoginTime = value;
    }

    /**
     * Gets the value of the menu property.
     * 
     * @return
     *     possible object is
     *     {@link MenuDto }
     *     
     */
    public MenuDto getMenu() {
        return menu;
    }

    /**
     * Sets the value of the menu property.
     * 
     * @param value
     *     allowed object is
     *     {@link MenuDto }
     *     
     */
    public void setMenu(MenuDto value) {
        this.menu = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the requiredChangeSecondPassword property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequiredChangeSecondPassword() {
        return requiredChangeSecondPassword;
    }

    /**
     * Sets the value of the requiredChangeSecondPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequiredChangeSecondPassword(Boolean value) {
        this.requiredChangeSecondPassword = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the userProfile property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getUserProfile() {
        return userProfile;
    }

    /**
     * Sets the value of the userProfile property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setUserProfile(byte[] value) {
        this.userProfile = value;
    }

}
