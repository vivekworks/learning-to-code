import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class TextArea1 implements ActionListener{
	JTextArea textArea;
	public static void main(String[] args){
		TextArea1 text = new TextArea1();
		text.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JButton button = new JButton("Just Click It");
		button.addActionListener(this);
		textArea = new JTextArea(10,20);
		textArea.setLineWrap(true);
		JScrollPane scroller = new JScrollPane(textArea);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel.add(scroller);
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.getContentPane().add(BorderLayout.SOUTH,button);
		frame.setSize(350,300);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event){
		textArea.append("Button Clicked \n");
	}
}