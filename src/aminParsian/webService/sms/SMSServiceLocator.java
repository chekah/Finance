/**
 * SMSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package aminParsian.webService.sms;

public class SMSServiceLocator extends org.apache.axis.client.Service implements aminParsian.webService.sms.SMSService {

    public SMSServiceLocator() {
    }


    public SMSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SMSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SMSServiceSoap
    private java.lang.String SMSServiceSoap_address = "http://172.17.40.4:90/smsservice.asmx";

    public java.lang.String getSMSServiceSoapAddress() {
        return SMSServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SMSServiceSoapWSDDServiceName = "SMSServiceSoap";

    public java.lang.String getSMSServiceSoapWSDDServiceName() {
        return SMSServiceSoapWSDDServiceName;
    }

    public void setSMSServiceSoapWSDDServiceName(java.lang.String name) {
        SMSServiceSoapWSDDServiceName = name;
    }

    public aminParsian.webService.sms.SMSServiceSoap_PortType getSMSServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SMSServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSMSServiceSoap(endpoint);
    }

    public aminParsian.webService.sms.SMSServiceSoap_PortType getSMSServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            aminParsian.webService.sms.SMSServiceSoap_BindingStub _stub = new aminParsian.webService.sms.SMSServiceSoap_BindingStub(portAddress, this);
            _stub.setPortName(getSMSServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSMSServiceSoapEndpointAddress(java.lang.String address) {
        SMSServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (aminParsian.webService.sms.SMSServiceSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                aminParsian.webService.sms.SMSServiceSoap_BindingStub _stub = new aminParsian.webService.sms.SMSServiceSoap_BindingStub(new java.net.URL(SMSServiceSoap_address), this);
                _stub.setPortName(getSMSServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SMSServiceSoap".equals(inputPortName)) {
            return getSMSServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "SMSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "SMSServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SMSServiceSoap".equals(portName)) {
            setSMSServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
