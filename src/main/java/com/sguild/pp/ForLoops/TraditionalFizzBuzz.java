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
public class TraditionalFizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        int popsWanted = 0;
        int pops = 0;
        
        System.out.println("How much units fizzing and buzzing do you need in your life?  ");
        popsWanted = userInput.nextInt();
        
        
        
        for (int i = 0; i < (50 * popsWanted); i++) {
            
            if (i % 15 == 0 && i > 0) {
                System.out.println("fizz buzz");
                pops++;
            }else if (i % 3 == 0 && i > 0){
                System.out.println("fizz");
                pops++;
            }else if (i % 5 == 0 && i > 0) {
                System.out.println("buzz");
                pops++;
            } else if (pops == popsWanted) {
                System.out.println("TRADITION!!");
                break;         
            } else {
            System.out.println(i);
            }
        }   
    }
}
    
