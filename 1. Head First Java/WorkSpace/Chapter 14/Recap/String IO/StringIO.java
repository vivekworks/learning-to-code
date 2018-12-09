import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class StringIO implements Serializable{
	transient JTextArea readArea;
	transient JTextArea writeArea;
	transient JFrame frame;
	String writeAreaText;
	public static void main(String[] args){
		StringIO strIO = new StringIO();
		strIO.makeInterface();
	}

	public void makeInterface(){
		frame =new JFrame("Object IO");
		JPanel buttonPanel = new JPanel();
		JButton readButton = new JButton("Read");
		JButton writeButton = new JButton("Write");
		JButton clearButton = new JButton("Clear");
		buttonPanel.add(readButton);
		buttonPanel.add(writeButton);
		buttonPanel.add(clearButton);
		readButton.addActionListener(new ReadActionListener());
		writeButton.addActionListener(new WriteActionListener());
		clearButton.addActionListener(new ClearActionListener());
		readArea = new JTextArea(10,20);
		readArea.setLineWrap(true);
		readArea.setWrapStyleWord(true);
		readArea.setEditable(false);
		writeArea = new JTextArea(10,20);
		writeArea.setLineWrap(true);
		writeArea.setWrapStyleWord(true);
		JScrollPane readScroller = new JScrollPane(readArea);
		readScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		readScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		JScrollPane writeScroller = new JScrollPane(writeArea);
		writeScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		writeScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		JLabel readLabel = new JLabel("Read");
		JLabel writeLabel = new JLabel("Write");
		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(readLabel);
		mainBox.add(readScroller);
		mainBox.add(writeLabel);
		mainBox.add(writeScroller);
		mainBox.add(buttonPanel);
		frame.getContentPane().add(mainBox);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}

	public class ReadActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JFileChooser readChooser = new JFileChooser();
			readChooser.showOpenDialog(frame);
			readFile(readChooser.getSelectedFile());
		}
	}

	public class WriteActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JFileChooser writeChooser = new JFileChooser();
			writeChooser.showSaveDialog(frame);
			writeFile(writeChooser.getSelectedFile());	
		}
	}


	public class ClearActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			clearScreen();
		}
	}

	public void readFile(File newFile){
		try{
			clearScreen();
			FileReader fr = new FileReader(newFile);
			BufferedReader buffReader = new BufferedReader(fr);
			String writeText = buffReader.readLine();
			readArea.setText(writeText+"\n\n Path - "+newFile.getAbsolutePath());
			buffReader.close();
		} catch(Exception e){
			e.printStackTrace();
		}
		
	}

	public void clearScreen(){
		readArea.setText("");
		writeArea.setText("");
		writeArea.requestFocus();
	}

	public void writeFile(File newFile){
		try{
			FileWriter fw = new FileWriter(newFile);
			BufferedWriter buffWriter = new BufferedWriter(fw);
			writeAreaText = writeArea.getText();
			buffWriter.write(writeAreaText);
			buffWriter.close();
			clearScreen();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}