import javax.swing.*;
import java.awt.*;
class MyDrawPanel extends JPanel{
	public void paintComponent(Graphics g){
		Graphics2D g2D = (Graphics2D)g;
		int red = (int)(Math.random()*255);
		int blue = (int)(Math.random()*255);
		int green = (int)(Math.random()*255);
		System.out.println("StartColor - "+red+" - "+blue+" - "+green);
		Color startColor = new Color(red, blue, green);
		red = (int)(Math.random()*255);
		blue = (int)(Math.random()*255);
		green = (int)(Math.random()*255);
		System.out.println("EndColor - "+red+" - "+blue+" - "+green);
		Color endColor = new Color(red, blue, green);
		GradientPaint gPaint = new GradientPaint(70,70,startColor,100,100,endColor);
		g2D.setPaint(gPaint);
		g2D.fillOval(70,70,100,100);
	}
}