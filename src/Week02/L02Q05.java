/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02;
import java.util.Random;

/**
 *
 * @author Azhar Aizad
 */
public class L02Q05 {
    public static void main(String[] args) {
        Random x = new Random();
        int MAX,random,n1,n2,n3,n4,n5,sum;
        MAX = 10001;
        random = x.nextInt(MAX);        
        System.out.println(random);
        
        n1= random/10000;
        n2= (random%10000)/1000;
        n3= ((random%10000)%1000)/100;
        n4= (((random%10000)%1000)%100)/10;
        n5= (((random%10000)%1000)%100)%10;
        sum = n1+n2+n3+n4+n5;
        
        
    if (n1>0) 
        System.out.print(n1+" + ");
    else
        System.out.println();
    
        System.out.print(n2+" + ");
        System.out.print(n3+" + ");
        System.out.print(n4+" + ");
        System.out.print(n5);
        System.out.print(" = "+sum);
        
    }
    
}
