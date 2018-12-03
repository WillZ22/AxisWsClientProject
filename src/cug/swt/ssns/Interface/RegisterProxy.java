package cug.swt.ssns.Interface;

public class RegisterProxy implements cug.swt.ssns.Interface.Register {
  private String _endpoint = null;
  private cug.swt.ssns.Interface.Register register = null;
  
  public RegisterProxy() {
    _initRegisterProxy();
  }
  
  public RegisterProxy(String endpoint) {
    _endpoint = endpoint;
    _initRegisterProxy();
  }
  
  private void _initRegisterProxy() {
    try {
      register = (new cug.swt.ssns.Interface.impl.RegisterImplServiceLocator()).getregisterservicePort();
      if (register != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)register)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)register)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (register != null)
      ((javax.xml.rpc.Stub)register)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public cug.swt.ssns.Interface.Register getRegister() {
    if (register == null)
      _initRegisterProxy();
    return register;
  }
  
  public java.lang.String register(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException, cug.swt.ssns.Interface.Exception{
    if (register == null)
      _initRegisterProxy();
    return register.register(arg0, arg1);
  }
  
  public java.lang.String unregister(java.lang.String arg0) throws java.rmi.RemoteException, cug.swt.ssns.Interface.Exception{
    if (register == null)
      _initRegisterProxy();
    return register.unregister(arg0);
  }
  
  
}