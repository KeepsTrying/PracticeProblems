/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.WhileAndDo;

/**
 *
 * @author apprentice
 */
public class WaitAWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int timeNow = 5;
        int bedTime = 10;
        
        //changing bedTime to 11 means the boolean condition for the while loop won't trigger false
        //and stop the code until timeNow==11 instead of the 10 initially stated
        
        //if you change timeNow's time to 11 and kept bedTime=10 the loop would not trigger to run

        while (timeNow < bedTime) {
            System.out.println("It's only " + timeNow + " o'clock!");
            System.out.println("I think I'll stay up just a liiiiittle longer....");
            timeNow++; // Time passes
        }
        
        //if you delete timeNow incrementation then the termination clause will never be triggered

        System.out.println("Oh. It's " + timeNow + " o'clock.");
        System.out.println("Guess I should go to bed ...");
    
    
    
    
    }
    
}
