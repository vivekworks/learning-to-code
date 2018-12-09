import java.io.*;
import java.net.*;
public class DailyAdviceServer{
	String[] adviceList = {"Take smaller bites","Go for the tight jeans. No they do NOT make you look fat","One word : inappropriate","Just for today, be honest. Tell your boss what you *really* think","You might want to rethink that haircut"};
	public void go(){
		try{
			ServerSocket servSock = new ServerSocket(4242);
			while(true){
				Socket sock = servSock.accept();
				PrintWriter writer = new PrintWriter(sock.getOutputStream());
				String advice = getAdvice();
				writer.write(advice);
				writer.close();
				System.out.println(advice);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	public static void main(String[] args){
		DailyAdviceServer dailyAdSer = new DailyAdviceServer();
		dailyAdSer.go();
	}

	public String getAdvice(){
		int random = (int)(Math.random()*adviceList.length);
		return adviceList[random];
	}
}