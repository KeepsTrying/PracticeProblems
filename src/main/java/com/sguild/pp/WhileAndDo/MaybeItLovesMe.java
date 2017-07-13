/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.WhileAndDo;
import java.util.Random;
/**
 *
 * @author apprentice
 */
public class MaybeItLovesMe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random flowerFinder = new Random();
        
        int petals = flowerFinder.nextInt(75) + 14;
        int pulls = 0;
        
        while (pulls < petals){
            pulls++;
        
            if (pulls % 2 == 0){
                System.out.println("It loves me NOT!");
                
                    
            }else {
                System.out.println("It LOVES me!!");
            }
            
            if (petals == pulls && pulls % 2 == 0){
                System.out.println("Awww, bummer");
                
            }else if (petals == pulls && pulls % 2 != 0){
                System.out.println("Oh ,wow! It really LOVES me!");
            }
        }
        
        
        
        
    }
    
}
