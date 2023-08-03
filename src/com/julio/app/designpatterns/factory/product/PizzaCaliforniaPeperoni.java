package com.julio.app.designpatterns.factory.product;

import com.julio.app.designpatterns.factory.PizzaProduct;

public class PizzaCaliforniaPeperoni extends PizzaProduct {


    public PizzaCaliforniaPeperoni() {
        super();
        this.name = "California Peperoni pizza";
        this.masa = " masa think peperoni extra";
        this.sause = "Tomatoes Sause with bbq";
        ingredients.add("Cheese");
        ingredients.add("Extra peperoniess");
    }

    @Override
    public void cook() {
        System.out.println("Cocking for 50 mins to 55 grades");
    }

    @Override
    public void cutPizza() {
        System.out.println("Cutting pizza on rebanadas redondas");
    }
}