package com.itii.planning.GUI;

import javax.swing.*;
import java.awt.BorderLayout;

public class MainWindow extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
  private static MainWindow mainWindow;


    private MainWindow() {
        //initialize();
        initialize();
    }

    public static MainWindow getMainWindow() {
        if ( mainWindow == null){
            mainWindow = new MainWindow();
        }
        return mainWindow;
    }

    private void initialize(){
        
    	setSize(640,480);
        setVisible(true);
        this.validate();
        this.repaint();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.NORTH);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Fichier");
        menuBar.add(mntmNewMenuItem);
    }
}