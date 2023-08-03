package com.julio.app.designpatterns.decorator;

public class Text implements Formateable{

    protected String text;

    public Text(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String giveFormat() {
        return getText();
    }

}
