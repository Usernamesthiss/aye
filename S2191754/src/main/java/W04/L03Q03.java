/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W04;

import java.util.Scanner;

/**
 *
 * @author aviat
 */
public class L03Q03 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Sales volume = ");
        float a = keyboard.nextInt();
        if (a<=100)
            System.out.printf("Commision = %.2f",a/20);
        else if (a>100 && a<=500)
            System.out.printf("Commision = %.2f",a*3/40);
        else if (a>500 && a<=1000)
            System.out.printf("Commision = %.2f",a/10);
        else
            System.out.printf("Commision = %.2f",a*5/4);        
        
    }

    
}
