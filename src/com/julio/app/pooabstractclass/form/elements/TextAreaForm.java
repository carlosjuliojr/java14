package com.julio.app.pooabstractclass.form.elements;

public class TextAreaForm extends ElementForm {

    private int rows;
    private int cols;


    public TextAreaForm(String name) {
        super(name);
    }

    @Override
    public String drawHtml() {
        return "<textarea name='" + this.name + "' cols= '" + this.cols + "'rows= '" + this.rows + "' >" + this.value + "</textarea>";
    }

    public TextAreaForm(String name, int rows, int cols) {
        super(name);
        this.rows = rows;
        this.cols = cols;
    }

    public TextAreaForm(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }
}
