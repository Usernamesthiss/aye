/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jelly;

/**
 *
 * @author aviat
 */
import java.util.Scanner;
public class Lab001 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
                int a,b,c,d,e,f,g,h,i;
        System.out.println("Assalamualaykum, this program can find the determinant of a 3x3 matrix!"
                + "\nSimply Enter the values below (row by row)");
        System.out.println("a");
        a = S.nextInt();
         System.out.println("b");
        b = S.nextInt();
          System.out.println("c");
        c = S.nextInt();
          System.out.println("d");
        d = S.nextInt();
          System.out.println("e");
        e = S.nextInt();
          System.out.println("f");
        f = S.nextInt();
          System.out.println("g");
        g = S.nextInt();
          System.out.println("h");
        h = S.nextInt();
          System.out.println("i");
        i = S.nextInt();
        System.out.printf("The determinant is %d",(a*e*i + b*f*g + c*d*h)  -  (b*d*i + a*f*h + c*e*g));
         
        
        
    }
    
    
}
