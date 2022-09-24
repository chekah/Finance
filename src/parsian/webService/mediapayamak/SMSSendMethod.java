/**
 * SMSSendMethod.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package parsian.webService.mediapayamak;

public class SMSSendMethod implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SMSSendMethod(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _Quick = "Quick";
    public static final java.lang.String _Test = "Test";
    public static final java.lang.String _Regional = "Regional";
    public static final java.lang.String _Group = "Group";
    public static final java.lang.String _WebService = "WebService";
    public static final java.lang.String _Announcement = "Announcement";
    public static final java.lang.String _Secretary = "Secretary";
    public static final java.lang.String _IntelligentSend = "IntelligentSend";
    public static final java.lang.String _CorrespondingSend = "CorrespondingSend";
    public static final java.lang.String _CodeReader = "CodeReader";
    public static final java.lang.String _Poll = "Poll";
    public static final java.lang.String _Transfer = "Transfer";
    public static final java.lang.String _Reply = "Reply";
    public static final java.lang.String _PhoneBook = "PhoneBook";
    public static final java.lang.String _PostalCode = "PostalCode";
    public static final java.lang.String _SmsEvent = "SmsEvent";
    public static final java.lang.String _IntelligentSecretary = "IntelligentSecretary";
    public static final java.lang.String _AddToPhoneBook = "AddToPhoneBook";
    public static final java.lang.String _InstantSms = "InstantSms";
    public static final java.lang.String _ScheduleSms = "ScheduleSms";
    public static final java.lang.String _UsanceSms = "UsanceSms";
    public static final SMSSendMethod None = new SMSSendMethod(_None);
    public static final SMSSendMethod Quick = new SMSSendMethod(_Quick);
    public static final SMSSendMethod Test = new SMSSendMethod(_Test);
    public static final SMSSendMethod Regional = new SMSSendMethod(_Regional);
    public static final SMSSendMethod Group = new SMSSendMethod(_Group);
    public static final SMSSendMethod WebService = new SMSSendMethod(_WebService);
    public static final SMSSendMethod Announcement = new SMSSendMethod(_Announcement);
    public static final SMSSendMethod Secretary = new SMSSendMethod(_Secretary);
    public static final SMSSendMethod IntelligentSend = new SMSSendMethod(_IntelligentSend);
    public static final SMSSendMethod CorrespondingSend = new SMSSendMethod(_CorrespondingSend);
    public static final SMSSendMethod CodeReader = new SMSSendMethod(_CodeReader);
    public static final SMSSendMethod Poll = new SMSSendMethod(_Poll);
    public static final SMSSendMethod Transfer = new SMSSendMethod(_Transfer);
    public static final SMSSendMethod Reply = new SMSSendMethod(_Reply);
    public static final SMSSendMethod PhoneBook = new SMSSendMethod(_PhoneBook);
    public static final SMSSendMethod PostalCode = new SMSSendMethod(_PostalCode);
    public static final SMSSendMethod SmsEvent = new SMSSendMethod(_SmsEvent);
    public static final SMSSendMethod IntelligentSecretary = new SMSSendMethod(_IntelligentSecretary);
    public static final SMSSendMethod AddToPhoneBook = new SMSSendMethod(_AddToPhoneBook);
    public static final SMSSendMethod InstantSms = new SMSSendMethod(_InstantSms);
    public static final SMSSendMethod ScheduleSms = new SMSSendMethod(_ScheduleSms);
    public static final SMSSendMethod UsanceSms = new SMSSendMethod(_UsanceSms);
    public java.lang.String getValue() { return _value_;}
    public static SMSSendMethod fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SMSSendMethod enumeration = (SMSSendMethod)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SMSSendMethod fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SMSSendMethod.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/SMSPanel.Domain.Enums", "SMSSendMethod"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
