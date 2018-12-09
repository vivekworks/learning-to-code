import javax.swing.*;
import java.awt.*;
import java.net.*;
import java.io.*;
import java.awt.event.*;
public class ServerWindow{
	ServerSocket serverSock;
	Socket sock;
	JTextArea textArea;
	JTextArea sendArea;
	PrintWriter writer;
	public static void main(String[] args){
		ServerWindow sWindow = new ServerWindow();
		sWindow.start();
	}

	public void start(){
		try{
			makeInterface();
			serverSock = new ServerSocket(4500);
			while(true){
				sock = serverSock.accept();
				writer = new PrintWriter(sock.getOutputStream());
				makeThread(sock);
			}
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	public void makeInterface(){
		JFrame frame = new JFrame("Server");
		textArea = new JTextArea(10,20);
		textArea.setEditable(false);
		Font taFont = new Font("Segoe UI",Font.PLAIN,12);
		textArea.setFont(taFont);
		JScrollPane taScroller = new JScrollPane(textArea);
		taScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		taScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendButtonActionListener());
		sendArea = new JTextArea(2,15);
		JPanel southPanel = new JPanel();
		southPanel.add(sendArea);
		southPanel.add(sendButton);
		frame.getContentPane().add(BorderLayout.CENTER,taScroller);
		frame.getContentPane().add(BorderLayout.SOUTH,southPanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	public boolean startListening(Socket sockClient){
		String text =  null;
		try{
			System.out.println("Got the first connection");
			InputStreamReader ipReader = new InputStreamReader(sockClient.getInputStream());
			BufferedReader reader = new BufferedReader(ipReader);
			while((text = reader.readLine()) != null)
				textArea.append("Client : "+text+"\n");
		} catch(Exception e){
			e.printStackTrace();
		}
		return true;
	}

	public class SendButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("Button is pressed");
			String sendText = sendArea.getText();
			System.out.println("Send Text - "+sendText);
			if((sendText != null) && (!(sendText.equals("")))) {
				writer.println(sendText);
				writer.flush();
				textArea.append("Me : "+sendText+"\n");
				sendArea.setText("");
				sendArea.requestFocus();	
			}
		}
	}

	public void makeThread(Socket sock){
		Thread listen = new Thread(new MsgListener(sock));
		listen.start();
	}

	public class MsgListener implements Runnable{
		private Socket sock;
		public MsgListener(Socket clientSocket){
			sock = clientSocket;
		}
		public void run(){
			startListening(this.sock);
		}
	}

}