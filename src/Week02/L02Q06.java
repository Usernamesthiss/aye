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
public class L02Q06 {
    public static void main(String[] args) {
         Scanner x = new Scanner(System.in);
         double M,Q,ftF,itF,ftC,itC,kg;
        
         System.out.print("Enter the amount of water in gram: ");
         M = x.nextDouble();
         System.out.print("Enter the initial temperature in Fahrenheit: ");
         itF = x.nextDouble();
         System.out.print("Enter the final temperature in Fahrenheit:");
         ftF = x.nextDouble();
         
         kg = M/1000;
         ftC = (ftF-32)/1.8;
         itC = (itF-32)/1.8;
         Q = (kg*(ftC-itC)*4184)*1000;
         System.out.println("The energy needed is "+Q);
    }
   
    
    
    
    
}
