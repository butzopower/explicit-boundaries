package com.example.catalog.delivery;

import com.example.catalog.adapter.HardcodedCatalog;
import com.example.catalog.core.CatalogItemPresenter;
import com.example.catalog.core.CatalogRepo;
import com.example.catalog.core.ShowCatalog;

public class CLI {
    public static void main(String[] args) {
        CatalogRepo repo = new HardcodedCatalog();
        CatalogItemPresenter presenter = new CommandLineCatalogItemPresenter();

        ShowCatalog event = new ShowCatalog(repo, presenter);

        event.execute();
    }
}
