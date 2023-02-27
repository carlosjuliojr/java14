package com.julio.app.pooherence;

public class Student extends Person {

    private String school;
    private double calificationMath;
    private double calificationLiterature;
    private double calificationHistory;

    public Student(String name, String lastName, int age, String email, String school, double calificationMath, double calificationLiterature, double calificationHistory) {
        super(name, lastName, age, email);
        this.school = school;
        this.calificationMath = calificationMath;
        this.calificationLiterature = calificationLiterature;
        this.calificationHistory = calificationHistory;
    }

    @Override
    public String toString() {

        return  "\n Student: \n{\n" +
                "\tfirstName =" + this.getName() + ",\n"+
                "\tlastName =" + this.getLastName() + ",\n"+
                "\tage =" + this.getAge() + ",\n"+
                "\temail =" + this.getEmail() + ",\n"+
                "\tschool = '" + school + '\'' + ",\n"+
                "\tcalificationMath = " + calificationMath + ",\n"+
                "\tcalificationLiterature = " + calificationLiterature + ",\n"+
                "\tcalificationHistory = '" + calificationHistory + '\'' + ",\n"+
                "}";
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getCalificationMath() {
        return calificationMath;
    }

    public void setCalificationMath(double calificationMath) {
        this.calificationMath = calificationMath;
    }

    public double getCalificationLiterature() {
        return calificationLiterature;
    }

    public void setCalificationLiterature(double calificationLiterature) {
        this.calificationLiterature = calificationLiterature;
    }

    public double getCalificationHistory() {
        return calificationHistory;
    }

    public void setCalificationHistory(double calificationHistory) {
        this.calificationHistory = calificationHistory;
    }
}
