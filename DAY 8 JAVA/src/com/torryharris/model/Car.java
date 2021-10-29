package com.torryharris.model;

public class Car implements Comparable<Car>{
    public int chassisNo;
    public String name;
    public String fuelType;
    public int power;

    @Override
    public String toString() {
        return "Car{" +
                "chassisNo=" + chassisNo +
                ", name='" + name + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", power=" + power +
                '}';
    }

    public int getChassisNo() {
        return chassisNo;
    }

    public void setChassisNo(int chassisNo) {
        this.chassisNo = chassisNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Car(int chassisNo, String name, String fuelType, int power) {
        this.chassisNo = chassisNo;
        this.name = name;
        this.fuelType = fuelType;
        this.power = power;
    }

    @Override
    public int compareTo(Car car) {
        return this.power- car.power;
    }
}
