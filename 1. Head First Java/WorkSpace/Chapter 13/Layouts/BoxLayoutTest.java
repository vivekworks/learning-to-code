import javax.swing.*;
import java.awt.*;

public class BoxLayoutTest{
	public static void main(String[] args){
		BoxLayoutTest fLayout = new BoxLayoutTest();
		fLayout.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.setBackground(Color.green);
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.add(new JButton("Shock Me!"));
		panel.add(new JButton("bliss"));
		panel.add(new JButton("huh?"));
		frame.setContentPane(panel);
		//frame.getContentPane().add(BorderLayout.EAST,panel);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}