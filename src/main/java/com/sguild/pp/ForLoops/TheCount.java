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
public class TheCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int start;
        int end;
        int increment;
        int count = 0;
        
        System.out.println("*** I love to count! Let me share my counting with you!! ***");
        System.out.println("Start at: ");
        start = userInput.nextInt();
        System.out.println("End At: ");
        end = userInput.nextInt();
        System.out.println("Count by: ");
        increment = userInput.nextInt();
        
        
        for (int i = start;i <= end; i += increment){
            count++;
        
            if(count % 3 == 0){
                    System.out.println(i + " - Ah ah ah!");
        }else {
                System.out.print(i + " ");
            }
            
        }
    }
}

        
    
    

    