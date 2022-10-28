/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02;

/**
 *
 * @author User
 */
import java.util.Random;
public class TestingRandom {
    public static void main(String[] args) {
        
       int num;
       
       Random rand= new Random();
       
       for (int i=0;i<50;i++){
       num= rand.nextInt(5);
       
        System.out.println(num);}
    }
}
