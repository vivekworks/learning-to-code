import java.rmi.*;
import java.rmi.server.*;

public class RemoteClientImpl{

	public static void main(String[] args){
		new RemoteClientImpl().go();
	}

	public void go(){
		try{
			RemoteInterface serverService = (RemoteInterface)Naming.lookup("rmi://192.168.1.4/doCalc");
			double value = serverService.doCalc(7);
			System.out.println(value);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}