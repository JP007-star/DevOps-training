package com.torryharris.model;

import java.io.Serializable;

public class Person implements Serializable {
    int personId;
    String name;
    String occupation;
    String city;

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public Person(int personId, String name, String occupation, String city) {
        this.personId = personId;
        this.name = name;
        this.occupation = occupation;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", city='" + city+'\n';
    }

}

