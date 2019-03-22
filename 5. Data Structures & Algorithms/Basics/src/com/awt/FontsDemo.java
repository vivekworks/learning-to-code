package com.awt;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FontsDemo extends Frame {
    String font="";
    int count;
    String[] allFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    static void launch(){
        FontsDemo fontsDemo = new FontsDemo();
    }

    FontsDemo(){
        setSize(1000,1000);
        setVisible(true);
        setTitle("Fonts");
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                System.out.println("Mouse Clicked");
                Font nf = new Font(allFonts[++count],Font.PLAIN,15);
                setFont(nf);
            }
        });
    }

    public void paint(Graphics g){
        System.out.println("Paint");
        g.drawString("Typesetting",50,25);
        g.drawString(getFont().getFamily()+" "+getFont().getFontName()+" "+getFont().getStyle()+" "+getFont().getPSName()+" "+getFont().getName(),250,250);
    }
}
