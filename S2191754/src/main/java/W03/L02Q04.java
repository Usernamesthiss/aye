/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W03;

/**
 *
 * @author aviat
 */
import java.util.Scanner;
public class L02Q04 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int s = keyboard.nextInt();
        int r = s-s/3600*3600;
        System.out.printf("%d seconds is %d hours, %d minutes, and %d seconds",s,s/3600,s/60-s/3600*60,r-(r)/60*60);
    }
}
