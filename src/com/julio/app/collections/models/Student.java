package com.julio.app.collections.models;

public class Student implements Comparable<Student> {

    private String  name;
    private int calification;

    public Student(String name, int calification) {
        this.name = name;
        this.calification = calification;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalification() {
        return calification;
    }

    public void setCalification(int calification) {
        this.calification = calification;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + ' ' +
                ", calification=" + calification +
                '}';
    }
}
