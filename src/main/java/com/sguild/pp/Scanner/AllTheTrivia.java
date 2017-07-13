/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.Scanner;
import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class AllTheTrivia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        String ans1 = null;
        String ans2 = null;
        String ans3 = null;
        String ans4 = null;
        
        System.out.print("1,024 Gigabytes is equal to one what? ");
        ans1 = userInput.next();
        
        System.out.print("In our solar system which is the only planet that rotates clockwise? ");
        ans2 = userInput.next();
        
        System.out.print("The largest volcano ever discovered in our solar system is located on which planet? ");
        ans3 = userInput.next();
        
        System.out.print("What is the most abundant element in the Earth's atmoshphere? ");
        ans4 = userInput.next();
        
        System.out.println("");
        
        System.out.println("Wow, 1,024 Gigabytes is a " + ans3 + "!");
        System.out.println("I didn't know that the largest ever volcano was discovered on " + ans1 + "!");
        System.out.println("That's amazing that " +  ans2 + "is the most abundant element in the atmostphere.");
        System.out.println(ans4 + " is the only planet that rotates clockwise? Neat!");
              
        
        
        
        
    }
    
}
