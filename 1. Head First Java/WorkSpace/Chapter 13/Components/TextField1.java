import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TextField1 implements ActionListener{
	JFrame frame;
	JTextField field;
	public static void main(String[] args){
		TextField1 compClass = new TextField1();
		compClass.go();
	}
	public void go(){
		frame = new JFrame();
		//JPanel panel = new panel();
		field = new JTextField("Text");

		//panel.add(field);
		frame.getContentPane().add(BorderLayout.NORTH,field);
		JButton button = new JButton("Get Text");
		frame.getContentPane().add(BorderLayout.SOUTH,button);
		button.addActionListener(this);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event){
		//field.requestFocus();
	}
}