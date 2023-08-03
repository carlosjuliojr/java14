package com.julio.app.designpatterns.decorator2.decorator;

import com.julio.app.designpatterns.decorator2.Configurable;

public class WithCremeDecorator extends CoffeeDecorator{


    public WithCremeDecorator(Configurable coffee) {
        super(coffee);
    }

    @Override
    public float getPriceBase() {
        return coffee.getPriceBase() + 2.5f;
    }

    @Override
    public String getIngredients() {
        return coffee.getIngredients() + ", Creme";
    }
}
