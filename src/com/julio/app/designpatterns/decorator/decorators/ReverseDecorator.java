package com.julio.app.designpatterns.decorator.decorators;

import com.julio.app.designpatterns.decorator.Formateable;

public class ReverseDecorator extends TextDecorator{


    public ReverseDecorator(Formateable text) {
        super(text);
    }

    @Override
    public String giveFormat() {
        StringBuilder stringBuilder = new StringBuilder(text.giveFormat());
        return stringBuilder.reverse().toString();
    }
}
