package com.julio.app.stream;

import com.julio.app.lambda.models.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStreamFilter {
    public static void main(String[] args) {


        System.out.println("************* Filter *************");
        Stream<User> people = Stream.of("Marco","Julio","Alberto", "Yohana", "Anibal")
                .peek(value ->System.out.print(value + ", " +(value.equals("Anibal")?"\n":"")))
                .map(u -> new User(u))
                .filter( name -> name.getName().startsWith("A"));

        System.out.println("Values start witn letter a");
        List<User> list2 = people.collect(Collectors.toList());
        list2.forEach(System.out::println);


        System.out.println("************* First method Optional<T> *************");
        Stream<User> people2 = Stream.of("Marco","Julio","Alberto", "Yohana", "Anibal")
                .map(u -> new User(u))
                .filter( name -> name.getName().startsWith("A"));


        Optional<User> peopleFirst = people2.findFirst();
        System.out.println(peopleFirst.get());

        System.out.println("************* AnyMatch *************");
        boolean people3 = Stream.of("Marco","Julio","Alberto", "Yohana", "Anibal")
                .map(u -> new User(u))
                .anyMatch( name -> name.getName().equals("Yohana"));

        System.out.println("exist name with letter Yohana ? : " + people3);


        System.out.println("************* Filter and count *************");
        long count = Stream.of("Marco","","Alberto", "", "Yohana")
                .filter(String::isEmpty)
                .count();

        System.out.println("count = " + count);


        System.out.println("************* Distint *************");
        Stream<String> distincPeople = Stream.of("Marco","Juan","Alberto", "Yohana", "Yohana")
                .distinct();
        distincPeople.forEach(System.out::println);

        System.out.println("************* Reduce *************");
        Stream<String> reducePeople = Stream.of("Marco","Juan","Alberto", "Yohana", "Yohana")
                .distinct();

        String res = reducePeople.reduce("res = ", (s, s2) -> s + ", " + s2);
        System.out.println(res);

        System.out.println("************* Reduce Integers *************");
        Stream<Integer> reduceIntegers = Stream.of(5,10,15, 20);

        Integer res2 = reduceIntegers.reduce(0, (s, s2) -> s + s2);
        System.out.println(res2);

        System.out.println("************* Reduce Sum *************");
        Stream<Integer> reduceIntegers2 = Stream.of(5,10,15, 50);

        Integer res3 = reduceIntegers2.reduce(0, Integer::sum);
        System.out.println(res3);



    }
}
