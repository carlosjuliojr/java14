package com.julio.app.stream;

import com.julio.app.lambda.models.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStreamOptionalApi {
    public static void main(String[] args) {


        System.out.println("************* orElseGet not found *************");
        Optional<User> people = Stream.of("Marco","Julio","Alberto", "Yohana", "Anibal")
                .peek(value ->System.out.print(value + ", " +(value.equals("Anibal")?"\n":"")))
                .map(u -> new User(u))
                .filter( name -> name.getName().startsWith("Z"))
                .findFirst();

        System.out.println(people.orElseGet(() -> new User("pepito")));

        System.out.println("************* orElseGet found *************");
        Optional<User> people2 = Stream.of("Marco","Julio","Alberto", "Yohana", "Anibal")
                .peek(value ->System.out.print(value + ", " +(value.equals("Anibal")?"\n":"")))
                .map(u -> new User(u))
                .filter( name -> name.getName().startsWith("M"))
                .findFirst();

        System.out.println(people2.orElseGet(() -> new User("pepito")));

    }
}
