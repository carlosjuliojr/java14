package com.julio.app.designpatterns.factory;

abstract public class PizzeriaZonaAbstractFactory {

    public PizzaProduct orderPizza(String type){
        PizzaProduct pizza = createPizza(type);
        System.out.println("---------Factoring pizza " + pizza.name + " ------------");
        pizza.making();
        pizza.cook();
        pizza.cutPizza();
        pizza.packagePizza();
        return pizza;

    }

     abstract PizzaProduct createPizza(String type);
}
