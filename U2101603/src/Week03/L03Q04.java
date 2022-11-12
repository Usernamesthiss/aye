/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week03;

/**
 *
 * @author Khairul<Khairul Amirin UM>
 */
import java.util.Random;
public class L03Q04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("DICE GAME\n");
        
        Random rand= new Random();
              
        //A and B are players
        int scoreA, scoreB; //score each round
        int sumA=0, sumB=0; //sum of scores
        
        final int MIN=1, MAX=6; //numbers on a dice
        
        //running
        for (int i=1;i<=2;i++){
            System.out.println("Round "+i);
            
            System.out.println("\nPlayer A rolls the dice");
            scoreA= rand.nextInt(MAX)+MIN; //0 to 5 is generated. +1
            System.out.println("Score of player A is: "+ scoreA);
            sumA+= scoreA; //total score
            
            System.out.println("Player B rolls the dice");
            scoreB= rand.nextInt(MAX)+MIN; //0 to 5 is generated. +1
            System.out.println("Score of player B is: "+ scoreB+"\n");
            sumB+= scoreB;
        } //end of round
        
        
        //sum of scores
        System.out.println("Total scores of Player A is: "+ sumA);
        System.out.println("Total scores of Player B is: "+ sumB);
        
        //decision of winner
        System.out.println();
        if (sumA> sumB){
            System.out.println("Player A wins");
        }
        
        else if( sumA== sumB){
            System.out.println("It is a tie!");
        }
        else{
            System.out.println("Player B wins");
        }
        
    }
    
}
