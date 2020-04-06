#!/usr/bin/env sh
set -e
echo "Ensuring all dependencies are present in LICENSE-3rdparty.csv ..."
# -DoutputType=dot will make output look like:
# [INFO] 	"org.glassfish.jersey.media:jersey-media-json-jackson:jar:2.27:compile" "org.glassfish.jersey.ext:jersey-entity-filtering:jar:2.27:compile" ;
# * the grep result:
#   "org.glassfish.jersey.ext:jersey-entity-filtering:jar:2.27:compile" ;
# * the first sed result:
#   org.glassfish.jersey.ext:jersey-entity-filtering:jar:2.27:compile
# * the second sed result
#   org.glassfish.jersey.ext:jersey-entity-filtering
ALL_DEPS=`mvn dependency:tree -DoutputType=dot | grep -- "-> " | sed 's|.*-> "\(.*\)".*|\1|' | sed "s/\(.*\):jar:.*/\1/" | sort | uniq`
DEPS_NOT_FOUND=""
for one_dep in `echo $ALL_DEPS`; do
    set +e
    cat LICENSE-3rdparty.csv | grep "$one_dep" > /dev/null 2>&1
    if [ $? -ne 0 ]; then
        DEPS_NOT_FOUND="${DEPS_NOT_FOUND}\n${one_dep}<LICENSE>,<COPYRIGHT>"
    fi
    set -e
done
if [ -n "$DEPS_NOT_FOUND" ]; then
    echo "Some dependencies were not found in LICENSE-3rdparty.csv, please add: $DEPS_NOT_FOUND"
    exit 1
else
    echo "LICENSE-3rdparty.csv is up to date"
fi

mvn --show-version --batch-mode test
