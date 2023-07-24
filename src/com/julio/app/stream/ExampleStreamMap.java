package com.julio.app.stream;

import com.julio.app.lambda.models.User;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStreamMap {
    public static void main(String[] args) {

        System.out.println("************* Stream directly Stream.of() and map *************");
        Stream<String> names = Stream.of("Marco","Julio","Alberto", "Yohana")
                .peek(System.out::println)
                .map(String::toUpperCase);

        //names.forEach(System.out::println);

        List<String> list = names.collect(Collectors.toList());
        list.forEach(System.out::println);


        System.out.println("************* convert array string to list user moedl *************");
        Stream<User> people = Stream.of("Marco","Julio","Alberto", "Yohana", "Anibal")
                .peek(System.out::println)
                .map(u -> new User(u))
                .map(x -> {
                    String n = x.getName().toUpperCase();
                    x.setName(n);
                    return x;
                });

        //names.forEach(System.out::println);

        List<User> list2 = people.collect(Collectors.toList());
        list.forEach(System.out::println);


        System.out.println("************* flagMap *************");
        Stream<Object> users = Stream.of("Marco","Julio","Alberto", "Yohana", "Anibal")
                .flatMap(u -> {
                    if(!u.equalsIgnoreCase("Marco")){
                        return Stream.of(u);
                    }else{
                        return Stream.empty();
                    }
                });

        users.forEach(System.out::println);


    }
}
