package com.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {

    @Id
    private int empId;

    private String empName;
    private float empSal;

    //@OneToOne
    //private Laptop laptop;

//    @OneToMany(mappedBy = "employee") //one emp have multiple laptop
//    private List<Laptop> laptop = new ArrayList<>();
//
//    @ManyToOne//one emp have multiple laptop
//    private List<Laptop> laptop = new ArrayList<>();
//
//    /*one to many*/
//    public List<Laptop> getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(List<Laptop> laptop) {
//        this.laptop = laptop;
//    }
    /*one to one*/
//    public Laptop getLaptop() {
//        return laptop;
//    }
//
//    public void setLaptop(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public float getEmpSal() {
        return empSal;
    }

    public void setEmpSal(float empSal) {
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
                '}';
    }
}
