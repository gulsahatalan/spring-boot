package com.farm.edu.controller.model;

public class  ChildWorkerModel {
    private int workHour;
    private String type;
    private String firstName;
    private String lastName;


    public ChildWorkerModel(String type, String firstName, String lastName) {
        this.type = type;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ChildWorkerModel() {}

    public String getType() {
        return type;
    }

    public void setType() {
        this.type = type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

}
