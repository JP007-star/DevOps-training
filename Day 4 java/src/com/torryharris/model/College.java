package com.torryharris.model;

public class College {
    private String collegeName;
    private int collegeId;
    private String place;

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public int getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public College(String collegeName, int collegeId, String place) {
        this.collegeName = collegeName;
        this.collegeId = collegeId;
        this.place = place;
    }

    @Override
    public String toString() {
        return
                "collegeName='" + collegeName + '\'' +
                ", collegeId=" + collegeId +
                ", place='" + place + '\'' ;
    }
}
