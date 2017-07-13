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
public class CoinFlipper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random coin = new Random();
        
        boolean heads = coin.nextBoolean();
        
        if(heads == true){
            System.out.println("The coin has flipped Heads!");
        }else if(heads == false){
        System.out.println("The coin has flipped Tails!");
        }else {
            System.out.println("Silly randomizer =/");
        }
        
        
        
        
        
        
        
        
        
    }
    
}
