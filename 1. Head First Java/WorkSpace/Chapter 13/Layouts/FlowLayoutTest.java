import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest{
	public static void main(String[] args){
		FlowLayoutTest fLayout = new FlowLayoutTest();
		fLayout.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.green);
		panel.add(new JButton("Shock Me!"));
		panel.add(new JButton("bliss"));
		panel.add(new JButton("huh?"));
		frame.getContentPane().add(BorderLayout.EAST,panel);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}