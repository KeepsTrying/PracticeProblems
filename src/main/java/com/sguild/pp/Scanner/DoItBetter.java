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
public class DoItBetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        int miles = 0;
        int hotdogs = 0;
        int langs = 0;
        
        System.out.println("Hello, User! I heard you're hot stuff. . . we'll see about that!");
        System.out.println("How many miles can you run, pudgy??" );
        miles = userInput.nextInt();
        
        System.out.println("Ha! I run " + (miles * 2 + 1) + " miles without breaking a sweat!");
        System.out.println("");
        
        
        
        System.out.println("Well tubby, I guess if you can't run, you can prolly eat. . .");
        System.out.println("How many hotdogs can you consume before you reach your bursting point? ");
        hotdogs = userInput.nextInt();

        System.out.println(". . . not impressive I have to say.  It takes " + (hotdogs * 2 + 1) + " to fill me up.");
        System.out.println("");
        
        
        
        System.out.println("Well you certainly aren't talkative.  I seriously doubt you know more languages than I.");
        System.out.println("How many languages can you speak? ");
        langs = userInput.nextInt();
        System.out.println("Well, at least you know enough words to respond.  I am fluent in " + (langs * 2 + 1) + " languages.");
        System.out.println("Do understand that's no reason to stop trying.");
        System.out.println("Best of luck!");
        
        
        
        
        
        
        
    }
    
}
