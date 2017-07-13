/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.Variables;

/**
 *
 * @author apprentice
 */
public class MenuOfChampions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String sod = "Slice of Big Rico Pizza";
        String pie = "Invisible Strawberry Pie";
        String egg = "Denver Omelette";
        
        double slice = 500.00;
        double whatPie = 2.00;
        double bfast = 1.50;
        
        System.out.println("_,-'2_,-'2_,-'2_,-'2_,-'2_,-'2_,-'2_,-'2_,-'2_,-'2");
        System.out.println("");
        System.out.println("              Welcome to the Restaurant!");
        System.out.println("                   Today's Menu is:");
        
        System.out.println("");
        System.out.println("_,-'2_,-'2_,-'2_,-'2_,-'2_,-'2_,-'2_,-'2_,-'2_,-'2");
        System.out.println("");
        
        System.out.println("   " + sod + "    $" + slice);
        System.out.println("   " + pie + "    $" + whatPie);
        System.out.println("   " + egg + "    $" + bfast);
        
        //I set the prices to variable type "double" yet only return one decimal
        //What gives?

    }
    
}
