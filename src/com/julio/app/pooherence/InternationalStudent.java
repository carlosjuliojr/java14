package com.julio.app.pooherence;

public class InternationalStudent extends Student{

    private  String country;
    private double calificationLanguages;

    public InternationalStudent(String name, String lastName, int age, String email, String school, double calificationMath, double calificationLiterature, double calificationHistory) {
        super(name, lastName, age, email, school, calificationMath, calificationLiterature, calificationHistory);
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCalificationLanguages() {
        return calificationLanguages;
    }

    public void setCalificationLanguages(double calificationLanguages) {
        this.calificationLanguages = calificationLanguages;
    }
}
