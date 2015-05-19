/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.im.oop.poly;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dumal
 */
public class Demo {
    public static void main(String[] args) {
        Animal a1=new Dog();
        Animal a2=new Cat();
        Animal a3=new Cow();
        
        List<Animal> list=new ArrayList<>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        for (Animal animal : list) {
            animal.sound();
        }
    }
}
