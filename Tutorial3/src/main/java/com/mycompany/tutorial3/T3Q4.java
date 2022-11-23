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
public class T3Q4 {
    public static void main(String[] args) {
        int x,y,z;
        Scanner a = new Scanner(System.in);
        System.out.println("Enter first number");
        x = a.nextInt();
        System.out.println("Enter second number");
        y = a.nextInt();
        System.out.println("Enter third number");
        z = a.nextInt();
        if (x>y && x>z)
                System.out.printf("The largest number is %d",x);
            else if (y>x && y>z)
                System.out.printf("The largest number is %d",y);
        else
                System.out.printf("The largest number is %d",z);
                    
    }
    
}
