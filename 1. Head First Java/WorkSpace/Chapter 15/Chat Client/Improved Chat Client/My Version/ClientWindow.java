import javax.swing.*;
import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class ClientWindow{
	JTextArea sendArea;
	PrintWriter writer;
	BufferedReader reader;
	JTextArea textArea;
	public static void main(String[] args){
		ClientWindow cWindow = new ClientWindow();
		cWindow.start();
	}

	public void start(){
		makeInterface();
		makeNetwork();
		makeThread();
	}

	public void makeInterface(){
		JFrame frame = new JFrame("Client");
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

	public class SendButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			String sendText = sendArea.getText();
			if((sendText != null) && (!(sendText.equals("")))){
				writer.println(sendText);
				writer.flush();
				textArea.append("Me : "+sendText+"\n");
				sendArea.setText("");
				sendArea.requestFocus();	
			}
		}
	}

	public void makeNetwork(){
		try{
			Socket sock = new Socket("192.168.1.4",4500);
			InputStreamReader ipReader = new InputStreamReader(sock.getInputStream());
			reader = new BufferedReader(ipReader);
			writer = new PrintWriter(sock.getOutputStream());
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	public class MsgListener implements Runnable{
		public void run(){
			try{
				String text = null;
				while((text = reader.readLine()) != null)
				textArea.append("Server : "+text+"\n");
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public void makeThread(){
		Thread listen = new Thread(new MsgListener());
		listen.start();
	}
}