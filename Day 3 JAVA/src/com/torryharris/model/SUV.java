package com.torryharris.model;

public class SUV extends Car{
    String driveMode;
    boolean sunRoof;

    public SUV(String name, String fuelType, int engineCapacity, float power, int noOfGears, Tyre tyre, MusicSystem musicSystem, String driveMode, boolean sunRoof) {
        super(name, fuelType, engineCapacity, power, noOfGears, tyre, musicSystem);
        this.driveMode = driveMode;
        this.sunRoof = sunRoof;
    }

    public String getDriveMode() {
        return driveMode;
    }

    public void setDriveMode(String driveMode) {
        this.driveMode = driveMode;
    }

    public boolean isSunRoof() {
        return sunRoof;
    }

    public void setSunRoof(boolean sunRoof) {
        this.sunRoof = sunRoof;
    }
    public void  displaySUVFeatures(){
        displayFeatures();
        System.out.println("Drive Mode:"+driveMode);
        System.out.println("Sun Roof:"+sunRoof);
    }
}
