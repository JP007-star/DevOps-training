package com.torryharris.model;

public abstract class Shape {
    private int noOfSlides;
    abstract void area();

    public int getNoOfSlides() {
        return noOfSlides;
    }

    public void setNoOfSlides(int noOfSlides) {
        this.noOfSlides = noOfSlides;
    }
}
