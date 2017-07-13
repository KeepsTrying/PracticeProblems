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
public class GuessMeFinally {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        Random choice = new Random();
        int secret = choice.nextInt(201) - 100;
        int guess = -299;
        int attempts = 0;
        Scanner guesses = new Scanner(System.in);
        
        
        System.out.println("I've chosen a number between -100 and 100 inclusive.  Betcha can't guess it!  ");
        
        
        
        
        do {
            guess = guesses.nextInt();
            attempts++;
            
            if (guess == secret && attempts == 1){
            System.out.println("Wow, first try!!  You must be a mindreader!");
            } else if (guess == secret){
            System.out.println("You got it, finally!  It took you " + attempts + " tries though.");
            } else if (guess > secret){
                System.out.println("Too high, next guess!  ");
            } else if (guess < secret){
                System.out.println("Too low, next guess!");
            } else {
                System.out.println("Something broke?");
            }}while(guess != secret);
           
        
        
                }
        
        
    }
    
