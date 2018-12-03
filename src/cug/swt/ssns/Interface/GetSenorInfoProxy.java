package cug.swt.ssns.Interface;

public class GetSenorInfoProxy implements cug.swt.ssns.Interface.GetSenorInfo {
  private String _endpoint = null;
  private cug.swt.ssns.Interface.GetSenorInfo getSenorInfo = null;
  
  public GetSenorInfoProxy() {
    _initGetSenorInfoProxy();
  }
  
  public GetSenorInfoProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetSenorInfoProxy();
  }
  
  private void _initGetSenorInfoProxy() {
    try {
      getSenorInfo = (new cug.swt.ssns.Interface.impl.GetSensorInfoImplServiceLocator()).getgetsensorinfoPort();
      if (getSenorInfo != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getSenorInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getSenorInfo)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getSenorInfo != null)
      ((javax.xml.rpc.Stub)getSenorInfo)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cug.swt.ssns.Interface.GetSenorInfo getGetSenorInfo() {
    if (getSenorInfo == null)
      _initGetSenorInfoProxy();
    return getSenorInfo;
  }
  
  public cug.swt.ssns.Interface.Sensor[] getSenosorList() throws java.rmi.RemoteException{
    if (getSenorInfo == null)
      _initGetSenorInfoProxy();
    return getSenorInfo.getSenosorList();
  }
  
  public cug.swt.ssns.Interface.Sensor getSensorInfo(java.lang.String arg0) throws java.rmi.RemoteException, cug.swt.ssns.Interface.SensorNotExistException{
    if (getSenorInfo == null)
      _initGetSenorInfoProxy();
    return getSenorInfo.getSensorInfo(arg0);
  }
  
  
}