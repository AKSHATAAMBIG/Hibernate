package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Laptop {
    @Id
    private int lapId;
    private String lapName;

//   @ManyToOne
//    private Employee employee;

    @ManyToMany
    private List<Employee> employee1 = new ArrayList<>();

    public List<Employee> getEmployee1() {
        return employee1;
    }

    public void setEmployee1(List<Employee> employee1) {
        this.employee1 = employee1;
    }


    /*Many to one*/
//    public Employee getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }

    public int getLapId() {
        return lapId;
    }

    public void setLapId(int lapId) {
        this.lapId = lapId;
    }

    public String getLapName() {
        return lapName;
    }

    public void setLapName(String lapName) {
        this.lapName = lapName;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "lapId=" + lapId +
                ", lapName='" + lapName + '\'' +
                '}';
    }
}
