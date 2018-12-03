package cug.swt.ssns.Interface;

public class SubscribeProxy implements cug.swt.ssns.Interface.Subscribe {
  private String _endpoint = null;
  private cug.swt.ssns.Interface.Subscribe subscribe = null;
  
  public SubscribeProxy() {
    _initSubscribeProxy();
  }
  
  public SubscribeProxy(String endpoint) {
    _endpoint = endpoint;
    _initSubscribeProxy();
  }
  
  private void _initSubscribeProxy() {
    try {
      subscribe = (new cug.swt.ssns.Interface.impl.SubscribeImplServiceLocator()).getsubscribeservicePort();
      if (subscribe != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)subscribe)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)subscribe)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (subscribe != null)
      ((javax.xml.rpc.Stub)subscribe)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cug.swt.ssns.Interface.Subscribe getSubscribe() {
    if (subscribe == null)
      _initSubscribeProxy();
    return subscribe;
  }
  
  public cug.swt.ssns.Interface.Consumer getConsumerInfo(java.lang.String arg0) throws java.rmi.RemoteException{
    if (subscribe == null)
      _initSubscribeProxy();
    return subscribe.getConsumerInfo(arg0);
  }
  
  public java.lang.String[] subscribe(java.lang.String[] arg0, java.lang.String arg1) throws java.rmi.RemoteException, cug.swt.ssns.Interface.SensorNotExistException{
    if (subscribe == null)
      _initSubscribeProxy();
    return subscribe.subscribe(arg0, arg1);
  }
  
  public java.lang.String[] unsubscribe(java.lang.String[] arg0, java.lang.String arg1) throws java.rmi.RemoteException, cug.swt.ssns.Interface.ConsumerNotExistException, cug.swt.ssns.Interface.SensorNotExistException{
    if (subscribe == null)
      _initSubscribeProxy();
    return subscribe.unsubscribe(arg0, arg1);
  }
  
  
}