/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.If.Else;
import java.util.Scanner;
/**
 *
 * @author apprentice
 */
public class YourLifeInMovies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        int yearBorn = 2000;
        
        System.out.println("Hello user!  Is that a gray hair?!  What year were you born? ");
        yearBorn = userInput.nextInt();
        
        
        if (yearBorn <= 2005) {
            System.out.println("Pixar's 'UP' came out half a decado ago even.");
        }
        
        if (yearBorn <= 1995) {
            System.out.println("You know it's been 15 years since the first Harry Potter movie came out?");
        }
        
        if (yearBorn <= 1985) {
            System.out.println("Space jam didn't come out last decade did it?  Nope.  It was the one before that!");            
        }
        
        if (yearBorn <= 1975) {
            System.out.println("Did you know the original Jurris Park release date is closer to the Lunar landing that today's?!");            
        }
        
        if (yearBorn <= 1965){
            System.out.println("Sheesh, making MASH look young and that's been out half a century!");
        }
        
        
        
      
        
        
        

    }
    
}
