package com.itii.planning.GUI;

import javax.swing.*;

public class MainWindow extends JFrame {
    private JPanel panel1;
    private JButton button1;
    private static MainWindow mainWindow;

    public static MainWindow getMainWindow() {
        if ( mainWindow == null){
            mainWindow = new MainWindow();
        }
        return mainWindow;
    }

    private MainWindow(){
        initialize();
    }
    private void initialize(){
        setSize(640,480);
        setVisible(true);

        this.validate();
        this.repaint();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
