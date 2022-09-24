
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chDepositSearchRequestBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chDepositSearchRequestBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="depositAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="depositNumbers" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="depositStatus" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chDepositStatus" minOccurs="0" form="unqualified"/>
 *         &lt;element name="excludeCurrency" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="excludeType" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chDepositGroupType" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="forSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="unqualified"/>
 *         &lt;element name="includeCreditAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="unqualified"/>
 *         &lt;element name="includeCurrency" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="includeSupportAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="unqualified"/>
 *         &lt;element name="includeType" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chDepositGroupType" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *         &lt;element name="offset" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0" form="unqualified"/>
 *         &lt;element name="personality" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chPersonalityType" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="serviceCode" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}servicesCode" minOccurs="0" form="unqualified"/>
 *         &lt;element name="signatureStatus" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chSignatureOwnerStatus" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chDepositSearchRequestBean", propOrder = {
    "cif",
    "depositAlias",
    "depositNumbers",
    "depositStatus",
    "excludeCurrency",
    "excludeType",
    "forSearch",
    "includeCreditAccount",
    "includeCurrency",
    "includeSupportAccount",
    "includeType",
    "length",
    "offset",
    "personality",
    "serviceCode",
    "signatureStatus"
})
public class ChDepositSearchRequestBean {

    protected String cif;
    protected String depositAlias;
    @XmlElement(nillable = true)
    protected List<String> depositNumbers;
    protected ChDepositStatus depositStatus;
    @XmlElement(nillable = true)
    protected List<String> excludeCurrency;
    @XmlElement(nillable = true)
    protected List<ChDepositGroupType> excludeType;
    protected Boolean forSearch;
    protected Boolean includeCreditAccount;
    @XmlElement(nillable = true)
    protected List<String> includeCurrency;
    protected Boolean includeSupportAccount;
    @XmlElement(nillable = true)
    protected List<ChDepositGroupType> includeType;
    protected Long length;
    protected Long offset;
    @XmlElement(nillable = true)
    protected List<ChPersonalityType> personality;
    protected ServicesCode serviceCode;
    @XmlElement(nillable = true)
    protected List<ChSignatureOwnerStatus> signatureStatus;

    /**
     * Gets the value of the cif property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCif() {
        return cif;
    }

    /**
     * Sets the value of the cif property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCif(String value) {
        this.cif = value;
    }

    /**
     * Gets the value of the depositAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositAlias() {
        return depositAlias;
    }

    /**
     * Sets the value of the depositAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositAlias(String value) {
        this.depositAlias = value;
    }

    /**
     * Gets the value of the depositNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depositNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepositNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDepositNumbers() {
        if (depositNumbers == null) {
            depositNumbers = new ArrayList<String>();
        }
        return this.depositNumbers;
    }

    /**
     * Gets the value of the depositStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChDepositStatus }
     *     
     */
    public ChDepositStatus getDepositStatus() {
        return depositStatus;
    }

    /**
     * Sets the value of the depositStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChDepositStatus }
     *     
     */
    public void setDepositStatus(ChDepositStatus value) {
        this.depositStatus = value;
    }

    /**
     * Gets the value of the excludeCurrency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeCurrency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExcludeCurrency() {
        if (excludeCurrency == null) {
            excludeCurrency = new ArrayList<String>();
        }
        return this.excludeCurrency;
    }

    /**
     * Gets the value of the excludeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the excludeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExcludeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChDepositGroupType }
     * 
     * 
     */
    public List<ChDepositGroupType> getExcludeType() {
        if (excludeType == null) {
            excludeType = new ArrayList<ChDepositGroupType>();
        }
        return this.excludeType;
    }

    /**
     * Gets the value of the forSearch property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForSearch() {
        return forSearch;
    }

    /**
     * Sets the value of the forSearch property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForSearch(Boolean value) {
        this.forSearch = value;
    }

    /**
     * Gets the value of the includeCreditAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeCreditAccount() {
        return includeCreditAccount;
    }

    /**
     * Sets the value of the includeCreditAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeCreditAccount(Boolean value) {
        this.includeCreditAccount = value;
    }

    /**
     * Gets the value of the includeCurrency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeCurrency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeCurrency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIncludeCurrency() {
        if (includeCurrency == null) {
            includeCurrency = new ArrayList<String>();
        }
        return this.includeCurrency;
    }

    /**
     * Gets the value of the includeSupportAccount property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSupportAccount() {
        return includeSupportAccount;
    }

    /**
     * Sets the value of the includeSupportAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSupportAccount(Boolean value) {
        this.includeSupportAccount = value;
    }

    /**
     * Gets the value of the includeType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the includeType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncludeType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChDepositGroupType }
     * 
     * 
     */
    public List<ChDepositGroupType> getIncludeType() {
        if (includeType == null) {
            includeType = new ArrayList<ChDepositGroupType>();
        }
        return this.includeType;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLength(Long value) {
        this.length = value;
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOffset(Long value) {
        this.offset = value;
    }

    /**
     * Gets the value of the personality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChPersonalityType }
     * 
     * 
     */
    public List<ChPersonalityType> getPersonality() {
        if (personality == null) {
            personality = new ArrayList<ChPersonalityType>();
        }
        return this.personality;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link ServicesCode }
     *     
     */
    public ServicesCode getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicesCode }
     *     
     */
    public void setServiceCode(ServicesCode value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the signatureStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the signatureStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSignatureStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChSignatureOwnerStatus }
     * 
     * 
     */
    public List<ChSignatureOwnerStatus> getSignatureStatus() {
        if (signatureStatus == null) {
            signatureStatus = new ArrayList<ChSignatureOwnerStatus>();
        }
        return this.signatureStatus;
    }

}
