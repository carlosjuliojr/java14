package com.julio.app.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ExampleFunction {
    public static void main(String[] args) {

        Function<String, String> f1 = param -> "Hello " + param;
        System.out.println("f1.apply(\"Pedro\") = " + f1.apply("Pedro"));
        
        Function<String, String> f2 = String::toUpperCase;
        System.out.println("f2.apply(\"mario\") = " + f2.apply("mario"));

        BiFunction<String, String, String> f3 = (a, b) -> a.toUpperCase().concat(b.toUpperCase());
        System.out.println("f3.apply(\"juan \", \"valdez\") = " + f3.apply("juan ", "valdez"));
        
        
    }
}
