/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02;
import java.io.PrintStream;
import java.util.Random;
/**
 *
 * @author Azhar Aizad
 */
public class L02Q03 {
    public static void main(String[] args) {
        Random x = new Random();
        double Num1,Num2,Num3,Sum,Average;
        
        Num1 = 10+(x.nextDouble()*39);
        Num2 = 10+(x.nextDouble()*39);
        Num3 = 10+(x.nextDouble()*39);               
        Sum = Num1 + Num2 + Num3;
        Average = (Sum)/3;
        
        System.out.printf("%4.2f\t",Num1);
        System.out.printf("%4.2f\t",Num2);
        System.out.printf("%4.2f\n",Num3);
        System.out.printf("Sum: %4.2f\n",Sum);
        System.out.printf("Average: %4.2f\n",Average);
        
    }
    
    }
    

