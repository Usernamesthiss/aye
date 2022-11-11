/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02;

import java.util.Scanner;

/**
 *
 * @author Irfanur
 */
public class L02Q02 {
    public static void main(String[] args) {
        double Car_price;
        double Down_payment;
        double Monthly_payment;
        double Interest_rate;
        double loan_duration;
       
        System.out.println("Enter the price of the car here");
        Scanner SC = new Scanner (System.in);
        Car_price = SC.nextDouble();
        
        
        System.out.println("Enter the Down_payment here");
        Down_payment = SC.nextDouble();
        
        System.out.println ("Enter the Interest_rate in percentage here");
        Interest_rate = SC.nextDouble();
        
        System.out.println("Enter the loan_duration here");
        loan_duration = SC.nextDouble();
        
         Monthly_payment= (Car_price - Down_payment) * (1 + Interest_rate*loan_duration/100) / (loan_duration *12);
         System.out.printf("The Monthly payment for the car is %.2f", Monthly_payment); 

        
        

     
        
        
        
        
        
        
        
        
        
                
                
        
        
        
        
    }
}
