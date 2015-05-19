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
public class Student extends Person{
    double fee;

    public Student(){// default constructor
        System.out.println("Student created...");
    }
    
    public Student(String name,String phone){//custome constructor
        setName(name);
        setPhone(phone);
    }
    @Override
    public void register() {
        System.out.println("Just register with prerequest");
    }
    
    public void register(String nic){
        System.out.println("register with nic");
    }
    
}
