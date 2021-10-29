package com.torryharris.model;

public class Student extends Branch{
    private String studentName;
    private int usn;

    public Student(String collegeName, int collegeId, String place, String branchName, int branchId, String studentName, int usn) {
        super(collegeName, collegeId, place, branchName, branchId);
        this.studentName = studentName;
        this.usn = usn;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString()+ '\''+
                "studentName='" + studentName + '\'' +
                ", usn=" + usn +
                '}';
    }
}
