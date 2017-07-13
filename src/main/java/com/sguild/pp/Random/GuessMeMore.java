/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.Random;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class GuessMeMore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random choice = new Random();
        int secret = choice.nextInt(201) - 100;
        
        Scanner guesses = new Scanner(System.in);
        
        
        System.out.println("I've chosen a number between -100 and 100 inclusive.  Betcha can't guess it!  ");
        int guess = guesses.nextInt();
        
        if (guess == secret){
            System.out.println("Wow nice guess! That was it!");
        } else if (guess < secret){
            System.out.println("Ha, nice try - too low!  Try again!  ");
            guess = guesses.nextInt();
            
            if (guess == secret){
            System.out.println("Wow nice guess! That was it!");
            }else {
                System.out.println("Good try but it was " + secret);
            }
        } else if (guess > secret){
            System.out.println("Too high!  Keep Trying!  ");
            guess = guesses.nextInt();
            
            if (guess == secret){
            System.out.println("Wow nice guess! That was it!");
            }else {
                System.out.println("Good try but it was " + secret);
            }
            
        }
       
        
        
        
        
        
    }
    
}
