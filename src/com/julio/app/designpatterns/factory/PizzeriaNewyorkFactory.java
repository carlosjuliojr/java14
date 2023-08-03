package com.julio.app.designpatterns.factory;

import com.julio.app.designpatterns.factory.product.PizzaNYItalian;
import com.julio.app.designpatterns.factory.product.PizzaNYPeperoni;
import com.julio.app.designpatterns.factory.product.PizzaNYVegetarian;

public class PizzeriaNewyorkFactory extends  PizzeriaZonaAbstractFactory{
    @Override
    public PizzaProduct createPizza(String type) {
        PizzaProduct product = switch (type) {
            case "vegetarian" -> new PizzaNYVegetarian();
            case "peperoni" -> new PizzaNYPeperoni();
            case "italian" -> new PizzaNYItalian();
            default -> null;
        };
        return product;
    }
}
