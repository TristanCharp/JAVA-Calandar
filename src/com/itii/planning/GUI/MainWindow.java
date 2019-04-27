package com.itii.planning.GUI;

import javax.swing.*;

public class MainWindow extends JFrame {
    private JPanel panel1;
    private JButton button1;
    private MainWindow mainWindow;

    public MainWindow getMainWindow() {
        if ( mainWindow == null){
            mainWindow = new MainWindow();
        }
        return mainWindow;
    }

    private MainWindow(){
        initialize();
    }
    private void initialize(){
        setSize(50,50);
        setVisible(true);
    }
}
