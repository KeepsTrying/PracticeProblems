/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.ForLoops;
import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class TwoForsAndTenYearsAgo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        System.out.print("What year would you like to count back from? ");
        int year = userInput.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " years ago would be " + (year - i));
        }
        
        //ranges for starting and stopping would be year input - (0 - 10)
        //the first one is clearer to me because seems like the second one is almost a double negative

        System.out.println("\nI can count backwards using a different way too...");

        for (int i = year; i >= year - 20; i--) {
            System.out.println( (year - i) + " years ago would be " + i);
        }
        
        //initial ranges for starting and stopping is year - (0 to 10)
        
        
        
    }
    
}
