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
public class MiniMadLibs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        
        String noun1 = "";
        String adj1 = "";
        String noun2 = "";
        Double num1 = 0.0;
        String adj2 = "";
        String plNoun1 = "";        
        String plNoun2 = "";
        String plNoun3 = "";
        String presentVerb = "";
        String pastVerb = "";
        
        
        System.out.println("Lets play MAD LIBS!!");
        System.out.println("Please fill out the following inputs: ");
        System.out.println("");
        
        System.out.println("Noun: ");
        noun1 = userInput.next();
        
        System.out.println("Adjective: ");
        adj1 = userInput.next();
        
        System.out.println("Noun: ");
        noun2 = userInput.next();
        
        System.out.println("Number: ");
        num1 = userInput.nextDouble();
        
        System.out.println("Adjective: ");
        adj2 = userInput.next();
        
        System.out.println("A plural noun: ");
        plNoun1 = userInput.next();
        
        System.out.println("Another plural noun: ");
        plNoun2 = userInput.next();
        
        System.out.println("Yet another plural noun: ");
        plNoun3 = userInput.next();
        
        System.out.println("A verb of the present tense: ");
        presentVerb = userInput.next();
        
        System.out.println("The same verb as before, now past tense: ");
        pastVerb = userInput.next();
        
        
        
        System.out.println("");
        System.out.println(" ***** Now on to the FUN!!! *****");
        System.out.println(noun1 + ": the " + adj1 + " frontier.  These are the voyages of the starship " + noun2 + ".");        
        System.out.println("Its " + num1 + " year mission: to explore strange " + adj2 + " " + plNoun1 + ", to seek out " + adj2 + " ");
        System.out.println(plNoun2 + " and " + adj2 + " " + plNoun3 + ", to boldy " + presentVerb + " where no one has " + pastVerb + " before.");
        
                
    }
    
}
