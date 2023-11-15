/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop;

import java.util.Scanner;

/**
 *
 * @author namhai18
 */
public class Person {
    // data field
    private String name;
    private String brith;
    private double gpa;
    
    // method, behaviour
    // constructor
    public Person(){
        System.out.println("Day la ham khoi tao");
    }

    public Person(String name, String brith, double gpa) {
        this.name = name;
        this.brith = brith;
        this.gpa = gpa;
    }
    public void eat(){
        System.out.println("People can eat");
    }
    //interface getter setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrith() {
        return brith;
    }

    public void setBrith(String brith) {
        this.brith = brith;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    
    
    
    
}
