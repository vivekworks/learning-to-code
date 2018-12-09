import javax.swing.*;
import java.awt.event.*;
import javax.sound.midi.*;
import java.awt.*;
import java.io.*;


public class MiniMusicService implements Service{
	MyDrawPanel drawPanel;
	public JPanel getGUIPanel(){
		JPanel panel = new JPanel();
		drawPanel = new MyDrawPanel();
		JButton playButton = new JButton("Play it!");
		playButton.addActionListener(new PlayListener());
		panel.add(drawPanel);
		panel.add(playButton);
		return panel;
	}

	public class PlayListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			try{
				Sequencer player = MidiSystem.getSequencer();
				player.open();
				player.addControllerEventListener(drawPanel, new int[]{127});
				Sequence seq = new Sequence(Sequence.PPQ,4);
				Track track = seq.createTrack();
				for(int i=0;i<100;i+=4){
					int ranNo = (int)((Math.random()*50)+1);
					//if(ranNo < 38){
						track.add(makeEvent(144,1,ranNo,100,i));
						track.add(makeEvent(176,1,127,0,i));
						track.add(makeEvent(128,1,ranNo,100,i+2));
					//}
				}
				player.setSequence(seq);
				player.start();
				player.setTempoInBPM(220);
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	}

	public static MidiEvent makeEvent(int control, int channel, int one, int two, int tick){
		MidiEvent event = null;
		try{
			ShortMessage message = new ShortMessage();
			message.setMessage(control, channel, one, two);
			event = new MidiEvent(message, tick);
		} catch(Exception e){
			e.printStackTrace();
		}
		return event;
	}

	public class MyDrawPanel extends JPanel implements ControllerEventListener{
		boolean msg = false;

		public void controlChange(ShortMessage event){
			System.out.println("Here");
			msg = true;
			repaint();
		}

		public Dimension getPrefferedSize(){
			return new Dimension(300,300);
		}

		public void paintComponent(Graphics g){
			if(msg){
				System.out.println("Then Here");
				Graphics2D g2D = (Graphics2D)g;

				int red = (int)(Math.random()*255);
				int green = (int)(Math.random()*255);
				int blue = (int)(Math.random()*255);
				System.out.println(red+" - "+green+" - "+blue);
				Color color = new Color(red, green, blue);

				int x = (int)((Math.random()*120)+10);
				int y = (int)((Math.random()*120)+10);
				int h = (int)((Math.random()*40)+10);
				int w = (int)((Math.random()*40)+10);
				System.out.println(x+" - "+y+" - "+h+" - "+w);
				g.setColor(color);
				g.fillRect(x,y,h,w);

				msg=false;
			}
		}
	}
}