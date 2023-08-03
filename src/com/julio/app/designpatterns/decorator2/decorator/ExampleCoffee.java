package com.julio.app.designpatterns.decorator2.decorator;

import com.julio.app.designpatterns.decorator2.Coffee;
import com.julio.app.designpatterns.decorator2.Configurable;

public class ExampleCoffee {
    public static void main(String[] args) {

        Configurable coffee = new Coffee(10, "Capuchino");
        WithMilkDecorator withMilkDecorator = new WithMilkDecorator(coffee);
        WithChocolateDecorator withChocolateDecorator = new WithChocolateDecorator(withMilkDecorator);
        WithCremeDecorator withCremeDecorator = new WithCremeDecorator(withChocolateDecorator);

        System.out.println("withCremeDecorator.getIngredients() = " + withCremeDecorator.getIngredients());
        System.out.println("withCremeDecorator.getPriceBase() = " + withCremeDecorator.getPriceBase());
        
        
    }
}
