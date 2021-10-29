package com.torryharris.driver;

import com.torryharris.model.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonDriver {
    public static void main(String[] args) {
        Person p1=new Person(231237878l,"P1","tn","dev");
        Person p2=new Person(231237877l,"P2","tn","dev");
        Person p3=new Person(231237880l,"P3","tn","dev");
        ArrayList<Person> personList=new ArrayList<Person>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        Iterator<Person> iteratorPerson=personList.iterator();
        
        while(iteratorPerson.hasNext()){
            System.out.println(iteratorPerson.next().toString());
        }
    }
}
