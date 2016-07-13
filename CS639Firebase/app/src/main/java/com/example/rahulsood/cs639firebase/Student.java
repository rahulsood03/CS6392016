package com.example.rahulsood.cs639firebase;

/**
 * Created by rahulsood on 7/12/16.
 */
public class Student {

    private String id, firstname;

    public Student() {

        this.id = "1";
        this.firstname = "Rahul Sood";
    }

    public Student (String id, String firstname) {

        this.id = id;
        this.firstname = firstname;
    }

    public String getId() {

        return id;
    }

    public String getFirstname() {

        return firstname;
    }

    public void setId(String id) {

        this.id = id;

    }

    public void setFirstname(String firstname) {

        this.firstname = firstname;

    }




}
