require 'core/catalog_item'

module Adapter
  class HardcodedCatalog
    def catalog_items
      [
        Core::CatalogItem.new("Courage", 10_00),
        Core::CatalogItem.new("Brain", 2),
        Core::CatalogItem.new("Heart", 7_89),
      ]
    end
  end
end