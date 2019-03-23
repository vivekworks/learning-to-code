package com.awt;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class LayoutManagersDemo extends Frame {
    int n = 4;

    static void launch() {
        LayoutManagersDemo layouts = new LayoutManagersDemo();
        //layouts.setupFlowLayout();
        //layouts.setupBorderLayout();
        //layouts.setupGridLayout();
        layouts.setupCardLayout();
        layouts.setVisible(true);
    }

    LayoutManagersDemo() {
        setTitle("Layout Managers");
        setSize(500, 500);
        //setBackground(Color.pink);
        setForeground(Color.red);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    void setupFlowLayout() {
        for (int i = 0; i < 5; i++)
            add(new Button(i + ""));
        setLayout(new FlowLayout(FlowLayout.RIGHT));
    }

    void setupBorderLayout() {
        setLayout(new BorderLayout());
        add(new Button("North"), BorderLayout.NORTH);
        add(new Label("South Area - Ulla varadha"), BorderLayout.SOUTH);
        add(new Button("East"), BorderLayout.EAST);
        add(new Button("West"), BorderLayout.WEST);
        add(new TextArea("Life is all about working out and finding the balance.", 10, 30), BorderLayout.CENTER);
    }

    public Insets getInsets() {
        return super.getInsets();
    }

    void setupGridLayout() {
        setLayout(new GridLayout(n, n));
        for (int i = 0; i < n * n; i++)
            add(new Button((i + 1) + ""));
    }

    void setupCardLayout() {
        setLayout(new FlowLayout());
        CardLayout card = new CardLayout();
        Panel panel = new Panel(card);
        add(panel);

        Button pcButton = new Button("PC");
        Button smartphoneButton = new Button("Smartphone");
        add(pcButton);
        add(smartphoneButton);
        Checkbox windows7 = new Checkbox("Windows 7", true);
        Checkbox windows8 = new Checkbox("Windows 8", true);
        Checkbox windows10 = new Checkbox("Windows 10", false);
        Checkbox android = new Checkbox("Android", false);
        Checkbox ios = new Checkbox("ios", true);
        Checkbox windowsPhone = new Checkbox("Windows Phone", false);
        Panel pcPanel = new Panel();
        pcPanel.add(windows7);
        pcPanel.add(windows8);
        pcPanel.add(windows10);
        Panel smartphonePanel = new Panel();
        smartphonePanel.add(android);
        smartphonePanel.add(ios);
        smartphonePanel.add(windowsPhone);
        panel.add(pcPanel,"pc");
        panel.add(smartphonePanel,"smartphone");
        pcButton.addActionListener((event) -> {
            card.show(panel, "pc");
            repaint();
        });
        smartphoneButton.addActionListener((event) -> {
            card.show(panel, "smartphone");
            repaint();
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                card.next(panel);
            }
        });
    }
}
