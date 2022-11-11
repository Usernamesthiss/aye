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
         int sum;
         
         
         Random randobj = new Random();
          A = randobj.nextInt(10000);
          
          B = (A / 10000);
          C = (A / 1000);
          D = (A / 100);
          E = (A / 10);
          
          sum = (B + C + D + E);
          
          System.out.printf("The number is %s and %s", A, sum);
          
          
          
         
          
          

          
         
          
           
         
    }
    
}
