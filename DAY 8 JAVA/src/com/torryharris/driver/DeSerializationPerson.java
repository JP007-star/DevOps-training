package com.torryharris.driver;

import com.torryharris.model.Employee;
import com.torryharris.model.Person;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class DeSerializationPerson {
    public static void main(String[] args) throws IOException {
        FileInputStream fis= new FileInputStream("person.txt");
        ObjectInputStream personInput=new ObjectInputStream(fis);
        TreeMap<Integer,Person>  personTreeMap=new TreeMap<>();
        Person personObj;
        System.out.println("Person Details from the File");
        try
        {
            while (true){
                personObj=(Person) personInput.readObject();
                personTreeMap.put(personObj.getPersonId(),personObj);
            }
        }
        catch (EOFException | ClassNotFoundException e)
        {
            //System.out.println(e.getMessage());
        }
        System.out.println("Person Details are...");
        for (Map.Entry<Integer,Person> entry:personTreeMap.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

    }
}
