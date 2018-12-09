import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class DiceGameService implements Service{
	JComboBox diceList;
	JLabel diceLabel;
	public JPanel getGUIPanel(){
		JPanel panel = new JPanel();
		diceList = new JComboBox(new String[]{"1","2","3","4","5"});
		JButton rollButton = new JButton("Roll 'em!");
		rollButton.addActionListener(new RollDiceListener());
		diceLabel = new JLabel("");
		panel.add(diceList);
		panel.add(rollButton);
		panel.add(diceLabel);
		return panel;
	}

	public class RollDiceListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			String selection = (String)diceList.getSelectedItem();
			String label = "";
			for(int i=0;i<Integer.parseInt(selection);i++){
				label = label+" "+(int)((Math.random()*6) + 1);
			}
			diceLabel.setText(label);
		}
	}
}