/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.ForLoops;

/**
 *
 * @author apprentice
 */
public class DifferentKettleOfFish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        for(int fish = 1; fish <= 10; fish++){
            if(fish == 3){
                System.out.println("RED fish!");
            }else if(fish == 4){
                System.out.println("BLUE fish!");
            } else{
                System.out.println(fish + " fish!");
            }
        }
        
        //all that changed really is where you put the condition, the initialized variable, and the incrementation
        
        /*
        int fish = 1;
        while(fish < 10){
            if(fish == 3){
                System.out.println("RED fish!");
            }else if(fish == 4){
                System.out.println("BLUE fish!");
            } else{
                System.out.println(fish + " fish!");
            }

            fish++;
        }
        
        */
        
        
    }
    
}