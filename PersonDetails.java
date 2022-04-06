package com.addressbook;

public class PersonDetails {

    private String firstName, lastName, street, city, state, country, email;
    long zip, phone;

    public PersonDetails(String firstName, String lastName, String address, String city, String state, long mobileNumber, String eMail, long zipCode) {
    }

    public void person(String firstName, String lastName, String street, String city, String state, String country, long phone, long zip, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.phone = phone;
        this.zip = zip;
        this.email = email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person [firstname=" + firstName + ", lastname=" + lastName + ", Address =" + street + ", mobile="
                + phone + "]";
    }
}
