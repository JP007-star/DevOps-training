package com.torryharris.model;

public class Bat implements Bird,Mammal{
    @Override
    public void fly() {
        System.out.println("Bats fly");
    }

    @Override
    public void feed() {
        System.out.println("Bats feed its child");
    }

    @Override
    public void eat() {
        System.out.println("Bats eats nuts and fruits");
    }
}
