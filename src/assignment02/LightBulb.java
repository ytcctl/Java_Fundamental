/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment02;


public class LightBulb {
    String brand;
    int power;
    
    void setPower(int aPower){
        power = aPower;
    }
    
    String getBrand(){
        return brand;
    }
    
    String category(){
        String aCategory ="";
        if (power >= 55)  {
            aCategory = "High";
        }
        
        if (power >= 25 && power < 55) {
            aCategory = "Medium";
        }
        
        if (power < 25 ) {
            aCategory = "Low";
        }
        
        return aCategory;
    }
}
