/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.Assessment1;
import com.sguild.PracticeProgramming.Random.*;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author apprentice
 */
public class DogGenetics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        Random percent = new Random();
        
        
        int prcntUsed = 0;
        int prcntAvail = 100;
        int breedsLeft = 5;
        
        
        
        System.out.println("Brand new technology has allowed modern science to instantly");
        System.out.println("find out your dog's entire geneology just from it's name!");
        System.out.println("What is your dog's name?");
        String dogName = userInput.nextLine();
        
        int breed1 = percent.nextInt(50) + 20;
        prcntUsed += breed1;
        prcntAvail = 100 - prcntUsed;
        breedsLeft--;
        
        int breed2 = percent.nextInt(prcntAvail/breedsLeft) + 1;
        prcntUsed += breed2;
        prcntAvail = 100 - prcntUsed;
        breedsLeft--;
        
        int breed3 = percent.nextInt(prcntAvail/breedsLeft) + 1;
        prcntUsed += breed3;
        prcntAvail = 100 - prcntUsed;
        breedsLeft--;
        
        int breed4 = percent.nextInt(prcntAvail/breedsLeft) + 1;
        prcntUsed += breed4;
        prcntAvail = 100 - prcntUsed;
        breedsLeft--;

        
        int breed5 = prcntAvail;
        
        
        System.out.println("");
        System.out.println("Aahhh yes, here's there portfolio right here: " + dogName + "!");
        System.out.println("");
        System.out.println(breed1 + "% St. Bernard");
        System.out.println(breed2 + "% Doberman Pinscher");
        System.out.println(breed3 + "% German Shepard");
        System.out.println(breed4 + "% Irish Wolf Hound");
        System.out.println(breed5 + "% King Doberman");
    }

    
}
