/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.If.Else;

/**
 *
 * @author apprentice
 */
public class SpaceRustlers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int spaceships = 10;
        int aliens = 25;
        int cows = 100;

        if(aliens > spaceships){
            System.out.println("Vrroom, vroom! Let's get going!");
            
            //if bases off of one condition and applies or not
            
            
            
            
        } else{
            System.out.println("There aren't enough green guys to drive these ships!");
        }

        if(cows == spaceships){
            System.out.println("Wow, way to plan ahead! JUST enough room for all these walking hamburgers!");
        } else if (cows > spaceships){
            System.out.println("Dangit! I don't how we're going to fit all these cows in here!");
        } 
        
            //else if puts a second condition statement to run though if the first one does not come back true
        
            // removing the "else"  from "else if" seperates the two comments and they now work as seperate "if" statements
            // so the second "if" is run wether or not the first one comes back as true
        else {
            System.out.println("Too many ships! Not enough cows.");
        }
        
        
        if (aliens > cows){
            System.out.println("Hurrah we've got the grub!  Hamburger party on Alpha Centauri!");
        } else if (cows > aliens) {
            System.out.println("Oh no!  The herds got restless and took over! Looks like _we're_ hamburger now!!");
        }
        
        
        
        
    }
    
}
