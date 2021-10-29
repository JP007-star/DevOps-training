package com.torryharris.model;

import java.util.ArrayList;

public class Person implements Comparable<Person>{
    public Long aadharNumber;
    public String name;
    public String state;
    public String occupation;

    @Override
    public String toString() {
        return "Person{" +
                "aadharNumber=" + aadharNumber +
                ", name='" + name + '\'' +
                ", state='" + state + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    public Person(long aadharNumber, String name, String state, String occupation) {
        this.aadharNumber = aadharNumber;
        this.name = name;
        this.state = state;
        this.occupation = occupation;
    }

    @Override
    public int compareTo(Person person) {
        return this.aadharNumber.compareTo(person.aadharNumber);
    }
}
