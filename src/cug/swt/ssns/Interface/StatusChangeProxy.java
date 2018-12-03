package cug.swt.ssns.Interface;

public class StatusChangeProxy implements cug.swt.ssns.Interface.StatusChange {
  private String _endpoint = null;
  private cug.swt.ssns.Interface.StatusChange statusChange = null;
  
  public StatusChangeProxy() {
    _initStatusChangeProxy();
  }
  
  public StatusChangeProxy(String endpoint) {
    _endpoint = endpoint;
    _initStatusChangeProxy();
  }
  
  private void _initStatusChangeProxy() {
    try {
      statusChange = (new cug.swt.ssns.Interface.impl.StatusChangeImplServiceLocator()).getstatusChangePort();
      if (statusChange != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)statusChange)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)statusChange)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (statusChange != null)
      ((javax.xml.rpc.Stub)statusChange)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cug.swt.ssns.Interface.StatusChange getStatusChange() {
    if (statusChange == null)
      _initStatusChangeProxy();
    return statusChange;
  }
  
  public java.lang.String stop(java.lang.String arg0) throws java.rmi.RemoteException, cug.swt.ssns.Interface.SensorNotExistException, cug.swt.ssns.Interface.Exception{
    if (statusChange == null)
      _initStatusChangeProxy();
    return statusChange.stop(arg0);
  }
  
  public java.lang.String pause(java.lang.String arg0) throws java.rmi.RemoteException, cug.swt.ssns.Interface.SensorNotExistException, cug.swt.ssns.Interface.Exception{
    if (statusChange == null)
      _initStatusChangeProxy();
    return statusChange.pause(arg0);
  }
  
  public java.lang.String resume(java.lang.String arg0) throws java.rmi.RemoteException, cug.swt.ssns.Interface.SensorNotExistException, cug.swt.ssns.Interface.Exception{
    if (statusChange == null)
      _initStatusChangeProxy();
    return statusChange.resume(arg0);
  }
  
  public java.lang.String start(java.lang.String arg0) throws java.rmi.RemoteException, cug.swt.ssns.Interface.SensorNotExistException, cug.swt.ssns.Interface.Exception{
    if (statusChange == null)
      _initStatusChangeProxy();
    return statusChange.start(arg0);
  }
  
  
}