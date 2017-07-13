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
public class TriviaNight {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int correct = 0;
        int incorrect = 0;
        
        boolean java = false;
        boolean dotnet = true;
        boolean instructor = false;
        boolean javaStudent = false;
       
        
        int firstQ = 0;
        int secQ = 0;
        int thirdQ = 0;
        
        
        System.out.println("Welcome! This is a Super Special Trivia for our coding cohort!");
        System.out.println("                ***  Thanks for playing!!  ***");
        System.out.println("");
        
        System.out.println("FIRST QUESTION!!");
        System.out.println("What was the precourse work called?");
        System.out.println("1) Java Rools           3)coding 101");
        System.out.println("2) Intro to Web Dev     4)what precourse work?");
        firstQ = userInput.nextInt();
        
        if (firstQ == 2){
            correct++;
        } else { incorrect++; }
        
        
        System.out.println("");
        System.out.println("");
        System.out.println("SECOND QUESTION!!");
        System.out.println("What is the best coding language to learn?");
        System.out.println("1) JAVA             3)I am an instructor, testing, so apply a politically neutral answer");
        System.out.println("2) .NET             4)I am Friend/Relative just testing and don't understand");
        secQ = userInput.nextInt();
        
        if (secQ == 1){
            correct++;
            javaStudent = true;
            System.out.println("You are a phenomenal classmate, thank you very much for testing!");
        }else if (secQ == 2) {
            incorrect++;
            System.out.println("Thank you for testing! I hope your class is as good as mine!");
        }else if (secQ == 3) {
            correct++;
            instructor = true;
            System.out.println("Thank you for testing!  This will be applied as a correct answer =)");
        }else {
            correct++;
            System.out.println("Thank you very much for testing! I hope you enjoy Trivia night!");
            System.out.println("This will be applied as a correct answer =))");
        }
            
      
        
        System.out.println("");
        System.out.println("");
        System.out.println("THIRD QUESTION!!");
        System.out.println("What is the Java instructors name?");
        System.out.println("1) Austyn           3)Frostyn");
        System.out.println("2) Lostyn           4)GOAT (greatest of all time)");
        thirdQ = userInput.nextInt();
        
        if (thirdQ == 1){
            correct++;
        }else if (thirdQ == 4){ 
                correct++;
                if (instructor == true){
                    System.out.println("Oh yeah? hehe");
                } else if (javaStudent == true) {
                    System.out.println("brown noser! ;)");
                }
        } else { 
            System.out.println("Well, she's really nice.  Maybe you'll meet her.");
            incorrect++;
        }
        
        
        System.out.println("");   
        System.out.println("");
        System.out.println("");
        System.out.println("Thanks for playing!! I hope you enjoyed Trivia Night! ");
        System.out.println("     ***  Now to the much awaited Results!!  ***");
        System.out.println("");
        System.out.println("You answered " + correct + " questions correctly!");
        if (correct == 3) {
            System.out.println("Wow that's a perfect score!  Great work!!!");
            
        }
        
        
        
       
        
    }
    
}
