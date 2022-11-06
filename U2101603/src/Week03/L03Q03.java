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
public class L03Q03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sales_vol; //sales volume
        double commision=0;
        
        Scanner sc= new Scanner(System.in); 
        
        System.out.println("COMMISION CALCULATOR");
        //take input
        System.out.print("Enter the sales volume: ");
        sales_vol= sc.nextDouble();
        
        //calc commision
        if (sales_vol>=0 && sales_vol<=100){
            commision= 0.05* sales_vol;
        }
        else if (sales_vol>100 && sales_vol<=500){
            commision= 7.5/100* sales_vol;
        }
        
        else if (sales_vol>500 && sales_vol<=1000){
            commision= 10/100 * sales_vol;
        }
        else if (sales_vol>1000){
            commision= 12.5/100 * sales_vol;
        }
        else{
            commision = -1; //for illogical input of sales_vol
        }
        
        
        //final output
        if (commision!= -1){
            System.out.printf("\nThe commision is %.2f\n", commision);
        }
        else{
            System.out.println("Please enter the correct input for sales volume");
        }
    }
    
}
