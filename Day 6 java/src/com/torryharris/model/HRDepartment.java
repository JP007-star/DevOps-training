package com.torryharris.model;
import com.torryharris.exception.CLLimitExceedException;
import com.torryharris.exception.InvalidCLRequestException;

public class HRDepartment {
    public void requestForCL( Employee e1, int noOfLeaves) throws InvalidCLRequestException, CLLimitExceedException {
        if(noOfLeaves>3){
            throw new InvalidCLRequestException(e1.getName()+"!.. You can't apply for leave more than 3 days");
        }

        if(e1.balanceCL<1){
            throw new CLLimitExceedException(e1.getName()+"!... You have exceed max no of leave..");
        }
        e1.balanceCL-=noOfLeaves;
        System.out.println("Your Leave is approved successfully!!!...");
        System.out.println("Your Balance leave is.."+e1.balanceCL);
    }
}
