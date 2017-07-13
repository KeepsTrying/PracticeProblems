/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.WhileAndDo;

/**
 *
 * @author apprentice
 */
public class LoveMe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int petals = 34;
        
        while (petals >= 0){
            if (petals % 2 == 0){
                System.out.println("It LOVES me!");
                if (petals == 0){
                    System.out.println("I knew it loved me!");
                }
                    
            }else {
                System.out.println("It loves me NOT!");
            }
            petals--;
            
            
            
            //I wrote it in a while loop because I didn't want the code to run before it
            //checked the condition of whether the flower had petals or not
            
        }
        
        
    }
    
}
