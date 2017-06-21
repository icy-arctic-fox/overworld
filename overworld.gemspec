# coding: utf-8
lib = File.expand_path('../lib', __FILE__)
$LOAD_PATH.unshift(lib) unless $LOAD_PATH.include?(lib)
require 'overworld/version'

Gem::Specification.new do |spec|
  spec.name          = 'overworld'
  spec.version       = Overworld::VERSION
  spec.authors       = ['Michael Miller']
  spec.email         = ['icy.arctic.fox@gmail.com']

  spec.summary       = %q{Easy server hosting for your games.}
  spec.description   = %q{Simple game server creation, hosting, and management.}
  spec.homepage      = 'https://github.com/overworld-hosting/overworld'
  spec.license       = 'MIT'
  spec.platform      = Gem::Platform::CURRENT

  spec.files         = `git ls-files -z`.split("\x0").reject { |f| f.match(%r{^(test|spec|features)/}) }
  spec.bindir        = 'exe'
  spec.executables   = spec.files.grep(%r{^exe/}) { |f| File.basename(f) }
  spec.require_paths = ['lib']

  spec.add_dependency 'thor', '~> 0.19'
  spec.add_dependency 'overworld-core', ">= #{Overworld::VERSION}"
  spec.add_dependency 'overworld-ui',   ">= #{Overworld::VERSION}"

  spec.add_development_dependency 'bundler', '~> 1'
  spec.add_development_dependency 'rake', '~> 12'
  spec.add_development_dependency 'rspec', '~> 3.0'
  spec.add_development_dependency 'fuubar', '~> 2.0'
  spec.add_development_dependency 'factory_girl', '~> 4.0'
  spec.add_development_dependency 'pry', '~> 0.10'
  spec.add_development_dependency 'reek', '~> 3.0'
  spec.add_development_dependency 'rubocop', '~> 0.38.0'
  spec.add_development_dependency 'simplecov', '~> 0.14'
  spec.add_development_dependency 'yard', '~> 0.9'
end
