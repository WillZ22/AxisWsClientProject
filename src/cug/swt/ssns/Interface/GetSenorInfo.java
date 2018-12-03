/**
 * GetSenorInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cug.swt.ssns.Interface;

public interface GetSenorInfo extends java.rmi.Remote {
    public cug.swt.ssns.Interface.Sensor[] getSenosorList() throws java.rmi.RemoteException;
    public cug.swt.ssns.Interface.Sensor getSensorInfo(java.lang.String arg0) throws java.rmi.RemoteException, cug.swt.ssns.Interface.SensorNotExistException;
}
