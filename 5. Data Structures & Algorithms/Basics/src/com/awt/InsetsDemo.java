package com.awt;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InsetsDemo extends Frame {
    int max=500;
    int min=200;
    int inc=25;
    static void launch(){
        InsetsDemo insetsDemo = new InsetsDemo();
    }

    InsetsDemo(){
        setSize(new Dimension(200,200));
        setVisible(true);
        setTitle("Insets");
        addWindowListener(new WindowAdapter() {
            /**
             * Invoked when a window is in the process of being closed.
             * The close operation can be overridden at this point.
             *
             * @param e
             */
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window closing");
                windowClosed(e);
            }

            /**
             * Invoked when a window has been closed.
             *
             * @param e
             */
            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window closed");
                System.exit(0);
            }
        });
        addMouseListener(new MouseAdapter() {
            /**
             * {@inheritDoc}
             *
             * @param e
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                setSize(getWidth()+inc > 1000 ? 200 : getWidth()+inc,getHeight()+inc > 1000 ? 200 : getHeight()+inc);
                Color color = new Color((float)Math.random()*1,(float)Math.random()*1,(float)Math.random()*1);
                //setForeground(new Color(255,0,255));
                color = new Color((float)Math.random()*1,(float)Math.random()*1,(float)Math.random()*1);
                //setBackground(new Color(36,48,78));
                //repaint();
            }
        });
    }

    public void paint(Graphics g){
        System.out.println("Paint call");
        Insets insets = getInsets();
        g.drawLine(insets.left,insets.top,insets.right,insets.bottom);
        g.drawLine(insets.left, insets.top, getWidth()-insets.right,getHeight()-insets.bottom);
        g.drawLine(insets.left, getHeight()-insets.bottom, getWidth()-insets.right,insets.top);
        g.setColor(new Color((float)Math.random()*1,(float)Math.random()*1,(float)Math.random()*1));
        Color color1;// =new Color((float)Math.random()*1,(float)Math.random()*1,(float)Math.random()*1);
        color1=new Color(Color.HSBtoRGB((float)Math.random()*1,(float)Math.random()*1,(float)Math.random()*1));
        setBackground(color1);
        System.out.println("Bg color");
        Color color2 =new Color((float)Math.random()*1,(float)Math.random()*1,(float)Math.random()*1);
        color2=Color.BLUE;
        setForeground(color2);
        System.out.println("Fg color");
    }
}
