package com.julio.app.collections.set;

import com.julio.app.collections.models.Student;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExampleTreeSet {

    public static void main(String[] args) {

        //reverse treeset
        Set<String> ts = new TreeSet<>((o1, o2) -> o2.compareTo(o1));

        ts.add("1");
        ts.add("5");
        ts.add("3");
        ts.add("2");
        ts.add("4");

        /**
         * print hashSet
         */
        System.out.println("ts = " + ts);


        System.out.println("***********************************");

        //reverse
        Set<Student> students = new TreeSet<>((a,b) -> b.getName().compareTo(a.getName()));
        
        students.add(new Student("zorra", 10));
        students.add(new Student("beto", 2));
        students.add(new Student("pablo", 8));
        students.add(new Student("maria", 3));

        System.out.println("students = " + students);
        
    }
}
