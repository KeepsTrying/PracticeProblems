/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.Assessment1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class PaperRockScissors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        Random compChoosing = new Random();

        String wantPlay = "";
        boolean willPlay = false;

        //beginning user prompt, initialized wantPlay to null and willPlay to false to help prevent "fall through"
        while (!willPlay) {
            System.out.println("Would you like to play Paper, Rock, Scissors?       Type Yes or No");
            wantPlay = userInput.nextLine();
            if (wantPlay.equalsIgnoreCase("Yes")) {
                willPlay = true;

                //wrote the game in a do..while loop since we know will happen once after initial validation
                do {

                    int wantRounds = 0;
                    int turnCount = 0;
                    boolean validation = false;
                    boolean reprompt = true;

                    String userString = null;
                    String compString = null;

                    int user = 5;
                    int comp;
                    int rounds = 0;
                    int wins = 0;
                    int losses = 0;
                    int ties = 0;

                    //Number of rounds validation
                    if (willPlay) {
                        while (validation == false) {
                            System.out.println("How many rounds would you like to play?  Please enter 1 - 10  ");

                            wantRounds = userInput.nextInt();
                            System.out.println("");

                            if (wantRounds > 0 && wantRounds <= 10) {
                                System.out.println(wantRounds + " rounds?  Sounds good!  Let's begin.");
                                validation = true;

                            } else {
                                System.out.println("I don't believe that was a number between 1 and 10 inclusive.");
                                validation = false;
                            }
                        }
                    }

                    //for loops ensures number of desired rounds is followed
                    for (rounds = 0; rounds < wantRounds; rounds++) {

                        //while loop creates boolean assessment for validation
                        //if/else loop converts user input from String to Integer
                        //also assisting with the validation assortment
                        while (reprompt) {
                            System.out.println("Do you want Paper, Rock, or Scissors?  ");
                            userString = userInput.next();
                            System.out.println("");

                            if (userString.equalsIgnoreCase("Paper")) {
                                user = 0;
                                reprompt = false;
                            } else if (userString.equalsIgnoreCase("Rock")) {
                                user = 1;
                                reprompt = false;
                            } else if (userString.equalsIgnoreCase("Scissors")) {
                                user = 2;
                                reprompt = false;
                            } else {
                                reprompt = true;
                                System.out.println("Please type Paper, Rock, or Scissors");
                            }
                        }

                        //Creating random number to mimick opponent making a choice
                        comp = compChoosing.nextInt(2);

                        //converting that choice to a string so we can display opponents action to the user
                        if (comp == 0) {
                            compString = "Paper";
                        } else if (comp == 1) {
                            compString = "Rock";
                        } else if (comp == 2) {
                            compString = "Scissors";
                        } else {
                            compString = null;
                        }

                        // if/else if  =  results assessment
                        //code in each block is associated tasks:
                        //Letting the user know the round results, counting how many rounds played
                        //lastly we have validation.  reprompt = true; then reset other variables to incorrect answers
                        //to ensure proper code function and validation upon looping
                        if (user == comp) {
                            System.out.println("You have Tied this round");
                            System.out.println("Your Opponent also chose " + compString);
                            System.out.println("");
                            ties++;
                            reprompt = true;
                            userString = null;
                            user = 5;
                            comp = 5;
                        } else if ((user == 2 && comp == 0) || (user == 0 && comp == 1) || (user == 1 && comp == 2)) {
                            System.out.println("You have Won this round");
                            System.out.println(userString + " beats " + compString);
                            System.out.println("");
                            wins++;
                            reprompt = true;
                            userString = null;
                            user = 5;
                            comp = 5;
                        } else {
                            System.out.println("You have Lost this round");
                            System.out.println(userString + " loses against " + compString);
                            System.out.println("");
                            losses++;
                            reprompt = true;
                            userString = null;
                            user = 5;
                            comp = 5;
                        }

                        //Entire round win conditions and associated reports
                        //also added else comment for alert if something would have gone wrong in this step
                        if (rounds == wantRounds - 1) {
                            if (wins > losses) {
                                System.out.println("Congratulations, you have won!");
                            } else if (wins < losses) {
                                System.out.println("You have Lost this series.");
                            } else if (wins == losses) {
                                System.out.println("You have Tied this series.");
                            } else {
                                System.out.println("Why you breaking my stuff, man?");
                            }

                            System.out.println("Thanks for Playing!");
                            System.out.println("You won " + wins + " of the " + wantRounds + " rounds.");
                            System.out.println("There were " + ties + " Ties.");
                            willPlay = false;
                        }
                    }

                } while (willPlay);

                //user prompted for easy replayability
                System.out.println("Would you like to play another series?   ");
                wantPlay = userInput.next();

                if (wantPlay.equalsIgnoreCase("Yes")) {
                    willPlay = true;
                } else if (!wantPlay.equalsIgnoreCase("No")) {
                    System.out.println("What was that?");
                    willPlay = false;
                } else {
                    System.out.println("Have a nice day!");
                    willPlay = false;
                    break;
                }

            } else if (!wantPlay.equalsIgnoreCase("No")) {
                System.out.println("What was that?");
                willPlay = false;
            } else {
                System.out.println("Have a nice day!");
                willPlay = false;
                break;
            }

        }
    }
}
