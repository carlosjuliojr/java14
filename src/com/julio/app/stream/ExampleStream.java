package com.julio.app.stream;

import com.julio.app.pooherence.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleStream {

    public static void main(String[] args) {

        System.out.println("************* Stream directly Stream.of() *************");
        Stream<String> names = Stream.of("Marco","Julio","Alberto", "Yohana");
        names.forEach(System.out::println);

        /**
         * Using Array of String
         */
        System.out.println("************* Using Array of String Arrays.stream *************");
        String[] colours = {"Marco","Julio","Alberto", "Yohana"};
        Stream<String> sColours = Arrays.stream(colours);
        sColours.forEach(System.out::println);

        /**
         * Using Stream builder
         */
        System.out.println("************* Using Stream builder *************");
        Stream<String> sbNames = Stream.<String>builder().add("paco").add("pepa").add("pepe").build();
        sbNames.forEach(System.out::println);


        /**
         *
         */
        List<Person> al = new ArrayList<>();
        System.out.println("************** using List collection***********");
        al.add((new Person("Pato","Perez", 18,"pato@gmail.com")));
        al.add((new Person("Cata","Perez", 27,"pato@gmail.com")));
        al.add((new Person("Luci","Perez", 15,"to@gmail.com")));
        al.add(2,(new Person("Jano","Perez", 33  ,"sto@gmail.com")));
        al.add((new Person("Andres","Perez", 20,"pato@gmail.com")));

        //al.forEach(System.out::println);
        al.stream().forEach(System.out::println);
    }
}
