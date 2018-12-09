import java.io.*;
import java.net.*;
public class DailyAdviceClient{
	public static void main(String[] args){
		DailyAdviceClient dailyClient = new DailyAdviceClient();
		dailyClient.go();
	}

	public void go(){
		try{
			Socket sock = new Socket("127.0.0.1",4242);
			InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
			BufferedReader reader = new BufferedReader(streamReader);
			String line = reader.readLine();
			System.out.println(line);
			reader.close();
		} catch(Exception e){
			System.out.println(e);
		}
	}
}