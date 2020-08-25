require 'core/show_catalog'
require 'adapter/hardcoded_catalog'
require_relative 'catalog_item_presenter'

show_catalog = Core::ShowCatalog.new(
  catalog_repo: Adapter::HardcodedCatalog.new,
  catalog_item_presenter: Delivery::CatalogItemPresenter.new
)

show_catalog.execute