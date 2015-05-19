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
public class Demo {
    public static void main(String[] args) {
        GirlFriend gf1=GirlFriend.getInstance();
        gf1.name="zzz";
        
        GirlFriend gf2=GirlFriend.getInstance();
        gf2.name="new girl";
        System.out.println("G1="+gf1.name);
        System.out.println("G2="+gf2.name);
    }
}
