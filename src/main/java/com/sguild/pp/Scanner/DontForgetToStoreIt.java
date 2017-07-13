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
public class DontForgetToStoreIt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int meaningOfLifeAndEverything = 42;
        double pi = 3.14159;
        String cheese, color;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Give me pi to at least 5 decimals: ");
        pi = inputReader.nextDouble();
        
        System.out.println("What is the meaning of life, the universe and Everything? ");
        meaningOfLifeAndEverything = inputReader.nextInt();
        
        System.out.print("What is your favorite kind of cheese? ");
        cheese = inputReader.next();
        
        System.out.print("Do you like the color red of blue more? ");
        color = inputReader.next();
        
        
           System.out.println("Ooh, " + color + " " + cheese + " sounds delicious!");
           System.out.println("The circumference of life is " + (2 * pi * meaningOfLifeAndEverything));
       
    }
    
}
