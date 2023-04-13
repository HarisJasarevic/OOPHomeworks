package com.qamp.HarisJasarevic.homeworks.homework1.task1;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee employee = new Employee("Haris", "Jasarevic",3000);
        employee.printEmployeeDetails();
        employee.raiseSalary(10);
        employee.printEmployeeDetails();

    }
}
