package com.torryharris.model;

public class Clerk extends  Employee{
    private String degree;

    public Clerk(String name, int employeeId, String designation, float salary, String degree) {
        super(name, employeeId, designation, salary);
        this.degree = degree;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
    public void payRoll(){
        System.out.println("payRoll is made up......");
    }
}
