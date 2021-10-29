package com.torryharris.driver;

import com.torryharris.model.Person;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationPerson {
    public static void main(String[] args) throws IOException {
        Person p1=new Person(123,"p1","ase","bangalore");
        Person p2=new Person(124,"p1","ase","bangalore");
        Person p3=new Person(125,"p1","ase","bangalore");
        Person p4=new Person(126,"p1","ase","bangalore");

        FileOutputStream fos=new FileOutputStream("person.txt");
        ObjectOutputStream employeeObjectStream=new ObjectOutputStream(fos);
        employeeObjectStream.writeObject(p1);
        employeeObjectStream.writeObject(p2);
        employeeObjectStream.writeObject(p3);
        employeeObjectStream.writeObject(p4);
        employeeObjectStream.flush();
        employeeObjectStream.close();
        fos.close();
    }
}
