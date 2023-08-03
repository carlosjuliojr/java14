package com.julio.app.designpatterns.decorator.decorators;

import com.julio.app.designpatterns.decorator.Formateable;

public class SubLineDecorator extends TextDecorator{

    public SubLineDecorator(Formateable text) {
        super(text);
    }

    @Override
    public String giveFormat() {
        StringBuilder stringBuilder = new StringBuilder(text.giveFormat());
        stringBuilder.append("\n");
        for (int i = 0; i < text.giveFormat().length(); i++) {
            stringBuilder.append("_");
        }
        return stringBuilder.toString();
    }
}
