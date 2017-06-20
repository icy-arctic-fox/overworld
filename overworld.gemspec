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

  spec.files         = `git ls-files -z`.split("\x0").reject { |f| f.match(%r{^(test|spec|features)/}) }
  spec.bindir        = 'exe'
  spec.executables   = spec.files.grep(%r{^exe/}) { |f| File.basename(f) }
  spec.require_paths = ['lib']

  spec.add_dependency 'thor'

  spec.add_development_dependency 'bundler'
  spec.add_development_dependency 'rake'
  spec.add_development_dependency 'rspec', '~> 3.0'
  spec.add_development_dependency 'fuubar'
  spec.add_development_dependency 'factory_girl', '~> 4.0'
  spec.add_development_dependency 'pry'
  spec.add_development_dependency 'reek', '~> 3.0'
  spec.add_development_dependency 'rubocop', '~> 0.38.0'
  spec.add_development_dependency 'simplecov'
  spec.add_development_dependency 'yard'
end
