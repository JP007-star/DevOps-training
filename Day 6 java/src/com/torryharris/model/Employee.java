package com.torryharris.model;

public class Employee {
    public String empId;
    public String name;
    public String designation;
    public float salary;
    public int balanceCL;


    public Employee(String empId, String name, String designation, float salary,int balanceCL) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
        this.balanceCL = balanceCL;
    }

    public Employee() {

    }


    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
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
