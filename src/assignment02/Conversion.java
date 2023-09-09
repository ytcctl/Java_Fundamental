/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment02;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Conversion extends JFrame implements ActionListener{
    
    private final JTextField textfield = new JTextField(10);
    private final JLabel label;
    private final JButton button;
    
    public Conversion(){
       
        
        
        button = new JButton("Calculate");
        label = new JLabel("                              ");
        
        add(textfield, BorderLayout.WEST);
        add(label, BorderLayout.EAST);
        add(button, BorderLayout.SOUTH);
        
        button.addActionListener(this);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //setSize(200,100);
        pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       double thb = Double.parseDouble(textfield.getText());
       
       label.setText(thb * 0.029 + "");
       this.pack();
        
    }
}
