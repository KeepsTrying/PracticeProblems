/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming.Basics;

/**
 *
 * @author apprentice
 */
public class AllTheMathsUndecimaled {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("1 + 2 is: ");
        System.out.println(1 + 2);
        
        System.out.println("42001 modulus 5 is: ");
        System.out.println(42001 % 5);
        
        System.out.println("5565 divided by 22 is: ");
        System.out.println(5565 / 22);
        
        System.out.println("223 times 31 - 42:");
        System.out.println(223 * 31 - 42);
        
        System.out.println("Is 4 greater than -1? ");
        System.out.println(4 > -1);
        
        System.out.println("\n****** Now make the computer do some harder maths!");
        
        System.out.println("8043 minus 4 plus 23 divided by 56 times -76 is: ");
        System.out.println(8043 - 4 + 23 / 56 * -76);
        
        System.out.println("11111 modulus 3 minus 67 minus 1 plus 9 is: ");
        System.out.println(11111 % 3 - 67 - 1 + 9);
        
        System.out.println("44 minus 22 minus 11 minus 66 minus 88 minus 76 minus 11 minus 33 is: ");
        System.out.println(44 - 22 - 11 - 66 - 88 - 76 - 11 - 33);
        
        System.out.println("22 times 3 minus 1 plus 4 times 6 minus -9 is: ");
        System.out.println(22 * 3 - 1  + 4 * 6 - -9);
        
        System.out.println("Is 67 greater than 4 * 5?");
        System.out.println(67 > 4 * 5);
        
        System.out.println("Is 78 less than than  4 * 5?"); //"than than" copied correctly.  
        /*also on lines 20, 37, and 40, although I did not copy verbatim, in the 
        course material there was a space before and after the semicolon " : " incongruent 
        with the rest of the text. */
        
        //going back through to remove the decimals I caught a personal error
        //I doubled the (plus 23) in line 36, and then copied it in the equation
        //on the subsequent line as well.
      
        System.out.println(78 < 4 * 5);
        
        /* for whatever reason, removing the decimals in the math but not the
        string changed my code and produced a series of strings instead of 
        relevant mathematical answers.
        
        That was leaving the decimals within the string statements.  Going back
        and removing those as well fixed the code and everything ran as intended
        Very Interesting!  I must say I do not understand.
        */
    }
    
}
