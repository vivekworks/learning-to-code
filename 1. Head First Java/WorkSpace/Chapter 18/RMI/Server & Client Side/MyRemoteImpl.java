import java.rmi.*;
import java.rmi.server.*;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

	public String sayHello() throws RemoteException{
		System.out.println("Hey, Hello!");
		return "Hello";
	}

	public MyRemoteImpl() throws RemoteException{

	}

	public static void main(String[] args){
		try{
			MyRemote service = new MyRemoteImpl();
			Naming.rebind("RemoteHello",service);
		} catch(Exception e){

		}
	}
}