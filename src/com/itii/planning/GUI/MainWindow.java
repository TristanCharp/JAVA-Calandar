package com.itii.planning.GUI;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;

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
        getContentPane().setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(501, 79, 123, 224);
        getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        JButton btnNewButton_1 = new JButton("Creer");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton_1.setBounds(0, 11, 89, 23);
        panel_1.add(btnNewButton_1);
        
        JButton btnNewButton = new JButton("Editer");
        btnNewButton.setBounds(0, 45, 89, 23);
        panel_1.add(btnNewButton);
        
        JButton btnNewButton_2 = new JButton("Marquer");
        btnNewButton_2.setBounds(0, 79, 89, 23);
        panel_1.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("Dupliquer");
        btnNewButton_3.setBounds(0, 113, 89, 23);
        panel_1.add(btnNewButton_3);
        
        JButton btnSupprimer = new JButton("Supprimer");
        btnSupprimer.setBounds(0, 147, 89, 23);
        panel_1.add(btnSupprimer);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenuItem mntmNewMenuItem_2 = new JMenuItem("Fichier");
        menuBar.add(mntmNewMenuItem_2);
        
        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Edition");
        menuBar.add(mntmNewMenuItem_1);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Vue");
        menuBar.add(mntmNewMenuItem);
        
        JMenuItem mntmNewMenuItem_3 = new JMenuItem("Aide");
        menuBar.add(mntmNewMenuItem_3);
    }
}