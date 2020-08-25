package com.example.catalog.adapter;

import com.example.catalog.core.CatalogItem;
import com.example.catalog.core.CatalogRepo;

import java.util.List;

import static java.util.Arrays.asList;

public class HardcodedCatalog implements CatalogRepo {
    @Override
    public List<CatalogItem> catalogItems() {
        return asList(
                new CatalogItem("Courage", 10_00),
                new CatalogItem("Brain", 2),
                new CatalogItem("Heart", 7_89)
        );
    }
}
