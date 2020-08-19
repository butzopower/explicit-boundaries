package com.example.catalog.delivery;

import com.example.catalog.core.CatalogItem;
import com.example.catalog.core.CatalogItemPresenter;

public class CommandLineCatalogItemPresenter implements CatalogItemPresenter {
    @Override
    public void presentCatalogItem(CatalogItem item) {
        System.out.println("=======================");
        System.out.println("Name: " + item.getName());
        System.out.println("Price: " + formatPrice(item.getPriceInCents()));
    }

    private String formatPrice(int totalPrice) {
        int cents = totalPrice % 100;
        int dollars = totalPrice / 100;

        return "$" + dollars + "." + String.format("%02d", cents);
    }
}
