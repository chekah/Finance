
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for chDepositBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chDepositBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="availableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="blockedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="branchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="creditDeposit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="creditLoanRemainAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="creditRateAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0" form="unqualified"/>
 *         &lt;element name="creditRemainAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="dayOfDepositInterest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="depositAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="depositNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="depositStatus" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chDepositStatus" minOccurs="0" form="unqualified"/>
 *         &lt;element name="depositTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="expireDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="extraAvailableBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="group" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chDepositGroupType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="iban" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="inaugurationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0" form="unqualified"/>
 *         &lt;element name="interestAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="lotusFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="unqualified"/>
 *         &lt;element name="maximumBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="minimumBalance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="owner" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chDepositOwnerType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="owners" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="personality" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chPersonalityType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="signature" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chSignatureOwnerStatus" minOccurs="0" form="unqualified"/>
 *         &lt;element name="supportCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="supportDepositNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="supportDepositStatus" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chDepositStatus" minOccurs="0" form="unqualified"/>
 *         &lt;element name="supportStatus" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chSupportStatus" minOccurs="0" form="unqualified"/>
 *         &lt;element name="withdrawalOption" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chWithdrawalOption" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chDepositBean", propOrder = {
    "availableBalance",
    "balance",
    "blockedAmount",
    "branchCode",
    "creditDeposit",
    "creditLoanRemainAmount",
    "creditRateAmount",
    "creditRemainAmount",
    "currency",
    "dayOfDepositInterest",
    "depositAlias",
    "depositNumber",
    "depositStatus",
    "depositTitle",
    "expireDate",
    "extraAvailableBalance",
    "group",
    "iban",
    "inaugurationDate",
    "interestAccount",
    "lotusFlag",
    "maximumBalance",
    "minimumBalance",
    "owner",
    "owners",
    "personality",
    "signature",
    "supportCurrency",
    "supportDepositNumber",
    "supportDepositStatus",
    "supportStatus",
    "withdrawalOption"
})
public class ChDepositBean {

    protected BigDecimal availableBalance;
    protected BigDecimal balance;
    protected BigDecimal blockedAmount;
    protected String branchCode;
    protected String creditDeposit;
    protected BigDecimal creditLoanRemainAmount;
    protected Double creditRateAmount;
    protected BigDecimal creditRemainAmount;
    protected String currency;
    protected String dayOfDepositInterest;
    protected String depositAlias;
    protected String depositNumber;
    protected ChDepositStatus depositStatus;
    protected String depositTitle;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expireDate;
    protected BigDecimal extraAvailableBalance;
    protected ChDepositGroupType group;
    protected String iban;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inaugurationDate;
    protected String interestAccount;
    protected Boolean lotusFlag;
    protected BigDecimal maximumBalance;
    protected BigDecimal minimumBalance;
    protected ChDepositOwnerType owner;
    protected String owners;
    protected ChPersonalityType personality;
    protected ChSignatureOwnerStatus signature;
    protected String supportCurrency;
    protected String supportDepositNumber;
    protected ChDepositStatus supportDepositStatus;
    protected ChSupportStatus supportStatus;
    protected ChWithdrawalOption withdrawalOption;

    /**
     * Gets the value of the availableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    /**
     * Sets the value of the availableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAvailableBalance(BigDecimal value) {
        this.availableBalance = value;
    }

    /**
     * Gets the value of the balance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * Sets the value of the balance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBalance(BigDecimal value) {
        this.balance = value;
    }

    /**
     * Gets the value of the blockedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBlockedAmount() {
        return blockedAmount;
    }

    /**
     * Sets the value of the blockedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBlockedAmount(BigDecimal value) {
        this.blockedAmount = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchCode(String value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the creditDeposit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditDeposit() {
        return creditDeposit;
    }

    /**
     * Sets the value of the creditDeposit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditDeposit(String value) {
        this.creditDeposit = value;
    }

    /**
     * Gets the value of the creditLoanRemainAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditLoanRemainAmount() {
        return creditLoanRemainAmount;
    }

    /**
     * Sets the value of the creditLoanRemainAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditLoanRemainAmount(BigDecimal value) {
        this.creditLoanRemainAmount = value;
    }

    /**
     * Gets the value of the creditRateAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getCreditRateAmount() {
        return creditRateAmount;
    }

    /**
     * Sets the value of the creditRateAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setCreditRateAmount(Double value) {
        this.creditRateAmount = value;
    }

    /**
     * Gets the value of the creditRemainAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCreditRemainAmount() {
        return creditRemainAmount;
    }

    /**
     * Sets the value of the creditRemainAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCreditRemainAmount(BigDecimal value) {
        this.creditRemainAmount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the dayOfDepositInterest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayOfDepositInterest() {
        return dayOfDepositInterest;
    }

    /**
     * Sets the value of the dayOfDepositInterest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayOfDepositInterest(String value) {
        this.dayOfDepositInterest = value;
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
     * Gets the value of the depositNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositNumber() {
        return depositNumber;
    }

    /**
     * Sets the value of the depositNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositNumber(String value) {
        this.depositNumber = value;
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
     * Gets the value of the depositTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositTitle() {
        return depositTitle;
    }

    /**
     * Sets the value of the depositTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositTitle(String value) {
        this.depositTitle = value;
    }

    /**
     * Gets the value of the expireDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpireDate() {
        return expireDate;
    }

    /**
     * Sets the value of the expireDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpireDate(XMLGregorianCalendar value) {
        this.expireDate = value;
    }

    /**
     * Gets the value of the extraAvailableBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtraAvailableBalance() {
        return extraAvailableBalance;
    }

    /**
     * Sets the value of the extraAvailableBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtraAvailableBalance(BigDecimal value) {
        this.extraAvailableBalance = value;
    }

    /**
     * Gets the value of the group property.
     * 
     * @return
     *     possible object is
     *     {@link ChDepositGroupType }
     *     
     */
    public ChDepositGroupType getGroup() {
        return group;
    }

