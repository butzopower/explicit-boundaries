package core

type showCatalog struct {
	repo          CatalogRepo
	itemPresenter CatalogItemPresenter
}

func ShowCatalog(repo CatalogRepo, presenter CatalogItemPresenter) *showCatalog {
	action := new(showCatalog)
	action.repo = repo
	action.itemPresenter = presenter
	return action
}

func (catalog *showCatalog) Execute() {
	catalogItems := catalog.repo.CatalogItems()
	for _, item := range catalogItems {
		catalog.itemPresenter.PresentCatalogItem(item)
	}
}