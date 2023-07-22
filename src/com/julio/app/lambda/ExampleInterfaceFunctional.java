package com.julio.app.lambda;

import com.julio.app.lambda.arithmetic.Arithmetic;
import com.julio.app.lambda.arithmetic.Calculator;

public class ExampleInterfaceFunctional {

    public static void main(String[] args) {

        Arithmetic sum = Double::sum;
        Arithmetic less = (a, b) -> a-b;

        Calculator calculator = new Calculator();

        System.out.println("calculator.computar(5,2,sum) = " + calculator.computar(5,2,sum));
        System.out.println("calculator.computar(5,2,less) = " + calculator.computar(5,2,less));
        System.out.println("calculator.computar(5,2,(a,b) -> a*b = " + calculator.computar(5,2,(a,b) -> a*b));

        System.out.println("calculator.computeBiFunction(10,5,(aDouble, aDouble2) -> aDouble+aDouble2) = " + calculator.computeBiFunction(10,5,(aDouble, aDouble2) -> aDouble+aDouble2));

    }
}
