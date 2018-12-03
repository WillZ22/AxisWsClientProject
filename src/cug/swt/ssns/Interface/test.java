package cug.swt.ssns.Interface;

import java.rmi.RemoteException;


public class test {


	public static void main(String[] args) throws Exception, RemoteException {
		RegisterProxy registerProxy = new RegisterProxy();
		SubscribeProxy subscribeProxy = new SubscribeProxy();
		StatusChangeProxy statusChangeProxy = new StatusChangeProxy();
		GetSenorInfoProxy getSenorInfoProxy = new GetSenorInfoProxy();
	}
}
