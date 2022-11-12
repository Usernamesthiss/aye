/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02;

import java.util.Random;

/**
 *
 * @author Irfanur
 */
public class L02Q05 {
    public static void main(String[] args) {
         int A;
         int B;
         int C;
         int D;
         int E;
         int F;
         int sum;
         
         
         Random randobj = new Random();
          A = randobj.nextInt(10000); // 3153
          
          B = (A / 10000); // 0
          C = (A / 1000); // 3
          D = (A - C*1000)/100; // 1
          E = (A - C*1000-D*100)/10; // 4
          F = (A - C*1000-D*100 - E*10); 
          
          
          sum = (B + C + D + E + F);
          
          System.out.printf("The number is %s and %s", A, sum);
          
          
          
         
          
          

          
         
          
           
         
    }
    
}
