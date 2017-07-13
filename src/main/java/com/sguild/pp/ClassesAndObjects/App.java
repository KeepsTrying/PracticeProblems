/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.ClassesAndObjects;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class App {
    
    // input = Double.parseDouble(userInput.nextLine());
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        int decision;
        double a;
        double b;
        boolean run = true;
        
        double answer;
        
        do {
        System.out.println("Would you like to 1)add  2)subtract  3)multiply  or  4)divide or 0)exit?");
        
        
       decision = Integer.parseInt(userInput.nextLine());
       
       if (decision == 1){
           System.out.println("You selected addition.");
           System.out.println("");
           System.out.println("What is your first Addend?");
           a = Double.parseDouble(userInput.nextLine());
           
           System.out.println("What is your second Addend?");
           b = Double.parseDouble(userInput.nextLine());
           
           System.out.println("The sum is: " + SimpleCalculator.add(a,b));
           
       } else if (decision == 2) {
           System.out.println("You selected subtraction.");
           System.out.println("");
           System.out.println("What is your Minuend?");
           a = Double.parseDouble(userInput.nextLine());
           
           System.out.println("What is your Subtrahend?");
           b = Double.parseDouble(userInput.nextLine());
           
           System.out.println("The difference is: " + SimpleCalculator.subtract(a,b));
           
       } else if (decision == 3) {
           System.out.println("You selected Multiplication.");
           System.out.println("");
           System.out.println("What is your first Factor?");
           a = Double.parseDouble(userInput.nextLine());
           
           System.out.println("What is your second Factor?");
           b = Double.parseDouble(userInput.nextLine());
           
           System.out.println("The result is: " + SimpleCalculator.multiply(a,b));
           
       } else if (decision == 4) {
           System.out.println("You selected Division.");
           System.out.println("");
           System.out.println("What is your Dividend?");
           a = Double.parseDouble(userInput.nextLine());
           do {
           System.out.println("What is your Divisor?");
           b = Double.parseDouble(userInput.nextLine());
           if (b == 0){
               System.out.println("You cannot divide by zero");
           }
           } while (b == 0);
           System.out.println("The quotient is: " + SimpleCalculator.divide(a,b));
           
       } else if (decision == 0) {
           System.out.println("Thank you for choosing SimpleCaclulator for all your math needs!");
           run = false;
           break;
       }
           
           

        
        
        
       
          

        } while (run);
        
        
        
    }
    
}
