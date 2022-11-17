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
public class T3Q1e {
    public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
    int e;
    e = keyboard.nextInt();
        switch (e) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("N/A");
                break;
        }

        
    }
   
    
    
}
