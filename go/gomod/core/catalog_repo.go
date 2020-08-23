package core

type CatalogRepo interface {
	CatalogItems() []CatalogItem
}