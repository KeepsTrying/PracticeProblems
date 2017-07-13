/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sguild.PracticeProgramming;

/**
 *
 * @author apprentice
 */
public class CallMethodEx {

    public static int addTwoNumbers(int firstNum, int secNum) {
        int sum = firstNum + secNum;
        return sum;
    }
    
    
    
    public static void main(String[] args) {
        int sum = addTwoNumbers(2, 3);
        System.out.println(sum);
    }
    
}
