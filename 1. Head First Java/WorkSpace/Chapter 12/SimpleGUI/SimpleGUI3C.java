import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleGUI3C implements ActionListener{
	JFrame frame;
	public static void main(String[] args){
		SimpleGUI3C s3G = new SimpleGUI3C();
		s3G.go();
	}
	public void go(){
		frame = new JFrame();
		JButton button = new JButton("Change color");
		button.addActionListener(this);
		frame.getContentPane().add(BorderLayout.SOUTH,button);
		MyDrawPanel panel = new MyDrawPanel();
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event){
		frame.repaint();
	}
}