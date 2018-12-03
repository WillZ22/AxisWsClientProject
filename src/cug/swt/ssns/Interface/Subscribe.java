/**
 * Subscribe.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cug.swt.ssns.Interface;

public interface Subscribe extends java.rmi.Remote {
    public cug.swt.ssns.Interface.Consumer getConsumerInfo(java.lang.String arg0) throws java.rmi.RemoteException;
    public java.lang.String[] subscribe(java.lang.String[] arg0, java.lang.String arg1) throws java.rmi.RemoteException, cug.swt.ssns.Interface.SensorNotExistException;
    public java.lang.String[] unsubscribe(java.lang.String[] arg0, java.lang.String arg1) throws java.rmi.RemoteException, cug.swt.ssns.Interface.ConsumerNotExistException, cug.swt.ssns.Interface.SensorNotExistException;
}
