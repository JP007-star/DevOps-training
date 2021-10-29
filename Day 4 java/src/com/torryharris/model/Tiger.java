package com.torryharris.model;

public class Tiger implements Mammal{
    @Override
    public void feed() {
        System.out.println("Tiger feed its calf");
    }

    @Override
    public void eat() {
        System.out.println("Tiger eats meat");
    }
}
