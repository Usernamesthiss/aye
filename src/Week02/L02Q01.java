/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02;
import java.util.Scanner;

/**
 *
 * @author Azhar Aizad
 */
public class L02Q01 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double Fahrenheit,Celcius;       
        System.out.print("Degree Fahrenheit: ");
        Fahrenheit = x.nextDouble();
        
        Celcius = (Fahrenheit-32)/1.8;
        System.out.printf("Degree Celcius: "+"%6.2f\n",Celcius);
        
    }
    
}
