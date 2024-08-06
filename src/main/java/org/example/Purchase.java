package org.example;

import java.time.LocalDate;

public class Purchase {

    private Client client;

    private  String product;

    private int quantity = 0;

    private LocalDate purchaseDate;

    public Purchase(Client client, String product, int quantity, LocalDate purchaseDate) {
        this.client = client;
        this.product = product;
        this.quantity = quantity;
        this.purchaseDate = purchaseDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }
}