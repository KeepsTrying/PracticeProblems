/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.Random;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author apprentice
 */
public class HighRoller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner diceSize = new Scanner(System.in);
        Random diceRoller = new Random();
        

        System.out.println("TIME TO ROOOOOOLL THE DIE!");
        System.out.println("How many sides does your die have?  ");
        int diceSides = diceSize.nextInt();
        int rollResult = diceRoller.nextInt(diceSides) + 1;
        
        System.out.println("You rolled a " + rollResult);

        if (rollResult == 1) {
            System.out.println("You rolled a critical failure! Ouch. Noob.");
        }else if (rollResult == diceSides){
            System.out.println("You rolled a Critical!  *Ding* (you leveled)");
        }else {
            System.out.println("Not bad.");
        }
        
        
        
        
        
    }
    
}
