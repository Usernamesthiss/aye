/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W04;

/**
 *
 * @author aviat
 */
import java.util.Random;
public class L03Q02 {
    public static void main(String[] args) {
        Random RNG = new Random();
        int lim = 5;
        int n = RNG.nextInt(lim);
        if (n==0)
            System.out.println(n+" is zero");
        else if (n==1)
            System.out.println(n+" is one");
        else if (n==2)
            System.out.println(n+" is two");
        else if (n==3)
            System.out.println(n+" is three");
        else if (n==4)
            System.out.println(n+" is four");
        else if (n==5)
            System.out.println(n+" is five");
            
    }
    
}
