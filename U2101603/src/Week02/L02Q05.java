/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02;

/**
 *
 * @author User
 */
//generate a random number 0 to 1000
import java.util.Random;
public class L02Q05 {
    public static void main(String[] args) {
        
        System.out.println("1 Random Number Generator");
        
        // random
        int min=1, max= 10_000;
        int num;
        Random rand= new Random();
        
        num= rand.nextInt(max-min+1) + min;
        
        System.out.print("The random number generated= ");
        System.out.print(num);
        
        //find sum of digits
        int sum=0;
        int number= num;
        
        while (num>0){
            sum+= num%10;
            num/= 10;
        }
            
         System.out.println("\nSum of all digits: "+ sum);   
        
            
            
    }
    
}
