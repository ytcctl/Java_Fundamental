/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment02;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class Launcher extends JFrame implements ActionListener, MenuListener {
    private JTextArea textArea;
    
    private JMenuBar menuBar = new JMenuBar();
    
    private JMenu launchMenu = new JMenu("Launch");
    private JMenu exitMenu = new JMenu("Exit");
    
    private JMenuItem lightBulb = new JMenuItem("Launch LightBulb");
    private JMenuItem dialogBox = new JMenuItem("Launch DialogBox");
    private JMenuItem conversion = new JMenuItem("Launch Conversion");
    
    public Launcher() {
        setJMenuBar(menuBar);
        
        menuBar.add(launchMenu);
        menuBar.add(exitMenu);
        
        launchMenu.add(lightBulb);
        launchMenu.add(dialogBox);
        launchMenu.add(conversion);
        
        textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        add(scrollPane);
        
        lightBulb.addActionListener(this);
        dialogBox.addActionListener(this);
        conversion.addActionListener(this);
        exitMenu.addMenuListener(this);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == exitMenu ) {
            System.out.println("Go");
        }
        if (source == lightBulb ) {
        String oldText = textArea.getText();
        textArea.setText(oldText + "LightBulb launched" +"\n");
        LightBulb lightBulb = new LightBulb();
         System.out.println("An object lightBulbA of Class LightBulb has been created");
        int aPower;
        do {
        String inputPower = JOptionPane.showInputDialog("Input a value for power >0");
        
        aPower = Integer.parseInt(inputPower);
        if (aPower < 0) {
             System.out.println("Power must be > 0");
        } 
        
        } while (aPower < 0);
        
        lightBulb.setPower(aPower);
        
        System.out.println(lightBulb.category());
        }
        
        if (source == dialogBox ) {
            String oldText = textArea.getText();
            textArea.setText(oldText + "DialogBox launched" +"\n");
            DialogBox dialogBox = new DialogBox();
            dialogBox.checkTHBAmount();
        }
        
         if (source == conversion ) {
             String oldText = textArea.getText();
               textArea.setText(oldText + "Conversion launched" +"\n");
            Conversion conversion = new Conversion();
            conversion.setVisible(true);
        }
    }

    @Override
    public void menuSelected(MenuEvent e) {
        System.exit(0);
    }

    @Override
    public void menuDeselected(MenuEvent e) {
        
    }

    @Override
    public void menuCanceled(MenuEvent e) {
        
    }
    
}

