/**
 * SMSServiceSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package aminParsian.webService.sms;

public interface SMSServiceSoap_PortType extends java.rmi.Remote {
    public java.lang.String createSMS(java.lang.String docID, java.lang.String docDate, java.lang.String mobileNo, java.lang.String SMSText, int type) throws java.rmi.RemoteException;
}
