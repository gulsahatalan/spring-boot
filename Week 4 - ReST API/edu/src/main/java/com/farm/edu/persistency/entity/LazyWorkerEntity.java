package com.farm.edu.persistency.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class LazyWorkerEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private int costPerHour=23;
    private int workHourPerWeek=40;
    private String type ="lazyWorker";
    private String firstName;
    private String lastName;
    private int workHour=20;

    public LazyWorkerEntity(String firstName, String lastName, int workHour) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.workHour = workHour;
    }

    public LazyWorkerEntity(int workHour) {
        this.workHour = workHour;
    }
    public LazyWorkerEntity() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCostPerHour() {
        return costPerHour;
    }

    public int getWorkHourPerWeek() {
        return workHourPerWeek;
    }

    public int getWorkHour() {
        return workHour;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }
}

