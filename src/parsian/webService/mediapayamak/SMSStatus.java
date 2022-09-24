/**
 * SMSStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package parsian.webService.mediapayamak;

public class SMSStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SMSStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _Pending = "Pending";
    public static final java.lang.String _Illegal = "Illegal";
    public static final java.lang.String _Sending = "Sending";
    public static final java.lang.String _NotApproved = "NotApproved";
    public static final java.lang.String _Sent = "Sent";
    public static final java.lang.String _Canceled = "Canceled";
    public static final java.lang.String _Error = "Error";
    public static final java.lang.String _NoCredit = "NoCredit";
    public static final java.lang.String _NotSent = "NotSent";
    public static final java.lang.String _WaitForSend = "WaitForSend";
    public static final java.lang.String _PendingDecCost = "PendingDecCost";
    public static final java.lang.String _InQueue = "InQueue";
    public static final SMSStatus None = new SMSStatus(_None);
    public static final SMSStatus Pending = new SMSStatus(_Pending);
    public static final SMSStatus Illegal = new SMSStatus(_Illegal);
    public static final SMSStatus Sending = new SMSStatus(_Sending);
    public static final SMSStatus NotApproved = new SMSStatus(_NotApproved);
    public static final SMSStatus Sent = new SMSStatus(_Sent);
    public static final SMSStatus Canceled = new SMSStatus(_Canceled);
    public static final SMSStatus Error = new SMSStatus(_Error);
    public static final SMSStatus NoCredit = new SMSStatus(_NoCredit);
    public static final SMSStatus NotSent = new SMSStatus(_NotSent);
    public static final SMSStatus WaitForSend = new SMSStatus(_WaitForSend);
    public static final SMSStatus PendingDecCost = new SMSStatus(_PendingDecCost);
    public static final SMSStatus InQueue = new SMSStatus(_InQueue);
    public java.lang.String getValue() { return _value_;}
    public static SMSStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SMSStatus enumeration = (SMSStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SMSStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SMSStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Enums", "SMSStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
