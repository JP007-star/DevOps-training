package com.torryharris.comparator;

import com.torryharris.model.Person;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {

    @Override
    public int compare(Person person, Person t1) {
        return person.getName().compareTo(t1.getName());
    }
}
