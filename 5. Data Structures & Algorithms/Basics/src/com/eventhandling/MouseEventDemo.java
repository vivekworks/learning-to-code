package com.eventhandling;

import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener, MouseWheelListener {
    String message="";
    int mouseX, mouseY;
    public static void launch(){
        MouseEventDemo mouseEventDemo = new MouseEventDemo();
    }

    public MouseEventDemo(){
        this.setSize(500,500);
        this.setTitle("Mouse Events");
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.addMouseWheelListener(this);
        this.addWindowListener(new WindowClosure());;
        this.setVisible(true);
    }

    public void mousePressed(MouseEvent e){
        System.out.println("Mouse Pressed");
        mouseX=e.getX();
        mouseY=e.getY();
        System.out.println(e.getX()+" - "+e.getXOnScreen()+" - "+e.getButton());
        message = "Mouse Pressed on ("+mouseX+","+mouseY+")";
        repaint();
    }

    public void mouseClicked(MouseEvent e){
        System.out.println("Mouse Clicked");
    }

    public void mouseExited(MouseEvent e){
        System.out.println("Mouse Exited");
    }

    public void mouseEntered(MouseEvent e){
        System.out.println("Mouse Entered");
    }

    public void mouseReleased(MouseEvent e){
        System.out.println("Mouse Released");
        mouseX=e.getX();
        mouseY=e.getY();
        message = "Mouse Released on ("+mouseX+","+mouseY+")";
        repaint();
    }

    public void mouseMoved(MouseEvent e){
        System.out.println("Mouse Moved");
        mouseX=e.getX();
        mouseY=e.getY();
        message = "Mouse Moved on ("+mouseX+","+mouseY+")";
        repaint();
    }

    public void mouseDragged(MouseEvent e){
        System.out.println("Mouse Dragged");
    }

    public void mouseWheelMoved(MouseWheelEvent e){
        System.out.println("Mouse Wheel Moved");
        mouseX=e.getX();
        mouseY=e.getY();
        message = "Mouse Wheel Moved on ("+mouseX+","+mouseY+"); Wheel moved is "+e.getScrollType();
        repaint();
    }

    public class WindowClosure extends WindowAdapter{
        public void windowClosing(WindowEvent e) {
            System.out.println("Window closing");
            System.exit(0);
        }
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(message, mouseX, mouseY);
    }
}
