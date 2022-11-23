/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial3;

/**
 *
 * @author aviat
 */
import java.util.Scanner;
public class T3Q5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int r;
        System.out.print("Enter year: ");
        r = keyboard.nextInt();
        if (r % 4 == 0 && r % 100 != 0)
            System.out.println("This year is a leap year");
        else
            System.out.println("This year is not a leap year");
            
        
        
    }
    
}
