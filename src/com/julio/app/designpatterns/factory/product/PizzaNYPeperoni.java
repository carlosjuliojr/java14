package com.julio.app.designpatterns.factory.product;

import com.julio.app.designpatterns.factory.PizzaProduct;

public class PizzaNYPeperoni extends PizzaProduct {


    public PizzaNYPeperoni() {
        super();
        this.name = "Peperoni pizza New York";
        this.masa = " masa think to rock";
        this.sause = "Tomatoes Sause";
        ingredients.add("Cheese Mozzarella");
        ingredients.add("Tomatoes");
        ingredients.add("Extra peperoniess");
        ingredients.add("Aceitunas");
    }

    @Override
    public void cook() {
        System.out.println("Cocking for 40 mins to 90 grades");
    }

    @Override
    public void cutPizza() {
        System.out.println("Cutting pizza on rebanadas triangulares");
    }
}