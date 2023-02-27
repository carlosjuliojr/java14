package com.julio.app.facturas.models;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Facture {
    private int folio;
    private String description;
    private Date date;

    private Client client;
    private ItemFacture[] items;
    private int indexItems;
    public static final int MAX_ITEMS = 10;
    public static int lastFolio;

    public Facture(String description, Client client) {
        this.description = description;
        this.client = client;
        this.items = new ItemFacture[MAX_ITEMS];
        this.folio = ++lastFolio;
        this.date = new Date();
    }

    public Facture(int folio, String description, Date date) {

        this.folio = folio;
        this.description = description;
        this.date = date;

    }

    public Facture() {
        this.date = new Date();
    }

    public int getFolio() {
        return folio;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public ItemFacture[] getItems() {
        return items;
    }

    public void addItemFacture(ItemFacture item) {

        if (indexItems < MAX_ITEMS)
            this.items[this.indexItems++] = item;
    }

    public float calculateTotal() {
        float total = 0;
        for (ItemFacture item : items) {
            if (item != null) {
                total += item.caculateImport();
            }

        }
        return total;
    }

    public String generateDetalle() {
        StringBuilder sb = new StringBuilder("Factura N: ");
        sb.append(this.folio)
                .append("\nCliente: ")
                .append(this.client.getName())
                .append("\tNif: ")
                .append(this.getClient().getNif())
                .append("\nDescription: ")
                .append(this.description + "\n")
                .append("\nN#\tName\tCant.\tTotal");

        SimpleDateFormat df = new SimpleDateFormat("DD-MM-YYYY");
        sb.append("Date Created: ")
                .append(df.format(this.date))
                .append("\n");

        for (ItemFacture item: this.items ) {
            if(item == null)
                continue;
            sb.append(item.getProduct().getCode())
                    .append("\t")
                    .append(item.getProduct().getName())
                    .append("\t")
                    .append(item.getProduct().getPrice())
                    .append("\t")
                    .append(item.getCantidad())
                    .append("\t")
                    .append(item.caculateImport())
                    .append("\n");

        }

        sb.append("\nGrand Total: ")
                .append(calculateTotal());
        return sb.toString();

    }
}
