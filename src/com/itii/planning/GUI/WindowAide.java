package com.itii.planning.GUI;
import java.awt.Dimension;

import javax.swing.*;
import java.awt.BorderLayout;

public class WindowAide extends JFrame {
		
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		public WindowAide() {
			setTitle("Aide\r\n");
			this.setSize(443, 275);
	    	getContentPane().setMinimumSize(new Dimension(450, 275));
	    	getContentPane().setLayout(null);
	    	
	    	JPanel panel = new JPanel();
	    	panel.setBounds(0, 0, 421, 219);
	    	getContentPane().add(panel);
	    	panel.setLayout(null);
	    	
	    	JLabel lblVersion = new JLabel("Version 1.1");
	    	lblVersion.setBounds(167, 49, 81, 20);
	    	panel.add(lblVersion);
	    	
	    	JLabel lbldevTristanJo = new JLabel("@Dev Tristan Jo\u00E9 Florian");
	    	lbldevTristanJo.setBounds(121, 85, 182, 20);
	    	panel.add(lbldevTristanJo);
	    }
}
