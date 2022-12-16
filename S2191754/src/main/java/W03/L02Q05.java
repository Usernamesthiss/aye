/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W03;

/**
 *
 * @author aviat
 */
import java.util.Random;
public class L02Q05 {
    public static void main(String[] args) {
        int lim = 10000;
        Random RNG = new Random();
        int s = RNG.nextInt(lim);
        System.out.println("number is: "+s);
        if (s==10000)
            System.out.println("1");
        else
            System.out.printf("sum of digits is: %d",(s-s%1000)/1000+(s%1000-s%100)/100+(s%100-s%10)/10+s%10);   
        
    }
    
}
