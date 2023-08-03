package com.julio.app.designpatterns.decorator.decorators;

import com.julio.app.designpatterns.decorator.Formateable;

public class ChangeSpaceDecorator extends  TextDecorator{


    public ChangeSpaceDecorator(Formateable text) {
        super(text);
    }

    @Override
    public String giveFormat() {
        return text.giveFormat().replace(" ", "_");
    }
}
