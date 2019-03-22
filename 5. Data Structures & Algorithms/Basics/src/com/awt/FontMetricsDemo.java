package com.awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FontMetricsDemo extends Frame{
    static void launch(){
        FontMetricsDemo fmd = new FontMetricsDemo();
    }
    FontMetricsDemo(){
        setTitle("Font Metrics");
        setSize(500,500);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public void paint(Graphics g){
        FontMetrics fm = g.getFontMetrics();
        String s="This is Font Metrics and I'm trying it sincerely";
        g.drawString(s,150,250);
        g.drawString("(app)",150+fm.stringWidth(s),250);
        g.drawString(s,150,250+fm.getHeight());
    }

}