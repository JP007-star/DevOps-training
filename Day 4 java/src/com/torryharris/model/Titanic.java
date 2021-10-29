package com.torryharris.model;

public class Titanic implements Boat{


    @Override
    public void floating() {
        System.out.println("Titanic is floating");
    }

    @Override
    public void move() {
        System.out.println("Titanic is moving");
    }
}
