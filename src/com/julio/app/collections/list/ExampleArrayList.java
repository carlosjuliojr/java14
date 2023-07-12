package com.julio.app.collections.list;

import com.julio.app.pooherence.Person;
import com.julio.app.pooherence.Student;

import java.util.*;

public class ExampleArrayList {

    public static void main(String[] args) {

        List<Person> al = new ArrayList<>();
        System.out.println("al.size() = " + al.size());
        System.out.println("al.isEmpty() = " + al.isEmpty());
        System.out.println("**************insertying 5 elements************");
        al.add((new Person("Pato","Perez", 18,"pato@gmail.com")));
        al.add((new Person("Cata","Perez", 27,"pato@gmail.com")));
        al.add((new Person("Luci","Perez", 15,"to@gmail.com")));
        al.add(2,(new Person("Jano","Perez", 33  ,"sto@gmail.com")));
        al.add((new Person("Andres","Perez", 20,"pato@gmail.com")));

        /**
         * Size
         */
        System.out.println("al.size() = " + al.size());
        System.out.println("al.isEmpty() = " + al.isEmpty());

        System.out.println(al + " size: " + al.size());
        /**
         * remove
         */

        al.remove((new Person("Jano","Perez", 33  ,"sto@gmail.com")));
        al.remove(2);
        System.out.println(al + " size: " + al.size());
        boolean bb = al.contains((new Person("Pato","Perez", 18,"pato@gmail.com")));
        System.out.println("al.contains() = " + bb);

        /**
         * order list using Collections.sort
         */
        //Collections.sort(al,(a,b) -> a.getName().compareTo(b.getName()));
        //al.sort((a,b) -> a.getName().compareTo(b.getName()));
        /**
         * using java 8
         */
        al.sort(Comparator.comparing((Person::getAge)).reversed());
        System.out.println(al + " size: " + al.size());
    }
}
