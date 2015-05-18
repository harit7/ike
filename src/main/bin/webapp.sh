#!/bin/bash

# Regular stuff below
JVM_ARGS="-Xmx28G -Xms28G"
CLASS_NAME="org.allenai.dictionary.DictionaryToolWebapp"
SCRIPT_DIR="$( cd "$( dirname "$0" )" && pwd )"
SHORT_NAME=webapp
. "${SCRIPT_DIR}/run-class.sh" "$CLASS_NAME" "$SHORT_NAME" "$@"
