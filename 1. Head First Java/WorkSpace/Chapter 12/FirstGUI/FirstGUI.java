import javax.swing.*;
import java.awt.event.*;
public class FirstGUI implements ActionListener{
	public static void main(String[] args){
		FirstGUI fG = new FirstGUI();
		fG.run();
	}
	public void run(){
		JFrame frame = new JFrame();
		JButton button = new JButton("Click me");
		button.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(button);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event){
		System.out.println("Button is clicked.");
	}
}