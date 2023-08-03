package com.julio.app.designpatterns.factory.product;

import com.julio.app.designpatterns.factory.PizzaProduct;

public class PizzaCaliforniaCheese extends PizzaProduct {


    public PizzaCaliforniaCheese() {
        super();
        this.name = "cheese pizza California";
        this.masa = "Masa gruesa ";
        this.sause = "Sause of tomato with rocula";
        ingredients.add("Extra Cheese Mozarrella");
        ingredients.add("Cebolla");
        ingredients.add("Aceitunas");
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