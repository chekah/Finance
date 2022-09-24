
package com.caspian.moderngateway.core.webservicegateway.endpoint.internalbankservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for menuEntryDto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="menuEntryDto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="activity" type="{http://internalbankservice.endpoint.webservicegateway.core.moderngateway.caspian.com/}activityDto" minOccurs="0" form="unqualified"/>
 *         &lt;element name="children" type="{http://internalbankservice.endpoint.webservicegateway.core.moderngateway.caspian.com/}menuEntryDto" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="displayMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="formName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *         &lt;element name="isVisibleInRibbon" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="unqualified"/>
 *         &lt;element name="largeImageAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="order" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/>
 *         &lt;element name="parentId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *         &lt;element name="persianMenuTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="persianRibbonTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="shortcutKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="smallImageAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0" form="unqualified"/>
 *         &lt;element name="visibility" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "menuEntryDto", propOrder = {
    "activity",
    "children",
    "displayMode",
    "formName",
    "id",
    "isVisibleInRibbon",
    "largeImageAddress",
    "order",
    "parentId",
    "persianMenuTitle",
    "persianRibbonTitle",
    "shortcutKey",
    "smallImageAddress",
    "version",
    "visibility"
})
public class MenuEntryDto {

    protected ActivityDto activity;
    @XmlElement(nillable = true)
    protected List<MenuEntryDto> children;
    protected String displayMode;
    protected String formName;
    protected Long id;
    protected Boolean isVisibleInRibbon;
    protected String largeImageAddress;
    protected Integer order;
    protected Long parentId;
    protected String persianMenuTitle;
    protected String persianRibbonTitle;
    protected String shortcutKey;
    protected String smallImageAddress;
    protected Integer version;
    protected Boolean visibility;

    /**
     * Gets the value of the activity property.
     * 
     * @return
     *     possible object is
     *     {@link ActivityDto }
     *     
     */
    public ActivityDto getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActivityDto }
     *     
     */
    public void setActivity(ActivityDto value) {
        this.activity = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the children property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildren().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MenuEntryDto }
     * 
     * 
     */
    public List<MenuEntryDto> getChildren() {
        if (children == null) {
            children = new ArrayList<MenuEntryDto>();
        }
        return this.children;
    }

    /**
     * Gets the value of the displayMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayMode() {
        return displayMode;
    }

    /**
     * Sets the value of the displayMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayMode(String value) {
        this.displayMode = value;
    }

    /**
     * Gets the value of the formName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormName() {
        return formName;
    }

    /**
     * Sets the value of the formName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormName(String value) {
        this.formName = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the isVisibleInRibbon property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsVisibleInRibbon() {
        return isVisibleInRibbon;
    }

    /**
     * Sets the value of the isVisibleInRibbon property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsVisibleInRibbon(Boolean value) {
        this.isVisibleInRibbon = value;
    }

    /**
     * Gets the value of the largeImageAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLargeImageAddress() {
        return largeImageAddress;
    }

    /**
     * Sets the value of the largeImageAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLargeImageAddress(String value) {
        this.largeImageAddress = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOrder(Integer value) {
        this.order = value;
    }

    /**
     * Gets the value of the parentId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentId() {
        return parentId;
    }

    /**
     * Sets the value of the parentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentId(Long value) {
        this.parentId = value;
    }

    /**
     * Gets the value of the persianMenuTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersianMenuTitle() {
        return persianMenuTitle;
    }

    /**
     * Sets the value of the persianMenuTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersianMenuTitle(String value) {
        this.persianMenuTitle = value;
    }

    /**
     * Gets the value of the persianRibbonTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersianRibbonTitle() {
        return persianRibbonTitle;
    }

    /**
     * Sets the value of the persianRibbonTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersianRibbonTitle(String value) {
        this.persianRibbonTitle = value;
    }

    /**
     * Gets the value of the shortcutKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcutKey() {
        return shortcutKey;
    }

    /**
     * Sets the value of the shortcutKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcutKey(String value) {
        this.shortcutKey = value;
    }

    /**
     * Gets the value of the smallImageAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmallImageAddress() {
        return smallImageAddress;
    }

    /**
     * Sets the value of the smallImageAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmallImageAddress(String value) {
        this.smallImageAddress = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setVersion(Integer value) {
        this.version = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisibility(Boolean value) {
        this.visibility = value;
    }

}
