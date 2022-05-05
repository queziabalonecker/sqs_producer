#!/bin/bash
export CLASSPATH=target/sqs_producer-1.0-SNAPSHOT.jar
export className=App
echo "## Running $className..."
shift
mvn exec:java -Dexec.mainClass="br.com.sqs_producer.$className"