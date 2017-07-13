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
public class DoOrDoNot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Should I do it? (y/n) ");
        boolean doIt;

        if (input.next().equals("y")) {
            doIt = true; // DO IT!
        } else {
            doIt = false; // DONT YOU DARE!
        }

        boolean iDidIt = false;

        
        
        while(doIt){
            iDidIt = true;
            break;
        }
            
        
        
        /*
        do {
            iDidIt = true;
            break;
        } while (doIt);
        */
        
        
        if (doIt && iDidIt) {
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not to ... but I totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anything!");
        




        //if you tell it to do it it says "I did it!"
        //If you tell it not to it says "I know you said not to.. but I totally did anyway."
        //without the do/while loop and just the while loop, it will appropriately say wether you 
        //did anything or not because it will not execute the IdidIt=true; line in the Do loop
        
        
    }
    
    }
}
