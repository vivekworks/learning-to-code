import java.rmi.*;
import java.rmi.server.*;
import java.util.*;

public class ServiceServerImpl extends UnicastRemoteObject implements ServiceServer{

	HashMap<String, Service> serviceMap = new HashMap<String, Service>();

	public ServiceServerImpl() throws Exception{

	}

	public Service getService(Object serviceKey) throws RemoteException{
		return serviceMap.get(serviceKey);
	}

	public Object[] getServicesList() throws RemoteException{
		setServices();
		return serviceMap.keySet().toArray();
	}

	public static void main(String[] args){
		try{
			ServiceServer mainServer = new ServiceServerImpl();
			Naming.rebind("ServiceServer", mainServer);
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	public void setServices(){
		serviceMap.put("Dice Game", new DiceGameService());
		serviceMap.put("Mini Music", new MiniMusicService());
		serviceMap.put("Day Of The Week", new DayOfTheWeekService());
	}
}