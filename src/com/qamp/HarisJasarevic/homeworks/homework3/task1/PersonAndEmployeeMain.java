package com.qamp.HarisJasarevic.homeworks.homework3.task1;

public class PersonAndEmployeeMain {

    public static void main(String[] args) {

        final Person person = new Person("Bukayo");
        System.out.println(person.toString());

        final  Employee employee = new Employee("Martin", 2000, "78GVK170110");
        System.out.println(employee.toString());
    }
}
