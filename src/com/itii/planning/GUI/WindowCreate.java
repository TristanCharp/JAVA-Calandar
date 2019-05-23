package com.itii.planning.GUI;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import com.itii.planning.Engine;





public class WindowCreate extends JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNom;
	private JTextField txtDate;
	private JTextField txtDetail;
	private Engine engine = Engine.getEngine();


	private JDatePickerImpl datePicker_1;
	
    public WindowCreate() {
    	this.setSize(770, 428);
    	getContentPane().setMinimumSize(new Dimension(906, 402));
    	getContentPane().setLayout(null);
    	this.setTitle("Nouvelle tache");
    	
    	JPanel panel = new JPanel();
    	panel.setBounds(0, 0, 754, 389);
    	getContentPane().add(panel);
    	panel.setLayout(null);
    	
    	JLabel lblNomDeLa = new JLabel("Nom de la t\u00E2che :");
    	lblNomDeLa.setBounds(18, 33, 126, 20);
    	panel.add(lblNomDeLa);
    	
    	txtNom = new JTextField();
    	txtNom.setBounds(159, 30, 573, 26);
    	panel.add(txtNom);
    	txtNom.setColumns(10);
    	
    	JLabel lblDateDe = new JLabel("Date d\u00FBe :");
    	lblDateDe.setBounds(18, 79, 126, 20);
    	panel.add(lblDateDe);
    	
    	txtDate = new JTextField();
    	txtDate.setColumns(10);
    	txtDate.setBounds(159, 76, 350, 26);
    	panel.add(txtDate);
    	
    	JLabel lblDtails = new JLabel("D\u00E9tails :");
    	lblDtails.setBounds(18, 134, 126, 20);
    	panel.add(lblDtails);
    	
    	txtDetail = new JTextField();
    	txtDetail.setBounds(159, 118, 350, 200);
    	panel.add(txtDetail);
    	txtDetail.setColumns(10);
    	
    	JButton btnAnnuler = new JButton("Annuler");
    	btnAnnuler.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			dispose();
    		}
    	});
    	btnAnnuler.setBounds(426, 344, 115, 29);
    	panel.add(btnAnnuler);
    	
    	JButton btnOk = new JButton("OK");
    	btnOk.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			engine.addTache(txtNom.getText(), txtDate.getText(),txtDetail.getText());
    			dispose();
    		}
    	});
    	btnOk.setBounds(571, 344, 115, 29);
    	panel.add(btnOk);

    	Properties p = new Properties();
    	p.put("text.today", "today");
    	p.put("text.month", "month");
    	p.put("text.year", "year");

    	UtilDateModel model = new UtilDateModel();
    	
    	JDatePanelImpl datePanel = new JDatePanelImpl(model,p );
    	JDatePickerImpl datePicker_1 = new JDatePickerImpl(datePanel,new DateLabelFormatter());
    	
    	datePicker_1.setBounds(530, 79, 202, 30);
    	
    	panel.add(datePicker_1);
    	datePicker_1.setAlignmentX(Component.RIGHT_ALIGNMENT);


}
    public void actionPerformed(ActionEvent event) {
		// for UtilDateModel, the value returned is of type java.util.Date
		Date selectedDate = (Date) datePicker_1.getModel().getValue();
		
		// for UtilCalendarModel, the value returned is of type java.util.Calendar
//		Calendar selectedValue = (Calendar) datePicker.getModel().getValue();
//		Date selectedDate = selectedValue.getTime();

		// for SqlDateModel, the value returned is of type java.sql.Date
//		java.sql.Date selectedDate = (java.sql.Date) datePicker.getModel().getValue();
		
		JOptionPane.showMessageDialog(this, "The selected date is " + selectedDate);
	}
}

