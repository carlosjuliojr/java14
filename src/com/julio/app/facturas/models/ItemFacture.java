package com.julio.app.facturas.models;

public class ItemFacture {
    private int cantidad;
    private Product product;



    public ItemFacture(int cantidad, Product product) {
        this.cantidad = cantidad;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float caculateImport(){
        return this.cantidad * this.product.getPrice();
    }
}
