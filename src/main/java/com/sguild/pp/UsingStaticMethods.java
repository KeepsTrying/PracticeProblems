/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming;

/**
 *
 * @author apprentice
 */
public class UsingStaticMethods {

    public static void main(String[] args) {

        String theAnimal = StaticMethods.randimalizer();
        System.out.println("The animals selected were: ");
        UsingStaticMethods.fluffySpam();
    }
    // prints out 50 random animals

    public static void fluffySpam() {
        for (int i = 0; i < 50; i++) {
            System.out.println(StaticMethods.randimalizer());
               
            
            
            //However, shortcut wise, you can also call a method
            // defined INSIDE THE SAME CLASS as ... methodName
        }
    }
}
