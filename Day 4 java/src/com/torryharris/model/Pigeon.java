package com.torryharris.model;

public class Pigeon implements  Bird{
    @Override
    public void fly() {
        System.out.println("Pigeon is flying higher");
    }

    @Override
    public void eat() {
        System.out.println("Pigeon is eating grains");
    }
}
