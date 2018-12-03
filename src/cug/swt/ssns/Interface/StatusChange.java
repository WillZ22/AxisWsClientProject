/**
 * StatusChange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cug.swt.ssns.Interface;

public interface StatusChange extends java.rmi.Remote {
    public java.lang.String stop(java.lang.String arg0) throws java.rmi.RemoteException, cug.swt.ssns.Interface.SensorNotExistException, cug.swt.ssns.Interface.Exception;
    public java.lang.String pause(java.lang.String arg0) throws java.rmi.RemoteException, cug.swt.ssns.Interface.SensorNotExistException, cug.swt.ssns.Interface.Exception;
    public java.lang.String resume(java.lang.String arg0) throws java.rmi.RemoteException, cug.swt.ssns.Interface.SensorNotExistException, cug.swt.ssns.Interface.Exception;
    public java.lang.String start(java.lang.String arg0) throws java.rmi.RemoteException, cug.swt.ssns.Interface.SensorNotExistException, cug.swt.ssns.Interface.Exception;
}
