package com.julio.app.pooherence;

public class Teacher extends Person{

    private String asignature;
    public Teacher(String name, String lastName, int age, String email, String asignature) {
        super(name, lastName, age, email);
        this.asignature = asignature;
    }

    public String getAsignature() {
        return asignature;
    }

    public void setAsignature(String asignature) {
        this.asignature = asignature;
    }
}
