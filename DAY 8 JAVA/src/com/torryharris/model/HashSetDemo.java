package com.torryharris.model;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        Person p1=new Person(1,"p1","dev","Bangalore");
        Person p2=new Person(2,"p2","dev","Bangalore");
        Person p3=new Person(3,"p3","dev","Bangalore");
        Person p4=new Person(4,"p4","dev","Bangalore");
        HashSet<Person> personHashSet=new HashSet<>();
        personHashSet.add(p1);
        personHashSet.add(p2);
        personHashSet.add(p3);
        personHashSet.add(p4);
        for (Person person:personHashSet) {
            System.out.println(person);
        }

    }
}
