package com.torryharris.model;

import java.io.*;

import java.util.ArrayList;

public class DeSerializableDemo {


    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("employee.txt");
        ObjectInputStream employeeObjectInput=new ObjectInputStream(fis);
        ArrayList<Employee> employeeArrayList=new ArrayList<>();
        Employee employee;
        System.out.println("Employee Details from the File");
        try
        {
            while (true){
                employee=(Employee)employeeObjectInput.readObject();
                employeeArrayList.add(employee);
            }
        }
        catch (EOFException | ClassNotFoundException e)
        {
            //System.out.println(e.getMessage());
        }
        System.out.println("Employee Details are...");
        for (Employee emp:employeeArrayList) {
            System.out.println(emp);
        }
    }
}
