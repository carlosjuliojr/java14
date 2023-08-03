package com.julio.app.designpatterns.decorator2.decorator;

import com.julio.app.designpatterns.decorator2.Configurable;

abstract public class CoffeeDecorator implements Configurable {

    protected Configurable coffee;

    public CoffeeDecorator(Configurable coffee) {
        this.coffee = coffee;
    }
}
