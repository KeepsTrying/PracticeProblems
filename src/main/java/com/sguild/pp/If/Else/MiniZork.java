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
public class MiniZork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);

        System.out.println("You are standing in an open field west of a white house,");
        System.out.println("With a boarded front door.");
        System.out.println("There is a small mailbox here.");
        System.out.print("Go to the house, or open the mailbox? ");

        String action = userInput.nextLine();

        if (action.equals("open the mailbox")) {
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.print("Look inside or stick your hand in? ");
            action = userInput.nextLine();

            if (action.equals("look inside")) {
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.print("Run away or keep looking? ");
                action = userInput.nextLine();

                if (action.equals("keep looking")) {
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if (action.equals("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you're alive. Possibly a wise choice.");
                }
            } else if (action.equals("stick your hand in")) {
                System.out.println("You feel something moist and squishy all the way in the back.");
                System.out.println("Retrieve or Let Go?");
                action = userInput.nextLine();
                
                if(action.equalsIgnoreCase("Retrieve")){
                    System.out.println("You bravely grasp onto the nasty object, yanking it out revealing. . .");
                    System.out.println("a wet, old tennis ball.  Gross.");
                }else if (action.equalsIgnoreCase("Let Go")){
                    System.out.println("You're so grossed out by the feeling you jerk your arm out of the mailbox");
                    System.out.println("and wipe your hand on your jeans.  Eww.");
                }
            }
        } else if (action.equals("go to the house")) {
            System.out.println("You begin walking to the house and hear a rustling in the bushes.");
            System.out.println("Inspect Bushes or Continue?");
            action = userInput.nextLine();
            
            if (action.equalsIgnoreCase("Inspect Bushes")){
                System.out.println("You hunch down and creep towards the bushes quietly");
                System.out.println("Suddenly, a shadow in the bushes rushes around to the back of the house.");
                System.out.println("Do you Follow or Turn Around?");
                action = userInput.nextLine();
                
                if (action.equalsIgnoreCase("Follow")){
                    System.out.println("You bolt around the house following the noise in the brush");
                    System.out.println("only to be greeted by a frightened cat.");
                } else if (action.equalsIgnoreCase("Turn Around")){
                    System.out.println("You nonchalantly turn around to leave.");
                    System.out.println("It was prolly just a cat.");
                }
                
            }else if (action.equalsIgnoreCase("Continue")){
                System.out.println("You ignore the small animal in the bushes and continue onto the porch.");
                System.out.println("Do you -Peek- in the window or -Knock- on the door?");
                action = userInput.nextLine();
            if (action.equalsIgnoreCase("Peek")){
                System.out.println("You peek in the window.  It's so dusty on the outside and so dark inside");
                System.out.println("that you really can't make anything out.");
            }else if (action.equalsIgnoreCase("Knock")){
                System.out.println("You muster up the courage to knock on the door *Knock*Knock*Knock*");
                System.out.println("You immediately realise you never had any courage in the first place");
                System.out.println("and run for dear life back the way you came!");
            }
            }
        }
        
        
        
        
        
        
    }
    
}
