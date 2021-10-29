package com.torryharris.model;

public class Branch extends College{
    private String branchName;
    private int branchId;

    @Override
    public String toString() {
        return   super.toString()+'\''+
                "branchName='" + branchName + '\'' +
                ", branchId=" + branchId ;
    }

    public Branch(String collegeName, int collegeId, String place, String branchName, int branchId) {
        super(collegeName, collegeId, place);
        this.branchName = branchName;
        this.branchId = branchId;
    }
}
