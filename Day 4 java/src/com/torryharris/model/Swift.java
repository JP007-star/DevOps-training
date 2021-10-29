package com.torryharris.model;

public class Swift implements Car{
    @Override
    public void changeGear() {
        System.out.println("Car Gear is changed");
    }

    @Override
    public void move() {
        System.out.println("Swift starts moving....");
    }
}
