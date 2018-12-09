import javax.swing.*;
import java.awt.*;
public class BorderLayoutTest{
	public static void main(String[] args){
		BorderLayoutTest blayout = new BorderLayoutTest();
		blayout.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		JButton buttonS = new JButton("South");
		JButton buttonN = new JButton("North");
		JButton buttonW = new JButton("West");
		JButton buttonE = new JButton("East");
		JButton buttonC = new JButton("Center");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.SOUTH,buttonS);
		frame.getContentPane().add(BorderLayout.NORTH,buttonN);
		frame.getContentPane().add(BorderLayout.WEST,buttonW);
		frame.getContentPane().add(BorderLayout.EAST,buttonE);
		frame.getContentPane().add(BorderLayout.CENTER,buttonC);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
}