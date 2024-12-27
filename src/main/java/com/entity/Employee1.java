package com.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee1 {
    @Id
    private int empid;

    @Column(name="empname")
    private String empname;

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Employee1(int empid, String empname) {
        this.empid = empid;
        this.empname = empname;
    }

    public int getEmpid() {
        return empid;
    }

    public String getEmpname() {
        return empname;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "empid=" + empid +
                ", empname='" + empname + '\'' +
                '}';
    }
}
