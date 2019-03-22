package com.awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GraphicsDemo extends Frame {
    static void launch(){
        GraphicsDemo gDemo = new GraphicsDemo();
    }

    GraphicsDemo(){
        setSize(500,500);
        setTitle("Graphics");
        setVisible(true);
        addWindowListener(new GraphicsClosure());
    }

    public void paint(Graphics g){
        g.drawString("Keezha irundhu mela yeri vandhutane....",100,100);
        g.draw3DRect(250,250,50,20,true);
        g.drawRect(400,400,50,20);
        g.drawRoundRect(200,200,50,30,3,3);
        g.fillRoundRect(100,100,50,30,3,3);
        int[] xPoints={10,20,10};
        int[] yPoints={250,240,250};
        g.drawPolygon(xPoints,yPoints,xPoints.length);
        g.fillOval(320,320,10,10);
        g.fillArc(220,220,30,30,0,90);
    }

    public class GraphicsClosure extends WindowAdapter{
        public void windowClosing(WindowEvent w){
            setTitle("Closing the window....");
            try {
                Thread.sleep(300);
            } catch (Exception e){
                e.printStackTrace();
            }
            System.exit(0);
        }
    }
}
