/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02;

import java.util.Scanner;

/**
 *
 * @author Irfanur
 */
public class L02Q04 {
    public static void main(String[] args) {
    double Total_seconds;
    double second;
    double minute;
    double hour;
   
      System.out.println("Enter the number of seconds");
      Scanner SC = new Scanner (System.in);
      Total_seconds = SC.nextDouble();
       
      hour = (Total_seconds / 3600); 
      minute = (Total_seconds % 3600)/60;
      second = (Total_seconds % 60);
      
        System.out.printf("%s seconds is %s hour %s minutes and %s seconds", Total_seconds, hour, minute, second );
         
              
              
      
      
      
       
      
      
              
      
      
      
      
    }
    
               
            
    
    
}
