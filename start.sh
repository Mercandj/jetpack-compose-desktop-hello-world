#!/usr/bin/env bash

BASE_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" >/dev/null && pwd )"

pushd "$BASE_DIR" > /dev/null || exit

  ./gradlew clean app:run

popd > /dev/null || exit
