/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W03;

import java.util.Scanner;

/**
 *
 * @author aviat
 */
public class L02Q02 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("What's the price of the car?");
        float P = keyboard.nextFloat();
        System.out.print("What's the down payment?");
        float D = keyboard.nextFloat();
        System.out.print("What's the interest rate?");
        float R = keyboard.nextFloat();
        System.out.print("What's the loan duration?");
        float Y = keyboard.nextFloat();
        System.out.printf("The monthly payment is %.2f",(P-D)*(1+R*Y/100)/(Y*12));
    
}
}