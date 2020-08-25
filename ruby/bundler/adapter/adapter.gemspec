require_relative 'lib/adapter/version'

Gem::Specification.new do |spec|
  spec.name          = "adapter"
  spec.version       = Adapter::VERSION
  spec.authors       = ["Example"]
  spec.email         = ["example@example.com"]
  spec.summary       = "adapter"

  spec.required_ruby_version = Gem::Requirement.new(">= 2.3.0")

  spec.require_paths = ["lib"]
end
