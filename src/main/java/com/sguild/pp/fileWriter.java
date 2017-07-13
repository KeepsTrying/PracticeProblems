/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
         *
         * @author apprentice
 */

class WritingFiles {

    public static void main(String[] args) throws IOException {

        String fileName = "Outfile.txt";

        try {
            FileWriter scribe = new FileWriter(fileName);
            PrintWriter author = new PrintWriter(scribe);

            author.println("There once was a llama named George");
            author.println("And he had a chicken friend named King Prawn....");
            author.println("They would frolic about the farm, and lived happily...");
            author.println("UNtil they got eaten by a Coyote.");
            author.println("The end.");

            //make SURE it gets written
            author.flush();

            //be polite and close the file after using
            author.close();

        } catch (IOException e) {
            System.out.println("Dude, something 'sploded.");
        }

        //chance exception may occur  when using FileWriter
        //throw at user w/throws IOException in psvm line
        //or try{}catch(){}
        //"finally" used after try{}catch(){} block
        //printWriter uses filewriter
    }

}
