/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02;

/**
 *
 * @author User
 */

// calc energy to heat water
import java.util.Scanner;
public class L02Q06 {
    public static void main(String[] args) {
        
        System.out.println("Energy to Heat Water");
        
        double M_gram; //amount of water in gram
        double T1_Fahrenheit; // initial temperature in Fahr
        double T2_Fahrenheit; //final temperature in Fahr
        
        double M; //amount of water in kg
        double T1_Celsius; //T initial in Celsius
        double T2_Celsius; //T final in Celsius
        double Q; //energy needed
        
        Scanner sc= new Scanner(System.in);
        
        
        System.out.print("Enter the amount of water in gram: ");
        M_gram= sc.nextDouble();
        
        System.out.print("Enter the initial temperature in Fahrenheit: ");
        T1_Fahrenheit= sc.nextDouble();
        
        System.out.print("Enter the final temperature in Fahrenheit: ");
        T2_Fahrenheit= sc.nextDouble();
        
        
        //Change unit
        M= M_gram/1000; //gram to kg
        T1_Celsius= (T1_Fahrenheit-32 )/1.8;
        T2_Celsius= (T2_Fahrenheit -32)/1.8;
        
        //calc of energy
        Q= M* (T2_Celsius- T1_Celsius)* 4184;
        
        System.out.printf("The energy needed is %e\n ", Q);
        
    }
    
}
