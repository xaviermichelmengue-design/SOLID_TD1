#!/bin/bash
echo "Compilation de tous les principes SOLID..."
javac -d bin src/srp/avant/*.java
javac -d bin src/srp/apres/*.java
javac -d bin src/ocp/avant/*.java
javac -d bin src/ocp/apres/*.java
javac -d bin src/lsp/avant/*.java
javac -d bin src/lsp/apres/*.java
javac -d bin src/isp/avant/*.java
javac -d bin src/isp/apres/*.java
javac -d bin src/dip/avant/*.java
javac -d bin src/dip/apres/*.java
echo "Compilation terminée!"
