package com.eventhandling;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class KeyEventDemo extends Frame implements KeyListener {
    String message="";
    public static void launch(){
        KeyEventDemo keyEventDemo = new KeyEventDemo();
    }

    public KeyEventDemo(){
        this.addKeyListener(this);
        this.addWindowListener(new WindowClosure());
        this.setSize(new Dimension(500,500));
        this.setTitle("Key Events");
        this.setVisible(true);
    }

    public void keyPressed(KeyEvent e){
        message="Key pressed "+e.getKeyCode()+" "+e.getKeyChar();
        repaint();
    }

    public void keyTyped(KeyEvent e){
        message="Key typed "+e.getKeyCode()+" "+e.getKeyChar();
        repaint();
    }

    public void keyReleased(KeyEvent e){
        message="Key released "+e.getKeyCode()+" "+e.getKeyChar();
        repaint();
    }

    public void paint(Graphics g){
        g.drawString(message,250,250);
    }

    public class WindowClosure extends WindowAdapter{
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }
}
