/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W03;

/**
 *
 * @author aviat
 */
import java.util.Scanner;
public class L02Q06 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the amount of water in grams: ");
        int m = keyboard.nextInt();
        System.out.println("Enter the initial temperature in fahrenheit: ");
        float Ti = keyboard.nextFloat();
        System.out.println("Enter the final temperature in fahrenheit: ");
        float Tf = keyboard.nextFloat();
        System.out.println("The energy needed is"+m*(Tf-Ti)*4184);
    }
    
}
