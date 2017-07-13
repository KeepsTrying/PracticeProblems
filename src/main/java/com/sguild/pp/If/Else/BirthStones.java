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
public class BirthStones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int month = 1;
        
        System.out.println("Pick a number 1-12 to display the corresponding month and birthstone: ");
        month = userInput.nextInt();
        System.out.println("");
        
        
        
        if (month == 1){
            System.out.println("January     Garnet");
        }else if (month == 2){
            System.out.println("February       Amethyst");
        }else if (month == 3){
            System.out.println("March       Aquamarine");
        }else if (month == 4){
            System.out.println("April       Diamond");
        }else if (month == 5){
            System.out.println("May       Emerald");
        }else if (month == 6){
            System.out.println("June       Pearl");
        }else if (month == 7){
            System.out.println("July       Ruby");
        }else if (month == 8){
            System.out.println("August       Peridot");
        }else if (month == 9){
            System.out.println("September       Sapphire");
        }else if (month == 10){
            System.out.println("October       Opal");
        }else if (month == 11){
            System.out.println("November       Topaz");
        }else if (month == 12){
            System.out.println("December       Turqouise");
        }else{
            System.out.println("Error: Input received was not a whole integer number between 1-12 inclusive.");
        }
        
    
    
    
    
    }
    
}
