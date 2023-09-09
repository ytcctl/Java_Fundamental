/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment02;

import javax.swing.JOptionPane;

/**
 *
 * @author ytcct
 */
public class DialogBox {
    public double inputTHBAmount(){
        String THBAmount = JOptionPane.showInputDialog("Input the THB Amount:");
        int userInput = JOptionPane.showConfirmDialog(null, "The input is: " + THBAmount + ", is it correct?" ,"Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);
        
        if (userInput  == JOptionPane.YES_OPTION) {
            double aTHBAmount = Double.parseDouble(THBAmount);
            return aTHBAmount;
        } 
        else {
            return 0;
        } 
    }
    
    public void checkTHBAmount(){
       while (inputTHBAmount() < 0) {
           JOptionPane.showMessageDialog(null, "The THB amount should be greater than Zero");
        }
    }
}
