/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02;

/**
 *
 * @author User
 */
//temperature converter
import java.util.Scanner;
public class L02Q01 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        double TFahrenheit, TCelsius;
        
        System.out.println("Enter the temperature in fahrenheit");
       TFahrenheit= sc.nextDouble();
       
       //calc temperature in celsius
       
       TCelsius= (TFahrenheit-32)/ 1.8;
       
        System.out.println("Temperature in celsius: " + TCelsius);
       
        
        
        
        
    }
    
}
