package com.sguild.PracticeProgramming;

import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apprentice
 */
public class LuckySevens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int bank = 0;
        int rolls = 0;
        int maxBank;
        int rollsAtMax = 0;
        
        
        
        Scanner input = new Scanner(System.in);
        System.out.print("How many dollars would you like to gamble?");
        bank = input.nextInt();
        
        maxBank = bank;
        
        
        while (bank >= 1) {
            int thisRoll = diceRoll();
                rolls++;
                        
                if (thisRoll == 7) {
                    bank += 4;
                    if (bank > maxBank) {
                        maxBank = bank;
                        rollsAtMax = rolls;
                    }

                }
                else {bank -= 1;}   
        }
        
        System.out.println("You are broke after " + rolls + " rolls.");
        System.out.println("You should have quit after " + rollsAtMax + " rolls when you had " + maxBank + ".");
        
        
        
        
        

        
        
        
        
    }
    
            public static int diceRoll() {
            int roll = 0;
            Random game = new Random();
            roll = game.nextInt(10)+2;
            
            return roll;
                
        }
    
}
