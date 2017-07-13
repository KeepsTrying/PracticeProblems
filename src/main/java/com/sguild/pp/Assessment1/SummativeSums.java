/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.pp.Assessment1;

/**
 *
 * @author apprentice
 */
public class SummativeSums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] array1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] array2 = {999, -60, -77, 14, 160, 301};
        int[] array3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99};

        int sum = 0;
        
        //declare variable sum and initialize it to the sum of an integer array

        sum = addElements(array1);
        System.out.println("#1 Array Sum: " + sum);

        sum = addElements(array2);
        System.out.println("#2 Array Sum: " + sum);

        sum = addElements(array3);
        System.out.println("#3 Array Sum: " + sum);
        
        //to sum and print in a single line:
        
        System.out.println(addElements(array1));
        System.out.println(addElements(array2));
        System.out.println(addElements(array3));

    }

    public static int addElements(int[] anyArray) {
        int sum = 0;
        for (int i = 0; i < anyArray.length; i++) {
            sum += anyArray[i];
        }
        return sum;

    }

}
