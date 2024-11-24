package com.example.demo1;

public abstract class Employee {
    private String name;  // Use camelCase for variable names
    private double salary; // Corrected spelling from "saliare" to "salary"

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public abstract double calculateBonus();

    // Optional: Getter methods for name and salary
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }



}
