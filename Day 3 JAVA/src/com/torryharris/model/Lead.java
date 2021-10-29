package com.torryharris.model;

public class Lead extends  Employee{
    private int teamSize;

    public Lead(String name, int employeeId, String designation, float salary, int teamSize) {
        super(name, employeeId, designation, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }
    public void standUpCall(){
        System.out.println("Stand up call is calling.....");
    }
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
}
