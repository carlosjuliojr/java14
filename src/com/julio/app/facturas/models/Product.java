package com.julio.app.facturas.models;

public class Product {

    private int code;
    private String name;
    private static int lastCode;
    public Product( String name, float price) {

        this.name = name;
        this.price = price;
        this.code = ++lastCode;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    private float price;

}
