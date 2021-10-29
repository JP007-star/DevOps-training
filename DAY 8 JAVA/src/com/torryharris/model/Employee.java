package com.torryharris.model;

import java.io.Serializable;

public class Employee implements Serializable {
    public int empId;
    public String name;
    public String designation;
    public float salary;
    public int balanceCL;


    public Employee(int empId, String name, String designation, float salary,int balanceCL) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.balanceCL = balanceCL;
    }

    public Employee() {

    }


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                ", balanceCL=" + balanceCL +
                '}';
    }
}
