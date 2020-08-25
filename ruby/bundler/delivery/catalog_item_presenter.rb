module Delivery
  class CatalogItemPresenter
    def present_catalog_item(item)
      puts "======================="
      puts "Name: " + item.name
      puts "Price: " + format_price(item.price_in_cents)
    end

    private

    def format_price(price_in_cents)
      cents = price_in_cents % 100
      dollars = price_in_cents / 100

      "$#{dollars}.#{"%02d" % cents}"
    end
  end
end