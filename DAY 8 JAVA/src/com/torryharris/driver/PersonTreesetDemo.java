package com.torryharris.driver;
import com.torryharris.comparator.PersonNameComparator;
import com.torryharris.model.Person;
import java.util.TreeSet;
public class PersonTreesetDemo {
    public static void main(String[] args) {
        Person p1=new Person(1,"p1","dev","Bangalore");
        Person p2=new Person(2,"p2","dev","Bangalore");
        Person p3=new Person(3,"p3","dev","Bangalore");
        Person p4=new Person(4,"p4","dev","Bangalore");
        TreeSet<Person> personTreeSet=new TreeSet<>(new PersonNameComparator());
        personTreeSet.add(p4);
        personTreeSet.add(p2);
        personTreeSet.add(p3);
        personTreeSet.add(p4);
        for (Person personTree: personTreeSet) {
            System.out.println(personTree);
        }
    }
}
