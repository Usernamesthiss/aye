/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W06;

/**
 *
 * @author aviat
 */
import java.util.Scanner;
import java.util.Random;
public class L04Q01 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int N = keyboard.nextInt();
        int [] gaston = new int[N];
        int h = 0;
        int lim = 100;
        Random RNG = new Random();
        while (h<N){
            gaston[h]=RNG.nextInt(lim);
            System.out.println(""+gaston[h]);
            ++h;
        }
            
    }
    
}
