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
public abstract class Person {// if having any abstract method class must use abstract
    private String name;
    private String address;
    private String phone;
    private String email;

    public abstract void register();// if use abstract no scope
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        if(name.length()>0){//data validation
            this.name = name;
        }
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return "not available";
    }

    public String getPhone(String pw){
        if(pw.equals("1234")){
            return phone;
        }else{
            return "nit avaliable";
        }
    }
    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
}

