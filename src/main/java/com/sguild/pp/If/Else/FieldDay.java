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
public class FieldDay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String lastName = null;
        
        String yourTeam = null;
        
        String team1 = "Red Dragons";
        String team2 = "Dark Wizards";
        String team3 = "Moving Castles";
        String team4 = "Golden Snitches";
        String team5 = "Night Guards";
        String team6 = "Black Holes";
        
        String bound1 = "Baggins";
        String bound2 = "Dresden";
        String bound3 = "Howl";
        String bound4 = "Potter";
        String bound5 = "Vimes";
        
        System.out.println("What is your last name? ");
        lastName = userInput.next();
        
        if (lastName.compareToIgnoreCase(bound1) <= 0){
            yourTeam = team1;
        } else if (lastName.compareToIgnoreCase(bound1) > 0 && lastName.compareToIgnoreCase(bound2) <= 0 ){
            yourTeam = team2;
        } else if (lastName.compareToIgnoreCase(bound2) > 0 && lastName.compareToIgnoreCase(bound3) <= 0 ){
            yourTeam = team3;
        }else if (lastName.compareToIgnoreCase(bound3) > 0 && lastName.compareToIgnoreCase(bound4) <= 0 ){
            yourTeam = team4;
        }else if (lastName.compareToIgnoreCase(bound4) > 0 && lastName.compareToIgnoreCase(bound5) <= 0 ){
            yourTeam = team5;
        }else if (lastName.compareToIgnoreCase(bound5) > 0){
            yourTeam = team6;
        }
        
        
        System.out.println("Aha!  You're on the team " + yourTeam + "!");
        System.out.println("Good luck in the games!");
        
    }
    
}
