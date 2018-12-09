import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.sound.midi.*;
import java.net.*;
import java.io.*;

public class FinalBeatBox{

	String[] instruments = {"Bass Drum","Closed Hi-Hat", "Open Hi-Hat", "Acoustic Snare", "Crash Cymbal", "Hand Clap", "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell", 
							"Vibra Slap", "Low-mid Tom","High Agogo", "Open Hi Conga"};

	int[] instrumentSerial = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};
	Sequencer sequencer;
	Sequence seq;
	Track track;
	JTextArea outgoingTextArea;
	ArrayList<JCheckBox> checkBoxList;
	Vector<String> listVector = new Vector<String>();
	ObjectOutputStream out;
	ObjectInputStream in;
	HashMap<String,boolean[]> otherSeqsMap = new HashMap<String, boolean[]>();
	JList incomingList;
	public static void main(String[] args){
		new FinalBeatBox().start();
	}

	public void start(){
		createUI();
		setupMIDI();
		setupNetwork();
	}

	public void createUI(){
		JFrame frame = new JFrame("Final Beat Box");

		//Beat Box Section - BL CENTER
		Box instrBox = new Box(BoxLayout.Y_AXIS);
		Label instrLabel = null;
		for(String newInstr :instruments){
			instrLabel = new Label(newInstr);
			instrBox.add(instrLabel);
		}
		JPanel beatCheckBoxesPanel = new JPanel(new GridLayout(16,16,1,2));
		checkBoxList = new ArrayList<JCheckBox>();
		for(int i=0;i<256;i++){
			JCheckBox newCheck = new JCheckBox();
			checkBoxList.add(newCheck);
			beatCheckBoxesPanel.add(newCheck);
		}
		JPanel fullBeatBoxPanel = new JPanel();
		fullBeatBoxPanel.add(instrBox);
		fullBeatBoxPanel.add(beatCheckBoxesPanel);


		//Button & Chat Section - BL EAST
		JButton startButton = new JButton("Start");
		startButton.addActionListener(new StartActionListener());
		JButton stopButton = new JButton("Stop");
		stopButton.addActionListener(new StopActionListener());
		JButton tempoUpButton = new JButton("Tempo Up");
		tempoUpButton.addActionListener(new TempoUpActionListener());
		JButton tempoDownButton = new JButton("Tempo Down");
		tempoDownButton.addActionListener(new TempoDownActionListener());
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendActionListener());
		Box buttonBox = new Box(BoxLayout.Y_AXIS);
		buttonBox.add(startButton);
		buttonBox.add(stopButton);
		buttonBox.add(tempoUpButton);
		buttonBox.add(tempoDownButton);
		buttonBox.add(sendButton);
		JTextArea incomingTextArea = new JTextArea(10,10);
		incomingTextArea.setLineWrap(true);
		incomingTextArea.setWrapStyleWord(true);
		JScrollPane incomingScroller = new JScrollPane(incomingTextArea);
		incomingScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		incomingScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		outgoingTextArea = new JTextArea(10,10);
		outgoingTextArea.setLineWrap(true);
		outgoingTextArea.setWrapStyleWord(true);
		JScrollPane outgoingScroller = new JScrollPane(outgoingTextArea);
		outgoingScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		outgoingScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		Box chatBox = new Box(BoxLayout.Y_AXIS);
		chatBox.add(new JLabel("Incoming"));
		chatBox.add(outgoingTextArea);
		incomingList = new JList();
		incomingList.addListSelectionListener(new MyListSelectionListener());
		incomingList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		outgoingScroller = new JScrollPane(incomingList);
		incomingList.setListData(listVector);
		chatBox.add(new JLabel("Outgoing"));
		chatBox.add(outgoingScroller);
		buttonBox.add(chatBox);
		JPanel eastPanel = new JPanel(new GridLayout(2,1));
		eastPanel.add(buttonBox);
		eastPanel.add(chatBox);



		//Frame Setup
		frame.getContentPane().add(BorderLayout.CENTER, fullBeatBoxPanel);
		frame.getContentPane().add(BorderLayout.EAST, eastPanel);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,450);
		frame.setVisible(true);
	}

	public class StartActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			createTracks();
		}
	}

	public class StopActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			sequencer.stop();
		}
	}

	public class TempoUpActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			sequencer.setTempoFactor((float)(sequencer.getTempoFactor()*1.15));
		}
	}

	public class TempoDownActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			sequencer.setTempoFactor((float)(sequencer.getTempoFactor()*0.85));	
		}
	}

	public class SendActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			boolean[] checkBoxState = new boolean[256]			;
			for(int i=0;i<256;i++){
				if(checkBoxList.get(i).isSelected())
					checkBoxState[i]=true;
				else
					checkBoxState[i]=false;
			}
			try{
				out.writeObject(outgoingTextArea.getText());
				out.writeObject(checkBoxState);
			} catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}

	public void setupMIDI(){
		try{
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			seq = new Sequence(Sequence.PPQ,4);
			track = seq.createTrack();
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public static MidiEvent eventMaker(int command, int channel, int one, int two, int tick){
		MidiEvent mEvent = null;
		try{
			ShortMessage shMsg = new ShortMessage();
			shMsg.setMessage(command,channel,one,two);
			mEvent = new MidiEvent(shMsg,tick);
		} catch(Exception ex){
			ex.printStackTrace();
		}
		return mEvent;
	}

	public void createTracks(){
		try{
			for(int i=0;i<16;i++){
				for(int j=0;j<16;j++){
					JCheckBox cBox= checkBoxList.get((16*i)+j);
					if(cBox.isSelected()){
						track.add(eventMaker(144, 9, instrumentSerial[i],100,i));
						track.add(eventMaker(128, 9, instrumentSerial[i],100,i+2));
					}
				}
			track.add(eventMaker(176,9,127,0,16));
			}
			track.add(eventMaker(192,9,1,0,15));
			sequencer.setSequence(seq);
			sequencer.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
			sequencer.setTempoInBPM(120);
			sequencer.start();
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public void setupNetwork(){
		try{
			Socket clientSock = new Socket("192.168.1.4",4500);
			out = new ObjectOutputStream(clientSock.getOutputStream());
			in = new ObjectInputStream(clientSock.getInputStream());
			Thread readerThread = new Thread(new RemoteReader());
			readerThread.start();
		} catch(Exception e){
			e.printStackTrace();
		}
	}

	public class RemoteReader implements Runnable{
		boolean[] checkBoxState = null;
		String nameToShow = null;
		Object obj = null;
		public void run(){
			try{
				while((obj = in.readLine()) != null){
					nameToShow = (String)obj;
					checkBoxState = (boolean[]) in.readObject();
					otherSeqsMap.put(nameToShow, checkBoxState);
					listVector.add(nameToShow);
					incomingList.setListData(listVector);
				}
			} catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}

	public class MyListSelectionListener implements ListSelectionListener {
		public void valueChanged(ListSelectionEvent le){
			if(!le.getValueIsAdjusting()){
				String selected = (String) incomingList.getSelectedValue();
				if(selected != null){
					boolean[] selectedState = (boolean[])otherSeqsMap.get(selected);
					changeSequence(selectedState);
					sequencer.stop();
					createTracks();
				}
			}
		}
	}

	public void changeSequence(boolean[] checkBoxState){
		for(int i=0;i<256;i++){
			JCheckBox check = (JCheckBox)checkBoxList.get(i);
			if(checkBoxState[i])
				check.setSelected(true);
			else
				check.setSelected(false);
		}
	}
}