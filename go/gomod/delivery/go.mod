module example.com/catalog/delivery

go 1.14

require example.com/catalog/adapter v0.0.0
require example.com/catalog/core v0.0.0

replace example.com/catalog/adapter => ./../adapter
replace example.com/catalog/core => ./../core