import java.awt.*;
import javax.swing.*;
public class SimpleAnimation{
	int x = 70,y=70;
	public static void main(String[] args){
		SimpleAnimation simAnime = new SimpleAnimation();
		simAnime.go();
	}
	public void go(){
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MyDrawPanel panel = new MyDrawPanel();
		frame.getContentPane().add(panel);
		frame.setSize(300,300);
		frame.setVisible(true);
		for(int i=0;i<100;i++){
			x++;
			y++;
			frame.repaint();
			try{
				Thread.sleep(20);
			} catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	class MyDrawPanel extends JPanel{
		public void paintComponent(Graphics g){
			g.setColor(Color.white);
			g.fillRect(0,0,this.getWidth(),this.getHeight());
			g.setColor(Color.green);
			g.fillOval(x,y,80,80);
		}
	}
}