package com.julio.app.pooherence;

public class MainTest {

    public static void main(String[] args) {
        Student student = new Student("Julio","Jaimes",30,"carlosjuliojr@gmail.com","ULA",20,20,20);
        student.setName("Carlos Julio");
        System.out.println(student.toString());
    }
}
