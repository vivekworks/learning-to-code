import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.sound.midi.*;
import java.io.*;
import java.net.*;

public class FinalBeatBox{

	String[] instruments = {"Bass Drum","Closed Hi-Hat", "Open Hi-Hat", "Acoustic Snare", "Crash Cymbal", "Hand Clap", "High Tom", "Hi Bongo", "Maracas", "Whistle", "Low Conga", "Cowbell", 
							"Vibra Slap", "Low-mid Tom","High Agogo", "Open Hi Conga"};

	int[] instrumentNos = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};

	ArrayList<JCheckBox> checkBoxList;
	Sequencer sequencer;
	Sequence seq;
	Track track;
	ObjectOutputStream out;
	ObjectInputStream in;
	JList  list;
	JTextArea incomingArea;
	JTextArea outgoingArea;
	Vector<String> msgVector = new Vector<String>();
	public static void main(String[] args){
		new FinalBeatBox().setupAll();
	}

	public void setupAll(){
		makeUI();
		prepareMIDI();
		setNetwork();
	}

	public void makeUI(){
		JFrame frame = new JFrame("FinalBeatBox");
		

		//Labels
		Box labelBox = new Box(BoxLayout.Y_AXIS);
		for(String instr :instruments){
			Label instrLabel = new Label(instr);
			labelBox.add(instrLabel);
		}
		JPanel labelPanel = new JPanel();
		labelPanel.add(labelBox);
		//labelPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		//frame.getContentPane().add(BorderLayout.WEST,labelPanel);
		

		//Checkboxes
		JPanel checkBoxPanel = new JPanel(new GridLayout(16,16,1,2));
		checkBoxList = new ArrayList<JCheckBox>();
		for(int i=0;i<256;i++){
			JCheckBox check = new JCheckBox();
			checkBoxList.add(check);
			checkBoxPanel.add(check);
		}
		JPanel midiPanel = new JPanel();
		midiPanel.add(labelPanel);
		midiPanel.add(checkBoxPanel);
		frame.getContentPane().add(BorderLayout.CENTER, midiPanel);

		
		//Buttons
		JPanel eastPanel = new JPanel();
		eastPanel.setLayout(new BoxLayout(eastPanel,BoxLayout.Y_AXIS));
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel,BoxLayout.Y_AXIS));
		JButton startButton = new JButton("Start");
		startButton.addActionListener(new StartActionListener());
		buttonPanel.add(startButton);
		JButton stopButton = new JButton("Stop");
		stopButton.addActionListener(new StopActionListener());
		buttonPanel.add(stopButton);
		JButton tempoUpButton = new JButton("Tempo Up");
		tempoUpButton.addActionListener(new TempoUpActionListener());
		buttonPanel.add(tempoUpButton);
		JButton tempoDownButton = new JButton("Tempo Down");
		tempoDownButton.addActionListener(new TempoDownActionListener());
		buttonPanel.add(tempoDownButton);
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new SendActionListener());
		buttonPanel.add(sendButton);
		eastPanel.add(buttonPanel);

		//Chat
		JPanel chatPanel = new JPanel();
		chatPanel.setLayout(new BoxLayout(chatPanel,BoxLayout.Y_AXIS));
		JLabel incomingLabel = new JLabel("Incoming");
		chatPanel.add(incomingLabel);
		incomingArea = new JTextArea(1,1);
		incomingArea.setLineWrap(true);
		incomingArea.setWrapStyleWord(true);
		incomingArea.setEditable(false);
		JScrollPane incomingScroller = new JScrollPane(incomingArea);
		incomingScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		incomingScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		chatPanel.add(incomingScroller);
		JLabel outgoingLabel = new JLabel("Outgoing");
		chatPanel.add(outgoingLabel);
		outgoingArea = new JTextArea(1,1);
		outgoingArea.setLineWrap(true);
		outgoingArea.setWrapStyleWord(true);
		JScrollPane outgoingScroller = new JScrollPane(outgoingArea);
		outgoingScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		outgoingScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		chatPanel.add(outgoingScroller);
		eastPanel.add(chatPanel);		
		frame.getContentPane().add(BorderLayout.EAST, eastPanel);


		//JList

		list = new JList();
		JScrollPane listScroller  = new JScrollPane(list);
		listScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		listScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		frame.getContentPane().add(BorderLayout.SOUTH, listScroller);

		//Frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(900,500);
		frame.setVisible(true);
	}

	public class StartActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			playTracks();
		}
	}

	public class StopActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			sequencer.stop();
		}
	}

	public class TempoUpActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			sequencer.setTempoFactor((float)(sequencer.getTempoFactor() * 1.15));
		}
	}

	public class TempoDownActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			sequencer.setTempoFactor((float)(sequencer.getTempoFactor() * 0.85));	
		}
	}

	public class SendActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			sendTrack();
		}
	}

	public void prepareMIDI(){
		try{
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			seq = new Sequence(Sequence.PPQ,4);
			track = seq.createTrack();
			sequencer.setTempoInBPM(120);
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public void setNetwork(){
		try{
			Socket sock = new Socket("192.168.1.4", 8765);
			out = new ObjectOutputStream(sock.getOutputStream());
			in = new ObjectInputStream(sock.getInputStream());
			Thread readThread = new Thread(new ReaderRunnable());
			readThread.start();
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public class ReaderRunnable implements Runnable{
		Object input = null;
		public void run(){
			try{
				while((input = in.readObject()) != null){
					incomingArea.setText(incomingArea.getText()+input.toString()+"\n");
					msgVector.add(input.toString());
					list.setListData(msgVector);
					in.readObject();
				}
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public static MidiEvent eventMaker(int command, int channel, int dataOne, int dataTwo, int tick){
		MidiEvent mEvent = null;
		try{
			ShortMessage shortMsg = new ShortMessage();
			shortMsg.setMessage(command, channel, dataOne, dataTwo);
			mEvent = new MidiEvent(shortMsg, tick);
		} catch(Exception ex){
			ex.printStackTrace();
		}
		return mEvent;
	}

	public void playTracks(){
		try{
			for(int i=0;i<16;i++){
				for(int inst :instrumentNos){
					track.add(eventMaker(144,9,inst,100,i));
					track.add(eventMaker(128,9,inst,100,i+2));
					track.add(eventMaker(176,9,127,0,16));
				}
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

	public void sendTrack(){
		try{
			System.out.println("Inside");
			Boolean[] boolObject = new Boolean[256];
			int i=0;
			System.out.println("BoolObject");
			for(JCheckBox check :checkBoxList){
				boolObject[i++] = check.isSelected();
			}
			System.out.println("My List");
			out.writeObject(outgoingArea.getText());
			out.writeObject(boolObject);
			out.flush();
			System.out.println("Outside");
		} catch(Exception ex){
			ex.printStackTrace();
		}
	}

}