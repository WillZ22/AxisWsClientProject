/**
 * RegisterImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cug.swt.ssns.Interface.impl;

public class RegisterImplServiceLocator extends org.apache.axis.client.Service implements cug.swt.ssns.Interface.impl.RegisterImplService {

    public RegisterImplServiceLocator() {
    }


    public RegisterImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RegisterImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for registerservicePort
    private java.lang.String registerservicePort_address = "http://localhost:8080/SSNS/service/registerservice";

    public java.lang.String getregisterservicePortAddress() {
        return registerservicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String registerservicePortWSDDServiceName = "registerservicePort";

    public java.lang.String getregisterservicePortWSDDServiceName() {
        return registerservicePortWSDDServiceName;
    }

    public void setregisterservicePortWSDDServiceName(java.lang.String name) {
        registerservicePortWSDDServiceName = name;
    }

    public cug.swt.ssns.Interface.Register getregisterservicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(registerservicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getregisterservicePort(endpoint);
    }

    public cug.swt.ssns.Interface.Register getregisterservicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cug.swt.ssns.Interface.impl.RegisterImplServiceSoapBindingStub _stub = new cug.swt.ssns.Interface.impl.RegisterImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getregisterservicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setregisterservicePortEndpointAddress(java.lang.String address) {
        registerservicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cug.swt.ssns.Interface.Register.class.isAssignableFrom(serviceEndpointInterface)) {
                cug.swt.ssns.Interface.impl.RegisterImplServiceSoapBindingStub _stub = new cug.swt.ssns.Interface.impl.RegisterImplServiceSoapBindingStub(new java.net.URL(registerservicePort_address), this);
                _stub.setPortName(getregisterservicePortWSDDServiceName());
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
        if ("registerservicePort".equals(inputPortName)) {
            return getregisterservicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.Interface.ssns.swt.cug/", "RegisterImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.Interface.ssns.swt.cug/", "registerservicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("registerservicePort".equals(portName)) {
            setregisterservicePortEndpointAddress(address);
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
