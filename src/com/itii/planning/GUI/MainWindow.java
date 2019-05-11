package com.itii.planning.GUI;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import java.awt.Color;
import java.awt.Dimension;

public class MainWindow extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static MainWindow mainWindow;


    private MainWindow() {
    	getContentPane().setMinimumSize(new Dimension(130, 250));

    	
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

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setMinimumSize(new Dimension(250, 130));
        panel_1.setBounds(486, 48, 128, 261);
        getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        JButton btnNewButton_1 = new JButton("Creer");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton_1.setBounds(0, 11, 100, 25);
        panel_1.add(btnNewButton_1);
        
        JButton btnNewButton = new JButton("Editer");
        btnNewButton.setBounds(0, 47, 100, 25);
        panel_1.add(btnNewButton);
        
        JButton btnNewButton_2 = new JButton("Marquer");
        btnNewButton_2.setBounds(0, 83, 100, 25);
        panel_1.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("Dupliquer");
        btnNewButton_3.setBounds(0, 119, 100, 25);
        panel_1.add(btnNewButton_3);
        
        JButton btnSupprimer = new JButton("Supprimer");
        btnSupprimer.setBounds(0, 155, 100, 25);
        panel_1.add(btnSupprimer);
        
        JLabel lblVue = new JLabel("Vue :");
        lblVue.setBounds(116, 11, 34, 14);
        getContentPane().add(lblVue);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Liste", "Semaine", "Mois"}));
        comboBox.setBounds(145, 8, 223, 20);
        getContentPane().add(comboBox);
        
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        
        JMenu mnFichier = new JMenu("Fichier");
        menuBar.add(mnFichier);
        
        JMenuItem mntmNewMenuItem = new JMenuItem("Quitter");
        mnFichier.add(mntmNewMenuItem);
        
        JMenu mnEditer = new JMenu("Editer");
        menuBar.add(mnEditer);
        
        JMenuItem mntmEditer = new JMenuItem("Creer");
        mnEditer.add(mntmEditer);
        
        JMenuItem mntmEditer_1 = new JMenuItem("Editer");
        mnEditer.add(mntmEditer_1);
        
        JMenuItem mntmMarquer = new JMenuItem("Marquer");
        mnEditer.add(mntmMarquer);
        
        JMenuItem mntmDupliquer = new JMenuItem("Dupliquer");
        mnEditer.add(mntmDupliquer);
        
        JMenuItem mntmNewMenuItem_1 = new JMenuItem("Supprimer");
        mnEditer.add(mntmNewMenuItem_1);
        
        JMenu mnVue = new JMenu("Vue");
        menuBar.add(mnVue);
        
        JMenuItem mntmNewMenuItem_2 = new JMenuItem("Liste");
        mnVue.add(mntmNewMenuItem_2);
        
        JMenuItem mntmNewMenuItem_3 = new JMenuItem("Semaine");
        mnVue.add(mntmNewMenuItem_3);
        
        JMenuItem mntmNewMenuItem_4 = new JMenuItem("Mois");
        mnVue.add(mntmNewMenuItem_4);
        
        JMenu mnAide = new JMenu("Aide");
        menuBar.add(mnAide);
        
        JMenuItem mntmNewMenuItem_5 = new JMenuItem("Aide");
        mnAide.add(mntmNewMenuItem_5);
        menuBar.setVisible(true);
       
        
        this.validate();
        this.repaint();
    }
}