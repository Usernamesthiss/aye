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
public class L02Q03 {
    public static void main(String[] args) {
        Random RNG = new Random();
    float n1;
    float n2;
    float n3;
    int l = 40;
    n1 = RNG.nextInt(l)+10;
    n2 = RNG.nextInt(l)+10;
    n3 = RNG.nextInt(l)+10;
        System.out.println("Number 1 = "+n1);
        System.out.println("Number 2 = "+n2);
        System.out.println("Number 3 = "+n3);
        System.out.println("Sigma n = "+(n1+n2+n3));
        System.out.printf("The Average is = %.2f",(n1+n2+n3)/3);
    
        
    }
    
}