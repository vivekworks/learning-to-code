import java.rmi.*;

public class MyRemoteClient{
	public static void main(String[] args){
		new MyRemoteClient().go();
	}

	public void go(){
		try{
			MyRemote service = (MyRemote) Naming.lookup("rmi://192.168.1.4/RemoteHello");
			String s = service.sayJello();
			System.out.println(s);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}