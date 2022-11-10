/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02;


/**
 *
 * @author Irfanur
 */
import java.util.Scanner;
public class L02Q01 {
    public static void main(String[] args) {  
    System.out.println("Please enter a number in Fahrenheit");
    double Fahrenheit;
    double Celsius;
    Scanner Templ = new Scanner (System.in);
    Fahrenheit = Templ.nextDouble();
    Celsius = (Fahrenheit-32)/1.8;
    System.out.printf("The temperature in Celsius is %.2f", Celsius);
    
          
    
}
