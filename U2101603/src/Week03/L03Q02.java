/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Week03;

import java.util.Random;
public class L03Q02 {

    public static void main(String[] args) {
        // TODO code application logic here
      Random rand= new Random()  ;
      
      int num; //number
      num= rand.nextInt(6); //0 t0 5
      
      String num_in_word;
      
      switch(num){
          case 0:
           num_in_word="zero"   ;
          break;
          
          case 1:
              num_in_word="one"   ;
          break;
          
          case 2:
              num_in_word="two"   ;
          break;
          
          case 3:
              num_in_word="three"   ;
          break;
          
          case 4:
              num_in_word="four"   ;
          break;   
          
          default:
              num_in_word="five"   ;
          break;                  
           
      }//end of switch
      
      //output
        System.out.printf("%d is %s.\n", num, num_in_word);
    }
    
}
