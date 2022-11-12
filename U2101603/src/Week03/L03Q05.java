/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week03;

import java.util.Scanner;
public class L03Q05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc= new Scanner(System.in);
        //scanner
        
     double a,b,c,d,e,f;
     
     double det, x,y; //to find
     //det= ad-bc
     
     //intro
        System.out.println("Cramer's Rule");    
        System.out.println("ax+by=e, cx+dy=f");
        System.out.println("x= (ed-bf)/(ad-bc)   y=(af-ec)/(ad-bc)");
        System.out.println();
        
        
        //asking input
        System.out.print("Enter a: ");
        a= sc.nextDouble();
        
         System.out.print("\nEnter b: ");
        b= sc.nextDouble();
        
        System.out.print("\nEnter c: ");
        c= sc.nextDouble();
        
        System.out.print("\nEnter d: ");
        d= sc.nextDouble();
        
        System.out.print("\nEnter e: ");
        e= sc.nextDouble();
        
        System.out.print("\nEnter f: ");
        f= sc.nextDouble();
        //end of input
        
        
        //calc det
        det= (a*d) - (b*c);
        
        
        if (det!= 0.0){ //can proceed as det is not 0
            
        //calc x
        x= (e*d-b*f) / (det);
        
        //calc y
        y= (a*f - e*c)/ det;
        
            System.out.printf("x= %.3f, y= %.3f", x,y);
            //3 decimal places
        
        
        }
        
        else{
            System.out.println("The equation has no solution");
        } //if det==0.0
        
        
        
        
        
    }
    
}
