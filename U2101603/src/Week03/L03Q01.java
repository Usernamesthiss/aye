/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03;

/**
 *
 * @author KA
 */
import java.util.Scanner;
public class L03Q01 {
    public static void main(String[] args) {
        int num1, num2, result;
        
        char operand;
        
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter two integer number: ");
        //read 2 int
        num1= sc.nextInt();
        num2= sc.nextInt();
        
        //read operand
        System.out.print("\nEnter the operand: ");
        operand= sc.next().charAt(0);
        
        
        //switch
        switch (operand){
            case '+':
               result= num1+num2;
            break;
            
            case '-':
                 result= num1-num2;
            break;
            
            case '*':
                 result= num1*num2;
            break;
            
            case '/':
                 result= num1/num2;
            break;
            
            case '%':
                 result= num1%num2;
            break;
            
            default:
                result= 0;
                System.out.println("Please run again");
            break;
            
        }//end of switch
        
        //output
        System.out.printf("%d %c %d = %d\n", num1, operand, num2, result);
        
    }
    
}
