package com.torryharris.model;

public class Peacock implements  Bird{
    @Override
    public void fly() {
        System.out.println("Peacock is flying lower");
    }

    @Override
    public void eat() {
        System.out.println("Peacock is eating insects");
    }
}
