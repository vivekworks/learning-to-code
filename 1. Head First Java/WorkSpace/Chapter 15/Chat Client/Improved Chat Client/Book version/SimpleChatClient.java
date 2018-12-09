import javax.swing.*;
import java.net.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleChatClient{
	JTextArea incoming;
	JTextField outgoing;
	BufferedReader reader;
	PrintWriter writer;
	Socket sock;

	public static void main(String[] args){
		SimpleChatClient chatClient = new SimpleChatClient();
		chatClient.go();
	}

	public void go(){
		JFrame frame = new JFrame("Ludicrously Simple Chat Client");
		JPanel mainPanel = new JPanel();
		incoming = new JTextArea(15,50);
		incoming.setLineWrap(true);
		incoming.setWrapStyleWord(true);
		incoming.setEditable(true);
		JScrollPane qScroller = new JScrollPane(incoming);
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		outgoing = new JTextField(20);
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendButtonListener());
		mainPanel.add(qScroller);
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		setUpNetworking();

		/*Thread readerThread = new Thread(new IncomingReader());
		readerThread.start();*/
		IncomingReader h = new IncomingReader();
		h.run();
		System.out.println("Thread started");

		frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
		frame.setSize(400,500);
		frame.setVisible(true);
	}

	private void setUpNetworking(){
		try{
			sock = new Socket("192.168.1.4",4500);
			InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
			reader = new BufferedReader(streamReader);
			writer = new PrintWriter(sock.getOutputStream());
			System.out.println("Network established!");
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	public class SendButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try{
				writer.println(outgoing.getText());
				writer.flush();
			} catch(Exception ex){
				ex.printStackTrace();
			}
			outgoing.setText("");
			outgoing.requestFocus();
		}
	}

	public class IncomingReader /*implements Runnable*/{
		public void run(){
			String message=null;
			System.out.println("Thread running");
			try{
				System.out.println("msg"+message);
				while((message = reader.readLine()) != null){
					System.out.println("read "+message);
					incoming.append(message+"\n");
				}
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	}
}