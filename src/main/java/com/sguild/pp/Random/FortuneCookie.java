/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.Random;
import java.util.Random;
/**
 *
 * @author apprentice
 */
public class FortuneCookie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        int fortune = randomizer.nextInt(10);
      
        System.out.println("Today is your lucky day!  Free fortune cookies!");
        System.out.println("Your lucky fortune is:");
        
        if (fortune == 0){
            System.out.println("Those aren't the droids you're looking for.");
        }else if (fortune == 1){
            System.out.println("Never go in again a Sicilian when death is on the line!");
        }else if (fortune == 2) {
            System.out.println("Goonies never say die!");
        } else if (fortune == 3) {
            System.out.println("With great power there must also come - great responsibility.");
        }else if (fortune == 4) {
            System.out.println("Never argue with the data.");
        }else if (fortune == 5) {
            System.out.println("Try not.  Do or do not.  There is no try.");
        }else if (fortune == 6) {
            System.out.println("You are a leaf on the wind, watch how you soar.");
        }else if (fortune == 7) {
            System.out.println("Do absolutely nothing, and it will be everything that you thought it would be.");
        }else if (fortune == 8) {
            System.out.println("Kneel before Zod. . . and don't get the carpet dirty.");
        }else if (fortune == 9) {
            System.out.println("Make it so.");
        }else {
            System.out.println("Watchoo tryina pull here, randomizer?!");
        }
        
        
        
    }
    
}
