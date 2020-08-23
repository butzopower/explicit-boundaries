package adapter

import "example.com/catalog/core"

type HardcodedCatalog struct {}

func (adapter HardcodedCatalog) CatalogItems() []core.CatalogItem {
	return []core.CatalogItem {
		core.CatalogItem {
			Name:         "Courage",
			PriceInCents: 10_00,
		},
		core.CatalogItem {
			Name:         "Brain",
			PriceInCents: 2,
		},
		core.CatalogItem {
			Name:         "Heart",
			PriceInCents: 7_89,
		},
	}
}
