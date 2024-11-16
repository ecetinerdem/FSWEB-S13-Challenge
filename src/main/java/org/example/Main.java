// org.example.Main.java
package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runApplication();
    }

    private static void runApplication() {
        // Healthplan örneği oluşturma
        Healthplan healthplan = new Healthplan(1, "Gold Health Package", Plan.BASIC);
        System.out.println("Healthplan ToString: " + healthplan);

        // Employee örneği oluşturma
        Employee employee = new Employee(
                1,
                "John Doe",
                "john@example.com",
                "password123",
                new String[3]
        );

        // Metod ismi düzeltildi: addHealthplan -> addHealthPlan
        employee.addHealthPlan(1, "Basic Health");      // index 1'e ekleme yapılmalı
        employee.addHealthPlan(1, "Premium Health");    // Dolu index kontrolü
        System.out.println("Employee ToString: " + employee);

        // Company örneği oluşturma
        Company company = new Company(
                1,
                "Tech Corp",
                1000000.0,
                new String[5]
        );
        company.addEmployee(0, "Alice Developer");
        company.addEmployee(0, "Bob Developer"); // Dolu index kontrolü
        company.setGiro(-5000); // Negatif giro kontrolü
        System.out.println("Company ToString: " + company);
    }
}