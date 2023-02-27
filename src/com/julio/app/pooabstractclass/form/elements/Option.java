package com.julio.app.pooabstractclass.form.elements;

public class Option extends ElementForm{
    private boolean selected;
    private int id;

    public Option(int id , boolean selected) {
        this.selected = selected;
        this.id = id;
    }

    public Option(int id, String name, boolean selected,String value) {
        super(name);
        this.id = id;
        this.selected = selected;
        this.setValue(value);
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    @Override
    public String drawHtml() {
        return null;
    }
}
