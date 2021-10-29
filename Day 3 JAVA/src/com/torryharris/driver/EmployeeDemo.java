package com.torryharris.driver;

import com.torryharris.model.Clerk;
import com.torryharris.model.Employee;
import com.torryharris.model.Lead;
import com.torryharris.model.Manager;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1=new Employee("e1",4001,"dev",300000);
        Employee e2=new Employee("e2",4002,"tester",250000);
        Employee e3=new Employee("e3",4003,"manager",400000);
        Employee e4=new Employee("e4",4004,"teamLead",500000);
        Manager  e5=new Manager("e5",4006,"manager",500000,"Flipkart",6);
        Lead  e6=new Lead("e6",4006,"Lead",400000,4);
        Clerk e7=new Clerk("e7",4007,"clerk",3454455,"B.Sc");
        e1.display();
        System.out.println(e5.toString());
        e5.display();
        e5.callMeeting();
        e7.display();
    }
}
