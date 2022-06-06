#!/usr/bin/env bash
set -e

function finish {
    rm -rf target/rerun.txt
}
trap finish EXIT

echo "Ensuring all dependencies are present in LICENSE-3rdparty.csv ..."
# -DoutputType=dot will make output look like:
# [INFO] 	"org.glassfish.jersey.media:jersey-media-json-jackson:jar:2.27:compile" "org.glassfish.jersey.ext:jersey-entity-filtering:jar:2.27:compile" ;
# * the grep result:
#   "org.glassfish.jersey.ext:jersey-entity-filtering:jar:2.27:compile" ;
# * the first sed result:
#   org.glassfish.jersey.ext:jersey-entity-filtering:jar:2.27:compile
# * the second sed result
#   org.glassfish.jersey.ext:jersey-entity-filtering
MVN_OUTPUT=`mvn dependency:tree -DoutputType=dot`
if [ $? -ne 0 ]; then
    echo $MVN_OUTPUT
    exit 1
fi
ALL_DEPS=`echo $MVN_OUTPUT | grep -- "-> " | sed 's|.*-> "\(.*\)".*|\1|' | sed "s/\(.*\):jar:.*/\1/" | sort | uniq`
DEPS_NOT_FOUND=""
for one_dep in `echo $ALL_DEPS`; do
    set +e
    cat LICENSE-3rdparty.csv | grep "$one_dep" > /dev/null 2>&1
    if [ $? -ne 0 ]; then
        DEPS_NOT_FOUND="${DEPS_NOT_FOUND}\nimport,${one_dep},<LICENSE>,<COPYRIGHT>"
    fi
    set -e
done
if [ -n "$DEPS_NOT_FOUND" ]; then
    echo "Some dependencies were not found in LICENSE-3rdparty.csv, please add: $DEPS_NOT_FOUND"
    exit 1
else
    echo "LICENSE-3rdparty.csv is up to date"
fi


# Test build java doc
echo "Ensuring javadocs build successfully ..."

set +e
JAVADOC_OUTPUT=`mvn javadoc:javadoc`
if [[ $? -ne 0 ]]; then
    exit "$JAVADOC_OUTPUT"
    exit 1
else
    echo "javadocs build successfully"
fi

RERUN_COUNT=$([ "$CI" == "true" ] && echo "1" || echo "0")

set +e
mvn --show-version --batch-mode -Dsurefire.rerunFailingTestsCount=${RERUN_COUNT} test
RESULT=$?
if [ "$RESULT" -ne 0 -a ! -d "target/surefire-reports" ]; then
    # No surefire reports and error means compilation error, don't try to rerun
    exit $RESULT
fi
if [ "$RERECORD_FAILED_TESTS" == "true" -a "$RESULT" -ne 0 ]; then
    set -e
    python3 -m pip install -U pip setuptools
    python3 -m pip install "junitparser==1.4.1"
    python3 failed.py | RECORD=true bash
    RESULT=$?
fi

exit $RESULT
