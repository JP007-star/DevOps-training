package com.torryharris.driver;

import com.torryharris.model.Employee;
import com.torryharris.model.GenericPrint;


public class GenericDemo {
    public static void main(String[] args) {
        GenericPrint<Integer> iPrint=new GenericPrint<>(1);
        System.out.println(iPrint.getObj());

        GenericPrint<String> strPrint=new GenericPrint<>("hi");
        System.out.println(strPrint.getObj());

        GenericPrint<Float> fPrint=new GenericPrint<>(3.56f);
        System.out.println(fPrint.getObj());

        Employee e2=new Employee("1321","e2","Manager",50000,242443);
        GenericPrint<Employee> objPrint=new GenericPrint<>(e2);
        System.out.println(objPrint.toString());
        genericDisplay(3);
        genericDisplay(5.6);
        genericDisplay(e2);
        genericDisplay("JP");

    }
    static  <T> void genericDisplay(T obj){
        System.out.println(obj);
    }
}
