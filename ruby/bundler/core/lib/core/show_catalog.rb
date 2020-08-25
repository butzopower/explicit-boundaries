module Core
  class ShowCatalog
    private
    attr_reader :catalog_repo, :catalog_item_presenter

    public

    def initialize(catalog_repo:, catalog_item_presenter:)
      @catalog_repo = catalog_repo
      @catalog_item_presenter = catalog_item_presenter
    end

    def execute
      catalog_items = catalog_repo.catalog_items

      catalog_items.each do |item|
        catalog_item_presenter.present_catalog_item(item)
      end
    end
  end
end