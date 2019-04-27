/*
 * Created by JFormDesigner on Sat Apr 27 16:53:58 CEST 2019
 */

package com.itii.planning.GUI;

import java.awt.*;
import javax.swing.*;

public class MainWindow extends JFrame {

    private JPanel panel1;
    private static MainWindow mainWindow;


    private MainWindow() {
        //initialize();
        initComponents();
    }



    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - tristan
    private JMenuBar menuBar1;
    private JMenu menu1;
    private JMenuItem menuItem1;
    private JMenu menu2;
    private JMenuItem menuItem2;
    private JMenuItem menuItem3;
    private JMenuItem menuItem4;
    private JMenuItem menuItem5;
    private JMenuItem menuItem6;
    private JMenu menu3;
    private JMenuItem menuItem7;
    private JMenuItem menuItem8;
    private JMenuItem menuItem9;
    private JMenu menu4;
    private JLabel label1;
    private JComboBox comboBox1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables



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
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - tristan
        menuBar1 = new JMenuBar();
        menu1 = new JMenu();
        menuItem1 = new JMenuItem();
        menu2 = new JMenu();
        menuItem2 = new JMenuItem();
        menuItem3 = new JMenuItem();
        menuItem4 = new JMenuItem();
        menuItem5 = new JMenuItem();
        menuItem6 = new JMenuItem();
        menu3 = new JMenu();
        menuItem7 = new JMenuItem();
        menuItem8 = new JMenuItem();
        menuItem9 = new JMenuItem();
        menu4 = new JMenu();
        label1 = new JLabel();
        comboBox1 = new JComboBox();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        //======== menuBar1 ========
        {

            //======== menu1 ========
            {
                menu1.setText("Fichier");

                //---- menuItem1 ----
                menuItem1.setText("Quitter");
                menu1.add(menuItem1);
            }
            menuBar1.add(menu1);

            //======== menu2 ========
            {
                menu2.setText("Edition");

                //---- menuItem2 ----
                menuItem2.setText("Cr\u00e9er");
                menu2.add(menuItem2);

                //---- menuItem3 ----
                menuItem3.setText("Editer");
                menu2.add(menuItem3);

                //---- menuItem4 ----
                menuItem4.setText("Marquer");
                menu2.add(menuItem4);

                //---- menuItem5 ----
                menuItem5.setText("Dupliquer");
                menu2.add(menuItem5);

                //---- menuItem6 ----
                menuItem6.setText("Supprimer");
                menu2.add(menuItem6);
            }
            menuBar1.add(menu2);

            //======== menu3 ========
            {
                menu3.setText("Vue");

                //---- menuItem7 ----
                menuItem7.setText("Liste");
                menu3.add(menuItem7);

                //---- menuItem8 ----
                menuItem8.setText("Semaine");
                menu3.add(menuItem8);

                //---- menuItem9 ----
                menuItem9.setText("Mois");
                menu3.add(menuItem9);
            }
            menuBar1.add(menu3);

            //======== menu4 ========
            {
                menu4.setText("Aide");
            }
            menuBar1.add(menu4);
        }
        setJMenuBar(menuBar1);

        //---- label1 ----
        label1.setText("Vue :");
        contentPane.add(label1);
        label1.setBounds(85, 5, 30, 20);

        //---- comboBox1 ----
        comboBox1.setMaximumRowCount(3);
        comboBox1.setSelectedIndex(0);
        contentPane.add(comboBox1);
        comboBox1.setBounds(new Rectangle(new Point(115, 0), comboBox1.getPreferredSize()));

        { // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents

        setSize(640,480);
        setVisible(true);


        this.validate();
        this.repaint();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}