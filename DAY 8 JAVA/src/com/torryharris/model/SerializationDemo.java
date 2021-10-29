package com.torryharris.model;

import com.torryharris.model.Employee;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws IOException {

        Employee e1 = new Employee(123, "e1", "ASE", 2352, 12);
        Employee e2=new Employee(123,"e1","ASE",2352,12);
        Employee e3=new Employee(123,"e1","ASE",2352,12);
        Employee e4=new Employee(123,"e1","ASE",2352,12);
        Employee e5=new Employee(123,"e1","ASE",2352,12);

        FileOutputStream fos=new FileOutputStream("employee.txt");
        ObjectOutputStream employeeObjectStream=new ObjectOutputStream(fos);
        employeeObjectStream.writeObject(e1);
        employeeObjectStream.writeObject(e2);
        employeeObjectStream.writeObject(e3);
        employeeObjectStream.writeObject(e4);
        employeeObjectStream.writeObject(e5);
        employeeObjectStream.flush();
        employeeObjectStream.close();
        fos.close();

    }
}
