
package aminParsian.webService.AchAmin.com.caspian.channelmanager.core.webservicegateway.endpoint.corebankingservice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for chBatchTransferResponseBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="chBatchTransferResponseBean">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="balance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0" form="unqualified"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *         &lt;element name="depositProblem" type="{http://corebankingservice.endpoint.webservicegateway.core.channelmanager.caspian.com/}chDepositProblemBean" maxOccurs="unbounded" minOccurs="0" form="unqualified"/>
 *         &lt;element name="doneCompletely" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0" form="unqualified"/>
 *         &lt;element name="transferId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chBatchTransferResponseBean", propOrder = {
    "balance",
    "currency",
    "depositProblem",
    "doneCompletely",
    "transferId"
})
public class ChBatchTransferResponseBean {

    protected BigDecimal balance;
    protected String currency;
    @XmlElement(nillable = true)
    protected List<ChDepositProblemBean> depositProblem;
    protected Boolean doneCompletely;
    protected String transferId;

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
     * Gets the value of the depositProblem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the depositProblem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepositProblem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChDepositProblemBean }
     * 
     * 
     */
    public List<ChDepositProblemBean> getDepositProblem() {
        if (depositProblem == null) {
            depositProblem = new ArrayList<ChDepositProblemBean>();
        }
        return this.depositProblem;
    }

    /**
     * Gets the value of the doneCompletely property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoneCompletely() {
        return doneCompletely;
    }

    /**
     * Sets the value of the doneCompletely property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoneCompletely(Boolean value) {
        this.doneCompletely = value;
    }

    /**
     * Gets the value of the transferId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferId() {
        return transferId;
    }

    /**
     * Sets the value of the transferId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferId(String value) {
        this.transferId = value;
    }

}
