/**
 * DarmanWebService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package aminParsian.webService.virtualBank;

public class DarmanWebService_ServiceLocator extends org.apache.axis.client.Service implements aminParsian.webService.virtualBank.DarmanWebService_Service {

    public DarmanWebService_ServiceLocator() {
    }


    public DarmanWebService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DarmanWebService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DarmanWebServicePort
    private java.lang.String DarmanWebServicePort_address = "http://192.168.10.14:8080/services/DarmanWebService";

    public java.lang.String getDarmanWebServicePortAddress() {
        return DarmanWebServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DarmanWebServicePortWSDDServiceName = "DarmanWebServicePort";

    public java.lang.String getDarmanWebServicePortWSDDServiceName() {
        return DarmanWebServicePortWSDDServiceName;
    }

    public void setDarmanWebServicePortWSDDServiceName(java.lang.String name) {
        DarmanWebServicePortWSDDServiceName = name;
    }

    public aminParsian.webService.virtualBank.DarmanWebService_PortType getDarmanWebServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DarmanWebServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDarmanWebServicePort(endpoint);
    }

    public aminParsian.webService.virtualBank.DarmanWebService_PortType getDarmanWebServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            aminParsian.webService.virtualBank.DarmanWebServicePortBindingStub _stub = new aminParsian.webService.virtualBank.DarmanWebServicePortBindingStub(portAddress, this);
            _stub.setPortName(getDarmanWebServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDarmanWebServicePortEndpointAddress(java.lang.String address) {
        DarmanWebServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (aminParsian.webService.virtualBank.DarmanWebService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                aminParsian.webService.virtualBank.DarmanWebServicePortBindingStub _stub = new aminParsian.webService.virtualBank.DarmanWebServicePortBindingStub(new java.net.URL(DarmanWebServicePort_address), this);
                _stub.setPortName(getDarmanWebServicePortWSDDServiceName());
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
        if ("DarmanWebServicePort".equals(inputPortName)) {
            return getDarmanWebServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://implementation.service.aminParsian/", "DarmanWebService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://implementation.service.aminParsian/", "DarmanWebServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DarmanWebServicePort".equals(portName)) {
            setDarmanWebServicePortEndpointAddress(address);
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
