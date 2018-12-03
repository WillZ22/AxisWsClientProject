/**
 * SubscribeImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cug.swt.ssns.Interface.impl;

public class SubscribeImplServiceLocator extends org.apache.axis.client.Service implements cug.swt.ssns.Interface.impl.SubscribeImplService {

    public SubscribeImplServiceLocator() {
    }


    public SubscribeImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SubscribeImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for subscribeservicePort
    private java.lang.String subscribeservicePort_address = "http://localhost:8080/SSNS/service/subscribeservice";

    public java.lang.String getsubscribeservicePortAddress() {
        return subscribeservicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String subscribeservicePortWSDDServiceName = "subscribeservicePort";

    public java.lang.String getsubscribeservicePortWSDDServiceName() {
        return subscribeservicePortWSDDServiceName;
    }

    public void setsubscribeservicePortWSDDServiceName(java.lang.String name) {
        subscribeservicePortWSDDServiceName = name;
    }

    public cug.swt.ssns.Interface.Subscribe getsubscribeservicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(subscribeservicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getsubscribeservicePort(endpoint);
    }

    public cug.swt.ssns.Interface.Subscribe getsubscribeservicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cug.swt.ssns.Interface.impl.SubscribeImplServiceSoapBindingStub _stub = new cug.swt.ssns.Interface.impl.SubscribeImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getsubscribeservicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setsubscribeservicePortEndpointAddress(java.lang.String address) {
        subscribeservicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cug.swt.ssns.Interface.Subscribe.class.isAssignableFrom(serviceEndpointInterface)) {
                cug.swt.ssns.Interface.impl.SubscribeImplServiceSoapBindingStub _stub = new cug.swt.ssns.Interface.impl.SubscribeImplServiceSoapBindingStub(new java.net.URL(subscribeservicePort_address), this);
                _stub.setPortName(getsubscribeservicePortWSDDServiceName());
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
        if ("subscribeservicePort".equals(inputPortName)) {
            return getsubscribeservicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.Interface.ssns.swt.cug/", "SubscribeImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.Interface.ssns.swt.cug/", "subscribeservicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("subscribeservicePort".equals(portName)) {
            setsubscribeservicePortEndpointAddress(address);
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
