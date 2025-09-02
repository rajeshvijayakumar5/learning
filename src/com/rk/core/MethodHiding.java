/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rk.core;

/**
 *
 * @author rajes
 */
class BaseMH {

    public static void print() {
        System.out.println("HELLO");
    }
}

class DerivedMH extends BaseMH {

    public static void print() {
        System.out.println("WELCOME");
    }
}

public class MethodHiding {

    public static void main(String[] args) {
        BaseMH base = new DerivedMH();                                  // Accessing static method print
        base.print();
        DerivedMH derived = new DerivedMH();
        derived.print();                                                // Accessing static method print
    }
}
