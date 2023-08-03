package com.julio.app.designpatterns.factory.product;

import com.julio.app.designpatterns.factory.PizzaProduct;

public class PizzaCaliforniaVegetarian extends PizzaProduct {


    public PizzaCaliforniaVegetarian() {
        super();
        this.name = "Vegetarian pizza California";
        this.masa = "Masa delgada light";
        this.sause = "BBQ light";
        ingredients.add("Cheese Mozarrella");
        ingredients.add("Aceitunas");
        ingredients.add("Espinacas");
        ingredients.add("Cebolla");
        ingredients.add("Berengena");
    }

    @Override
    public void cook() {
        System.out.println("Cocking for 20 mins to 180 grades");
    }

    @Override
    public void cutPizza() {
        System.out.println("Cutting pizza on rebanadas rectangulares");
    }
}