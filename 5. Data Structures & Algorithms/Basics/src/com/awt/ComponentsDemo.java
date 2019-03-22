package com.awt;

import java.awt.*;
import java.awt.event.*;

public class ComponentsDemo extends Frame {
    String message = "";
    CheckboxGroup chkBoxGrp;

    static void launch() {
        ComponentsDemo compDemo = new ComponentsDemo();
        compDemo.setupLabels();
        compDemo.setupButtons();
        compDemo.setupCheckBoxes();
        compDemo.setupCheckBoxGroups();//Radio buttons
        compDemo.setupChoices();
        compDemo.setupScrollbars();
        compDemo.setupTextFields();
        compDemo.setupTextArea();
        compDemo.setVisible(true);
    }

    ComponentsDemo() {
        setTitle("Components");
        setSize(700, 700);
        setLayout(new FlowLayout());
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    void setupLabels() {
        Label one = new Label("One");
        Label two = new Label("Two");
        Label three = new Label("Three");
        add(one);
        add(two);
        add(three);
        repaint();
    }

    void setupButtons() {
        Button yesButton = new Button("Yes");
        Button noButton = new Button("No");
        Button maybeButton = new Button("Maybe");
        yesButton.addActionListener((event) -> {
            message = event.getActionCommand() + " button is pressed";
            repaint();
        });
        noButton.addActionListener((event) -> {
            message = event.getActionCommand() + " button is pressed";
            repaint();
        });
        maybeButton.addActionListener((event) -> {
            message = event.getActionCommand() + " button is pressed";
            repaint();
        });
        add(yesButton);
        add(noButton);
        add(maybeButton);
    }

    public void paint(Graphics g) {
        g.drawString(message, 350, 350);
    }

    void setupCheckBoxes() {
        Checkbox windows = new Checkbox("Windows");
        Checkbox linux = new Checkbox("Linux", true);
        Checkbox mac = new Checkbox("Mac");
        Checkbox android = new Checkbox("Android", false);
        Checkbox ios = new Checkbox("ios", true);
        add(windows);
        add(linux);
        add(mac);
        add(android);
        add(ios);
        windows.addItemListener(this::itemStateChanged1);
        linux.addItemListener(this::itemStateChanged1);
        mac.addItemListener(this::itemStateChanged1);
        android.addItemListener(this::itemStateChanged1);
        ios.addItemListener(this::itemStateChanged1);
    }

    public void itemStateChanged1(ItemEvent ie) {
        message = (ie.getItem() + " is " + (ie.getStateChange() == 1 ? "checked" : "unchecked"));
        repaint();
    }

    public void itemStateChanged2(ItemEvent ie) {
        message = chkBoxGrp.getSelectedCheckbox().getLabel() + " is currently selected";
        repaint();
    }

    void setupCheckBoxGroups() {
        chkBoxGrp = new CheckboxGroup();
        Checkbox windows = new Checkbox("Windows", chkBoxGrp, true);
        Checkbox linux = new Checkbox("Linux", true, chkBoxGrp);
        Checkbox mac = new Checkbox("Mac", chkBoxGrp, false);
        Checkbox android = new Checkbox("Android", false, chkBoxGrp);
        Checkbox ios = new Checkbox("ios", true, chkBoxGrp);
        add(windows);
        add(linux);
        add(mac);
        add(android);
        add(ios);
        windows.addItemListener(this::itemStateChanged2);
        linux.addItemListener(this::itemStateChanged2);
        mac.addItemListener(this::itemStateChanged2);
        android.addItemListener(this::itemStateChanged2);
        ios.addItemListener(this::itemStateChanged2);
        chkBoxGrp.setSelectedCheckbox(ios);
    }

    void setupChoices() {
        Choice os, browser;
        os = new Choice();
        os.add("Windows");
        os.add("Linux");
        os.add("Mac");
        browser = new Choice();
        browser.add("Chrome");
        browser.add("Firefox");
        browser.add("Opera");
        browser.add("Edge");
        os.addItemListener((event) -> {
            message = event.getItem().toString() + " os is chosen";
            repaint();
        });
        browser.addItemListener((event) -> {
            message = event.getItem().toString() + " browser is chosen";
            repaint();
        });
        os.select(2);
        browser.select(3);
        add(os);
        add(browser);
    }

    void setupScrollbars() {
        Scrollbar vertical = new Scrollbar(Scrollbar.HORIZONTAL, 1, 0, 0, 500);
        vertical.setPreferredSize(new Dimension(100, 20));
        add(vertical);
        vertical.addAdjustmentListener((event) -> {
            message = event.getValue() + " : ";
            switch (event.getAdjustmentType()) {
                case 1:
                    message += "Unit Increment";
                    break;
                case 2:
                    message += "Unit Decrement";
                    break;
                case 3:
                    message += "Block Decrement";
                    break;
                case 4:
                    message += "Block Increment";
                    break;
                case 5:
                    message += "Track";
                    break;
            }
            repaint();
        });
    }

    void setupTextFields() {
        TextField name = new TextField("");
        TextField pwd = new TextField("");
        pwd.setEchoChar('*');
        name.setColumns(10);
        pwd.setColumns(10);
        add(new Label("Name : "));
        add(name);
        add(new Label("Password : "));
        add(pwd);
        name.addActionListener((event) -> {
            message = "Name : " + name.getText() + "; Selected Text : " + name.getSelectedText();
            repaint();
        });
        pwd.addActionListener((event) -> {
            message = "Password : " + pwd.getText() + "; Selected Text : " + pwd.getSelectedText();
            repaint();
        });
    }

    void setupTextArea(){
        TextArea textArea = new TextArea("",10,30);
        message = textArea.getText();
        add(textArea);
        textArea.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                message = message+e.getKeyChar();
                repaint();
            }

            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
            }

            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
            }
        });
    }
}