    /**
     * Sets the value of the group property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChDepositGroupType }
     *     
     */
    public void setGroup(ChDepositGroupType value) {
        this.group = value;
    }

    /**
     * Gets the value of the iban property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIban() {
        return iban;
    }

    /**
     * Sets the value of the iban property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIban(String value) {
        this.iban = value;
    }

    /**
     * Gets the value of the inaugurationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInaugurationDate() {
        return inaugurationDate;
    }

    /**
     * Sets the value of the inaugurationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInaugurationDate(XMLGregorianCalendar value) {
        this.inaugurationDate = value;
    }

    /**
     * Gets the value of the interestAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterestAccount() {
        return interestAccount;
    }

    /**
     * Sets the value of the interestAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterestAccount(String value) {
        this.interestAccount = value;
    }

    /**
     * Gets the value of the lotusFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLotusFlag() {
        return lotusFlag;
    }

    /**
     * Sets the value of the lotusFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLotusFlag(Boolean value) {
        this.lotusFlag = value;
    }

    /**
     * Gets the value of the maximumBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumBalance() {
        return maximumBalance;
    }

    /**
     * Sets the value of the maximumBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumBalance(BigDecimal value) {
        this.maximumBalance = value;
    }

    /**
     * Gets the value of the minimumBalance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumBalance() {
        return minimumBalance;
    }

    /**
     * Sets the value of the minimumBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumBalance(BigDecimal value) {
        this.minimumBalance = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link ChDepositOwnerType }
     *     
     */
    public ChDepositOwnerType getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChDepositOwnerType }
     *     
     */
    public void setOwner(ChDepositOwnerType value) {
        this.owner = value;
    }

    /**
     * Gets the value of the owners property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwners() {
        return owners;
    }

    /**
     * Sets the value of the owners property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwners(String value) {
        this.owners = value;
    }

    /**
     * Gets the value of the personality property.
     * 
     * @return
     *     possible object is
     *     {@link ChPersonalityType }
     *     
     */
    public ChPersonalityType getPersonality() {
        return personality;
    }

    /**
     * Sets the value of the personality property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChPersonalityType }
     *     
     */
    public void setPersonality(ChPersonalityType value) {
        this.personality = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link ChSignatureOwnerStatus }
     *     
     */
    public ChSignatureOwnerStatus getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChSignatureOwnerStatus }
     *     
     */
    public void setSignature(ChSignatureOwnerStatus value) {
        this.signature = value;
    }

    /**
     * Gets the value of the supportCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportCurrency() {
        return supportCurrency;
    }

    /**
     * Sets the value of the supportCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportCurrency(String value) {
        this.supportCurrency = value;
    }

    /**
     * Gets the value of the supportDepositNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportDepositNumber() {
        return supportDepositNumber;
    }

    /**
     * Sets the value of the supportDepositNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportDepositNumber(String value) {
        this.supportDepositNumber = value;
    }

    /**
     * Gets the value of the supportDepositStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChDepositStatus }
     *     
     */
    public ChDepositStatus getSupportDepositStatus() {
        return supportDepositStatus;
    }

    /**
     * Sets the value of the supportDepositStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChDepositStatus }
     *     
     */
    public void setSupportDepositStatus(ChDepositStatus value) {
        this.supportDepositStatus = value;
    }

    /**
     * Gets the value of the supportStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ChSupportStatus }
     *     
     */
    public ChSupportStatus getSupportStatus() {
        return supportStatus;
    }

    /**
     * Sets the value of the supportStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChSupportStatus }
     *     
     */
    public void setSupportStatus(ChSupportStatus value) {
        this.supportStatus = value;
    }

    /**
     * Gets the value of the withdrawalOption property.
     * 
     * @return
     *     possible object is
     *     {@link ChWithdrawalOption }
     *     
     */
    public ChWithdrawalOption getWithdrawalOption() {
        return withdrawalOption;
    }

    /**
     * Sets the value of the withdrawalOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChWithdrawalOption }
     *     
     */
    public void setWithdrawalOption(ChWithdrawalOption value) {
        this.withdrawalOption = value;
    }

}
