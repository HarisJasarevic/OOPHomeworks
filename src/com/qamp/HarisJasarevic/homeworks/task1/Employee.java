package com.qamp.HarisJasarevic.homeworks.task1;

public class Employee {

    private String firstName;
    private String lastName;
    private double employeeSalary;

    public Employee(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeSalary = 0;
    }

    public Employee(final String firstName, final String lastName, final double employeeSalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeSalary = employeeSalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(final double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }
}
