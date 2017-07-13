/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.If.Else;
import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class GuessMe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner guesses = new Scanner(System.in);
        int correct = 27;
        int guess = 0;
        
        System.out.println("I've chosen a number, Betcha can't guess it!!");
        System.out.println("Your guess: ");
        guess = guesses.nextInt();
        
        if(guess > correct){
            System.out.println("Way too High! My number was " + correct);
        }else if(guess < correct){
            System.out.println("Too low, too slow. It was " + correct);
            
        }else{  
            System.out.println("WoW!! You must be a mind reader!");
        }
        
        
        
    }
    
}
