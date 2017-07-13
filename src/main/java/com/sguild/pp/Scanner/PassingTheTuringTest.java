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
public class PassingTheTuringTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myName = "Matt";
        String myFavColor = "blue";
        String myFavFood = "crab legs";
        int myFavNumber = 27;
        
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Hello there!");
        System.out.print("What's your name?");
        
        String userName = userInput.next();
        
        System.out.println("Hi " + userName + "!  My name is " + myName + ".");
        System.out.print("What's you're favorite color " + userName + "?");
        
        String userFavColor = userInput.next();
        
        System.out.println(userFavColor + ", is it?  Well I personally prefer " + myFavColor + ".");
        
        System.out.print("Maybe we have the same taste in cuisine. . . I love to eat " + myFavFood + "!  What's your favorite food?");
        
        String userFavFood = userInput.next();
        
        System.out.println("You like " + userFavFood + " too, huh?  Yeah, I'd grub on that!");
        System.out.print("...do you like numbers too? My favorite is " + myFavNumber + ", what about you?");
        
        String userFavNumber = userInput.next();
        
        System.out.println("Interesting! I think " + userFavNumber + " is a fabulous number as well!");
        System.out.println("Well thanks for staying to chat for a while " + userName + ", I thoroughly enjoyed it!  But as all good things must come to an end, I must vacate and focus on all this classwork!");
        
    }
    
}
