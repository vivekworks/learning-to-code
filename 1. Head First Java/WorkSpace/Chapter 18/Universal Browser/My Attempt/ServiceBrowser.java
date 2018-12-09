import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.rmi.*;



public class ServiceBrowser{
	JComboBox comboList;
	ServiceServer service;
	JFrame frame;
	
	public static void main(String[] args){
		new ServiceBrowser().start();
	}

	public void start(){
		try{
			frame = new JFrame("Client Browser");
			service = (ServiceServer)Naming.lookup("rmi://192.168.1.4/ServiceServer");
			comboList = new JComboBox(service.getServicesList());
			comboList.addActionListener(new ComboActionListener());
			frame.getContentPane().add(BorderLayout.NORTH, comboList);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(500,500);
			frame.setVisible(true);
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	public class ComboActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try{
				Object key = comboList.getSelectedItem();
				Service selectedService = service.getService(key);
				frame.getContentPane().add(BorderLayout.CENTER,selectedService.getGUIPanel());
				frame.validate();
				frame.repaint();
			} catch(Exception ex){
				ex.printStackTrace();
			}
			
		}
	}
}