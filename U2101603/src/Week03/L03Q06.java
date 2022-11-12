/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week03;

/**
 *
 * @author Khairul<Khairul Amirin UM>
 */
import java.util.Scanner;
public class L03Q06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double r, x, y, distance;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Determining The Point Position\n");
        System.out.print("Enter the radius: ");
        r= sc.nextDouble();
        
        System.out.print("\nEnter the x-coordinate: ");
        x= sc.nextDouble();
        
        System.out.print("\nEnter the y-coordinate: ");
        y= sc.nextDouble();
        
        //calc distance
        distance= Math.sqrt(x*x + y*y);
        
        //decision
        if (distance>r){
            System.out.println("The point is outside the circle");
        }
        
        else{
            System.out.println("\nThe point is inside the circle");
        }
    }
    
}
