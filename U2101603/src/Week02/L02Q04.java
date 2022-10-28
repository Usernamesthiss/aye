/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02;

/**
 *
 * @author User
 */
//convert seconds to hrs, minutes
import java.util.Scanner;
public class L02Q04 {
    public static void main(String[] args) {
        
        System.out.println("Time Converter");
        
        Scanner sc= new Scanner(System.in);
        
        int seconds_Input; //input from user
        
        int hour_enough, minute_enough; //output enough
        int second_remain;
        
        
        //read input
        System.out.print("Enter the seconds: ");
        seconds_Input= sc.nextInt();
        
        System.out.println();
        
        //calculation of hour
        hour_enough= seconds_Input/3600; //convert seconds to hrs
        second_remain= seconds_Input% 3600; //remainder of seconds
        
        //calc of minute
        minute_enough= second_remain/60; //convert seconds to minutes
        second_remain= second_remain%60; //remainder of seconds
       
        
        //output
        System.out.printf("\n%d seconds is %d hours, %d minutes and %d seconds\n", 
             seconds_Input, hour_enough, minute_enough, second_remain);
    }
}
