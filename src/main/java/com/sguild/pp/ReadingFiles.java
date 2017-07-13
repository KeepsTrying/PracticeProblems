/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ReadingFiles {

    public static void main(String[] args) throws FileNotFoundException {
        //FileReading finds a book in the library, but cant read
        //BufferReader knows how to read the book
        //Scanner tells BufferReader to read the next line

        String bookName = "Outfile.txt";
//would be better to try{}catch(){}        
        FileReader librarian = new FileReader(bookName);
        BufferedReader translator = new BufferedReader(librarian);
        Scanner speakerPrompter = new Scanner(translator);

        //     Scanner speaker = new Scanner(new Buffered Reader(new FileReader("Outfile.txt")));
        while (speakerPrompter.hasNextLine()) {
            String line = speakerPrompter.nextLine();
            System.out.println(line);

        }

        System.out.println("We've finished the file!");
        //close everything when you're done because you're polite!
        speakerPrompter.close();

    }

}
