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
public class ForTimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Which times table would you like to practice?");
        int help = userInput.nextInt();
        
        for(int i = 1; i <= 15; i++){
            System.out.println(i + " times " + help + " is " + (i*help) );
        }
        
        
        
        
    }
    
}
