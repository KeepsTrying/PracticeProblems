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
public class LazyTeenager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random life = new Random();
        boolean roomClean = false;
        int prcntChance = 5;
        int totalChance;
        int toldYou = 0;
        
        do {
            toldYou++;
            System.out.println("Clean your room! x" + toldYou);
            prcntChance += 5;
            totalChance = life.nextInt(100) + 1;
            
            if (prcntChance >= totalChance){
                System.out.println("FINE!  I'LL CLEAN MY ROOM, BUT I REFUSE TO EAT MY PEAS!");
                
                break;
            }else if (toldYou >= 15) {
                System.out.println("That's IT!  I'm doing it and you're grounded AND I'm taking your XBOX!");
            }
            
        }while(roomClean == false);
        
    }
    
}
