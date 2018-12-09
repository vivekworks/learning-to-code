import java.rmi.*;
import java.rmi.server.*;


public interface ServiceServer extends Remote {
	public Service getService(Object serviceKey) throws RemoteException;
	public Object[] getServicesList() throws RemoteException;
}