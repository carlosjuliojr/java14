package com.julio.app.designpatterns.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaProduct {

    public String getName() {
        return name;
    }

    protected String name;
    protected String masa;
    protected String sause;
    protected List<String> ingredients;

    public PizzaProduct() {
        this.ingredients = new ArrayList<>();
    }

    public void making(){
        System.out.println("Making " + name);
        System.out.println("Selecting masa " + masa);
        System.out.println("Addding sause " + sause);
        System.out.println("Adding ingredients: ");
        this.ingredients.forEach(System.out::println);
    }
    public abstract void cook();
    public abstract void cutPizza();
    public void packagePizza(){
        System.out.println("Puting pizza in a package");
    }

    @Override
    public String toString() {
        return " {" +
                "name='" + name + '\'' +
                ", masa='" + masa + '\'' +
                ", sause='" + sause + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
