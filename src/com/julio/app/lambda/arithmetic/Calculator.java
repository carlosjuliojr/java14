package com.julio.app.lambda.arithmetic;

import java.util.function.BiFunction;

public class Calculator {

    public  double computar(double a, double b, Arithmetic lambda) {
        return lambda.operation(a, b);
    }
    public double computeBiFunction(double a, double b, BiFunction<Double, Double, Double> lambda){
        return lambda.apply(a,b);
    }
}
