/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02;
import java.util.Scanner;
/**
 *
 * @author Azhar Aizad
 */
public class L02Q02 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        double P,D,R,Y,M;
        System.out.print("Fill up these information\nThe price of the car: ");
        P = x.nextDouble();
        System.out.print("\nDown Payment: "); 
        D = x.nextDouble();
        System.out.print("\nInterest Rate in %: ");
        R = x.nextDouble();
        System.out.print("\nLoan Duration in Year: ");
        Y = x.nextDouble();
 
        M = (P-D)*(1+R*Y/100)/(Y*12);
        System.out.printf("Monthy Payment: "+"%6.2f\n",M);

        
    }
    
}
