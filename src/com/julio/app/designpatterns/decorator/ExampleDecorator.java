package com.julio.app.designpatterns.decorator;

import com.julio.app.designpatterns.decorator.decorators.ChangeSpaceDecorator;
import com.julio.app.designpatterns.decorator.decorators.ReverseDecorator;
import com.julio.app.designpatterns.decorator.decorators.SubLineDecorator;
import com.julio.app.designpatterns.decorator.decorators.UpperCaseDecorator;

public class ExampleDecorator {

    public static void main(String[] args) {
        Formateable text = new Text("Hello how about u Julio!");
        UpperCaseDecorator upperCaseDecorator = new UpperCaseDecorator(text);
        ReverseDecorator reverseDecorator = new ReverseDecorator(text);
        SubLineDecorator subLineDecorator = new SubLineDecorator(text);
        ChangeSpaceDecorator changeSpaceDecorator = new ChangeSpaceDecorator(text);

        System.out.println("upperCaseDecorator = " + upperCaseDecorator.giveFormat());
        System.out.println("reverseDecorator = " + reverseDecorator.giveFormat());
        System.out.println("subLineDecorator = " + subLineDecorator.giveFormat());
        System.out.println("changeSpaceDecorator = " + changeSpaceDecorator.giveFormat());    }
}
