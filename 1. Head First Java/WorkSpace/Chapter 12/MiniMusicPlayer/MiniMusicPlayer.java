import javax.sound.midi.*;
public class MiniMusicPlayer implements ControllerEventListener{
	public static void main(String[] args){
		MiniMusicPlayer mini = new MiniMusicPlayer();
		mini.play();
	}
	public void play(){
		try{
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			player.addControllerEventListener(this,{127});
			Sequence seq = new Sequence(Sequence.PPQ,4);
			Track track = seq.createTrack();
			for(int i=1;i<=30;i++){
				track.add(makeEvent(144,1,i,100,i));
				track.add(makeEvent(176,1,127,0,i))
				track.add(makeEvent(128,1,i,100,i+2));
			}
			player.setSequence(seq);
			player.start();
		} catch(Exception e){
			e.printStackTrace();
		}

	}
	public static MidiEvent makeEvent(int command, int channel, int note, int power, int beat){
		MidiEvent mEvent = null;
		try{
			ShortMessage msg = new ShortMessage();
			msg.setMessage(command, channel, note, power);
			mEvent = new MidiEvent(msg,beat);
		} catch(Exception e){
			e.printStackTrace();
		}
		return mEvent;
	}
	public void controlChange(ShortMessage eventMsg){
		System.out.println("la");
	}
}