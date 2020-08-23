package main

import (
	"example.com/catalog/adapter"
	"example.com/catalog/core"
	"example.com/catalog/delivery/cli"
)

func main() {
	catalog := adapter.HardcodedCatalog{}
	presenter := cli.CommandLinePresenter{}
	core.ShowCatalog(catalog, presenter).Execute()
}