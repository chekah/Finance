/**
 * SMSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package aminParsian.webService.sms;

public interface SMSService extends javax.xml.rpc.Service {
    public java.lang.String getSMSServiceSoapAddress();

    public aminParsian.webService.sms.SMSServiceSoap_PortType getSMSServiceSoap() throws javax.xml.rpc.ServiceException;

    public aminParsian.webService.sms.SMSServiceSoap_PortType getSMSServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
