package com.julio.app.lambda;

import com.julio.app.lambda.models.User;

import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ExampleConsumer {

    public static void main(String[] args) {

        Consumer<Date> consumer = date -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(date));
        };

        consumer.accept(new Date());

        BiConsumer<String, Integer> biConsumer = (name, age) -> {
            System.out.println("name: " + name + " age: " + age);
        };

        biConsumer.accept("Julio", 30);
        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("Hello world");


        List<String> names = Arrays.asList("juan", "andres", "luz", "paco");
        names.forEach(consumer2);

        User user = new User();

        BiConsumer<User, String> setNameToUser = User::setName;
        setNameToUser.accept(user,"yohana");
        System.out.println("user = " + user.getName());

        /**
         * Supplier
         */
        Supplier<String> proveedor = () -> "Hello workd lambda supplier";
        System.out.println("proveedor.get() = " + proveedor.get());

    }


}
