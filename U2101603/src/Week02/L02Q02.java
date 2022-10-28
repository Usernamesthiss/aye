/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02;

/**
 *
 * @author User
 */

//Monthly payment for car loan 
import java.util.Scanner;
public class L02Q02 {
    public static void main(String[] args) {
        
        System.out.println("Monthly payment for car loan ");
        Scanner sc= new Scanner(System.in);
        
        double P, D, R, Y, M;
        /* P= price of car
        D= down payment
        R= interest rate in %
        Y= loan duration in year
        M= monthly payment
        */
        
        System.out.print("Enter the price of car: ");
        P= sc.nextDouble();
        
         System.out.print("\nEnter the down payment: ");
        D= sc.nextDouble();
        
        System.out.print("\nEnter the interest rate in %: ");
        R= sc.nextDouble();
        
        System.out.print("\nEnter the loan duration in year: ");
        Y= sc.nextDouble();
        
        sc.close();
        
        //calc M
        M= (P-D) * (1+R*Y/100)/ (Y*12);
        
        System.out.println();
        
        System.out.printf("Monthly payment: %.2f\n",M);
        
        
        
        
        
    }
    
}
