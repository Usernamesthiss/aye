/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W04;

/**
 *
 * @author aviat
 */
import java.util.Scanner;
import java.util.Random;
public class L03Q04 {
    public static void main(String[] args) {
        int Player1,Player2;
        Scanner keyboard = new Scanner(System.in);
        Random RNG = new Random();
        int six = 6;
        int blank;
        System.out.println("Player 1 enter a number to start: ");
        blank = keyboard.nextInt();
        int a = RNG.nextInt(six);
        System.out.println("Player 1 second turn: ");
        blank = keyboard.nextInt();
        a = a + RNG.nextInt(six);
        System.out.println("Player 2 enter a number to start: ");
        blank = keyboard.nextInt();
        int b = RNG.nextInt(six);
        System.out.println("Player 2 second turn: ");
        blank = keyboard.nextInt();
        b = b + RNG.nextInt(six);
        if (a>b)
            System.out.println("Player 1 wins");
        else if (b>a)
            System.out.println("Player 2 wins");
        else
            System.out.println("It's a tie");
    }
}
