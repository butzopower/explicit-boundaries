require_relative 'lib/core/version'

Gem::Specification.new do |spec|
  spec.name          = "core"
  spec.version       = Core::VERSION
  spec.authors       = ["Example"]
  spec.email         = ["example@example.com"]
  spec.summary       = "core"

  spec.required_ruby_version = Gem::Requirement.new(">= 2.3.0")

  spec.require_paths = ["lib"]
end
