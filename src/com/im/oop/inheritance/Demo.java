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
public class Demo {
    public static void main(String[] args) {// this is how we mention as Inherit
        Student st=new Student("Dumal","071471272");
        System.out.println(st.getName());
        System.out.println(st.getPhone("1234"));
        System.out.println(st.getEmail());
        
        Lecture lec=new Lecture();
        lec.setPhone("026352324");
        
        System.out.println(lec.getMobile());
        //Person p1=new Person();//if class use abstract u cant create an instance
        
        //Person p2=new Student();
    }
}
