import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.sound.midi.*;

public class BeatBox{
	JFrame frame;
	JPanel panel;
	ArrayList<JCheckBox> checkBoxList;
	int[] instrumentList = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};
	final int NOTE_ON = javax.sound.midi.ShortMessage.NOTE_ON;
	final int NOTE_OFF = javax.sound.midi.ShortMessage.NOTE_OFF;
	final int CONTROL_CHANGE = javax.sound.midi.ShortMessage.CONTROL_CHANGE;
	Sequencer player;
	Sequence seq;
	Track track;
	public static void main(String[] args){
		BeatBox bBox = new BeatBox();
		bBox.setUpBeatBox();
	}
	public void setUpBeatBox(){
		constructUI();
		constructMIDI();
	}
	public void constructUI(){
		frame = new JFrame("Beat Box Player");
		panel = new JPanel(new BorderLayout());
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		buildDrumLabels();
		buildMIDIButtons();
		buildCheckBoxes();
		frame.setContentPane(panel);
		frame.setBounds(50,50,300,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	public void constructMIDI(){
		try{
			player = MidiSystem.getSequencer();
			player.open();
			seq = new Sequence(Sequence.PPQ,4);
			track = seq.createTrack();
			player.setTempoInBPM(120);
		} catch(Exception e){
			e.printStackTrace();
		}		
	}
	public void buildDrumLabels(){
		Box drumLabelBox = new Box(BoxLayout.Y_AXIS);
		String[] drumLabelList = {"Bass Drum","Closed Hi-Hat","Open Hi-Hat","Acoustic Snare","Crash Cymbal","Hand Clap",
								  "High Tom","Hi Bongo","Maracas","Whistle","Low Conga","Cowbell","Vibraslap","Low Mid Tom",
								  "High Agogo","Open Hi Conga"};
		for(int i=0;i<drumLabelList.length;i++){
			drumLabelBox.add(new Label(drumLabelList[i]));
		}
		panel.add(BorderLayout.WEST,drumLabelBox);
	}
	public void buildMIDIButtons(){
		Box midiButtonsBox = new Box(BoxLayout.Y_AXIS);
		JButton startButton = new JButton("Start");
		startButton.addActionListener(new StartActionListener());
		JButton stopButton = new JButton("Stop");
		stopButton.addActionListener(new StopActionListener());
		JButton tempoUpButton = new JButton("Tempo Up");
		tempoUpButton.addActionListener(new TempoUpActionListener());
		JButton tempoDownButton = new JButton("Tempo Down");
		tempoDownButton.addActionListener(new TempoDownActionListener());
		midiButtonsBox.add(startButton);
		midiButtonsBox.add(stopButton);
		midiButtonsBox.add(tempoUpButton);
		midiButtonsBox.add(tempoDownButton);
		panel.add(BorderLayout.EAST,midiButtonsBox);	
	}
	public void buildCheckBoxes(){
		GridLayout gLayout = new GridLayout(16,16,1,1);
		checkBoxList = new ArrayList<JCheckBox>();
		JPanel checkBoxPanel = new JPanel(gLayout);
		for(int i=0;i<256;i++){
			JCheckBox check = new JCheckBox();
			checkBoxList.add(check);
			checkBoxPanel.add(check);
		}
		panel.add(BorderLayout.CENTER,checkBoxPanel);
	}
	public class StartActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			buildTrack();
			playTrack();
		}
	}
	public class StopActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			player.stop();
		}
	}
	public class TempoUpActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			float tempoFactor = player.getTempoFactor();
			player.setTempoFactor((float)(tempoFactor*1.05));
		}
	}
	public class TempoDownActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			float tempoFactor = player.getTempoFactor();
			player.setTempoFactor((float)(tempoFactor*.95));	
		}
	}
	public static MidiEvent eventMaker(int command, int channel, int note, int intensity, int beat){
		MidiEvent mEvent = null;
		try{
			ShortMessage shortMesg = new ShortMessage();
			shortMesg.setMessage(command,channel,note,intensity);
			mEvent = new MidiEvent(shortMesg,beat);
		} catch(Exception e){
			e.printStackTrace();
		}
		return mEvent;
	}
	public void createTracks(int[] notes){
		for(int i=0;i<notes.length;i++){
			int note = notes[i];
			if(note != 0){
				track.add(eventMaker(NOTE_ON,9,note,100,i));
				track.add(eventMaker(NOTE_OFF,9,note,100,i+3));
			}
		}
	}
	public void buildTrack(){
		seq.deleteTrack(track);
		track = seq.createTrack();
		for(int i=0;i<instrumentList.length;i++){
			int[] noteList = new int[16];
			int instrument = instrumentList[i];
			for(int j=0;j<16;j++){
				JCheckBox check = checkBoxList.get((16*i)+j);
				if(check.isSelected())
					noteList[i] = instrument;
				else
					noteList[i] = 0;
			}
			createTracks(noteList);
			track.add(eventMaker(CONTROL_CHANGE,1,127,0,16));
		}
		track.add(eventMaker(192,9,1,0,15));
	}
	public void playTrack(){
		try{
			player.setSequence(seq);
			player.setLoopCount(Sequencer.LOOP_CONTINUOUSLY);
			player.setTempoInBPM(120);
			player.start();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
}