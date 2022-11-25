/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutorial4;

/**
 *
 * @author aviat
 */
import java.util.Scanner;
public class T4Q1d {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number: ");
    int o = keyboard.nextInt();
    int r = 0;
    int s = 0;
    while(r<o){
        ++r;
        s+=r;

    }        
        System.out.printf("%d",s);
    
        
    }
    
}
