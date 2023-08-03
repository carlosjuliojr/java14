package com.julio.app.designpatterns.decorator2;

public class Coffee implements Configurable{

    private float price;
    private String name;

    public Coffee(float price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public float getPriceBase() {
        return this.price;
    }

    @Override
    public String getIngredients() {
        return this.name;
    }
}
