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
public class L02Q01 {
     public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit");
        float c = keyboard.nextFloat();
        System.out.printf("This is %.2f°C",(c-32)/1.8);
    
}
}
