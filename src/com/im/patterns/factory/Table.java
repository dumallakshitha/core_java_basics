/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.patterns.factory;

/**
 *
 * @author Dumal
 */
public class Table implements furniture{

    @Override
    public void sale() {
        System.out.println("Table has sold");
    }
    
}