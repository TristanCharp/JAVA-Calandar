package com.itii.planning.GUI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

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
	private JTable table;
	private JTable table_1;
	private JTable table_2;


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
        
    	setSize(633,404);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        this.setTitle("Gestionnaire de planning");
        
        JPanel panel_1 = new JPanel();
        panel_1.setMinimumSize(new Dimension(250, 130));
        panel_1.setBounds(486, 48, 128, 261);
        getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        JButton btnNewButton_1 = new JButton("Creer");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		WindowCreate windowCreate = new WindowCreate();
        		windowCreate.setVisible(true);
        	}
        });
        btnNewButton_1.setBounds(0, 11, 100, 25);
        panel_1.add(btnNewButton_1);
        
        JButton btnNewButton = new JButton("Editer");
        btnNewButton.setBounds(0, 47, 100, 25);
        panel_1.add(btnNewButton);
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		WindowEdit windowEdite = new WindowEdit();
        		windowEdite.setVisible(true);
        	}
        });
        
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
        lblVue.setBounds(38, 11, 44, 14);
        getContentPane().add(lblVue);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Liste", "Semaine", "Mois"}));
        comboBox.setBounds(100, 8, 223, 20);
        getContentPane().add(comboBox);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(27, 48, 438, 261);
        getContentPane().add(scrollPane);
        
        

		Object[][] dataListe = { } ;
		String[] headerListe = {"Nome de la tache","Date due", "Details"}; 
        
        table_2 = new JTable(dataListe,headerListe);
        scrollPane.setViewportView(table_2);
        
        Object[][] dataSemaine = { } ;
		String[] headerSemaine = {"Lundi","Mardi", "Mercredi","Jeudi","Vendredi","Samedi","Dimanche"}; 
        
        table_1 = new JTable(dataSemaine,headerSemaine);
        
        
        Object[][] dataMois = { } ;
		String[] headerMois = {"Lundi","Mardi", "Mercredi","Jeudi","Vendredi","Samedi","Dimanche"}; 
        
        table = new JTable(dataMois,headerMois);
        


        
        comboBox.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		switch ((String) comboBox.getSelectedItem()) {
				case "Liste":
					scrollPane.setViewportView(table_2);
					break;
				case "Semaine":
					scrollPane.setViewportView(table_1);
					break;
				case "Mois":
					scrollPane.setViewportView(table);
					
					break;

				default:
					System.out.println("error");
					break;
				}
        		
        	}
        });
        

        
       
        
        
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
        mntmNewMenuItem_5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		WindowAide windowAide = new WindowAide();
        		windowAide.setVisible(true);
        	}
        });
        menuBar.setVisible(true);
       
        
        this.validate();
        this.repaint();
    }
}