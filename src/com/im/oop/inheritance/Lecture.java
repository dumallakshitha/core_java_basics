/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.oop.inheritance;

/**
 *
 * @author Dumal
 */
public class Lecture extends Person{
    double salary;

    @Override
    public void register() {
        System.out.println("with interview");
    }
    
    public String getMobile(){
        return "0117222181";
    }
}
