/**
 * SendServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package parsian.webService.mediapayamak;

public class SendServiceLocator extends org.apache.axis.client.Service implements parsian.webService.mediapayamak.SendService {

    public SendServiceLocator() {
    }


    public SendServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SendServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_ISendService
    private java.lang.String BasicHttpBinding_ISendService_address = "http://payamak-service.ir/SendService.svc";

    public java.lang.String getBasicHttpBinding_ISendServiceAddress() {
        return BasicHttpBinding_ISendService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_ISendServiceWSDDServiceName = "BasicHttpBinding_ISendService";

    public java.lang.String getBasicHttpBinding_ISendServiceWSDDServiceName() {
        return BasicHttpBinding_ISendServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_ISendServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_ISendServiceWSDDServiceName = name;
    }

    public parsian.webService.mediapayamak.ISendService getBasicHttpBinding_ISendService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_ISendService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_ISendService(endpoint);
    }

    public parsian.webService.mediapayamak.ISendService getBasicHttpBinding_ISendService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            parsian.webService.mediapayamak.BasicHttpBinding_ISendServiceStub _stub = new parsian.webService.mediapayamak.BasicHttpBinding_ISendServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_ISendServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_ISendServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_ISendService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (parsian.webService.mediapayamak.ISendService.class.isAssignableFrom(serviceEndpointInterface)) {
                parsian.webService.mediapayamak.BasicHttpBinding_ISendServiceStub _stub = new parsian.webService.mediapayamak.BasicHttpBinding_ISendServiceStub(new java.net.URL(BasicHttpBinding_ISendService_address), this);
                _stub.setPortName(getBasicHttpBinding_ISendServiceWSDDServiceName());
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
        if ("BasicHttpBinding_ISendService".equals(inputPortName)) {
            return getBasicHttpBinding_ISendService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "SendService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_ISendService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_ISendService".equals(portName)) {
            setBasicHttpBinding_ISendServiceEndpointAddress(address);
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
