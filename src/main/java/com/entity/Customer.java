package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    private int custId;
    private String customerName;
    private int customerAge;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", customerName='" + customerName + '\'' +
                ", customerAge=" + customerAge +
                '}';
    }
}
