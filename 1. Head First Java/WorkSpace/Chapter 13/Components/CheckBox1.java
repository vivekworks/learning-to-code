import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CheckBox1 implements ItemListener{
	JCheckBox check;
	public static void main(String[] args){
		CheckBox1 checkBox = new CheckBox1();
		checkBox.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		check = new JCheckBox("Checker");
		frame.getContentPane().add(BorderLayout.CENTER,check);
		check.addItemListener(this);
		frame.setSize(350,300);
		frame.setVisible(true);
	}
	public void itemStateChanged(ItemEvent e){
		if(check.isSelected())
			System.out.println("CheckBox is Selected");
		else if (!check.isSelected())
			System.out.println("CheckBox is Unselected");
	}
}