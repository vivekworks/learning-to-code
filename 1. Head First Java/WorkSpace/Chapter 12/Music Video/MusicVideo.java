import static java.lang.Math.*;
import javax.swing.*;
import javax.sound.midi.ShortMessage;
import javax.sound.midi.*;
import java.awt.*;
public class MusicVideo{
	JFrame frame;
	PanelDrawer panel;
	int NOTE_ON = ShortMessage.NOTE_ON;
	int NOTE_OFF = ShortMessage.NOTE_OFF;
	int CONTROL_CHANGE = ShortMessage.CONTROL_CHANGE;
	//Main class
	public static void main(String[] args){
		MusicVideo mVdo = new MusicVideo();
		mVdo.play();
	}
	//Event Maker
	public static MidiEvent eventMaker(int command, int channel, int note, int intensity, int beat){
		MidiEvent mEvent = null;
		try{
			ShortMessage sMsg = new ShortMessage();
			sMsg.setMessage(command, channel, note, intensity);
			mEvent = new MidiEvent(sMsg, beat);
		} catch(Exception e){
			e.printStackTrace();
		}
		return mEvent;
	}
	//Panel Drawer
	class PanelDrawer extends JPanel implements ControllerEventListener{
		boolean paintCall;
		public void controlChange(ShortMessage event){
			paintCall = true;
			repaint();
		}
		public void paintComponent(Graphics g){
			if(paintCall){
				Graphics2D g2D = (Graphics2D)g;
				int red = (int)(random()*255);
				int green = (int)(random()*255);
				int blue = (int)(random()*255);
				Color startColor = new Color(red, green, blue);
				red = (int)(random()*255);
				green = (int)(random()*255);
				blue = (int)(random()*255);
				Color endColor = new Color(red, green, blue);
				GradientPaint gPaint = new GradientPaint(80,80,startColor,150,150,endColor);
				int x = (int)((random()*120)+10);
				int y = (int)((random()*120)+10);
				int height = (int)((random()*40)+10);
				int width = (int)((random()*40)+10);
				g2D.setPaint(gPaint);
				g2D.fillRect(x,y,width,height);
				paintCall=false;
			}
		}
	}
	//Initialise UI
	public void initialiseUI(){
		frame = new JFrame();
		panel = new PanelDrawer();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(30,30,300,300);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}
	//Audio Maker
	public void audioMaker(){
		try{
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			Sequence seq = new Sequence(Sequence.PPQ,4);
			Track track = seq.createTrack();
			int[] controller = {127};
			player.addControllerEventListener(panel,controller);
			for(int i=1;i<=30;i++){
				track.add(eventMaker(NOTE_ON,1,i,100,i));
				track.add(eventMaker(CONTROL_CHANGE,1,127,0,i));
				track.add(eventMaker(NOTE_OFF,1,i,100,i+2));
			}
			player.setSequence(seq);
			player.setTempoInBPM(150);
			player.start();
		} catch(Exception e){
			e.printStackTrace();
		}
	}
	//Play
	public void play(){
		initialiseUI();
		audioMaker();
	}
}