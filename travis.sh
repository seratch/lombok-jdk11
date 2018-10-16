#!/bin/bash
if [[ "$BUILD_TOOL" == "gradle" ]]; then
  cd ./gradle-example
  ./gradlew test
elif [[ "$BUILD_TOOL" == "maven" ]]; then
  cd ./maven-example
  mvn test
fi
