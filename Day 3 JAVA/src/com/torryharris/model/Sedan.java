package com.torryharris.model;

public class Sedan extends  Car{
    int bootSpace;

    public Sedan(String name, String fuelType, int engineCapacity, float power, int noOfGears, Tyre tyre, MusicSystem musicSystem, int bootSpace) {
        super(name, fuelType, engineCapacity, power, noOfGears, tyre, musicSystem);
        this.bootSpace = bootSpace;
    }

    public int getBootSpace() {
        return bootSpace;
    }

    public void setBootSpace(int bootSpace) {
        this.bootSpace = bootSpace;
    }
    public  void displaySedanFeatures(){
        displayFeatures();
        System.out.println("Boot Space:"+bootSpace);
    }
}
