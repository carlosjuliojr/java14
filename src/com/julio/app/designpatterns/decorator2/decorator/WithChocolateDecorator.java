package com.julio.app.designpatterns.decorator2.decorator;

import com.julio.app.designpatterns.decorator2.Configurable;

public class WithChocolateDecorator extends CoffeeDecorator{


    public WithChocolateDecorator(Configurable coffee) {
        super(coffee);
    }

    @Override
    public float getPriceBase() {
        return coffee.getPriceBase() + 5f;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients() + ", Chocolate";
    }
}
