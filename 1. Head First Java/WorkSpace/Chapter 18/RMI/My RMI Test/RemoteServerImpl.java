import java.rmi.*;
import java.rmi.server.*;
import java.math.*;

public class RemoteServerImpl extends UnicastRemoteObject implements RemoteInterface{

	public RemoteServerImpl() throws RemoteException{

	}

	public static void main(String[] args){
		try{
			RemoteInterface remoteService = new RemoteServerImpl();
			Naming.rebind("doCalc",remoteService);
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	public double doCalc(double vari) throws RemoteException{
		return Math.sqrt(vari);
	}
}