package cli

import (
	"example.com/catalog/core"
	"fmt"
)

type CommandLinePresenter struct {}

func (presenter CommandLinePresenter) PresentCatalogItem(item core.CatalogItem) {
	println("=======================")
	println("Name: " + item.Name)
	println("Price: " + formatPrice(item.PriceInCents))
}

func formatPrice(priceInCents int) string {
	cents := priceInCents % 100
	dollars := priceInCents / 100
	return fmt.Sprintf(`$%d.%02d`, dollars, cents)
}