/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02;

/**
 *
 * @author User
 */
//generate 3 random numebers

import java.util.Random;
public class L02Q03 {
    public static void main(String[] args) {
        
        System.out.println("Random Numbers Generator");
        
        Random rand= new Random();
        
        //declare array
        int[] arr= new int[3];
        
        // conditions for random numbers
        int min=10, max=50;
       
        
        //generate random num
        int sum=0;
        double average; 
        
        for (int i=0;i<arr.length;i++){
            arr[i]= rand.nextInt(max-min+1)+ min;
            System.out.printf("%d ", arr[i]);
            sum+= arr[i];
        }
        
        average= sum/ 3.0;
        
        System.out.printf("\nSum of 3 numbrs is: %d\n", sum);
        System.out.printf("Average is %.2f\n", average);
        
    }
}
