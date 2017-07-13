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
public class BiggerBetterAdder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner addThese = new Scanner(System.in);
        
        System.out.println("What is the first number you would like to add? ");
        double a = addThese.nextDouble();
        
        
        System.out.println("What is the second number you would like to add? ");
        double b = addThese.nextDouble();
        
        
        System.out.println("What is the third number you would like to add? ");
        double c = addThese.nextDouble();
        
        double sum = a + b + c;
        
        System.out.println(sum);
        System.out.println(sum);
        
        
        
    }
    
}
