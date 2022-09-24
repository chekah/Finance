/**
 * MessageInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package parsian.webService.mediapayamak;

public class MessageInfo  implements java.io.Serializable {
    private java.util.Calendar actionDateTime;

    private java.lang.String content;

    private java.math.BigDecimal cost;

    private java.lang.Integer count;

    private java.lang.String desc;

    private java.lang.Boolean flash;

    private java.lang.Boolean isRead;

    private parsian.webService.mediapayamak.SMSLang lang;

    private java.lang.Integer messageId;

    private parsian.webService.mediapayamak.SMSDirectionType messageType;

    private java.lang.Boolean moneyIsRefunded;

    private java.lang.Integer notSent;

    private java.lang.Integer pages;

    private java.lang.String receiver;

    private parsian.webService.mediapayamak.SMSSendMethod sendMethod;

    private parsian.webService.mediapayamak.SMSSendStatus sendStatus;

    private java.lang.String sender;

    private java.lang.Integer sent;

    private parsian.webService.mediapayamak.SMSStatus status;

    private java.math.BigDecimal tariff;

    private java.lang.String title;

    private java.lang.Integer userId;

    public MessageInfo() {
    }

    public MessageInfo(
           java.util.Calendar actionDateTime,
           java.lang.String content,
           java.math.BigDecimal cost,
           java.lang.Integer count,
           java.lang.String desc,
           java.lang.Boolean flash,
           java.lang.Boolean isRead,
           parsian.webService.mediapayamak.SMSLang lang,
           java.lang.Integer messageId,
           parsian.webService.mediapayamak.SMSDirectionType messageType,
           java.lang.Boolean moneyIsRefunded,
           java.lang.Integer notSent,
           java.lang.Integer pages,
           java.lang.String receiver,
           parsian.webService.mediapayamak.SMSSendMethod sendMethod,
           parsian.webService.mediapayamak.SMSSendStatus sendStatus,
           java.lang.String sender,
           java.lang.Integer sent,
           parsian.webService.mediapayamak.SMSStatus status,
           java.math.BigDecimal tariff,
           java.lang.String title,
           java.lang.Integer userId) {
           this.actionDateTime = actionDateTime;
           this.content = content;
           this.cost = cost;
           this.count = count;
           this.desc = desc;
           this.flash = flash;
           this.isRead = isRead;
           this.lang = lang;
           this.messageId = messageId;
           this.messageType = messageType;
           this.moneyIsRefunded = moneyIsRefunded;
           this.notSent = notSent;
           this.pages = pages;
           this.receiver = receiver;
           this.sendMethod = sendMethod;
           this.sendStatus = sendStatus;
           this.sender = sender;
           this.sent = sent;
           this.status = status;
           this.tariff = tariff;
           this.title = title;
           this.userId = userId;
    }


    /**
     * Gets the actionDateTime value for this MessageInfo.
     * 
     * @return actionDateTime
     */
    public java.util.Calendar getActionDateTime() {
        return actionDateTime;
    }


    /**
     * Sets the actionDateTime value for this MessageInfo.
     * 
     * @param actionDateTime
     */
    public void setActionDateTime(java.util.Calendar actionDateTime) {
        this.actionDateTime = actionDateTime;
    }


    /**
     * Gets the content value for this MessageInfo.
     * 
     * @return content
     */
    public java.lang.String getContent() {
        return content;
    }


    /**
     * Sets the content value for this MessageInfo.
     * 
     * @param content
     */
    public void setContent(java.lang.String content) {
        this.content = content;
    }


    /**
     * Gets the cost value for this MessageInfo.
     * 
     * @return cost
     */
    public java.math.BigDecimal getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this MessageInfo.
     * 
     * @param cost
     */
    public void setCost(java.math.BigDecimal cost) {
        this.cost = cost;
    }


    /**
     * Gets the count value for this MessageInfo.
     * 
     * @return count
     */
    public java.lang.Integer getCount() {
        return count;
    }


    /**
     * Sets the count value for this MessageInfo.
     * 
     * @param count
     */
    public void setCount(java.lang.Integer count) {
        this.count = count;
    }


    /**
     * Gets the desc value for this MessageInfo.
     * 
     * @return desc
     */
    public java.lang.String getDesc() {
        return desc;
    }


    /**
     * Sets the desc value for this MessageInfo.
     * 
     * @param desc
     */
    public void setDesc(java.lang.String desc) {
        this.desc = desc;
    }


    /**
     * Gets the flash value for this MessageInfo.
     * 
     * @return flash
     */
    public java.lang.Boolean getFlash() {
        return flash;
    }


    /**
     * Sets the flash value for this MessageInfo.
     * 
     * @param flash
     */
    public void setFlash(java.lang.Boolean flash) {
        this.flash = flash;
    }


    /**
     * Gets the isRead value for this MessageInfo.
     * 
     * @return isRead
     */
    public java.lang.Boolean getIsRead() {
        return isRead;
    }


    /**
     * Sets the isRead value for this MessageInfo.
     * 
     * @param isRead
     */
    public void setIsRead(java.lang.Boolean isRead) {
        this.isRead = isRead;
    }


    /**
     * Gets the lang value for this MessageInfo.
     * 
     * @return lang
     */
    public parsian.webService.mediapayamak.SMSLang getLang() {
        return lang;
    }


    /**
     * Sets the lang value for this MessageInfo.
     * 
     * @param lang
     */
    public void setLang(parsian.webService.mediapayamak.SMSLang lang) {
        this.lang = lang;
    }


    /**
     * Gets the messageId value for this MessageInfo.
     * 
     * @return messageId
     */
    public java.lang.Integer getMessageId() {
        return messageId;
    }


    /**
     * Sets the messageId value for this MessageInfo.
     * 
     * @param messageId
     */
    public void setMessageId(java.lang.Integer messageId) {
        this.messageId = messageId;
    }


    /**
     * Gets the messageType value for this MessageInfo.
     * 
     * @return messageType
     */
    public parsian.webService.mediapayamak.SMSDirectionType getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this MessageInfo.
     * 
     * @param messageType
     */
    public void setMessageType(parsian.webService.mediapayamak.SMSDirectionType messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the moneyIsRefunded value for this MessageInfo.
     * 
     * @return moneyIsRefunded
     */
    public java.lang.Boolean getMoneyIsRefunded() {
        return moneyIsRefunded;
    }


    /**
     * Sets the moneyIsRefunded value for this MessageInfo.
     * 
     * @param moneyIsRefunded
     */
    public void setMoneyIsRefunded(java.lang.Boolean moneyIsRefunded) {
        this.moneyIsRefunded = moneyIsRefunded;
    }


    /**
     * Gets the notSent value for this MessageInfo.
     * 
     * @return notSent
     */
    public java.lang.Integer getNotSent() {
        return notSent;
    }


    /**
     * Sets the notSent value for this MessageInfo.
     * 
     * @param notSent
     */
    public void setNotSent(java.lang.Integer notSent) {
        this.notSent = notSent;
    }


    /**
     * Gets the pages value for this MessageInfo.
     * 
     * @return pages
     */
    public java.lang.Integer getPages() {
        return pages;
    }


    /**
     * Sets the pages value for this MessageInfo.
     * 
     * @param pages
     */
    public void setPages(java.lang.Integer pages) {
        this.pages = pages;
    }


    /**
     * Gets the receiver value for this MessageInfo.
     * 
     * @return receiver
     */
    public java.lang.String getReceiver() {
        return receiver;
    }


    /**
     * Sets the receiver value for this MessageInfo.
     * 
     * @param receiver
     */
    public void setReceiver(java.lang.String receiver) {
        this.receiver = receiver;
    }


    /**
     * Gets the sendMethod value for this MessageInfo.
     * 
     * @return sendMethod
     */
    public parsian.webService.mediapayamak.SMSSendMethod getSendMethod() {
        return sendMethod;
    }


    /**
     * Sets the sendMethod value for this MessageInfo.
     * 
     * @param sendMethod
     */
    public void setSendMethod(parsian.webService.mediapayamak.SMSSendMethod sendMethod) {
        this.sendMethod = sendMethod;
    }


    /**
     * Gets the sendStatus value for this MessageInfo.
     * 
     * @return sendStatus
     */
    public parsian.webService.mediapayamak.SMSSendStatus getSendStatus() {
        return sendStatus;
    }


    /**
     * Sets the sendStatus value for this MessageInfo.
     * 
     * @param sendStatus
     */
    public void setSendStatus(parsian.webService.mediapayamak.SMSSendStatus sendStatus) {
        this.sendStatus = sendStatus;
    }


    /**
     * Gets the sender value for this MessageInfo.
     * 
     * @return sender
     */
    public java.lang.String getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this MessageInfo.
     * 
     * @param sender
     */
    public void setSender(java.lang.String sender) {
        this.sender = sender;
    }


    /**
     * Gets the sent value for this MessageInfo.
     * 
     * @return sent
     */
    public java.lang.Integer getSent() {
        return sent;
    }


    /**
     * Sets the sent value for this MessageInfo.
     * 
     * @param sent
     */
    public void setSent(java.lang.Integer sent) {
        this.sent = sent;
    }


    /**
     * Gets the status value for this MessageInfo.
     * 
     * @return status
     */
    public parsian.webService.mediapayamak.SMSStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this MessageInfo.
     * 
     * @param status
     */
    public void setStatus(parsian.webService.mediapayamak.SMSStatus status) {
        this.status = status;
    }


    /**
     * Gets the tariff value for this MessageInfo.
     * 
     * @return tariff
     */
    public java.math.BigDecimal getTariff() {
        return tariff;
    }


    /**
     * Sets the tariff value for this MessageInfo.
     * 
     * @param tariff
     */
    public void setTariff(java.math.BigDecimal tariff) {
        this.tariff = tariff;
    }


    /**
     * Gets the title value for this MessageInfo.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this MessageInfo.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the userId value for this MessageInfo.
     * 
     * @return userId
     */
    public java.lang.Integer getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this MessageInfo.
     * 
     * @param userId
     */
    public void setUserId(java.lang.Integer userId) {
        this.userId = userId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageInfo)) return false;
        MessageInfo other = (MessageInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionDateTime==null && other.getActionDateTime()==null) || 
             (this.actionDateTime!=null &&
              this.actionDateTime.equals(other.getActionDateTime()))) &&
            ((this.content==null && other.getContent()==null) || 
             (this.content!=null &&
              this.content.equals(other.getContent()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.count==null && other.getCount()==null) || 
             (this.count!=null &&
              this.count.equals(other.getCount()))) &&
            ((this.desc==null && other.getDesc()==null) || 
             (this.desc!=null &&
              this.desc.equals(other.getDesc()))) &&
            ((this.flash==null && other.getFlash()==null) || 
             (this.flash!=null &&
              this.flash.equals(other.getFlash()))) &&
            ((this.isRead==null && other.getIsRead()==null) || 
             (this.isRead!=null &&
              this.isRead.equals(other.getIsRead()))) &&
            ((this.lang==null && other.getLang()==null) || 
             (this.lang!=null &&
              this.lang.equals(other.getLang()))) &&
            ((this.messageId==null && other.getMessageId()==null) || 
             (this.messageId!=null &&
              this.messageId.equals(other.getMessageId()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.moneyIsRefunded==null && other.getMoneyIsRefunded()==null) || 
             (this.moneyIsRefunded!=null &&
              this.moneyIsRefunded.equals(other.getMoneyIsRefunded()))) &&
            ((this.notSent==null && other.getNotSent()==null) || 
             (this.notSent!=null &&
              this.notSent.equals(other.getNotSent()))) &&
            ((this.pages==null && other.getPages()==null) || 
             (this.pages!=null &&
              this.pages.equals(other.getPages()))) &&
            ((this.receiver==null && other.getReceiver()==null) || 
             (this.receiver!=null &&
              this.receiver.equals(other.getReceiver()))) &&
            ((this.sendMethod==null && other.getSendMethod()==null) || 
             (this.sendMethod!=null &&
              this.sendMethod.equals(other.getSendMethod()))) &&
            ((this.sendStatus==null && other.getSendStatus()==null) || 
             (this.sendStatus!=null &&
              this.sendStatus.equals(other.getSendStatus()))) &&
            ((this.sender==null && other.getSender()==null) || 
             (this.sender!=null &&
              this.sender.equals(other.getSender()))) &&
            ((this.sent==null && other.getSent()==null) || 
             (this.sent!=null &&
              this.sent.equals(other.getSent()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.tariff==null && other.getTariff()==null) || 
             (this.tariff!=null &&
              this.tariff.equals(other.getTariff()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.userId==null && other.getUserId()==null) || 
             (this.userId!=null &&
              this.userId.equals(other.getUserId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getActionDateTime() != null) {
            _hashCode += getActionDateTime().hashCode();
        }
        if (getContent() != null) {
            _hashCode += getContent().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getCount() != null) {
            _hashCode += getCount().hashCode();
        }
        if (getDesc() != null) {
            _hashCode += getDesc().hashCode();
        }
        if (getFlash() != null) {
            _hashCode += getFlash().hashCode();
        }
        if (getIsRead() != null) {
            _hashCode += getIsRead().hashCode();
        }
        if (getLang() != null) {
            _hashCode += getLang().hashCode();
        }
        if (getMessageId() != null) {
            _hashCode += getMessageId().hashCode();
        }
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
        }
        if (getMoneyIsRefunded() != null) {
            _hashCode += getMoneyIsRefunded().hashCode();
        }
        if (getNotSent() != null) {
            _hashCode += getNotSent().hashCode();
        }
        if (getPages() != null) {
            _hashCode += getPages().hashCode();
        }
        if (getReceiver() != null) {
            _hashCode += getReceiver().hashCode();
        }
        if (getSendMethod() != null) {
            _hashCode += getSendMethod().hashCode();
        }
        if (getSendStatus() != null) {
            _hashCode += getSendStatus().hashCode();
        }
        if (getSender() != null) {
            _hashCode += getSender().hashCode();
        }
        if (getSent() != null) {
            _hashCode += getSent().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTariff() != null) {
            _hashCode += getTariff().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getUserId() != null) {
            _hashCode += getUserId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "MessageInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "ActionDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "Content"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "Cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "Count"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("desc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "Desc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flash");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "Flash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isRead");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "IsRead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lang");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "Lang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Common.Enums", "SMSLang"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "MessageId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "MessageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Enums", "SMSDirectionType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moneyIsRefunded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "MoneyIsRefunded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notSent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "NotSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "Pages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receiver");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "Receiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "SendMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Enums", "SMSSendMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "SendStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Enums", "SMSSendStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "Sender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "Sent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Enums", "SMSStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tariff");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "Tariff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Models", "UserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
