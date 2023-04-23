package com.qamp.HarisJasarevic.homeworks.homework5.task1;

public class AccountOwner {

    private String firstName;
    private String lastName;
    private String address;

    public AccountOwner(final String firstName, final String lastName, final String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }
}
