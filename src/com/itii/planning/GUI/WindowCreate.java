package com.itii.planning.GUI;
import java.awt.Dimension;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import java.util.Calendar;
import java.util.Date;
import org.jdatepicker.impl.*;
import org.jdatepicker.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class WindowCreate extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static MainWindow mainWindow;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	
    public WindowCreate() {
    	this.setSize(928, 450);
    	getContentPane().setMinimumSize(new Dimension(130, 250));
    	getContentPane().setLayout(null);
    	
    	JPanel panel = new JPanel();
    	panel.setBounds(0, 0, 928, 402);
    	getContentPane().add(panel);
    	panel.setLayout(null);
    	
    	JLabel lblNomDeLa = new JLabel("Nom de la t\u00E2che :");
    	lblNomDeLa.setBounds(18, 33, 126, 20);
    	panel.add(lblNomDeLa);
    	
    	textField = new JTextField();
    	textField.setBounds(159, 30, 722, 26);
    	panel.add(textField);
    	textField.setColumns(10);
    	
    	JLabel lblDateDe = new JLabel("Date d\u00FBe :");
    	lblDateDe.setBounds(18, 79, 126, 20);
    	panel.add(lblDateDe);
    	
    	textField_1 = new JTextField();
    	textField_1.setColumns(10);
    	textField_1.setBounds(159, 76, 350, 26);
    	panel.add(textField_1);
    	
    	JLabel lblDtails = new JLabel("D\u00E9tails :");
    	lblDtails.setBounds(18, 134, 126, 20);
    	panel.add(lblDtails);
    	
    	textField_2 = new JTextField();
    	textField_2.setBounds(159, 118, 350, 200);
    	panel.add(textField_2);
    	textField_2.setColumns(10);
    	
    	JButton btnAnnuler = new JButton("Annuler");
    	btnAnnuler.setBounds(626, 357, 115, 29);
    	panel.add(btnAnnuler);
    	
    	JButton btnOk = new JButton("OK");
    	btnOk.setBounds(766, 357, 115, 29);
    	panel.add(btnOk);
    	

    	Properties p = new Properties();
    	p.put("text.today", "Today");
    	p.put("text.month", "Month");
    	p.put("text.year", "Year");
  
    	UtilDateModel model = new UtilDateModel();
    	JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
    	JDatePickerImpl datePicker = new JDatePickerImpl(datePanel, null);
    	datePicker.setLocation(200, 0);
    	
    	panel.add(datePicker);

    	

    }
}

