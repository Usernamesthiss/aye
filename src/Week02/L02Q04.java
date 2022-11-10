/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02;


/**
 *
 * @author Azhar Aizad
 */
public class L02Q04 {
    public static void main(String[] args) {        
        int time1,time2,time3;
        time1 = 123456/3600;
        time2 = (123456%3600)/60;
        time3 = (123456%3600%60);
        
        System.out.print("123456 seconds is "+time1+" hours "+time2+" minutes "+time3+" seconds\n");                          
    }
}
