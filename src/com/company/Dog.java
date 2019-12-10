package com.company;

public class Dog extends Animal {
    public Dog() {
        System.out.println("Pies");
    }

    @Override
    void run() {
        System.out.println("Pies biegnie");;
    }
}
