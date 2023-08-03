package com.julio.app.designpatterns.decorator.decorators;

import com.julio.app.designpatterns.decorator.Formateable;
import com.julio.app.designpatterns.decorator.Text;

public class UpperCaseDecorator extends TextDecorator {


    public UpperCaseDecorator(Formateable text) {
        super(text);
    }

    @Override
    public String giveFormat() {
        return text.giveFormat().toUpperCase();
    }
}
