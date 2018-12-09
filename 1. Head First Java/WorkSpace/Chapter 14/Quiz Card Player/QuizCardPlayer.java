import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*;
public class QuizCardPlayer implements Serializable{
	JFrame frame;
	ArrayList<QuizCard> cardList;
	int questionCount=0;
	JTextArea questionArea;
	JTextArea answerArea;
	JButton showAnswer;
	JPanel panel;
	QuizCard card;
	JButton nextQuestion;
	Box box;
	JLabel answerLabel;
	JLabel questionLabel;
	JScrollPane ansScroller;
	JPanel buttonPanel;
	public static void main(String[] args){
		QuizCardPlayer qCardPlayer = new QuizCardPlayer();
		qCardPlayer.play();
	}

	public void play(){
		frame = new JFrame("Quiz Card Player");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("File");
		JMenuItem loadMenuItem = new JMenuItem("Load");
		loadMenuItem.addActionListener(new LoadActionListener());
		questionArea = new JTextArea(6,20);
		questionArea.setEditable(false);
		questionArea.setLineWrap(true);
		questionArea.setWrapStyleWord(true);
		JScrollPane quesScroller = new JScrollPane(questionArea);
		quesScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		quesScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		questionLabel = new JLabel("Question");
		showAnswer = new JButton("Show Answer");
		showAnswer.addActionListener(new ShowAnswerListener());
		nextQuestion = new JButton("Next Card");
		nextQuestion.addActionListener(new NextQuestionListener());
		menu.add(loadMenuItem);
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
		buttonPanel = new JPanel();
		buttonPanel.add(showAnswer);
		buttonPanel.add(nextQuestion);
		box = new Box(BoxLayout.Y_AXIS);
		box.add(questionLabel);
		box.add(quesScroller);
		box.add(buttonPanel);
		panel.add(box);
		frame.getContentPane().add(BorderLayout.CENTER,panel);
		frame.pack();
		frame.setSize(350,350);
		frame.setVisible(true);
	}

	public class LoadActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			try{
				JFileChooser cardChooser = new JFileChooser();
				cardChooser.showOpenDialog(frame);
				File loadedFile = cardChooser.getSelectedFile();
				BufferedReader reader = new BufferedReader(new FileReader(loadedFile));
				String line = null;
				cardList = new ArrayList<QuizCard>();
				while((line = reader.readLine()) != null ) {
					String[] qa = line.split("/");
					cardList.add(new QuizCard(qa[0],qa[1]));
				}
				questionCount=0;
				questionCount++;
				card = cardList.get(questionCount-1);
				questionArea.setText(card.getQuestion());
				showAnswer.requestFocus();
				showAnswer.setEnabled(true);
				frame.setVisible(false);
				frame.setVisible(true);
				reader.close();
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public class ShowAnswerListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			answerArea = new JTextArea(6,20);
			answerArea.setEditable(false);
			answerArea.setLineWrap(true);
			answerArea.setWrapStyleWord(true);
			ansScroller = new JScrollPane(answerArea);
			ansScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			ansScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			answerLabel = new JLabel("Answer");
			card = cardList.get(questionCount-1);
			answerArea.setText(card.getAnswer());
			box.add(answerLabel);
			box.add(ansScroller);
			showAnswer.setEnabled(false);
			nextQuestion.setEnabled(true);
			frame.setVisible(false);
			frame.setVisible(true);
		}
	}

	public class NextQuestionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			questionCount++;
			if(cardList.size() >= questionCount){
				card = cardList.get(questionCount-1);
				questionArea.setText(card.getQuestion());
				showAnswer.requestFocus();
				box.remove(answerLabel);
				box.remove(ansScroller);
				showAnswer.setEnabled(true);
				frame.setVisible(false);
				frame.setVisible(true);
			}
			else{
				nextQuestion.setEnabled(false);
				questionArea.setText("That was the last card!!!");
				box.remove(questionLabel);
				box.remove(answerLabel);
				box.remove(ansScroller);
				box.remove(buttonPanel);
				frame.setVisible(false);
				frame.setVisible(true);
			}
		}
	}
}