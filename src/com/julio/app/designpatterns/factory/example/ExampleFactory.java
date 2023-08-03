package com.julio.app.designpatterns.factory.example;

import com.julio.app.designpatterns.factory.PizzaProduct;
import com.julio.app.designpatterns.factory.PizzeriaCaliforniaFactory;
import com.julio.app.designpatterns.factory.PizzeriaNewyorkFactory;
import com.julio.app.designpatterns.factory.PizzeriaZonaAbstractFactory;

public class ExampleFactory {

    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny = new PizzeriaNewyorkFactory();
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();

        System.out.println("**************************************************************************");
        PizzaProduct pizza = california.orderPizza("cheese");
        System.out.println("Julio order pizza " + pizza.getName());
        System.out.println("**************************************************************************");
        pizza = ny.orderPizza("peperoni");
        System.out.println("maria order pizza " + pizza.getName());
        System.out.println("**************************************************************************");
        pizza = california.orderPizza("vegetarian");
        System.out.println("Teddy order pizza " + pizza.getName());

    }
}
