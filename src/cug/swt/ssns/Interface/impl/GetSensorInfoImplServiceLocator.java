/**
 * GetSensorInfoImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cug.swt.ssns.Interface.impl;

public class GetSensorInfoImplServiceLocator extends org.apache.axis.client.Service implements cug.swt.ssns.Interface.impl.GetSensorInfoImplService {

    public GetSensorInfoImplServiceLocator() {
    }


    public GetSensorInfoImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetSensorInfoImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for getsensorinfoPort
    private java.lang.String getsensorinfoPort_address = "http://localhost:8080/SSNS/service/getsensorinfo";

    public java.lang.String getgetsensorinfoPortAddress() {
        return getsensorinfoPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String getsensorinfoPortWSDDServiceName = "getsensorinfoPort";

    public java.lang.String getgetsensorinfoPortWSDDServiceName() {
        return getsensorinfoPortWSDDServiceName;
    }

    public void setgetsensorinfoPortWSDDServiceName(java.lang.String name) {
        getsensorinfoPortWSDDServiceName = name;
    }

    public cug.swt.ssns.Interface.GetSenorInfo getgetsensorinfoPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(getsensorinfoPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getgetsensorinfoPort(endpoint);
    }

    public cug.swt.ssns.Interface.GetSenorInfo getgetsensorinfoPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            cug.swt.ssns.Interface.impl.GetSensorInfoImplServiceSoapBindingStub _stub = new cug.swt.ssns.Interface.impl.GetSensorInfoImplServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getgetsensorinfoPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setgetsensorinfoPortEndpointAddress(java.lang.String address) {
        getsensorinfoPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (cug.swt.ssns.Interface.GetSenorInfo.class.isAssignableFrom(serviceEndpointInterface)) {
                cug.swt.ssns.Interface.impl.GetSensorInfoImplServiceSoapBindingStub _stub = new cug.swt.ssns.Interface.impl.GetSensorInfoImplServiceSoapBindingStub(new java.net.URL(getsensorinfoPort_address), this);
                _stub.setPortName(getgetsensorinfoPortWSDDServiceName());
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
        if ("getsensorinfoPort".equals(inputPortName)) {
            return getgetsensorinfoPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://impl.Interface.ssns.swt.cug/", "GetSensorInfoImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://impl.Interface.ssns.swt.cug/", "getsensorinfoPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("getsensorinfoPort".equals(portName)) {
            setgetsensorinfoPortEndpointAddress(address);
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
