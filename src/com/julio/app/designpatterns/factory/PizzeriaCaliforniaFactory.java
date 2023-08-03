package com.julio.app.designpatterns.factory;

import com.julio.app.designpatterns.factory.product.*;

public class PizzeriaCaliforniaFactory extends  PizzeriaZonaAbstractFactory{
    @Override
    public PizzaProduct createPizza(String type) {
        PizzaProduct product = switch (type) {
            case "vegetarian" -> new PizzaCaliforniaVegetarian();
            case "peperoni" -> new PizzaCaliforniaPeperoni();
            case "cheese" -> new PizzaCaliforniaCheese();
            default -> null;
        };
        return product;
    }
}
