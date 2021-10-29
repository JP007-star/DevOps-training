package com.torryharris.driver;

import com.torryharris.exception.CLLimitExceedException;
import com.torryharris.exception.InvalidCLRequestException;
import com.torryharris.model.Employee;
import com.torryharris.model.HRDepartment;

public class Company {
    public static void main(String[] args) throws CLLimitExceedException, InvalidCLRequestException {
        Employee e1=new Employee("emp1","e1","Manager",23333,8);
        HRDepartment hrDept=new HRDepartment();
        try {
            hrDept.requestForCL(e1,4);
        }
        catch (InvalidCLRequestException | CLLimitExceedException e)
        {
            System.err.println(e);
        }
    }
}
