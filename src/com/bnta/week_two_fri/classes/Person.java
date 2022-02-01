package com.bnta.week_two_fri.classes;

import java.time.LocalDate;

public class Person {
private int id;
private String firstName;
private String lastName;
private String email;
private String gender;
private LocalDate dob;

//Constructor
public Person(String firstName, String lastName, String gender, LocalDate dob) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.dob = dob;
}

//setters
    public void setId(int id){
        this.id=id;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setGender(String gender){
        this.gender=gender;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    //getters
    public int getId(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public String getGender(){
        return gender;
    }

    public LocalDate getDob(){
        return dob;
    }

}
