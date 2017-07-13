/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.ForLoops;

/**
 *
 * @author apprentice
 */
public class SpringForwardFallBack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("It's Spring...!");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
        }
        
        //starts initally at 0 and stops at 9
        
        

        System.out.println("\nOh no, it's fall...");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + ", ");
        }
        //starts at 10 and stops at 1
        
        
    }
    
}
