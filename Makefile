.PHONY: bootstrap setup update run console clean build test cibuild
.DEFAULT_GOAL := bootstrap

bootstrap:
	echo "'Bootstrap' not implemented"

setup:
	echo "'Setup' not implemented"

update: bootstrap
	echo "'Update' not implemented"

run: update
	mvn package

console:
	echo "'Console' not implemented"

clean:
	mvn clean

build: test
	mvn install

test: clean update
	mvn verify

cibuild: test
	mvn package
