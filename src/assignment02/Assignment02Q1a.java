/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment02;

/**
 *
 * @author GenMachine
 */
public class Assignment02Q1a {
    public static void main(String[] args){
        int from = 5;
        int to = 13;
        int product = 1;
        
        for (int i=from; i<=to; i+=4) {
            product *=i;
            System.out.println(product);
        }
        
        System.out.println("The product is " + product);
    }
    
}
