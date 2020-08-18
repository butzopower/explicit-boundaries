package com.example.catalog.core;

public class CatalogItem {
    private final String name;
    private final int priceInCents;

    public CatalogItem(String name, int priceInCents) {
        this.name = name;
        this.priceInCents = priceInCents;
    }

    public String getName() {
        return name;
    }

    public int getPriceInCents() {
        return priceInCents;
    }
}
