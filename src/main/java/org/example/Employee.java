package org.example;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans; // Changed from healthplans to healthPlans

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = healthPlans;
    }

    public void addHealthPlan(int index, String name) { // Changed from addHealthplan to addHealthPlan
        // Negatif index kontrolü
        if (index < 0) {
            System.out.println("Geçersiz index değeri!");
            return;
        }

        // Array bounds kontrolü
        if (index >= healthPlans.length) {
            System.out.println("Geçersiz index değeri!");
            return;
        }

        // Test senaryosuna göre, index 0'a ekleme yapılmamalı
        if (index == 0) {
            System.out.println("0 indexine ekleme yapılamaz!");
            return;
        }

        healthPlans[index] = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthPlans() { // Changed from getHealthplans to getHealthPlans
        return healthPlans;
    }

    public void setHealthPlans(String[] healthPlans) { // Changed from setHealthplans to setHealthPlans
        this.healthPlans = healthPlans;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }
}