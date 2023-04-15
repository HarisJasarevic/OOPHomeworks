package com.qamp.HarisJasarevic.homeworks.homework3.task1;

public class Employee extends Person {

    protected final double annualSalary;
    protected final String nationalInsuranceNumber;

    public Employee (final String name, final double annualSalary, final String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    @Override
    public String toString (){
        return super.toString() + ", Annual salary: {" + this.annualSalary + "}, National insurance number: {" + this.nationalInsuranceNumber + "}";
    }
}
