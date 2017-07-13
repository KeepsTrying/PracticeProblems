/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class StaticMethods {

    public static String randimalizer() {
        //return ""; //Remove Placeholder when ready to implement!

        String animal = "";

        Random r = new Random();

        switch (r.nextInt(10)) {

            case 1:
                animal = "Llama";
                break;

            case 2:
                animal = "Orca";
                break;

            case 3:
                animal = "Badger";
                break;

            case 4:
                animal = "Emperor Penguin";
                break;

            case 5:
                animal = "Panda Bear";
                break;

            case 6:
                animal = "Angry Koala";
                break;

            case 7:
                animal = "Finding Nemo";
                break;

            case 8:
                animal = "Elk";
                break;

            case 9:
                animal = "good lookin on the breaks Paul";
                break;

            default:
                animal = "pteradon";
        }

        return animal;
    }

}
