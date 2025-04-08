#!/bin/bash

mkdir -p out
javac -d out Main.java
java -cp out Main
