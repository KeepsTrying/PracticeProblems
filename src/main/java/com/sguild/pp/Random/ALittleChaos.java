/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.Random;
import java.util.Random;
/**
 *
 * @author apprentice
 */
public class ALittleChaos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random randomizer = new Random();

        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        int num = randomizer.nextInt(100);

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(101) + ", ");
        System.out.println(randomizer.nextInt(101));
        
        //chaging r.nextInt(101) to r.nextInt(50) + 50 changes the boundaries
        //initially we see random number 0-100
        //we change that to random numbers 0-49 and then add 50 to the result
        //then illustrating to the program random numbers 50-99
       
        
        
        
    }
    
}
