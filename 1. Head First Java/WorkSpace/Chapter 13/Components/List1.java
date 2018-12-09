import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
public class List1 implements ListSelectionListener{
	JList listy;
	JTextField field = new JTextField();
	public static void main(String[] args){
		List1 listo = new List1();
		listo.go();
	}
	public void go(){
		String[] listEntries = {"GodFather","Friends with Benefits","Whiplash","Avengers"};
		listy = new JList(listEntries);
		JScrollPane scroller = new JScrollPane(listy);
		scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		JPanel panel = new JPanel();
		panel.add(scroller);
		listy.addListSelectionListener(this);
		listy.setVisibleRowCount(4);
		listy.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JFrame frame = new JFrame();
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.getContentPane().add(BorderLayout.SOUTH,field);
		frame.setSize(400,400);
		frame.setVisible(true);
	}
	public void valueChanged(ListSelectionEvent event){
		//if(!listy.getValueIsAdjusting()){
		String selection = (String)listy.getSelectedValue();
		field.setText(selection);
		System.out.println(selection);
	//}
	}
}