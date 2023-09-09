/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment02;
import javax.swing.JOptionPane;
/**
 *
 * @author GenMachine
 */
public class TestLightBulb {
     public static void main(String[] args) {
        LightBulb lightBulbA = new LightBulb();
        System.out.println("An object lightBulbA of Class LightBulb has been created");
        int aPower;
        do {
        String inputPower = JOptionPane.showInputDialog("Input a value for power (>0");
        
        aPower = Integer.parseInt(inputPower);
        if (aPower < 0) {
             System.out.println("Power must be > 0");
        } 
        
        } while (aPower < 0);
        
        lightBulbA.setPower(aPower);
        
        
        System.out.println(lightBulbA.category());
        System.exit(0);
    }
}
