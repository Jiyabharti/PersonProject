package com.qa.PersonProject.entities;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.stereotype.Component;

//Making Component
@Component
public class Person {

//    constructors
    public Person() {
    }

    public Person(String firstname, String lastname, String age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    @Size(min = 2, max = 30)
    @NotNull
    private String firstname;

    @Size(min = 2, max = 30)
    private String lastname;

    @Min(2)
    @Max(30)
    private String age;

//    getters & setters
    public @Size(min = 2, max = 30) @NotNull String getFirstname() {
        return firstname;
    }

    public void setFirstname(@Size(min = 2, max = 30) @NotNull String firstname) {
        this.firstname = firstname;
    }

    public @Size(min = 2, max = 30) String getLastname() {
        return lastname;
    }

    public void setLastname(@Size(min = 2, max = 30) String lastname) {
        this.lastname = lastname;
    }

    public @Min(2) @Max(30) String getAge() {
        return age;
    }

    public void setAge(@Min(2) @Max(30) String age) {
        this.age = age;
    }
}