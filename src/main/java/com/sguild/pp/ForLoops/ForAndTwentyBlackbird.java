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
public class ForAndTwentyBlackbird {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int birdsInPie = 0;
        for (int i = 1; i <= 24; i++) {
            System.out.println("Blackbird #" + i + " goes into the pie!");
            birdsInPie++;
        }

        System.out.println("There are " + birdsInPie + " birds in there!");
        System.out.println("Quite the pie full!");
        
        //I changed the termination clause from 20 to 24
        //also changed it to include #24
        //also initialized i=1 so we dont start with putting 0 birds in the pie
        
        
        
        
    }
    
}
