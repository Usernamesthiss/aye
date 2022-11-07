/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.jelly;
import java.util.Scanner;
public class Jelly {
    

    public static void main(String[] args) {
        int mark;
        Scanner input = new Scanner(System.in);
        mark = input.nextInt();
        if (mark > 100 || mark < 0)
            System.out.println("ERROR");
        else if (mark >= 80)
            System.out.println("A is ye grade Hooray!");
        else if (mark >= 79)
            System.out.println("(A -) didn't make the cut lah nice work tho");
        else if (mark >= 74)
            System.out.println("(B +) Wooohooo");
        else if (mark >= 60)
            System.out.println("B b all u got");
        else 
            System.out.println("aah what a failure");
    }
}
