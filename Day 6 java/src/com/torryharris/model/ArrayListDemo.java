package com.torryharris.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> integerList=new ArrayList<>();
        integerList.add(2);
        integerList.add(3);
        System.out.println(integerList);
        integerList.add(0,23);
        integerList.remove(0);
        System.out.println(integerList);
        integerList.sort(Collections.reverseOrder());

        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        Employee e4=new Employee();
        ArrayList<Employee> empList=new ArrayList<>();
        empList.add(0,e1);
        empList.add(1,e2);

        /*  for (Employee emp:empList) {
            System.out.println(emp);
        }*/
        integerList.sort(null);

        System.out.println("******** Iterator ********");
        Iterator<Employee> empIterator=empList.iterator();

        while(empIterator.hasNext()){
            System.out.println(empIterator.next());
        }
        System.out.println("-------Done------");
    }
}
