import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.*;
import java.util.*;

public class DayOfTheWeekService implements Service{
	JTextField dayField, yearField;
	JLabel dayOfWeek;
	JComboBox monthList;
	public JPanel getGuiPanel(){
		JPanel panel = new JPanel();
		JPanel inputPanel = new JPanel(new GridLayout(3,2));
		DateFormatSymbols dates = new DateFormatSymbols();
		monthList = new JComboBox(dates.getMonths());
		dayField = new JTextField(10);
		yearField = new JTextField(10);
		inputPanel.add(new JLabel("Month"));
		inputPanel.add(monthList);
		inputPanel.add(new JLabel("Day"));
		inputPanel.add(dayField);
		inputPanel.add(new JLabel("Year"));
		inputPanel.add(yearField);
		panel.add(inputPanel);
		JButton doItButton = new JButton("Do it!");
		doItButton.addActionListener(new DoItListener());
		dayOfWeek = new JLabel("Day of Week");
		panel.add(doItButton);
		panel.add(dayOfWeek);
		return panel;
	}

	public class DoItListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			Calendar cal = Calendar.getInstance();
			int month = monthList.getSelectedIndex();
			int day = Integer.parseInt(dayField.getText());
			int year = Integer.parseInt(yearField.getText());
			cal.set(Calendar.MONTH,month);
			cal.set(Calendar.DAY_OF_MONTH,day);
			cal.set(Calendar.YEAR,year);
			Date date = cal.getTime();
			String dayOfWeekS = (new SimpleDateFormat("EEEE")).format(date);
			dayOfWeek.setText(dayOfWeekS);
		}
	}
}