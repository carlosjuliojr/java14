package com.julio.app.designpatterns.decorator2.decorator;

import com.julio.app.designpatterns.decorator2.Configurable;

public class WithMilkDecorator extends CoffeeDecorator{


    public WithMilkDecorator(Configurable coffee) {
        super(coffee);
    }

    @Override
    public float getPriceBase() {
        return coffee.getPriceBase() + 7.5f;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients() + ", Milk";
    }
}
