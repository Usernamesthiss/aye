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
public class L02Q06 {
    public static void main(String[] args) {
         
        double W; // weight of the water
        double FT; // final temperature
        double IT; // initial temperature
        double E; // energy
        
        Scanner SC = new Scanner(System.in);
        
        System.out.println("Eneter the initial temperature here");
        FT = SC.nextDouble();
        
        IT = SC.nextDouble();
        
        W = SC.nextDouble();
        
        E = W*(FT - IT)*4184;
        
        System.out.println("E");
        
        
        
        
        
        
        
        
        
                
        
    }
   
}
