package com.julio.app.designpatterns.factory.product;

import com.julio.app.designpatterns.factory.PizzaProduct;

public class PizzaNYVegetarian extends PizzaProduct {


    public PizzaNYVegetarian() {
        super();
        this.name = "Vegetarian pizza New York";
        this.masa = "Integral masa vegetarian";
        this.sause = "Tomatoes Sause";
        ingredients.add("Cheese Vegan");
        ingredients.add("Tomatoes");
        ingredients.add("Aceitunas");
        ingredients.add("Espinacas");
        ingredients.add("Aceitunas");
    }

    @Override
    public void cook() {
        System.out.println("Cocking for 25 mins to 150 grades");
    }

    @Override
    public void cutPizza() {
        System.out.println("Cutting pizza on rebanadas cuadradas");
    }
}