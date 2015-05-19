/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.patterns.singleton;

/**
 *
 * @author Dumal
 */
public class GirlFriend {
    
    String name;
    private static GirlFriend gf;
    private GirlFriend(){
        
    }
    
    static public GirlFriend getInstance(){
        if(gf ==null)
            gf=new GirlFriend();
        return gf;
    }
}
