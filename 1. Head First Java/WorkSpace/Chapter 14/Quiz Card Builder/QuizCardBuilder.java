import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class QuizCardBuilder{
	ArrayList<QuizCard> cardList;
	JTextArea qArea;
	JTextArea aArea;
	JFrame frame;
	public static void main(String[] args){
		QuizCardBuilder quizCard  = new QuizCardBuilder();
		quizCard.buildCard();
	}

	public void buildCard(){
		cardList = new ArrayList<QuizCard>();
		frame = new JFrame("Quiz Card Builder");
		JPanel panel = new JPanel();
		Box box = new Box(BoxLayout.Y_AXIS);
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem newMenu = new JMenuItem("New");
		newMenu.addActionListener(new NewMenuItemListener());
		JMenuItem saveMenu = new JMenuItem("Save");
		saveMenu.addActionListener(new SaveMenuItemListener());
		JLabel qLabel = new JLabel("Question");
		JLabel aLabel = new JLabel("Answer");
		qArea = new JTextArea(6,20);
		qArea.setWrapStyleWord(true);
		JScrollPane qScroller = new JScrollPane(qArea);
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		aArea = new JTextArea(6,20);
		aArea.setWrapStyleWord(true);
		JScrollPane aScroller = new JScrollPane(aArea);
		aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		JButton nextButton = new JButton("Next");
		nextButton.addActionListener(new NextActionListener());
		menu.add(newMenu);
		menu.add(saveMenu);
		box.add(qLabel);
		box.add(qScroller);
		box.add(aLabel);
		box.add(aScroller);
		box.add(nextButton);
		panel.add(box);
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
		frame.setContentPane(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350,350);
		frame.setVisible(true);
	}

	public class NextActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			cardList.add(new QuizCard(qArea.getText(),aArea.getText()));
			clearCard();
		}
	}

	public class NewMenuItemListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			cardList.clear();
			clearCard();
		}
	}

	public class SaveMenuItemListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			cardList.add(new QuizCard(qArea.getText(),aArea.getText()));
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.showSaveDialog(frame);
			saveCard(fileChooser.getSelectedFile());
			clearCard();
		}
	}

	public void clearCard(){
		qArea.setText(null);
		aArea.setText(null);
		qArea.requestFocus();
	}

	public void saveCard(File file){
		try{
			BufferedWriter fileSave = new BufferedWriter(new FileWriter(file));
			//FileWriter fileSave = new FileWriter(file);
			for(QuizCard card :cardList){
			fileSave.write(card.getQuestion()+"/");
			fileSave.write(card.getAnswer()+"\n");
			}
			fileSave.close();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}
