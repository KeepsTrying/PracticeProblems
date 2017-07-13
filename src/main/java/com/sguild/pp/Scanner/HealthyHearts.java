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
public class HealthyHearts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Double age = 0.0;
        
        
        System.out.println("What is your age? ");
        age = userInput.nextDouble();
        Double maxRate = 220 - age;
        Double healthyMinRange = maxRate / 2;
        Double healthyMaxRange = maxRate * .85;
        System.out.println("");
        
        
        System.out.println("Your maximum heart rate should be " + maxRate + " beats per minute.");
        System.out.println("Your target heart rate zone should be " + healthyMinRange + " - " + healthyMaxRange + " beats per minute.");
        
    }
    
}
