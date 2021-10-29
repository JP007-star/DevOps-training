package com.torryharris.model;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    public Long aadharNumber;
    public String name;
    public String state;
    public String occupation;

    public Long getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(Long aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Override
    public int compare(Person person, Person t1) {
        return this.getName().compareTo(person.name);
    }
}
