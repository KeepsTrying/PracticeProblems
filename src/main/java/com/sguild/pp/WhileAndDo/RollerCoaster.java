/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.WhileAndDo;
import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class RollerCoaster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        System.out.println("We're going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off...!");

        String keepRiding = "y";
        int loopsLooped = 0;
        // when declaring and initializing a variable a data type must be present
        
        
        
        //changing condition to check for "n" instead is asking the rider if they want to get off
        //because saying no keeps the user looping.  I would change var keepRiding to wantToStop to
        //better illustrate that
        while (keepRiding.equals("y")) {
            System.out.println("WHEEEEEEEEEEEEEeEeEEEEeEeeee.....!!!");
            System.out.print("Want to keep going? (y/n) :");
            keepRiding = userInput.nextLine();
            loopsLooped++;  //after declaring and initializing a variable, you do not repeat its data type
        }

        System.out.println("Wow, that was FUN!");
        System.out.println("We looped that loop " + loopsLooped + " times!!");
        
        
        
        
        
        
        
    }
    
}
