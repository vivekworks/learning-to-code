package com.awt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenusDemo extends Frame{
    static void launch(){
        MenusDemo menusDemo = new MenusDemo();
    }

    MenusDemo(){

        setSize(500,500);
        setTitle("Menus");
        menuSetup();
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    void menuSetup() {
        DialogBox dialogBox = new DialogBox(this,"New Dialog",true);
        MenuBar menuBar = new MenuBar();
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        MenuItem newMI = new MenuItem("New");
        MenuItem openMI = new MenuItem("Open");
        MenuItem exitMI = new MenuItem("Exit");
        MenuItem cutMI = new MenuItem("Cut");
        MenuItem copyMI = new MenuItem("Copy");
        MenuItem pasteMI = new MenuItem("Paste");
        fileMenu.add(newMI);
        fileMenu.add(openMI);
        fileMenu.add(exitMI);
        editMenu.add(cutMI);
        editMenu.add(copyMI);
        editMenu.add(pasteMI);
        Menu specialMenu = new Menu("Special");
        specialMenu.add(new MenuItem("S1"));
        specialMenu.add(new MenuItem("S2"));
        specialMenu.add(new MenuItem("S3"));
        fileMenu.add(specialMenu);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        setMenuBar(menuBar);
        newMI.addActionListener((event) -> dialogBox.setVisible(true));
        openMI.addActionListener(this::actionPerformed);
        exitMI.addActionListener(this::actionPerformed);
        cutMI.addActionListener(this::actionPerformed);
        copyMI.addActionListener(this::actionPerformed);
        pasteMI.addActionListener(this::actionPerformed);
        CheckboxMenuItem debug = new CheckboxMenuItem("Debug");
        editMenu.add(debug);
    }

    public void actionPerformed(ActionEvent ae){
        String val = ae.getActionCommand();
        if(val.equals("Exit"))
            System.exit(0);
    }

    public class DialogBox extends Dialog{
        DialogBox(Frame parent, String title, boolean modal){
            super(parent,title, modal);
            setSize(300,300);
            setLayout(new FlowLayout());
            Button closeButton = new Button("Close");
            closeButton.addActionListener((event) -> dispose());
            add(closeButton);
            add(new Label("This is a dialog box with close button"));
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    dispose();
                }
            });
        }
    }
}
