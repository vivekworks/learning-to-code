package com.eventhandling;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AdapterDemo extends Frame {
    AdapterDemo() {
        this.setSize(500, 500);
        this.addMouseListener(new MouseEvents() {
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Pressed");
            }
        });
        this.addWindowListener(new WindowEvents());
        this.setTitle("Mouse Event");
        this.setVisible(true);
    }

    public class MouseEvents extends MouseAdapter {
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse Clicked");
        }

        public void mouseReleased(MouseEvent e) {
            System.out.println("Mouse Released");
        }
    }

    public class WindowEvents extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.out.println("Window closed");
            System.exit(0);
        }

        public void windowGainedFocus(WindowEvent e) {
            System.out.println("Window Gained focus");
        }

        public void windowLostFocus(WindowEvent e) {
            System.out.println("Window Lost focus");
        }
    }
}
