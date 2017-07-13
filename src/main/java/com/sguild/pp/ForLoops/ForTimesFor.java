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
public class ForTimesFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner userInput = new Scanner(System.in);
        int correct = 0;
        System.out.println("Which times table would you like to practice?");
        int help = userInput.nextInt();
        
        for(int i = 1; i <= 15; i++){
            System.out.println(i + " times " + help + " is: ");
            int answer = userInput.nextInt();
            if (answer == (i*help)){
                correct++;
            }else {
                System.out.println("Sorry, the answer is: " + (i*5));
            }
        }
        System.out.println("You got " + correct + " correct!");
        
        if(correct < 8){
            System.out.println("Keep Studying!");
        }else if (correct > 13){
            System.out.println("Great work!  I can tell you've been practicing!");
        }
        
        
        
    }
    
}
