package com.julio.app.pooabstractclass.form.elements;

abstract public class ElementForm {

    protected String value;
    protected String name;

    public ElementForm() {
    }

    public ElementForm(String name) {
        this();
        this.name = name;
    }

    public void setValue(String value) {
        this.value = value;
    }

    abstract public String drawHtml();
}
