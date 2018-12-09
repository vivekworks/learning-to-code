import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TwoButtons{
	JFrame frame;
	JLabel label;
	public static void main(String[] args){
		TwoButtons two = new TwoButtons();
		two.go();
	}
	public void go(){
		frame = new JFrame();
		JButton button1= new JButton("Change Color");
		JButton button2 = new JButton("Change Label");
		MyDrawPanel panel = new MyDrawPanel();
		label = new JLabel("Initial Label");
		frame.getContentPane().add(BorderLayout.SOUTH,button1);
		frame.getContentPane().add(BorderLayout.EAST,button2);
		frame.getContentPane().add(BorderLayout.WEST,label);
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		button1.addActionListener(new ColorChangeListener());
		button2.addActionListener(new LabelChangeListener());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	class ColorChangeListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			frame.repaint();
		}
	}
	class LabelChangeListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			label.setText("Label Changed");
		}
	}
}