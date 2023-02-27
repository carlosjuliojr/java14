package com.julio.app.facturas.models;

public class Client {
    private String name;
    private String nif;

    public Client(String name, String nif) {
        this.name = name;
        this.nif = nif;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }
}
