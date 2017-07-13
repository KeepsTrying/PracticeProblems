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
abstract public class Food {
    private String description;
    private int calories;
    private boolean isTasty;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isIsTasty() {
        return isTasty;
    }

    public void setIsTasty(boolean isTasty) {
        this.isTasty = isTasty;
    }
    
    
    
    
    
    
    
}
