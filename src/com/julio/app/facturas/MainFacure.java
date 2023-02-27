package com.julio.app.facturas;

import com.julio.app.facturas.models.Client;
import com.julio.app.facturas.models.Facture;
import com.julio.app.facturas.models.Product;

import java.util.Scanner;

public class MainFacure {
    public static void main(String[] args) {
        Client client = new Client("Julio","555-3");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingress Description Facture: ");
        Facture facture = new Facture(scanner.nextLine(),client);

        Product product;
    }
}
