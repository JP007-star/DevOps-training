package com.torryharris.driver;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.torryharris.model.Car;
import com.torryharris.model.Employee;

import java.util.*;

public class CarArrayList {
    public static void main(String[] args) {
        Car nexon=new Car(2343,"nexon","petrol",234);
        Car car1=new Car(2343,"nexon","petrol",234);
        Car bmw=new Car(3345,"bmw","diesel",334);
        Car audi=new Car(5334,"audi","diesel",354);
        Car swift=new Car(2234,"swift","diesel",254);
        Car innova=new Car(12234,"innova","diesel",354);
        ArrayList<Car> arrayListCar=new ArrayList<>();
        arrayListCar.add(nexon);
        arrayListCar.add(bmw);
        arrayListCar.add(audi);
        arrayListCar.add(swift);
        arrayListCar.add(innova);
        for (Car car:arrayListCar) {
            System.out.println(car);
        }
        System.out.println("---Sort by power----");
        TreeMap<Integer,Car> carTreePowerMap=new TreeMap<>();
        carTreePowerMap.put(nexon.getPower(),nexon);
        carTreePowerMap.put(car1.getPower(),car1);
        carTreePowerMap.put(swift.getPower(),swift);
        carTreePowerMap.put(bmw.getPower(),bmw);
        carTreePowerMap.put(audi.getPower(),audi);
        carTreePowerMap.put(innova.getPower(),innova);
        for (Map.Entry<Integer,Car> entry:carTreePowerMap.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        System.out.println("---Unique Name-------");
        TreeMap<Integer,String> carTreeMap=new TreeMap<>();
        carTreeMap.put(nexon.getChassisNo(),nexon.getName());
        carTreeMap.put(car1.getChassisNo(),car1.getName());
        carTreeMap.put(swift.getChassisNo(),swift.getName());
        carTreeMap.put(bmw.getChassisNo(),bmw.getName());
        carTreeMap.put(audi.getChassisNo(),audi.getName());
        carTreeMap.put(innova.getChassisNo(),innova.getName());
        for (Map.Entry<Integer,String> entry:carTreeMap.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }


    }
}
