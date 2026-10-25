package com.codegnan.app.javaapp01.entity;

import java.util.Objects;

public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private char gender;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName, char gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Customer)) return false;
        Customer other = (Customer) obj;
        return id == other.id && gender == other.gender
                && Objects.equals(firstName, other.firstName)
                && Objects.equals(lastName, other.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, gender);
    }


    @Override
    public String toString() {
        String objectInfo = "Customer[";
         objectInfo += "id="+ id;
         objectInfo += ", firstName="+firstName;
         objectInfo += ", lastName="+lastName;
         objectInfo += ", gender="+gender;
         objectInfo += "]";

         return  objectInfo;
    }
}

