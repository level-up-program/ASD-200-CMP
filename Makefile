.PHONY: bootstrap setup update run console clean build test cibuild
.DEFAULT_GOAL := bootstrap

bootstrap:
	echo "'Bootstrap' not implemented"

setup:
	echo "'Setup' not implemented"

console:
	echo "'Console' not implemented"

clean:
	mvn clean

build: test
	mvn install

test: clean
	mvn verify

cibuild:
	mvn package
