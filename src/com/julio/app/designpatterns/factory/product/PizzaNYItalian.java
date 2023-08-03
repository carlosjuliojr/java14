package com.julio.app.designpatterns.factory.product;

import com.julio.app.designpatterns.factory.PizzaProduct;

public class PizzaNYItalian extends PizzaProduct {


    public PizzaNYItalian() {
        super();
        this.name = "Italian pizza New York";
        this.masa = " masa think to rock";
        this.sause = "Tomatoes Sause italiano meat";
        ingredients.add("Cheese Mozzarella");
        ingredients.add("Jamon");
        ingredients.add("Choricillo");
        ingredients.add("Aceitunas");
    }

    @Override
    public void cook() {
        System.out.println("Cocking for 30 mins to 120 grades");
    }

    @Override
    public void cutPizza() {
        System.out.println("Cutting pizza on little trozos");
    }
}