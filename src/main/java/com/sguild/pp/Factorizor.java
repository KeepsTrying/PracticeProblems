/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.sguild.PracticeProgramming;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Factorizor {
    public static void main(String[] args) {
        
          Scanner input = new Scanner(System.in);
          
          System.out.print("What number would you like to factor?");
          int x = input.nextInt();
          
          int sum = 0;
  
          for (int i = 1; i < x; i++) {
        if (x % i == 0){
            System.out.println(i);
            sum += i;
        }
          }
        
          if (sum == x) {
              System.out.println(x + " is a perfect number");
              System.out.println(x + " is not a prime number");
          }
          
          else {
              System.out.println(x + " is not a perfect number");
              if (sum == 1) {System.out.println(x + " is a prime number");}
              else{
                  System.out.println(x + " is not a prime number");
          }
              
          }
    }
}
         