/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.WhileAndDo;
import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class StayPositive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int printCount = 1;
        
        
        System.out.println("What number should I count down from?  ");
        int maxNum = userInput.nextInt();
        
        while (maxNum >= 0) {
            if (printCount % 10 == 0){
                System.out.println(maxNum);
            }else{
                System.out.print(maxNum + " ");
            }
            maxNum--;
            printCount++;
        }
        
        
        
        
        
    }
    
}
