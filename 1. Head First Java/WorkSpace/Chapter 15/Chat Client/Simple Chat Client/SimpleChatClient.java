import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class SimpleChatClient{
	JTextField outgoing;
	PrintWriter writer;
	Socket sock;

	public static void main(String[] args){
		SimpleChatClient chat = new SimpleChatClient();
		chat.go();
	}

	public void go(){
		setUpGUI();
		setUpNetwork();
	}

	public void setUpGUI(){
		JFrame frame = new JFrame("Simple Chat Client");
		JPanel panel = new JPanel();
		outgoing = new JTextField("",10);
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendButtonActionListener());
		panel.add(outgoing);
		panel.add(sendButton);
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350,350);
		//frame.pack();
		frame.setVisible(true);
	}

	public class SendButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			try{
				String text = outgoing.getText();
				writer.println(text);
				writer.flush();
				outgoing.setText("");
				outgoing.requestFocus();
				//writer.close();
			} catch(Exception e){
				e.printStackTrace();
			}			
		}
	}

	public void setUpNetwork(){
		try{
			Socket sock = new Socket("127.0.0.1",4242);
			writer = new PrintWriter(sock.getOutputStream());
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}