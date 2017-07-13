/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.WhileAndDo;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author apprentice
 */
public class BewareTheKraken {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random chooseFish = new Random();
        System.out.println("Already, get those flippers and wetsuit on - we're going diving!");
        System.out.println("Here we goooOOooOooo.....! *SPLASH*");

        int depthDivedInFt = 0;
        String response = null;
        String fish1 = "Bass";
        String fish2 = "Walleye";
        String fish3 = "Minnow";
        
        int whichFish = -1;

                
                
                
        // Turns out the ocean is only so deep, 36200 at the deepest survey,
        // so if we reach the bottom ... we should probably stop.
        
        
        //turning the while loop's condition to true doesn't change anything as is because the code stops
        //at the Kraken break; before it ever reaches the termination statement in the while() portion
        while(depthDivedInFt < 36200){
            System.out.println("So far, we've swam " + depthDivedInFt + " feet");
            System.out.println("Would you like to stop now?     y/n  ");
            response = userInput.nextLine();
            if (response.equalsIgnoreCase("y")){
                break;
            }else{
            if(depthDivedInFt >= 20000){
                System.out.println("Uhhh, I think I see a Kraken, guys ....");
                System.out.println("TIME TO GO!");
                break;
            }

            // I can swim, really fast! 500ft at a time!
            depthDivedInFt += 1000;
            whichFish = chooseFish.nextInt(3);
            if (whichFish == 0){
                System.out.println(fish1);
            }else if (whichFish == 1){
                System.out.println(fish2);
            }else if (whichFish == 2){
                System.out.println(fish3);
            }else{
                System.out.println("Undesired Effect  =(");
            }
            }
        }
        System.out.println("");
        System.out.println("We ended up swimming " + depthDivedInFt + " feet down.");
        System.out.println("I bet we can do better next time!");
        
        
        
        
        
    }
    
}
