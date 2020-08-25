package com.example.catalog.core;

import java.util.List;

public class ShowCatalog {
    private final CatalogRepo repo;
    private final CatalogItemPresenter presenter;

    public ShowCatalog(CatalogRepo repo, CatalogItemPresenter presenter) {
        this.repo = repo;
        this.presenter = presenter;
    }

    public void execute() {
        List<CatalogItem> catalogItems = repo.catalogItems();

        for (CatalogItem item: catalogItems) {
            presenter.presentCatalogItem(item);
        }
    }
}
