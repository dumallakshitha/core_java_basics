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
public class Furniture_Factory {

    public static furniture getFurniture(String type){
        if(type.equals("chair"))
            return new Chair();
        if(type.equals("table"))
            return new Table();
        return null;
        
    }
}
