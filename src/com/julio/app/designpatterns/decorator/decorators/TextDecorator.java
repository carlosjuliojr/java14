package com.julio.app.designpatterns.decorator.decorators;

import com.julio.app.designpatterns.decorator.Formateable;

public abstract class TextDecorator implements Formateable {

    protected Formateable text;

    public TextDecorator(Formateable text) {
        this.text = text;
    }
}
