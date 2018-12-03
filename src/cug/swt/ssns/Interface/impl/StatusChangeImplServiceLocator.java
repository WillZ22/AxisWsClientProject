/**
 * StatusChangeImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cug.swt.ssns.Interface.impl;

public class StatusChangeImplServiceLocator extends org.apache.axis.client.Service implements cug.swt.ssns.Interface.impl.StatusChangeImplService {

    public StatusChangeImplServiceLocator() {
    }


    public StatusChangeImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StatusChangeImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for statusChangePort
    private java.lang.String statusChangePort_address = "http://localhost:8080/SSNS/service/statuschange";

    public java.lang.String getstatusChangePortAddress() {
        return statusChangePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String statusChangePortWSDDServiceName = "statusChangePort";

    public java.lang.String getstatusChangePortWSDDServiceName() {
        return statusChangePortWSDDServiceName;
    }

    public void setstatusChangePortWSDDServiceName(java.lang.String name) {
        statusChangePortWSDDServiceName = name;
    }

    public cug.swt.ssns.Interface.StatusChange getstatusChangePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(statusChangePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getstatusChangePort(endpoint);
    }

    public cug.swt.ssns.Interface.StatusChange getstatusChangePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cug.swt.ssns.Interface.impl.StatusChangeImplServiceSoapBindingStub _stub = new cug.swt.ssns.Interface.impl.StatusChangeImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getstatusChangePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setstatusChangePortEndpointAddress(java.lang.String address) {
        statusChangePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cug.swt.ssns.Interface.StatusChange.class.isAssignableFrom(serviceEndpointInterface)) {
                cug.swt.ssns.Interface.impl.StatusChangeImplServiceSoapBindingStub _stub = new cug.swt.ssns.Interface.impl.StatusChangeImplServiceSoapBindingStub(new java.net.URL(statusChangePort_address), this);
                _stub.setPortName(getstatusChangePortWSDDServiceName());
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
        if ("statusChangePort".equals(inputPortName)) {
            return getstatusChangePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.Interface.ssns.swt.cug/", "StatusChangeImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.Interface.ssns.swt.cug/", "statusChangePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("statusChangePort".equals(portName)) {
            setstatusChangePortEndpointAddress(address);
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
