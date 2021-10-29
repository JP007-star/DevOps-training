package com.torryharris.driver;

import com.torryharris.model.Employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeHashMapDemo {
    public static void main(String[] args) {
        Employee e1=new Employee(401,"e1","SE",34000,12);
        Employee e2=new Employee(402,"e2","ASE",24000,12);
        Employee e3=new Employee(403,"e3","ASE",24000,12);
        Employee e4=new Employee(404,"e4","Tl",54000,12);
        Employee e5=new Employee(405,"e5","Manager",64000,12);
        Employee e6=new Employee(406,"e6","SE",34000,12);
        HashMap<Integer,Employee> employeeHashMap=new HashMap<>();
        employeeHashMap.put(e1.getEmpId(), e1);
        employeeHashMap.put(e2.getEmpId(),e2);
        employeeHashMap.put(e3.getEmpId(), e3);
        employeeHashMap.put(e4.getEmpId(), e4);
        employeeHashMap.put(e5.getEmpId(), e5);
        employeeHashMap.put(e6.getEmpId(), e6);
        for (Map.Entry<Integer,Employee> entry:employeeHashMap.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
        System.out.println("---Employee Object as Key--------");
        HashMap<Employee,Integer> newEmployeeHashMap=new HashMap<>();
        newEmployeeHashMap.put(e1,e1.getEmpId());
        newEmployeeHashMap.put(e2,e2.getEmpId());
        newEmployeeHashMap.put(e3,e3.getEmpId());
        newEmployeeHashMap.put(e4,e4.getEmpId());
        newEmployeeHashMap.put(e5,e5.getEmpId());
        newEmployeeHashMap.put(e6,e6.getEmpId());
        for (Map.Entry<Employee,Integer> entry:newEmployeeHashMap.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

    }
}
