package com.farm.edu.persistency.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChildWorkerEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private int costPerHour=10;
    private int workHourPerWeek=40;
    private String type = "childWorker";
    private String firstName;
    private String lastName;
    private int workHour=30;


    public ChildWorkerEntity(String firstName, String lastName, int workHour) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workHour=workHour;
    }

    public ChildWorkerEntity(int workHour) {
        this.workHour=workHour;
    }

    public ChildWorkerEntity() {
    }

    public int getCostPerHour() {
        return costPerHour;
    }

    public int getWorkHourPerWeek() {
        return workHourPerWeek;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }

    public int getWorkHour() {
        return workHour;
    }
}

