import java.util.*;
import java.io.*;
import java.net.*;
public class SimpleServer{
	ArrayList<Socket> clientSocketList;
	ObjectOutputStream oos;
	public static void main(String[] args){
		new SimpleServer().start();
	}

	public void start(){
		Socket clientSocket = null;
		try{
			clientSocketList = new ArrayList<Socket>();
			ServerSocket servSock = new ServerSocket(8765);
			while(true){
				clientSocket = servSock.accept();
				clientSocketList.add(clientSocket);
				oos = new ObjectOutputStream(clientSocket.getOutputStream());
				Thread thread = new Thread(new ClientHandler(clientSocket));
				thread.start();
				// System.out.println("Got a connection");
				// System.out.println("getInetAddress() - "+clientSocket.getInetAddress());
				// System.out.println("getLocalAddress() - "+clientSocket.getLocalAddress());
				// System.out.println("getLocalPort() - "+clientSocket.getLocalPort());
				// System.out.println("getLocalSocketAddress() - "+clientSocket.getLocalSocketAddress());
				// System.out.println("getRemoteSocketAddress() - "+clientSocket.getRemoteSocketAddress());
				// //clientSocketList.add()
			}
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public class ClientHandler implements Runnable{
		Socket socket;
		ObjectInputStream ois;

		public ClientHandler(Socket sock){
			try{
				socket = sock;				
				ois = new ObjectInputStream(sock.getInputStream());
			} catch(Exception e){
				e.printStackTrace();
			}
		}

		public void run(){
			Object msg = null;
			try{
				while((msg = ois.readObject()) != null){
					System.out.println(msg.toString());
					sendItBack(msg.toString(), ois.readObject());
				}
			} catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}

	public void sendItBack(String msg, Object checkBox){
		try{
			oos.writeObject("Server : "+msg);
			oos.writeObject(checkBox);
			oos.flush();
		} catch(Exception ex){
				ex.printStackTrace();
			}
	}
}