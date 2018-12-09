import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.sound.midi.*;
import static javax.sound.midi.ShortMessage.*;
public class BeatBox{
		JPanel panel = new JPanel(new BorderLayout());
		JFrame frame = new JFrame("Cyber BeatBox");
		ArrayList<JCheckBox> checkBoxList = new ArrayList<JCheckBox>();
		float tempo = 120;
		Sequencer player;
		Sequence seq;
		static final int NOTE_ON  = ShortMessage.NOTE_ON;
		static final int NOTE_OFF  = ShortMessage.NOTE_OFF;
		static final int CONTROL_CHANGE  = ShortMessage.CONTROL_CHANGE;
		int[] instrumentList = {35,42,46,38,49,39,50,60,70,72,64,56,58,47,67,63};
		Track track;
	public static void main(String[] args){
		BeatBox bBox = new BeatBox();
		bBox.buildGUI();
	}
	public void buildGUI(){
		buildLabelBox();
		buildMidiButtons();
		buildMidiCheckBoxes();
		buildMidi();
		constructUI();
	}
	public void constructUI(){
		panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		//frame.getContentPane().add(panel);
		frame.setContentPane(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(50,50,300,300);
		frame.pack();
		frame.setVisible(true);
	}
	public void buildLabelBox(){
		Box labelBox = new Box(BoxLayout.Y_AXIS);
		String[] labelList = {"Bass Drum","Closed Hi-Hat","Open Hi-Hat","Acoustic Snare","Crash Cymbal","Hand Clap","High Tom","Hi Bongo","Maracas","Whistle","Low Conga","Cowbell","Vibraslap","Low-mid Tom","High Agogo","Open Hi Conga"};
		for(int i=0;i<labelList.length;i++){
			labelBox.add(new Label(labelList[i]));
		}
		panel.add(BorderLayout.WEST,labelBox);
	}
	public void buildMidiButtons(){
		Box midiBox = new Box(BoxLayout.Y_AXIS);
		JButton button1 = new JButton("Start");
		button1.addActionListener(new StartActionListener());
		midiBox.add(button1);
		JButton button2 = new JButton("Stop");
		button2.addActionListener(new StopActionListener());
		midiBox.add(button2);
		JButton button3 = new JButton("Tempo Up");
		button3.addActionListener(new TempoUpActionListener());
		midiBox.add(button3);
		JButton button4 = new JButton("Tempo Down");
		button4.addActionListener(new TempoDownActionListener());
		midiBox.add(button4);
		panel.add(BorderLayout.EAST,midiBox);
	}
	public void buildMidiCheckBoxes(){
		GridLayout midiGrid = new GridLayout(16,16);
		midiGrid.setVgap(1);
		midiGrid.setHgap(1);
		JPanel gridPanel = new JPanel(midiGrid);
		for(int i=0;i<256;i++){
			JCheckBox check = new JCheckBox();
			checkBoxList.add(check);
			gridPanel.add(check);
		}
		panel.add(BorderLayout.CENTER,gridPanel);
	}
	public class StartActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			buildTrack();
			startTrack();
		}
	}
	public class StopActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			player.stop();
		}
	}
	public class TempoUpActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			tempo = (float)tempo*1.03F;
			player.setTempoInBPM(tempo);
			player.start();
		}
	}
	public class TempoDownActionListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			tempo = (float)tempo*0.97F;
			player.setTempoInBPM(tempo);
			player.start();
		}
	}
	public void buildMidi(){
		try{
			player = MidiSystem.getSequencer();
			player.open();
			seq = new Sequence(Sequence.PPQ,4);
			track = seq.createTrack();
			player.setTempoInBPM(tempo);
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	public static MidiEvent eventMaker(int command, int channel, int note, int intensity, int beat){
		MidiEvent mEvent = null;
		try{
			ShortMessage shortMsg = new ShortMessage();
			shortMsg.setMessage(command, channel, note, intensity);
			mEvent = new MidiEvent(shortMsg, beat);
		} catch(Exception e){
			e.printStackTrace();
		}
		return mEvent;
	}
	public void createTracks(int[] notes){
		for(int i=0;i<notes.length;i++){
			if(notes[i] != 0){
			track.add(eventMaker(NOTE_ON,9,notes[i],100,i));
			track.add(eventMaker(NOTE_OFF,9,notes[i],100,i+2));
		}
		}
	}
	public void buildTrack(){
		seq.deleteTrack(track);
		track = seq.createTrack();
		int instrument = 0;
		int[] note = null;
		for (int i=0;i<instrumentList.length;i++){
			instrument = instrumentList[i];
			note = new int[16];
			for(int j=0;j<16;j++){
				JCheckBox jCheck = checkBoxList.get((16*i)+j);
				if(jCheck.isSelected())
					note[j]=instrument;
				else
					note[j]=0;

			}
			createTracks(note);
			track.add(eventMaker(CONTROL_CHANGE,9,127,100,i));
		}
		track.add(eventMaker(192,9,1,0,15));
	}
	public void startTrack(){
		try{
			player.setSequence(seq);
			player.setLoopCount(player.LOOP_CONTINUOUSLY);
			player.setTempoInBPM(tempo);
			player.start();
		} catch(Exception e){
			e.printStackTrace();
		}
	}	
}